package org.telegram.messenger;

public class Sticker {
    private String id;
    private String name;
    private String imageUrl;
    private boolean isPremium;
    private int price;

    public Sticker(String id, String name, String imageUrl, boolean isPremium, int price) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.isPremium = isPremium;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public int getPrice() {
        return price;
    }
} 