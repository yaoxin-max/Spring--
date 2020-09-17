package com.spring.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Studnet {
	private String name;
	@Autowired
	private Computer computer;
	public void show(){
		System.out.println("学生信息");
		computer.show();
	}
	public void setName(String name){
		this.name=name;
	}
}
