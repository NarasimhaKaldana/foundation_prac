package ourwork;

public class Repeat {
	
	public static void main(String[] args) {
		
	
      boolean k;
      String str= "abbadcad";
      for(int i=0;i<str.length();i++)
    	  
      {
    	  int count=0;
    	  k=false;
    	  char ch=str.charAt(i);
    	  for(int j=0;j<str.length();j++)
    	  {
    		  
    		  char ch1=str.charAt(j);
    		  if((ch==ch1) && (i!=j))
    		  {
    			  k=true;
    			  count++;
    		  }
    	  }
    	  
    	  if(k&&count)
    	  {
    		  System.out.println(str.charAt(i));
    		 
    	  }
    	  
    	  
    	  
    	  
    	  
}
      
}
}

