package com.example.girish.main.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class User extends BaseEntity{

	private String name;
	private String email;
	private String phone;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dateOfBirth;
	private String address;

}
