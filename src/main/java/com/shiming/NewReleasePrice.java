/**
 * @Title: NewReleasePrice
 * @Package com.shiming
 * @Description: TODO
 * Copyright: Copyright (c) 2016
 * Company: 成都壹柒互动科技有限公司
 * @author yangshiming.ysm
 * @date 2018/1/9 11:55
 * @version V1.0
 */
package com.shiming;

/**
 * @version 1.0.0
 * @Title: NewReleasePrice
 * @Package: com.shiming
 * @Description: Copyright: Copyright (c) 2016
 * @Company: 成都壹柒互动科技有限公司
 * @author yangshiming.ysm
 * @date 2018/1/9 11:55
 */
public class NewReleasePrice extends Price {


    public double getCharge(int daysRental) {

        int result = 0;

        result +=   daysRental *3;

        return result;
    }

    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public int getFrequentRenterPoints(int daysRental) {
        return daysRental > 1 ? 2 : 1;
    }
}
