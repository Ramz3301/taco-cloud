package com.example.tacocloud.repository;

import com.example.tacocloud.tacos.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    Order save(Order order);

//    List<Order> findByDeliveryZip(String deliveryZip);
//
//    List<Order> readOrdersByDeliveryZipAndPlacedAtBetween(
//            String deliveryZop, Date startDate, Date endDate);
}
