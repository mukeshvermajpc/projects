public class StepProblem {
	public static String kangaroo(int x1,int v1,int x2,int v2)
	{
		boolean status=false;
	    String flag="";
		if((x2>x1)&&(v2>v1))
		{
			return "NO";
		}
		else
		{
			for(int i=1;i<=10000;i++)
			{
			  int x=x1+v1;
			  int y=x2+v2;
			  System.out.println(x+" "+y);
			  x1=x;
			  x2=y;
			  if(x==y)
			  {
				  status=true;
				  break;
			  }
			}
			if(status)
		    {
		    	return "Yes";
		    }
		    else
		    {
		    	return "No";
		    }
		}
		
	}
  public static void main(String args[])
  {
	  System.out.println("program for solve kangaroo problem in hackerrank");
	  System.out.println(kangaroo(0,3, 4, 2));
  }
}
