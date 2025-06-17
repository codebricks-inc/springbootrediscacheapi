package com.codebricks.isro.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Centre implements Serializable{

	private static final long serialVersionUID = 4544782906642341984L;
	private int id;
    private String name;
    
    @JsonProperty("Place")
    private String Place;
    @JsonProperty("State")
    private String State;
}