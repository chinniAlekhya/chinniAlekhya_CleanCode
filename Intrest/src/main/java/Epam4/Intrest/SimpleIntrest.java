package Epam4.Intrest;

public class SimpleIntrest {
     int principal;
     float rateOfIntrest,time;
     SimpleIntrest(int principal,float time,float rateOfIntrest){
    	 this.principal = principal;
    	 this.time = time;
    	 this.rateOfIntrest = rateOfIntrest;
     }
     public float simpleIntrest() {
    	 float s = (this.principal*this.time*this.rateOfIntrest)/100;
    	 return s;
     }
}
