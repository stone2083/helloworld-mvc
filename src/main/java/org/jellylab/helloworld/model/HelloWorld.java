package org.jellylab.helloworld.model;

import java.io.Serializable;

/**
 * @author jinli Nov 3, 2015
 */
public class HelloWorld implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
