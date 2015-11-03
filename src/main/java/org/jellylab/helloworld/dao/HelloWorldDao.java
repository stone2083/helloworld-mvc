package org.jellylab.helloworld.dao;

import org.jellylab.helloworld.model.HelloWorld;

/**
 * @author jinli Nov 3, 2015
 */
public interface HelloWorldDao {

    HelloWorld findByName(String name);

}
