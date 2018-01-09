/**
 * @Title: ChildrenPrice
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
 * @Title: ChildrenPrice
 * @Package: com.shiming
 * @Description: Copyright: Copyright (c) 2016
 * @Company: 成都壹柒互动科技有限公司
 * @author yangshiming.ysm
 * @date 2018/1/9 11:55
 */
public class ChildrenPrice extends Price {
    public double getCharge(int daysRental) {

        int result=0;

        result +=1.5;
        if (  daysRental > 3) {
            result += (  daysRental - 3)*1.5;
        }

        return result;
    }

    int getPriceCode() {
        return Movie.CHILDRENS;
    }
}
