package pl.simple.shop.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
@Entity
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private BigDecimal price;
    private String desc;
    @ManyToMany
    List<OrderEntity> orders = new ArrayList<>();

    public ProductEntity(String name, BigDecimal price, String desc) {
        this.name = name;
        this.price = price;
        this.desc = desc;
    }
}
