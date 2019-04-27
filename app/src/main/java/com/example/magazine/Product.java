package com.example.magazine;

class Product{

private String name;
private String content;
private int image;

public Product(String name, String content, int image){

        this.name=name;
        this.content = content;
        this.image = image;
        }

public String getName() {
        return this.name;
        }

public void setName(String name) {
        this.name = name;
        }

public String getCompany() {
        return this.content;
        }

public void setCompany(String company) {
        this.content = company;
        }

public int getImage() {
        return this.image;
        }

public void setImage(int image) {
        this.image = image;
        }
        }
