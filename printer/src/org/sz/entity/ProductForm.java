package org.sz.entity;


/**
 * ProductForm �� Product ���ƣ����ڵ�ԭ��λ��
 * ������ HTML����ӳ�䣬�� HTML ���ڷ���˵� [����]
 * �����󴫵� ServletRequest �����������ServletRequest ��һ��Servlet����
 * ��Ӧ�ñ�¶��Ӧ�õ������㡣
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
