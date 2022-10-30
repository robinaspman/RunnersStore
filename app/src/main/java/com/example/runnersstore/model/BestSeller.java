package com.example.runnersstore.model;

public class BestSeller {

    private String name;
    private String imageUrl;
    private String price;
    private String rating;
    private String type;

    public BestSeller(String name, String type, String imageUrl, String rating, String price) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.rating = rating;
        this.price = price;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getGender() {
        return rating;
    }

    public void setGender(String rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
