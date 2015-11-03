package org.jellylab.helloworld.web.controller;

import org.jellylab.helloworld.model.HelloWorld;
import org.jellylab.helloworld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jinli Nov 3, 2015
 */
@Controller
@RequestMapping(value = "/helloworld/")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping(value = "index")
    public ModelAndView index(@RequestParam(value = "name", defaultValue = "jinli") String name) {
        HelloWorld helloWorld = helloWorldService.getHelloWorld(name);
        return new ModelAndView("helloworld/index", "helloWorld", helloWorld);
    }

}
