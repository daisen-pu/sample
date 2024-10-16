package com.example.sample.controller;

import com.example.sample.module.SampleMudule;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ResponseBody
public class SampleController {

    @RequestMapping("/hi")
    public String indexPage() {
        SampleMudule sampleMudule = new SampleMudule();
        sampleMudule.setAge(18);
        sampleMudule.setName("daisen");
        return "<h1>Hi,Spring MVC.</h1>";
//        ModelAndView mav = new ModelAndView("index");
//
//        return mav;
    }
}
