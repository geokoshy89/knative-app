package com.example.knativeapp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "person")
public class Person{
    @Id
   private String id;
   private String firstName;
   private String lastName;
   private int age;
   private Gender gender;
   

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person(String id,String firstName,String lastName,int age,Gender gender) {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.age = age;
    }

    public Person(){

    }

   
}
