
public class AndDiffference 
{

	public static void main(String[] args) 
	{
	
	   boolean a=false;
	   boolean b=true;
;
	   System.out.println("using &"+(a & b));
	   int x=10;
	   int y=0;
	   System.out.println("\nusing &&");
	   long startex1=System.nanoTime();
	   if (y!=0 && x/y >2 ) {
		   System.out.println("condition is true");
	   }else {
		   System.out.println("condition is false");
	   long endex1=System.nanoTime();
	   System.out.println("execution time for &="+(endex1-startex1)+"nanoseconds");
	   
		   
	
		    }
		    
	}
	
}		// TODO Auto-generated method stub

	

