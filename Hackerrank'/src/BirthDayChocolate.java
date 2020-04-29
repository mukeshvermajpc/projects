import java.util.Arrays;
import java.util.List;

public class BirthDayChocolate {
    public static int chocolate(List<Integer>s,int d,int m)
    {
    	int count=0;
    	for(int i=0;i<s.size();i++)
    	{
    		int sum=0;
    		int k=i;
    		for(int j=1;j<=m;j++)
    		{
    			if(k<s.size())
    			{
    				sum=sum+s.get(k);
        			k++;
    			}
    		}
    		if(sum==d)
    		{
    			count++;
    		}
    	}
    	return count;
    }
	public static void main(String args[])
   {
	   List<Integer>list=Arrays.asList(4);
	   System.out.println(chocolate(list, 4, 1));
   }
}
