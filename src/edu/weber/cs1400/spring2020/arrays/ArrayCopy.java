package edu.weber.cs1400.spring2020.arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        double[] pricesJanuary = new double[]{4.5, 7.2, 11, 84.1, 21.21};
        double[] pricesFebruary = new double[5];

        for (int i = 0; i < 5; i++) {
            pricesFebruary[i] = pricesJanuary[i];
        }
        pricesFebruary[1] = 20;

        for(int i = 0; i < 5; ++i){
            System.out.println(pricesFebruary[i]);
        }
        System.out.println("");
        for(int i = 0; i < 5; ++i){
            System.out.println(pricesJanuary[i]);
        }

    }
}
