/**
 * 
 */

/**
 * @author internous
 *
 */


	/**
	 * @param args
	 */
	
	import java.io.BufferedReader;
	import java.io.InputStreamReader;

	public class KisoKadai1 {
	
		  public static void main(String args[]) 
		  {
			    System.out.println("九九の表");

			    int x;
	            int y;
	                       
	            
	            System.out.print("xを入力してください: ");
	            InputStreamReader isrx = new InputStreamReader(System.in);
	            BufferedReader brx = new BufferedReader(isrx);
	            try{
	                    String bufx = brx.readLine();
	                    x = Integer.parseInt(bufx);
	                    if(0 < x & 100 < x){
	                    	System.out.println("1〜100までの数字でお願いします");
	                    	return;
	                    }
	            }catch(Exception e){
	                    System.out.println("xに数字以外が入っています");
	                    return;
	            }
	         
	            
	            System.out.print("yを入力してください: ");
	            InputStreamReader isry = new InputStreamReader(System.in);
	            BufferedReader bry = new BufferedReader(isry);
	            try{
	                String bufy = bry.readLine();
	                y = Integer.parseInt(bufy);
	                if(y > 100 & y > 0){
	                	System.out.println("1〜100までの数字でお願いします");
	                	return;
	                }
	            }catch(Exception e){
	                System.out.println("yに数字以外が入っています");
	                return;
	            }
	            
			   
			    int kuku[][] = new int[x][y];

			    
			    for( int i=0; i<x; i++ ) {

	for( int j=0; j<y; j++ ){
			    	  kuku[i][j] = (i+1) * (j+1);
			      }
			    }

			   
			    for( int i=0; i<x; i++ ) {
			      for( int j=0; j<y; j++ ) { 
			    	  System.out.print(kuku[i][j] + " "); 
			      }
			      	  System.out.println(""); 
			    }	    
		  }
	}
