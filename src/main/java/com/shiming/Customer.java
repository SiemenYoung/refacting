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
        double totalAmount = 0;

        int frequentRenterPoints = 0;

        Enumeration enumeration = rentals.elements();

        String result = "Rental Record for" + getName() + "\n";

        while (enumeration.hasMoreElements()) {
            Rental each = (Rental) enumeration.nextElement();

            double thisAmount = amountFor(each);


            frequentRenterPoints ++;

            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)&& each.getDaysRental() >1 ) frequentRenterPoints++;

            result += "\t" + each.getMovie() + "\t" + String.valueOf(thisAmount) + "\n";

            totalAmount += thisAmount;

        }

        result += "Amount owed is" + String.valueOf(totalAmount) +  "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) +  "frequent renter points";
        return result;

    }

    private int amountFor(Rental each) {

        int thisAmount = 0;


        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount +=2;
                if (each.getDaysRental() > 2) {
                    thisAmount += (each.getDaysRental() - 2)*1.5;
                }
                break;
            case Movie.NEW_RELEASE:

                thisAmount += each.getDaysRental() *3;

                break;
            case Movie.CHILDRENS:
                thisAmount +=1.5;
                if (each.getDaysRental() > 3) {
                    thisAmount += (each.getDaysRental() - 3)*1.5;
                }
                break;

        }

        return thisAmount;
    }
}
