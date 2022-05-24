package com.example.tacocloud.web;

//import com.example.tacocloud.User;

import com.example.tacocloud.Order;
import com.example.tacocloud.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("order")
public class OrderController {

    private OrderRepository orderRepository;
//    private UserRepository userRepository;

    public OrderController() {
    }

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/current")
    public String orderForm(Model model) {
//        model.addAttribute("order", new Order());
        return "orderForm";
    }

    @PutMapping("/{orderId}")
    public Order putOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }

//    @PostMapping
//    public String processOrder(@Valid Order order, Errors errors,
//                               SessionStatus sessionStatus,
////                               Principal principal)
//                               @AuthenticationPrincipal User user)
//    {
//
//        if (errors.hasErrors()) {
//            return "orderForm";
//        }
//
////        User user = userRepository.findByUsername(principal.getName());
//        order.setUser(user);
//
//        orderRepository.save(order);
//        sessionStatus.setComplete();
//
//        return "redirect:/";
//    }
}
