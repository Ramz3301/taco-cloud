package com.example.tacocloud.repository;

import com.example.tacocloud.tacos.Order;

public interface OrderRepository {

    Order save(Order order);
}
