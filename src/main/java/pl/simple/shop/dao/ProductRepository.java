package pl.simple.shop.dao;

import org.springframework.data.repository.CrudRepository;
import pl.simple.shop.model.ProductEntity;

import java.util.List;

public interface ProductRepository extends CrudRepository<ProductEntity,Long> {
    List<ProductEntity> findAll();
}
