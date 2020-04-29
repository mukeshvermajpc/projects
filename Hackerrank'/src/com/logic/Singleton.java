package com.logic;
public class Singleton {
   public static Singleton obj=null;
   private Singleton()
   {}
   public static Singleton getInstance()
   {
	   if(obj==null)
		   obj=new Singleton();
	   return obj;
   }
   public void display()
   {
	   System.out.println("It is display method in singleton class");
	   System.out.println("Great singleton is working fine");
   }
}
