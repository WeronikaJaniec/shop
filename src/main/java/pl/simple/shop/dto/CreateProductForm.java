package pl.simple.shop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
@Getter
@Setter
@ToString
public class CreateProductForm {
    private String name;
    private BigDecimal price;
    private String description;
}
