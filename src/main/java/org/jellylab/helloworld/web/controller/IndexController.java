package org.jellylab.helloworld.web.controller;

import org.jellylab.helloworld.model.HelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jinli Nov 3, 2015
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

    @RequestMapping(value = { "index", "" })
    public ModelAndView index(@RequestParam(value = "name", defaultValue = "jinli") String name) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName(name);
        helloWorld.setMessage("welcome " + name + " !");
        return new ModelAndView("helloworld/index", "helloWorld", helloWorld);
    }

}
