/**
 * @Title: Movie
 * @Package com.shiming
 * @Description: TODO
 * Copyright: Copyright (c) 2016
 * Company: 成都壹柒互动科技有限公司
 * @author yangshiming.ysm
 * @date 2018/1/4 12:49
 * @version V1.0
 */
package com.shiming;


public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;

    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int priceCode) {

        switch ( priceCode) {
            case Movie.REGULAR:

               price = new RegularPrice();

                break;
            case Movie.NEW_RELEASE:

                price = new NewReleasePrice();

                break;
            case Movie.CHILDRENS:

                price = new ChildrenPrice();

                break;


            default:
                throw new IllegalArgumentException("Incorrect price code");
        }

    }

    public double getCharge(int daysRental) {

        return price.getCharge(daysRental);
    }

    public int getFrequentRenterPoints(int daysRental){

        return price.getFrequentRenterPoints(daysRental);

    }
}
