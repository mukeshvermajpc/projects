package com.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShopkeeperMain {
  public static void main(String args[]) throws NumberFormatException, IOException
  {
	  boolean status=true;
	  do {
		  System.out.println("1. IPhone");
		  System.out.println("2. Samsung");
		  System.out.println("3. Nokia");
		  System.out.println("4. Exit");
		  System.out.println("Enter your option");
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  int option=Integer.parseInt(br.readLine());
		  Shopkeeper sp=new Shopkeeper();
		  switch(option)
		  {
		  case 1: sp.iphoneSale();break;
		  case 2: sp.samsungSale(); break;
		  case 3: sp.nokiaSale();break;
		  case 4: System.out.println("Now you are Exit !!");status=false;break;
		  default:System.out.println("Select correct option");break;
		  }
	  }while(status);
  }
}
