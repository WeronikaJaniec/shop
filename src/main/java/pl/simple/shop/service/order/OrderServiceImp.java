package pl.simple.shop.service.order;

import org.springframework.stereotype.Service;
import pl.simple.shop.dao.OrderRepository;
import pl.simple.shop.dto.OrderDTO;
import pl.simple.shop.mapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class OrderServiceImp implements OrderService{

    private final OrderRepository orderRepository;

    public OrderServiceImp(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<OrderDTO> getOrders() {
      return orderRepository.findAll().stream().map(ModelMapper::map).collect(Collectors.toList());
    }

}
