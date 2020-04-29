package com.stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollector {
  public static void main(String args[])
  {
	  List<Product>list=Arrays.asList(new Product(1,"Dell",25000),new Product(2,"Dell",35000),
			  						 new Product(3,"Asus",40000),new Product(5,"Lenovo",45000),
			  						 new Product(6,"Sony",55000));
	  //code for get max price of laptop
	  Comparator<Product>cmp=Comparator.comparing(Product::getPrice);
	  Product maxPrice=list.stream().max(cmp).get();
	  System.out.println("max price of the laptop is:");
	  System.out.println(maxPrice.getId()+" "+maxPrice.getName()+" "+maxPrice.getPrice());
	  Product minPrice=list.stream().min(cmp).get();
	  System.out.println("Minimum price of laptop is:");
	  System.out.println(minPrice.getId()+" "+minPrice.getName()+" "+minPrice.getPrice());
	  long ct=list.stream().count();
	  System.out.println("Total number of product in list is: "+ct);
	  long cp=list.stream().filter((pd)->pd.getPrice()>25000).count();
	  System.out.println("count the product which price is more than ");
	  System.out.println(cp);
	  Optional<Product> pd=list.stream().filter((obj)->obj.getName().equals("Dell")).findFirst();
	  System.out.println(pd.get().getId()+" "+pd.get().getName()+" "+pd.get().getPrice());
	  
	  System.out.println("--- program for understanding stream collector in java--------");
      Integer sum=list.stream().collect(Collectors.summingInt(x->x.getPrice()));
      System.out.println("Sum of total product price:"+sum);
      Double avg=list.stream().collect(Collectors.averagingInt(x->x.getPrice()));
      
      System.out.println("average price of all product: "+avg);
      //fetching data as list
      List<Integer>lst=list.stream().map(x->x.getPrice()).collect(Collectors.toList());
      System.out.println(lst);
      System.out.println("convert list to set");
      Set<Product>set=list.stream().collect(Collectors.toSet());
      System.out.println(set);
      System.out.println("Convert list to map using stream");
      Map<Integer, Product>mapP=list.stream().collect(Collectors.toMap(Product::getId,Function.identity()));
      mapP.forEach((key,value)->{
    	  System.out.println(key);
    	  System.out.println(value.getId()+" "+value.getName()+" "+value.getPrice());
      });
      
      System.out.println("Group by in java 8");
      Map<String,List<Product>>map=list.stream().collect(Collectors.groupingBy(obj->obj.getName()));
      
      map.forEach((key,value)->{
    	  System.out.println(key);
    	  System.out.println(value.size());
    	  value.forEach((x)->{
    		  System.out.println(x.getId()+" "+x.getName()+" "+x.getPrice());
    	  });
      });
      
   
	  
  }
}
