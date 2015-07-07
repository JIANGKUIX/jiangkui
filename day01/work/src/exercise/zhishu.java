package exercise;

public class zhishu 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      int i,j,a=0;
      for(i=2;i<=100;i++)
      {
    	  for(j=2;j<i;j++)
    	  {
    		  if (i%j==0)
    			{
    			  a++;
    		      break;
    		    }
    	  }
      }
    
      System.out.println("" +(100-a));
      System.out.println(a+"\t");
      
	}

}
