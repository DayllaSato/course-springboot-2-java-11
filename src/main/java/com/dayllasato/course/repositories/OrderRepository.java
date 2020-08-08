package com.dayllasato.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dayllasato.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
