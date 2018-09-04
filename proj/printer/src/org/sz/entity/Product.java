package org.sz.entity;

import java.io.Serializable;


/**
 * ʵ��Serializable �ӿڣ���ʵ�����԰�ȫ�ı��浽  HttpSession
 */
public class Product implements Serializable {

    //SerializableҪ��ʵ��serialVersionUID
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