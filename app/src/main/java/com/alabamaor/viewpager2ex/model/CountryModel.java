package com.alabamaor.viewpager2ex.model;

public class CountryModel {


    String image;
    String name;
    String capital;
    boolean isSelected;

    public CountryModel(String image, String name, String capital) {
        this.isSelected = false;
        this.image = image;
        this.name = name;
        this.capital = capital;
    }

    public String getImage() {
        return image;
    }

    public CountryModel setImage(String image) {
        this.image = image;
        return this;
    }

    public String getName() {
        return name;
    }

    public CountryModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getCapital() {
        return capital;
    }

    public CountryModel setCapital(String capital) {
        this.capital = capital;
        return this;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public CountryModel setSelected(boolean selected) {
        isSelected = selected;
        return this;
    }
}
