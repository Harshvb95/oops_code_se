
//Problem Statement::
/*
  design a base class shape with two double type values and member function to 
  input the data and compute area() for calculating area of shape. Derive two classes 
  Triangle and Rectangle make compute area() as abstract function and redefine this function 
  in the derive class to suit their requirement .Write a program that accepts the dimension 
  of Triangle /Rectangle and display calculated area. Implement dynamic binding.
  */



//import java.io.*;
import java.util.*;

abstract class shape
{
    double length,height;
    abstract double compute_area();
}

class triangle extends shape
{
    void set_dimension (double b,double h)
    {
        length = b;
        height = h;
    }
    double compute_area()
    {
        double area;
        area = 0.5*length*height;
        return area;
    }
}

class rectangle extends shape
{
    void set_dimension (double l,double h)
    {
        length = l;
        height = h;
    }
    double compute_area()
    {
        double area;
        area = length*height;
        return area;
    }
}

public class oop_prac_4
{
    public static void main (String[] args)
    {
        double base,height,len,wid,area;
        triangle t1 = new triangle();
        rectangle r1 = new rectangle();
        
        System.out.printf("\nEnter Base of Triangle: ");
        Scanner in_obj = new Scanner(System.in);
        base = in_obj.nextDouble();
        
        System.out.printf("\nEnter Height of Triangle: ");
        height = in_obj.nextDouble();
        
        t1.set_dimension(base,height);
        area = t1.compute_area();
        System.out.printf("\nArea of Triangle is: "+area);
        
        System.out.printf("\nEnter Length of Rectangle: ");
        len = in_obj.nextDouble();
        
        System.out.printf("\nEnter Width of Rectangle: ");
        wid = in_obj.nextDouble();
        
        in_obj.close();
        
        r1.set_dimension(len,wid);
        area = r1.compute_area();
        System.out.printf("\nArea of Rectangle is: "+area);
    }
}