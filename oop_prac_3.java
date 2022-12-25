//Problem Statement::
/*
Design and develop inheritance for a given case study, identify objects and relationships 
and implement inheritance wherever applicable. Employee class has Emp_name, Emp_id, 
Address, Mail_id, and Mobile_no as members. Inherit the classes: Programmer, Team Lead, 
Assistant Project Manager and Project Manager from employee class. Add Basic Pay (BP) as 
the member of all the inherited classes . with 97% of BP as DA, 10 % of BP as HRA, 12% of 
BP as PF, 0.1% of BP for staff club fund. Generate pay slips for the employees with their 
gross and net salary 
*/ 


import java.util.Scanner;
//import java.io.*;
class Employee
{
    String Emp_name,Address;
    String Mail_id,Mobile_no;
    int Emp_id;
    
    public void input_emp()
    {
        Scanner in_obj = new Scanner(System.in);
        System.out.printf("\nEnter Employee ID::");
        Emp_id = in_obj.nextInt();
        System.out.printf("\nEnter Name::");
        Emp_name = in_obj.next();
        System.out.printf("\nEnter Address::");
        Address = in_obj.next();
        System.out.printf("\nEnter Mobile Number::");
        Mobile_no = in_obj.next();
        System.out.printf("\nEnter E-Mail ID::");
        Mail_id = in_obj.next();
        
        
    }
    
    public void display_emp()
    {
        System.out.printf("\nEnter Employee ID :: "+Emp_id);
        System.out.printf("\nEnter Name :: "+Emp_name);
        System.out.printf("\nEnter Address :: "+Address);
        System.out.printf("\nEnter Mobile Number :: "+Mobile_no);
        System.out.printf("\nEnter E-Mail ID :: "+Mail_id);
    }
}

class Programmer extends Employee
{
    double Basic_Pay;
    double gross_sal,net_sal;
    
    public Programmer()
    {
        super();
        Basic_Pay = 0;
    }
    public void set_basepay(double bp)
    {
        Basic_Pay = bp;
    }
    public void calculate_salary()
    {
        gross_sal = Basic_Pay + (Basic_Pay*0.97);
        net_sal = gross_sal - (Basic_Pay*0.12) - (Basic_Pay*0.1) - (Basic_Pay*0.001);
    }
    
    public void disp_prog()
    {
        display_emp();
        System.out.printf("\nBasic Pay::"+Basic_Pay);
        System.out.printf("\nDA::"+(Basic_Pay*0.97));
        System.out.printf("\nGross Salary::"+gross_sal);
        System.out.printf("\n\nPF::"+(Basic_Pay*0.12));
        System.out.printf("\nHRA::"+(Basic_Pay*0.1));
        System.out.printf("\nStaff Club Fund::"+(Basic_Pay*0.001));
        System.out.printf("\nNet Salary ="+net_sal);
    }
}

class Team_Lead extends Employee
{
    double Basic_Pay;
    double gross_sal,net_sal;
    
    public Team_Lead()
    {
        super();
        Basic_Pay = 0;
    }
    public void set_basepay(double bp)
    {
        Basic_Pay = bp;
    }
    public void calculate_salary()
    {
        gross_sal = Basic_Pay + (Basic_Pay*0.97);
        net_sal = gross_sal - (Basic_Pay*0.12) - (Basic_Pay*0.1) - (Basic_Pay*0.001);
    }
    
    public void disp_tl()
    {
        display_emp();
        System.out.printf("\nBasic Pay::"+Basic_Pay);
        System.out.printf("\nDA::"+(Basic_Pay*0.97));
        System.out.printf("\nGross Salary::"+gross_sal);
        System.out.printf("\n\nPF::"+(Basic_Pay*0.12));
        System.out.printf("\nHRA::"+(Basic_Pay*0.1));
        System.out.printf("\nStaff Club Fund::"+(Basic_Pay*0.001));
        System.out.printf("\nNet Salary ="+net_sal);
    }
}

class Assistant_Project_Manager extends Employee
{
    double Basic_Pay;
    double gross_sal,net_sal;
    
    public Assistant_Project_Manager()
    {
        super();
        Basic_Pay = 0;
    }
    public void set_basepay(double bp)
    {
        Basic_Pay = bp;
    }
    public void calculate_salary()
    {
        gross_sal = Basic_Pay + (Basic_Pay*0.97);
        net_sal = gross_sal - (Basic_Pay*0.12) - (Basic_Pay*0.1) - (Basic_Pay*0.001);
    }
    
    public void disp_apm()
    {
        display_emp();
        System.out.printf("\nBasic Pay::"+Basic_Pay);
        System.out.printf("\nDA::"+(Basic_Pay*0.97));
        System.out.printf("\nGross Salary::"+gross_sal);
        System.out.printf("\n\nPF::"+(Basic_Pay*0.12));
        System.out.printf("\nHRA::"+(Basic_Pay*0.1));
        System.out.printf("\nStaff Club Fund::"+(Basic_Pay*0.001));
        System.out.printf("\nNet Salary ="+net_sal);
    }
}

class Project_Manager extends Employee
{
    double Basic_Pay;
    double gross_sal,net_sal;
    
    public Project_Manager()
    {
        super();
        Basic_Pay = 0;
    }
    public void set_basepay(double bp)
    {
        Basic_Pay = bp;
    }
    public void calculate_salary()
    {
        gross_sal = Basic_Pay + (Basic_Pay*0.97);
        net_sal = gross_sal - (Basic_Pay*0.12) - (Basic_Pay*0.1) - (Basic_Pay*0.001);
    }
    
