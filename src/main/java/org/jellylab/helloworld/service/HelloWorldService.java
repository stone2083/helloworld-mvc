package org.jellylab.helloworld.service;

import org.jellylab.helloworld.dao.HelloWorldDao;
import org.jellylab.helloworld.model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jinli Nov 3, 2015
 */
@Service
public class HelloWorldService {

    @Autowired
    private HelloWorldDao helloWorldDao;

    public HelloWorld getHelloWorld(String name) {
        HelloWorld helloWorld = helloWorldDao.findByName(name);
        return helloWorld;
    }

}
