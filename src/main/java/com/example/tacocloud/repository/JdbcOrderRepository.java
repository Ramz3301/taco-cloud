//package com.example.tacocloud.repository;
//
//import com.example.tacocloud.Order;
//import com.example.tacocloud.Taco;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
//
//import java.util.*;
//
//public class JdbcOrderRepository implements OrderRepository {
//
//    private SimpleJdbcInsert orderInserter;
//    private SimpleJdbcInsert orderTacoInserter;
//    private ObjectMapper objectMapper;
//
//    @Autowired
//    public JdbcOrderRepository(JdbcTemplate jdbc) {
//        this.orderInserter = new SimpleJdbcInsert(jdbc)
//                .withTableName("Taco_Order")
//                .usingGeneratedKeyColumns("id");
//
//        this.orderTacoInserter = new SimpleJdbcInsert(jdbc)
//                .withTableName("Taco_Order_Tacos");
//
//        this.objectMapper = new ObjectMapper();
//    }
//
//    @Override
//    public Order save(Order order) {
//        order.setPlacedAt(new Date());
//        Long orderId = saveOrderDetails(order);
//        order.setId(orderId);
////        List<Taco> tacos = order.getTacos();
// // todo
////        for (Taco taco : tacos) {
////            saveTacoToOrder(taco, orderId);
////        }
//        return order;
//    }
//
//    @Override
//    public List<Order> findByDeliveryZip(String deliveryZip) {
//        return null;
//    }
//
//    @Override
//    public List<Order> readOrdersByDeliveryZipAndPlacedAtBetween(String deliveryZop, Date startDate, Date endDate) {
//        return null;
//    }
//
//    private Long saveOrderDetails(Order order) {
//        @SuppressWarnings("unchecked")
//        Map<String, Object> values =
//                objectMapper.convertValue(order, Map.class);
//        values.put("placedAt", order.getPlacedAt());
//
//        Long orderId = orderInserter
//                .executeAndReturnKey(values)
//                .longValue();
//        return orderId;
//    }
//
//    private void saveTacoToOrder(Taco taco, Long orderId) {
//        Map<String, Object> values = new HashMap<>();
//        values.put("tacoOrder", orderId);
//        values.put("taco", taco.getId());
//        orderTacoInserter.execute(values);
//    }
//}
