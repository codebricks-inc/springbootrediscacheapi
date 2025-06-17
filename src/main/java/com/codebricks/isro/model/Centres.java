package com.codebricks.isro.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Centres implements Serializable{
    private static final long serialVersionUID = -5601714730983044436L;
	private List<Centre> centres;
}