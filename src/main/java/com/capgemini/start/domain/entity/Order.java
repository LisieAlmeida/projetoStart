package com.capgemini.start.domain.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


import com.capgemini.start.domain.entity.enums.OrderStatus;

import lombok.EqualsAndHashCode;


@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "tb_order")
public class Order {



	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_order", nullable = false)
	private Long id;
	
	@Column(name = "order_status", nullable = false)
	private Integer orderStatus;
    
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	@Column(name = "dt_criacao", nullable = false)
	private Date dataCriacao;
	
	@Column(name = "dt_alteracao")
	private Date dataAlteracao;
	
	@OneToMany(mappedBy = "id.order" )
	private Set<OrderItem> items = new HashSet<>();
	
	public Order() {
		
	}
	
	public Order(Long id, OrderStatus orderStatus, Client client, Date dataCriacao, Date dataAlteracao) {
		super();
		this.id = id;
		setOrderStatus(orderStatus);
		this.client = client;
		this.dataCriacao = dataCriacao;
		this.dataAlteracao = dataAlteracao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public OrderStatus getOrderStatus() {
		return OrderStatus.valueOf(orderStatus);
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		if(orderStatus != null) {
		this.orderStatus = orderStatus.getCode();
		}
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	
	

	public Set<OrderItem> getItems() {
		return items;
	}

	
}