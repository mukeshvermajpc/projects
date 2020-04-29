package com.copy;

public class CopyClass {
	public static void main(String args[]) throws CloneNotSupportedException {
     Address address=new Address("Pune",411057);
     Employee employee=new Employee(12,"Manish",address);
     Employee employee2=(Employee) employee.clone();
     System.out.println(employee.getAddress().getCity());
     System.out.println(employee2.getAddress().getCity());
     System.out.println("after chnaging address value");
     employee2.getAddress().setCity("Mumbai");
     System.out.println(employee2.getAddress().getCity());
     System.out.println(employee.getAddress().getCity());
     System.out.println("changing pin code of pune city");
     employee2.getAddress().setPincode(224122);
     System.out.println("mumbai pincode "+employee2.getAddress().getPincode());
     System.out.println("Pune city password "+employee.getAddress().getPincode());
	}
}
