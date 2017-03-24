package com.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="data1")
public class RecievedData {
	@Id
	@Column (name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column (name="views")
	private int views;
	@Column (name="comments")
	private int commentCount;
	@Column (name="likes")
	private int likes;
	@Column (name="dislikes")
	private int dislikes;
	@Column (name="url")
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDislikes() {
		return dislikes;
	}

	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}
	public RecievedData (){}
	
}
