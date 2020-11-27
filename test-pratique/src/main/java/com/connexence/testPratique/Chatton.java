package com.connexence.testPratique;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chatton
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String nom;

	private Integer age;
	
	private String description;
	
	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getNom()
	{
		return nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
