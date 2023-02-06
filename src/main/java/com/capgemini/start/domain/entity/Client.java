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
@Entity(name="tb_client")
public class Client {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_client", nullable= false)
	private Long id;
	
	@Column(name="cpf_client")
	private Integer cpf;
	
	@Column(name = "name_client", nullable = false, length = 100)
	private String name;
	
	@Column(name = "email_client", nullable = false, length = 100)
	private String email;
	
	@Column(name = "adress_client", length = 250)
	private String adress;
	
	@Column(name="phone_client")
	private String phone;
	
	@Column(name = "dt_criacao", nullable = false)
	private Date dataCriacao;
	
	@Column(name = "dt_alteracao")
	private Date dataAlteracao;
	
}
