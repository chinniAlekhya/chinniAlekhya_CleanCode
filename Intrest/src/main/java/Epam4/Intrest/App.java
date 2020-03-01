package Epam4.Intrest;
import java.util.*;
import java.io.*;
public class App {
    public static void main( String[] args ){
        Scanner input = new Scanner(System.in);
         System.out.println("Enter option");
         System.out.println("1. Simpele Intrest"+"\n"+"2. Construction of house");
         int op = input.nextInt();
         switch(op) {
         case 1:
        	 System.out.println("Enter principal ammount");
             int p = input.nextInt();
             System.out.println("Enter rate of intrest");
        	 float rate = input.nextFloat();
        	 System.out.println("Enter time");
        	 float time = input.nextFloat();
        	 System.out.println("Enter your option");
        	 System.out.println("a. Simple Intrest"+"\n"+"b. Compound Intrest");
        	 char ca = input.next().charAt(0);
        	 switch(ca){
        		 case 'a':
        			 SimpleIntrest s = new SimpleIntrest(p,time,rate);
                	 float simple = s.simpleIntrest();
                	 System.out.println(simple);
                	 break;
        		 case 'b':
        			 System.out.println("Enter of number of times to calcuate compound Intrest");
        			 int noof = input.nextInt();
                	 CompoundIntrest c = new CompoundIntrest(p,time,rate,noof);
                	 float ci = c.compoundIntrest();
                	 System.out.println(ci);
                	 break;	 
        	   }
        	 break;
         case 2:
        	 System.out.println("Cost to construst a house based on the materials per 1 Square feet");
        	 System.out.println("1. 1200 INR if we use standard materials");
        	 System.out.println("2. 1500 INR if we use above standard materials");
        	 System.out.println("3. 1800 INR if we use high standard material");
        	 System.out.println("4. 2500 INR if w use high standard material and fully automated home");
        	 System.out.println("Enter number of square feets of house you required");
        	 float feets = input.nextFloat();
        	 System.out.println("Enter the option to select the material");
        	 int option = input.nextInt();
        	 switch(option) {
        	 case 1:
        		 System.out.println("Cost to construct your house as your request "+feets*1200);
        		 break;
        	 case 2:
        		 System.out.println("Cost to construct your house as your request "+feets*1500);
        		 break;
        	 case 3:
        		 System.out.println("Cost to construct your house as your request "+feets*1800);
        		 break;
        	 case 4:
        		 System.out.println("Cost to construct your house as your request "+feets*2500);
        		 break;
        		 }
        	 break;
         }
        
    }
}
