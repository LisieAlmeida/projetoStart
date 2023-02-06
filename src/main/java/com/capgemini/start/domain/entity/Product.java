package com.capgemini.start.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name="tb_product")
public class Product {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_product", nullable= false)
	private Long id;
	
	@Column(name = "name_product", nullable = false, length = 100)
	private String name;
	
	@Column(name ="ds_product", length = 100)
	private String descricao;
	
	@Column(name = "price_product", nullable = false)
	private Double price;
	
	@Column(name = "img_url_product")
	private String imgUrl;
	
	@Column(name = "dt_criacao", nullable = false)
	private Date dataCriacao;
	
	@Column(name = "dt_alteracao")
	private Date dataAlteracao;
	
}
