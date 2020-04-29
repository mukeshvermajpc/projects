import java.util.ArrayList;
import java.util.List;

public class ContinumProgram {
   public static List<String>processData()
   {
	return null;   
   }
   public static void main(String args[])
   {
	   String arr[]= {
			   "Mail Server, Authentication Library, v6",
			   "Video Call Server, Authentication Library, v7",
			   "Mail Server, Data Storage Library, v10",
			   "Chat Server, Data Storage Library, v11",
			   "Mail Server, Search Library, v6",
			   "Chat Server, Authentication Library, v8",
			   "Chat Server, Presence Library, v2",
			   "Video Call Server, Data Storage Library, v11",
			   "Video Call Server, Video Compression Library,v3" 
	   };
	   for(String st:arr)
	   {
		   String s[]=st.split(",");
		   for(String sb:s)
		   {
			   System.out.println(sb);
		   }
	   }
   }
}
