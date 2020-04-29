import java.util.HashSet;
import java.util.Set;

public class First {
 public static void main(String[] args) {
	Set<Employee>set=new HashSet<>();
	Employee emp1=new Employee(1, "Manish", 2000);
	Employee emp2=new Employee(1, "Manish", 2000);
	Employee emp3=new Employee(3,"Rahul",2500);
	set.add(emp1);
	set.add(emp2);
	set.add(emp3);
	System.out.println(set);
	System.out.println(emp1.hashCode());
	System.out.println(emp2.hashCode());
	System.out.println(emp3.hashCode());
 }
}
