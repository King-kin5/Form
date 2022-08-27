package com.form;
import com.model.PersonForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Formcontroller {
@RequestMapping(value = {"/display","/homepage.html"},method= RequestMethod.GET)
    public ModelAndView displayForm(){
    ModelAndView mv=new ModelAndView("homepage");
    mv.addObject("user");
    return mv;
}
}
