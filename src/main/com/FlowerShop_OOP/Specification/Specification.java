package main.com.FlowerShop_OOP.Specification;

import java.util.Date;

public  abstract class Specification{
    private int price;
    private String smell;
    private int lengthOfStem;
    private Date freshness;
    private String originCountry;

    Specification(int price,  String smell,
                  int lengthOfStem, Date freshness, String originCountry) {
        this.price = price;
        this.smell = smell;
        this.lengthOfStem = lengthOfStem;
        this.freshness = freshness;
        this.originCountry = originCountry;
    }

    public int getPrice() {
        return price;
    }



    public String getSmell() {
        return smell;
    }

    public int getLengthOfStem() {
        return lengthOfStem;
    }

    public Date getFreshness() {
        return freshness;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public void setSmell(String smell) {
        this.smell = smell;
    }

    public void setLengthOfStem(int lengthOfStem) {
        this.lengthOfStem = lengthOfStem;
    }

    public void setFreshness(Date freshness) {
        this.freshness = freshness;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }



    @Override
    public String toString() {
        return "Specification{" +
                "price=" + price +
                ", smell='" + smell + '\'' +
                ", lengthOfStem=" + lengthOfStem +
                ", freshness=" + freshness +
                ", originCountry='" + originCountry + '\'' +
                '}';
    }


}
