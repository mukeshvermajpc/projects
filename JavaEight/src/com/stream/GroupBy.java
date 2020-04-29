package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupBy {
  public static void main(String args[])
  {
	  List<Employeetwo>list=Arrays.asList(new Employeetwo(1,"Manish",26,"Male"),
			  							   new Employeetwo(1,"Rupal",29,"Female")
			                              ,new Employeetwo(1,"Priyanka",26,"Female"),
			                              new Employeetwo(1,"Shashank",25,"Male"),
			                              new Employeetwo(1,"Shabez",24,"Male"),
			                              new Employeetwo(1,"Rubeena",26,"Female"),
			                              new Employeetwo(1,"Raushan",29,"Male"));
  Map<String,List<Employeetwo>>mp=list.stream().collect(Collectors.groupingBy(Employeetwo::getGender));
  mp.forEach((key,value)->{
	  System.out.println(key);
	  value.forEach((obj)->{
		  System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getAge()+" "+obj.getGender());
	  });
  });
  }
}
