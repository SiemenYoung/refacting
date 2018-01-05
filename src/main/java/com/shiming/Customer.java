/**
 * @Title: Customer
 * @Package com.shiming
 * @Description: TODO
 * Copyright: Copyright (c) 2016
 * Company: 成都壹柒互动科技有限公司
 * @author yangshiming.ysm
 * @date 2018/1/4 12:53
 * @version V1.0
 */
package com.shiming;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @version 1.0.0
 * @Title: Customer
 * @Package: com.shiming
 * @Description: Copyright: Copyright (c) 2016
 * @Company: 成都壹柒互动科技有限公司
 * @author yangshiming.ysm
 * @date 2018/1/4 12:53
 */
public class Customer {

    private String name;

    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {

        Enumeration enumeration = rentals.elements();

        String result = "Rental Record for" + getName() + "\n";

        while (enumeration.hasMoreElements()) {
            Rental each = (Rental) enumeration.nextElement();

            result += "\t" + each.getMovie() + "\t" + String.valueOf( each.getCharge()) + "\n";

        }

        result += "Amount owed is" + String.valueOf( getTotalCharge()) +  "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) +  "frequent renter points";
        return result;

    }

    public double  getTotalCharge() {
        
        double totalAmount = 0;
        
        Enumeration enumeration = rentals.elements();

        while (enumeration.hasMoreElements()) {
            Rental each = (Rental) enumeration.nextElement();

            totalAmount +=  each.getCharge();
            
        }

        return totalAmount;
    }

    public double getFrequentRenterPoints() {

        int frequentRenterPoints = 0;

        Enumeration enumeration = rentals.elements();

        while (enumeration.hasMoreElements()) {
            Rental each = (Rental) enumeration.nextElement();
            
            frequentRenterPoints += each.getFrequentRenterPoints();

        }

        return frequentRenterPoints;
    }


}
