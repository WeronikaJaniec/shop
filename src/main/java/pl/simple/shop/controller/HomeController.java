package pl.simple.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping
    public ModelAndView getIndexPage(){
        ModelAndView mnv = new ModelAndView("index");
        mnv.addObject("username","Test userName");
        return mnv;
    }
}
