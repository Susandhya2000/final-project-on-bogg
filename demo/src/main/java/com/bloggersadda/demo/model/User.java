package com.bloggersadda.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String password;
//	public String getUsername() {
//	
//		throw new UnsupportedOperationException("Unimplemented method 'getUsername'");
//	}
//    public Object getPassword() {
//        
//        throw new UnsupportedOperationException("Unimplemented method 'getPassword'");
//    }
    
	public String getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}

    // Getters and Setters
    
}
