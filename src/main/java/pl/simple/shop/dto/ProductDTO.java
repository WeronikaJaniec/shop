package pl.simple.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
@AllArgsConstructor
@Getter
public class ProductDTO {
    private long id;
    private String name;
    private BigDecimal price;
    private String desc;
}
