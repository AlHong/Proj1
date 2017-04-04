package com.main;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.main.domain.Customer;
import com.main.domain.User;
import com.main.domain.UserDAO;

@Controller
public class JSPController {
	@Autowired UserDAO userDao;
		
	 @RequestMapping(value = "/customer", method = RequestMethod.GET)
	    public ModelAndView showForm() {
	        return new ModelAndView("customerHome", "customer", new Customer());
	  }
	 @PostMapping("/addCustomer")
	  public String submit(@ModelAttribute("customer") final Customer customer,final ModelMap model) {
	        
	        model.addAttribute("customerId", customer.getCustomerId());
	        model.addAttribute("customerName", customer.getCustomerName());
	        model.addAttribute("customerContact", customer.getCustomerContact());
	        model.addAttribute("customerEmail", customer.getCustomerEmail());
	        return "customerView";
	    }
	 
	 @RequestMapping(value = "/register", method = RequestMethod.GET)
	 public ModelAndView showAccountForm(){
		 //generates a view using JSP template: userAccount, 
		 //view attribute user with back up of a Model class:User
		 return new ModelAndView ("userAccount", "user", new User());
	 }
	 @PostMapping ("/addUser")
	 public String submitUser(@ModelAttribute("user") final User user,final ModelMap model) throws NoSuchAlgorithmException, NoSuchProviderException{
		 String input_username = user.getUsername();
		 String input_password = user.getPassword();
		 byte[] salt = Security.getSalt();
		 String securePassword = Security.getSecurePassword(input_password, salt);
	     
	     userDao.save(new User(input_username, user.getEmail(), securePassword,salt));
		 return "userResponse";
	 }
	 @RequestMapping(value = "/signIn", method = RequestMethod.GET)
	 public ModelAndView authenticate(){
		 return new ModelAndView ("SignIn", "login", new User());
	 }
	 
	 @PostMapping ("/login")
	 public String checkUser(@ModelAttribute("login") final User user,final ModelMap model) throws NoSuchAlgorithmException, NoSuchProviderException{
		 String input_username = user.getUsername();
		 String input_password = user.getPassword();
		 User storedUser = userDao.findByUsername(input_username);
		 if (storedUser == null){
			 model.addAttribute("status", "No Such User");
			 return "SignSucessful";
		 }
		 
		 byte[] salt = storedUser.getSalt();
		 String securePassword = Security.getSecurePassword(input_password, salt);
	     if (securePassword.equals(storedUser.getPassword()))
	    	 model.addAttribute("status","Successful");
	     else 
	    	 model.addAttribute("status","Fail");
	     
	     return "SignSucessful";
	    
	 }
	 
}
