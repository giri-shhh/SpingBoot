package com.example.girish.main.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity{

	private String name;
	private String email;
	private String phone;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dateOfBirth;
	private String address;

}