    public void disp_pm()
    {
        display_emp();
        System.out.printf("\nBasic Pay::"+Basic_Pay);
        System.out.printf("\nDA::"+(Basic_Pay*0.97));
        System.out.printf("\nGross Salary::"+gross_sal);
        System.out.printf("\n\nPF::"+(Basic_Pay*0.12));
        System.out.printf("\nHRA::"+(Basic_Pay*0.1));
        System.out.printf("\nStaff Club Fund::"+(Basic_Pay*0.001));
        System.out.printf("\nNet Salary ="+net_sal);
    }
}

public class oop_prac_3
{
    public static void main(String[] args)
    {
        double Base_Pay;
        int choice;
        Scanner in_obj = new Scanner(System.in);
        
        do
        {
            System.out.printf("\n\nEmployee Salary Slip Generator::");
            System.out.printf("\n1.Programmer\n2.Team Lead\n3.Assistant Project Manager\n4.Project Manager\n5.Exit");
            
            System.out.printf("\nEnter Choice::\t");
            choice = in_obj.nextInt();
            switch(choice)
            {
                case 1:
                Programmer p1 = new Programmer();
                System.out.printf("\nEnter Information for Employee::");
                p1.input_emp();
                System.out.printf("\nEmployee Base Pay of Programmer::");
                Base_Pay = in_obj.nextDouble();
                p1.set_basepay(Base_Pay);
                p1.calculate_salary();
                p1.disp_prog();
                break;    
                
                case 2:
                Team_Lead t1 = new Team_Lead();
                System.out.printf("\nEnter Information for Employee::");
                t1.input_emp();
                System.out.printf("\nEmployee Base Pay of Team Lead::");
                Base_Pay = in_obj.nextDouble();
                t1.set_basepay(Base_Pay);
                t1.calculate_salary();
                t1.disp_tl();
                break;
                
                case 3:
                Assistant_Project_Manager apm1 = new Assistant_Project_Manager();
                System.out.printf("\nEnter Information for Employee::");
                apm1.input_emp();
                System.out.printf("\nEmployee Base Pay of Assistant Project Manager::");
                Base_Pay = in_obj.nextDouble();
                apm1.set_basepay(Base_Pay);
                apm1.calculate_salary();
                apm1.disp_apm();    
                break;
                
                case 4:
                Project_Manager pm1 = new Project_Manager();
                System.out.printf("\nEnter Information for Employee::");
                pm1.input_emp();
                System.out.printf("\nEmployee Base Pay of Project Manager::");
                Base_Pay = in_obj.nextDouble();
                pm1.set_basepay(Base_Pay);
                pm1.calculate_salary();
                pm1.disp_pm();    
                break;    
                
                case 5:
                System.out.printf("Program Exiting!!!");
                break;
                
                default:
                System.out.printf("\nEnter Valid Option!!!");
                break;
            }
        }while(choice!=5);
        
        
        
    }
}

// import java.util.*;

// class Employee
// {
//     String emp_name, address;
//     String mail_id, mob_no;
//     int emp_id;
    
//     public void inp_emp()
//     {
//         Scanner in_obj = next Scanner(System.in);
//         System.out.println("Enter employee name :: ");
//         emp_name = in_obj.next();
//         System.out.println("Enter employee id :: ");
//         emp_id = in_obj.nextInt();
//         System.out.println("Enter employee address ::");
//         address =  in_obj.next();
//         System.out.println("Enter employee mail :: ");
//         mail_id =  in_obj.next();
//         System.out.println("Enter employee mobile :: ");
//         mob_no =  in_obj.next();
//     }
    
//     public void display_emp()
//     {
//         System.out.println("\nEmployee name :: " + emp_name);
//         System.out.println("\nEmployee id :: " +emp_id);
//         System.out.println("\nEmployee address :: "+address);
//         System.out.println("\nEmployee mail ide :: "+mail_id);
//         System.out.println("\nEmployee mobile number :: "+mob_no);
//     }
// }

// class Programmer extends Employee
// {
//     double basic_pay;
//     double gross_sal, net_sal;
    
//     public Programmer()
//     {
//         super();
//         basic_pay = 0;
//     }
    
//     public set_basepay(double bp)
//     {
//         basic_pay = bp;
//     }
    
//     public calc_sal()
//     {
//         gross_sal = basic_pay + (basic_pay*0.97);
//         net_sal = gross_sal - (basic_pay*0.12) - (basic_pay*0.1)-(basic_pay*0.01);
//     }
    
//     public void disp_prog()
//     {
//         display_emp();
//         System.out.println("Basic Pay : "+ basic_pay);
//         System.out.println("gross Salary : "+gross_sal);
//         System.out.println("Net Salary : "+net_sal);
        
//     }
// }

// public class Main
// {
//     public static void main (String[] args )
//     {
//         int choice;
//         double base_pay;
        
//         Scanner in_obj = new Scanner(System.in);
        
//         do
//         {
//             System.out.printf("\nEmployee Salary Slip Generator::");
//             System.out.printf("\n1.Programmer\n2.Team Lead\n3.Assistant Project Manager\nn4.Project Manager\n5.Exit");
            
//             System.out.printf("\nEnter Choice::\t");
//             choice = in_obj.nextInt();
            
//             switch(choice)
//             {
//                 case 1:
                    
//             }
//         }
//     }
// }