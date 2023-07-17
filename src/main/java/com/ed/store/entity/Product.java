package com.ed.store.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor @Builder
@Entity
@Table(name= "tbl_products" )
public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8558525488310754198L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private Double stock;
	private Double price;
	private String status;
	
	@Column(name="create_at")
	//Se toma date actual
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	//Declara la relacion con la tabla categoria
	//Especifica en que columa hace la relacion con la llave foranea
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Category category;
	
}
