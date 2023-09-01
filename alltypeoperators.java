package xyz;

public class alltypesoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=20;
          int b=10;
          // Arithmatic operators
          int sum = a + b;
          int difference = a-b;
          int product = a* b;
          int quotient = a/b;
          int remainder= a%b;
           System.out.println("Arithment operators:");
           System.out.println("sum: "+ sum);
           System.out.println("difference:"+ difference);
           System.out.println("product:"+product);
           System.out.println("quotient:"+ quotient);
           System.out.println("remainder:"+remainder);
           
           // relational operators
           boolean isEqual =a ==b;
           boolean isnotEqual =a !=b;
           boolean isGreaterThen = a >b;
           boolean isLessThen =a<b;
           boolean isGreaterThenOrEqual =a>=b;
           boolean isLessThenOrEqual =a <=b;
           
           System.out.println("nRelational operators:");
           System.out.println("Equal:"+ isEqual);
           System.out.println("notEqual: " + isnotEqual);
           System.out.println("Greater Then: " + isGreaterThen);
           System.out.println("LessThen:" + isLessThen);
           System.out.println("Greater Then Or Equal:"+ isGreaterThenOrEqual);
           System.out.println("Less Then Or Equal:"+ isLessThenOrEqual);
           
           // Logical operators
           boolean logicalAnd =(a>0) && (b>0);
           boolean logicalOr = (a>0); // (b>0);
           boolean logicalNotA = !(a>0);
           boolean logicalNotB =!(b>0);
           
           System.out.println("/nlogical operators:");
           System.out.println("Logical AND :"+ logicalAnd);
           System.out.println("Logical OR:"+ logicalOr);
           System.out.println("Logical NOT for 'A' : "+ logicalNotA);
           System.out.println("Logical NOT for 'B' : "+ logicalNotB);
           
           //assignment operators
           int c=7;
           c+= 3;
           c-= 2;
           c*= 5;
           c/= 2;
           c%= 3;
           
           System.out.println("/nAssignment Operators:");
           System.out.println("value of c: "+ c);
           
           // increment and decrement operators
           int d=8;
           d++;
           d--;
           
           
           System.out.println("/nIncrement and Decrement Operators:");
           System.out.println("value of d:"+d);
           
           
           
        		   
        		   
           
        	   
           
           
           
           
          
          
	}

}
