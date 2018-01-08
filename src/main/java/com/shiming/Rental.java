/**
 * @Title: Rental
 * @Package com.shiming
 * @Description: TODO
 * Copyright: Copyright (c) 2016
 * Company: 成都壹柒互动科技有限公司
 * @author yangshiming.ysm
 * @date 2018/1/4 12:52
 * @version V1.0
 */
package com.shiming;

/**
 * @version 1.0.0
 * @Title: Rental
 * @Package: com.shiming
 * @Description: Copyright: Copyright (c) 2016
 * @Company: 成都壹柒互动科技有限公司
 * @author yangshiming.ysm
 * @date 2018/1/4 12:52
 */
public class Rental {

    private Movie movie;

    private int daysRental;

    public Rental(Movie movie, int daysRental) {
        this.movie = movie;
        this.daysRental = daysRental;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getDaysRental() {
        return daysRental;
    }

    public void setDaysRental(int daysRental) {
        this.daysRental = daysRental;
    }

    public double getCharge() {

        return movie.getCharge(daysRental);
    }

    public int getFrequentRenterPoints(){

        return movie.getFrequentRenterPoints(daysRental);
    }
}
