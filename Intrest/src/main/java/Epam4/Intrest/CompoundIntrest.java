package Epam4.Intrest;

public class CompoundIntrest {
   int principal,noOfTimes;
   float rateOfIntrest,time;
   CompoundIntrest(int principal,float time,float rateOfIntrest,int noOfTimes){
	   this.principal = principal;
	   this.time = time;
	   this.rateOfIntrest = rateOfIntrest;
	   this.noOfTimes = noOfTimes;
   }
   public float compoundIntrest() {
	   float c = this.principal*(float)(Math.pow((1+(this.rateOfIntrest/this.noOfTimes)),(this.noOfTimes*this.time)));
	   return c;
   }
}
