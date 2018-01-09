/**
 * @Title: Price
 * @Package com.shiming
 * @Description: TODO
 * Copyright: Copyright (c) 2016
 * Company: 成都壹柒互动科技有限公司
 * @author yangshiming.ysm
 * @date 2018/1/8 13:23
 * @version V1.0
 */
package com.shiming;


public abstract class Price {

    abstract int getPriceCode();

    abstract double getCharge(int daysRental) ;

    public int getFrequentRenterPoints(int daysRental){
        return 0;
    }
}
