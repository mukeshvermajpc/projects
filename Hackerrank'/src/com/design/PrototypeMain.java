package com.design;
public class PrototypeMain {
  public static void main(String[] args) throws CloneNotSupportedException {
    Address address=new Address("Lucknow","Uttar Pradesh","India");
    EmployeeTwo employee=new EmployeeTwo(12,"Manish",address);
    EmployeeTwo emp=(EmployeeTwo) employee.clone();
    emp.getAddress().setState("Delhi");
    emp.getAddress().setCountry("USA");
    System.out.println("first employee object address"+employee);
    System.out.println("Second employee object address "+emp);
}
}
