package org.sz.entity;


/**
 * ProductForm 与 Product 类似，存在的原因位：
 * 表单类与 HTML表单相映射，是 HTML 表单在服务端的 [代表]
 * 表单对象传递 ServletRequest 给其他组件，ServletRequest 是一个Servlet对象，
 * 不应该暴露给应用的其它层。
 */

public class ProductForm {

    private String name;
    private String description;
    private String price;

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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
    
 }
