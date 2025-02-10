package com.unit.test.myapp;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_genrator")
	@SequenceGenerator(name ="product_id_genrator", sequenceName = "product_id_sequence")
	private Long id;
	
	@Column(nullable = false , unique = true)
	private String name;
	
	private String description;
	
	@Column(nullable = false)
	private BigDecimal price;
	
	private boolean disabled;
	
}
