package xyz;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int sal;
      double da,hra,pf,gross;
      System.out.println("Enter the salary :");
      Scanner sc= new Scanner(System.in);
      sal=sc.nextInt();
      da=sal*12/100;
      hra=sal*13/100;
      pf=sal*15/100;
      gross=sal+da+hra+pf;
      System.out.println("the salary wass: "+sal+" the da was: "+da+" the hra was: "+hra+" the pf was:"+pf+"total gross was:/"+gross);
      
      
      }

}
