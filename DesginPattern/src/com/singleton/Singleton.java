package com.singleton;
public class Singleton {
   private static Singleton obj=null;
	private Singleton()
	{ }
	public static Singleton getInstance()
	{
		if(obj==null)
		{
			obj= new Singleton();
		}
		return obj;
	}
  void display()
  {
	  System.out.println("Display method of singleton class");
  }
}
