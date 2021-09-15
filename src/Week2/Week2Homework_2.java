package Week2;

import java.util.Scanner;

public class Week2Homework_2 {


    public static void main(String[] args) {
        System.out.println("Please enter base salary: ");
        Scanner scanner = new Scanner (System.in);
        double baseSalary = scanner.nextInt();
        System.out.println("Please enter the weekday time: ");
        double weekdayTime = scanner.nextInt();
        System.out.println("Please enter the weekend time: ");
        double weekendTime = scanner.nextInt();

        System.out.println("Please enter the number of years you have worked: ");
        int year = scanner.nextInt();
        RaiseCalculation raiseCalculation=new RaiseCalculation();
        raiseCalculation.year= year;
        scanner.close();


        double totalTime=weekendTime+weekdayTime;
        double unitCharge=baseSalary/40;
        double x=unitCharge*1.5*(weekdayTime-40);
        double y=unitCharge*2*weekendTime;
        double z=unitCharge*2*(totalTime-40);
        double totalSalary=0;
        double salary=0;


        if(baseSalary<=999)
        {
            System.out.println("You entered the base salary less than 1000 euros");
        }
        else if(weekdayTime<0 || weekendTime<0 )
        {
            System.out.println("The total weekly working hours cannot be less than at least zero hours.");
        }
        else if(40>totalTime && totalTime>=0)
        {
            System.out.println("Your salary is "+(baseSalary*totalTime)/40+" euros.1");
        }
        else if((weekdayTime<40 || weekendTime<40) && totalTime==40)
        {
            System.out.println("Your salary is "+baseSalary+" euros.2");
        }
        else if(weekdayTime>=120 || weekendTime>=48 )
        {
            System.out.println("Please enter consistent working hours.");
        }
        else if((weekdayTime==40 && weekendTime==0)||(weekdayTime==0 && weekendTime==40) )
        {
            System.out.println("Your salary is "+baseSalary+" euros.3");
        }
        else if(totalTime>40)
        {
           if(weekdayTime>40 && weekendTime>10) // 1 2 3
           {
               salary=x+y+baseSalary+500;
           }
           else if(weekdayTime>40 && 10>=weekendTime) // 1 2
           {
               salary=x+y+baseSalary;
           }
           else if(weekdayTime>40 && weekendTime==0) // 1
           {
               salary=x+baseSalary;
           }
           else if(weekdayTime<40 && weekendTime>10) //2
           {
               salary=z+baseSalary;
           }
           else if(weekdayTime==40 && weekendTime>=10) //  2 3
           {
               salary=z+baseSalary+500;
           }
           else if(weekdayTime==40 && 10>weekendTime && weekendTime>0) //  2 3
           {
               salary=z+baseSalary;
           }
            totalSalary=((salary)*raiseCalculation.raiseCalculation())+salary;
            System.out.println("Your salary is "+totalSalary+" euros.");
        }
    }


}
