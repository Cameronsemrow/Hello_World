package edu.weber.cs1400.spring2020.introdutiontojava.programstructure;

//class block
public class MySecondProgram
{
    // method / function block
    public static void main(String[] args) //arguments or parameters
    {
        double area = calculateCircleArea(10);
        System.out.println("Area = " + area);
    }
    public static double calculateCircleArea(int radius)
    {
        double area = Math.PI * radius * radius;
        return area;
    }
}
