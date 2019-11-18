package pl.simple.shop.mapper;

import pl.simple.shop.dto.OrderDTO;
import pl.simple.shop.dto.ProductDTO;
import pl.simple.shop.model.OrderEntity;
import pl.simple.shop.model.ProductEntity;

import java.util.stream.Collectors;

public class ModelMapper {
    private ModelMapper (){
    }

    public static ProductDTO map(ProductEntity productEntity){
        return new ProductDTO(productEntity.getId(),productEntity.getName(),productEntity.getPrice(),productEntity.getDesc());
    }

    public static OrderDTO map(OrderEntity orderEntity){
       OrderDTO orderDTO = new OrderDTO();
       orderDTO.setId(orderEntity.getId());
       orderDTO.setStatus(orderEntity.getStatus());
       orderDTO.setProducts(orderEntity.getProducts().stream().map(ModelMapper::map).collect(Collectors.toList()));
       return orderDTO;
    }
}
