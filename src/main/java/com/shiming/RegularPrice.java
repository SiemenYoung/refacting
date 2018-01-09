/**
 * @Title: RegularPrice
 * @Package com.shiming
 * @Description: TODO
 * Copyright: Copyright (c) 2016
 * Company: 成都壹柒互动科技有限公司
 * @author yangshiming.ysm
 * @date 2018/1/9 11:51
 * @version V1.0
 */
package com.shiming;

/**
 * @version 1.0.0
 * @Title: RegularPrice
 * @Package: com.shiming
 * @Description: Copyright: Copyright (c) 2016
 * @Company: 成都壹柒互动科技有限公司
 * @author yangshiming.ysm
 * @date 2018/1/9 11:51
 */
public class RegularPrice extends Price {

    public double getCharge(int daysRental) {

        int result=0;
        result +=2;
        if (  daysRental > 2) {
            result += (  daysRental - 2)*1.5;
        }

        return result;
    }

    int getPriceCode() {
        return Movie.REGULAR;
    }
}
