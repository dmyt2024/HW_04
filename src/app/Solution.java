package app;

public class Solution {

    public static void main(String[]args){



                         // SMARTPHONE

        String prodNumb = "Product №";
        String prodName = "smartphone";
        String totalSales = "total sales for";
        String salesBy = "sales by day is";
        String dayIs = "day is";
        String currancy = "EUR";
        int numberPro = 1;

        double priceSmart = 607.6705;
        int smartSaleDay = 4;
        int totalDaysSale = 5;
        double sumSalesDay = priceSmart * smartSaleDay;
        double totalSum = sumSalesDay * totalDaysSale;

        System.out.printf("%s %d: %s,\n%s %d %s %s %.2f,\n%s %s %.2f.\n",
                prodNumb, numberPro, prodName, totalSales, totalDaysSale,
                dayIs, currancy, totalSum, salesBy, currancy, sumSalesDay);



                               //LAPTOP

        prodName = "laptop";
        numberPro = 2;
        priceSmart = 499.37381;
        smartSaleDay = 3;
        totalDaysSale = 7;
        sumSalesDay = priceSmart * smartSaleDay;
        totalSum = sumSalesDay * totalDaysSale;

        System.out.printf("%s %d: %s,\n%s %d %s %s %.2f,\n%s %s %.2f.",
                prodNumb, numberPro, prodName, totalSales, totalDaysSale,
                dayIs, currancy, totalSum, salesBy, currancy, sumSalesDay);









    }




}
