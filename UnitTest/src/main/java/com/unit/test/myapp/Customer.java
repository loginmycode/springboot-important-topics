package com.unit.test.myapp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="customer")
public class Customer {

	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "customer_id_generator")
	@SequenceGenerator(name = "customer_id_generator", sequenceName =  "customer_id_seq")
	private Long id;
	@Column(nullable = false, unique = true)
	private String mail;
	
	@Column(nullable = false)
	private String name;
}
