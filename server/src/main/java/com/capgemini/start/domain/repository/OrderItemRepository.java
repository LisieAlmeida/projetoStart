package com.capgemini.start.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.start.domain.entity.OrderItem;
import com.capgemini.start.domain.entity.pk.OrderItemPk;




@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{


}
