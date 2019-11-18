package pl.simple.shop.service.product;

import pl.simple.shop.dto.CreateProductForm;
import pl.simple.shop.dto.ProductDTO;
import pl.simple.shop.exception.NotFoundProductException;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getProducts();
    void addProduct(CreateProductForm form);
    ProductDTO getProductById(long idProduct) throws NotFoundProductException;
}
