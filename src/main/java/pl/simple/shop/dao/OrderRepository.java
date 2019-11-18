package pl.simple.shop.dao;

import org.springframework.data.repository.CrudRepository;
import pl.simple.shop.model.OrderEntity;

import java.util.List;

public interface OrderRepository extends CrudRepository<OrderEntity,Long> {
    List<OrderEntity> findAll();
}
