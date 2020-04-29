package com.singleton;
public class TestSingleton {
  public static void main(String args[])
  {
	Singleton obj=Singleton.getInstance();
	obj.display();
  }
}
