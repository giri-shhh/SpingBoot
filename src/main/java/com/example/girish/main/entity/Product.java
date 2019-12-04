package com.example.girish.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Product {

	@Id
	@NonNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NonNull
	private String name;
	@NonNull
	private Double rate;
	@NonNull
	private Integer count;
}
