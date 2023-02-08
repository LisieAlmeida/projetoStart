package com.capgemini.start.domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name="tb_client")
public class Client {
	
	@Getter @Setter
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_client", nullable= false)
	private Long id;
	
	@Getter @Setter
	@Column(name="cpf_client")
	private Integer cpf;
	
	@Getter @Setter
	@Column(name = "name_client", nullable = false, length = 100)
	private String name;
	
	@Getter @Setter
	@Column(name = "email_client", nullable = false, length = 100)
	private String email;
	
	@Getter @Setter
	@Column(name = "adress_client", length = 250)
	private String adress;
	
	@Getter @Setter
	@Column(name="phone_client")
	private String phone;
	
	@Getter @Setter
	@Column(name = "dt_criacao", nullable = false)
	private Date dataCriacao;
	
	@Getter @Setter
	@Column(name = "dt_alteracao")
	private Date dataAlteracao;
	
	@Getter
	@OneToMany(mappedBy = "client")
	private List<Order> orders = new ArrayList<>();
	
}
