package pl.simple.shop.controller;

import javassist.NotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import pl.simple.shop.exception.NotFoundProductException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundProductException.class)
    ModelAndView notFoundException(NotFoundException e){
        ModelAndView mnv = new ModelAndView("errorPage");
        mnv.addObject("message",e.getMessage());
        return mnv;
    }
}
