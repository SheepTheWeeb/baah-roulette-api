package com.salmon.hellorest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "")
public class Greeting {
	
	//@Id 
	//@GeneratedValue
	//@Column(name = "id")
	private long id;
	
	//@Column(name = "content")
    private  String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
