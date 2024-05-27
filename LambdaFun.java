package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@FunctionalInterface
interface Fun8
{
	//void sample();
	//int demo(int a,int b);
	int method(int a);
}

public class LambdaFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Fun8 obj=()->System.out.println("functional interface");
//		obj.sample();
//		Fun8 ob=( a, b)->a*b;
//		System.out.println(ob.demo(20, 10));
		Fun8 obj1=a->a;
		System.out.println(obj1.method(5));
		
		Runnable r=()->System.out.println("run method");
		Thread t=new Thread(r);
		t.start();
		LocalDate d=LocalDate.now();
		LocalTime tt=LocalTime.now();
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(d);
		System.out.println(tt);
		System.out.println(dt);
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy ss:mm:HH");
        String fd=dt.format(dtf);
        System.out.println(fd);
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MMM/E/yyyy");
        String fd1=d.format(dtf1);
        System.out.println(fd1);
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("ss:mm:HH");
        String fd2=tt.format(dtf2);
        System.out.println(fd2);
        Scanner sc=new Scanner(System.in);
        DateTimeFormatter date=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date1=sc.next();
        String date2=date1.formatted(date);
        System.out.println(date1);
        System.out.println(date2);
       
        
		
	}

}
