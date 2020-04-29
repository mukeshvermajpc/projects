package com.other;
public class Lexicographical {
      public static void main(String args[])
      {
    	  String words[]= {"Manish","Avinash","Priyanka","Rupal","Raushan","Shashank","Shabez"};
    	  int n=words.length;
    	  for(int i=0;i<n-1;i++)
    	  {
    		  for(int j=i+1;j<n;j++)
    		  {
    			  if(words[i].compareTo(words[j])>0)
    			  {
    				  String temp=words[i];
    				  words[i]=words[j];
    				  words[j]=temp;
    			  }
    		  }
    	  }
    	  System.out.println("word in dictionary order");
    	  for(String st:words)
    	  {
    		  System.out.println(st);
    	  }
      }
}
