package org.sz.entity;

import java.io.Serializable;


/**
 * 实现Serializable 接口，其实例可以安全的保存到  HttpSession
 */
public class Product implements Serializable {

    //Serializable要求实现serialVersionUID
    private static final long serialVersionUID = 1l;
    private String name;
    private String description;
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}