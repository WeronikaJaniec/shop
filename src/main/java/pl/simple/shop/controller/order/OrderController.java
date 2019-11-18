package pl.simple.shop.controller.order;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.simple.shop.service.order.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping
    ModelAndView getOrder(){
        ModelAndView mnv = new ModelAndView("order/orders");
        mnv.addObject("orders", orderService.getOrders());
        return mnv;
    }
}
