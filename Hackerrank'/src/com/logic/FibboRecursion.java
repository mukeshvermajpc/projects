package com.logic;
public class FibboRecursion {
     int a=0,b=1,c;
   public  void fibbo(int num)
    {
    	if(num==0)
    	return;
    	else
    	{
    		c=a+b;
    		System.out.println(c);
    		a=b;
    		b=c;
    		fibbo(num-1);
    	}
    }
    public static void main(String[] args) {
		System.out.println("program for print fibbonaci series");
		FibboRecursion obj=new FibboRecursion();
		int num=12;
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.fibbo(num-2);
		
	}
}
