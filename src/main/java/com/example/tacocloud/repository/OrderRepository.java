package com.example.tacocloud.repository;

import com.example.tacocloud.tacos.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

//    Order save(Order order);
}
