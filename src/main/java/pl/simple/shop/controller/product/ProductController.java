package pl.simple.shop.controller.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.simple.shop.dto.ProductDTO;
import pl.simple.shop.exception.NotFoundProductException;
import pl.simple.shop.service.product.ProductService;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping
    ModelAndView getProductsPage(){
        ModelAndView mnv = new ModelAndView("products");
        List<ProductDTO> products = productService.getProducts();
        mnv.addObject("products",products);
        return mnv;
    }

    @RequestMapping("/{idProduct}")
    ModelAndView getProductPageById(@PathVariable long idProduct) throws NotFoundProductException {
        ModelAndView mnv = new ModelAndView("product");
        mnv.addObject("product",productService.getProductById(idProduct));
        return mnv;
    }

}
