package com.springboot.parkinglot.springbootparkinglotdesign.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MyIntroduction {

	private String name;
	private int age;
	private String skills;
}
