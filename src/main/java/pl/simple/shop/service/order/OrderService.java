package pl.simple.shop.service.order;


import pl.simple.shop.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    List<OrderDTO> getOrders();
    //void placeOrder(String userName, List<Long> idProducts);
}
