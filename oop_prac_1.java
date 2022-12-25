//Problem Statement::
/*
Design a class ‘Complex ‘with data members for real and imaginary part. 
Provide default and Parameterized constructors. Write a program to perform 
arithmetic operations of two complex numbers.
*/

import java.util.*;

class Complex_No{
    float real,img;
    public Complex_No() {
        real = 0;
        img = 0;
    }
    public Complex_No(float a, float b) {
        real = a;
        img = b;
    }
    public void Display(Complex_No C1, Complex_No C2) {
        System.out.println("\nFirst Complex Numbers = ("+C1.real+")+("+C1.img+")i");
        System.out.println("\nSecond Complex Numbers = ("+C2.real+")+("+C2.img+")i");
    }
    public void AddNumbers(Complex_No C1, Complex_No C2) {
        float real,img;
        real = (C1.real + C2.real);
        img = (C1.img + C2.img);
        System.out.println("\nAddition of Complex Numbers = ("+real+") + ("+img+")i");
    }
    public void SubNumbers(Complex_No C1, Complex_No C2) {
        float real,img;
        real = (C1.real - C2.real);
        img = (C1.img - C2.img);
        System.out.println("\nSubtraction of Complex Numbers = ("+real+") + ("+img+")i");
    }
    public void MultiNumbers(Complex_No C1, Complex_No C2) {
        float real,img;
        real = (C1.real*C2.real-C1.img*C2.img);
        img = (C1.real*C2.img+C1.img*C2.real);
        System.out.println("\nMultiplication of Complex Numbers = ("+real+") + ("+img+")i");
    }
    public void DivNumbers(Complex_No C1, Complex_No C2) {
        float real,img;
        real = (C1.real*C2.real+C1.img*C2.img)/(C2.real*C2.real+C2.img*C2.img);
        img = (C1.img*C2.real-C1.real*C2.img)/(C2.real*C2.real+C2.img*C2.img);
        System.out.println("\nDivision of Complex Numbers = ("+real+") + ("+img+")i");
    }
}



public class oop_prac_1 {
    public static void main(String args[]) {
        float num1,num2;
        Complex_No cal = new Complex_No();
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Complex number in a+bi format.\n");
        
        System.out.print("Enter real part of First Number, a : ");
        num1 = Sc.nextFloat();
        System.out.print("Enter img part of First Number, b : ");
        num2 = Sc.nextFloat();
        Complex_No Com1 = new Complex_No(num1,num2);
        
        System.out.print("\nEnter real part of Second Number, a : ");
        num1 = Sc.nextFloat();
        System.out.print("Enter img part of Second Number, b : ");
        num2 = Sc.nextFloat();
        Complex_No Com2 = new Complex_No(num1,num2);
        Sc.close();
        
        System.out.print("\n");
        cal.Display(Com1,Com2);
        System.out.print("\n");
        cal.AddNumbers(Com1,Com2);
        cal.SubNumbers(Com1,Com2);
        cal.MultiNumbers(Com1,Com2);
        cal.DivNumbers(Com1,Com2);
      
    }
}