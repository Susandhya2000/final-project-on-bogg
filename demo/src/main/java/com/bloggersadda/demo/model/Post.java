package com.bloggersadda.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posts")
public class Post {
	@Id
	private String id;
	private String title;
	private String body;
	private String authorId;

	public void setId(String id2) {

		throw new UnsupportedOperationException("Unimplemented method 'setId'");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getId() {
		return id;
	}

	// Getters and Setters

}
