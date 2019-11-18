package pl.simple.shop.service.product;

import org.springframework.stereotype.Service;
import pl.simple.shop.dao.ProductRepository;
import pl.simple.shop.dto.CreateProductForm;
import pl.simple.shop.dto.ProductDTO;
import pl.simple.shop.exception.NotFoundProductException;
import pl.simple.shop.mapper.ModelMapper;
import pl.simple.shop.model.ProductEntity;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImp  implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<ProductDTO> getProducts() {
       return productRepository.findAll().stream().map(ModelMapper::map).collect(Collectors.toList());
    }

    @Override
    public void addProduct(CreateProductForm form) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(form.getName());
        productEntity.setDesc(form.getDescription());
        productEntity.setPrice(form.getPrice());
        productRepository.save(productEntity);
    }

    @Override
    public ProductDTO getProductById(long idProduct) throws NotFoundProductException {
        Optional<ProductEntity> byID = productRepository.findById(idProduct);

      return byID
              .map(ModelMapper::map)
              .orElseThrow(()-> new NotFoundProductException("Not found product with id: " + idProduct));
    }

}
