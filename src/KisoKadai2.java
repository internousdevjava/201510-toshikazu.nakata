/**
 * 
 */

/**
 * @author internous
 *
 */
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class KisoKadai2{

	 public static void main(String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        Random rnd = new Random();

	        int end = 0;
	        int ran = rnd.nextInt() % 101;
	        if(ran<0){
	            ran*= -1;
	        }
	        System.out.println("”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
	                
	        while(end==0){
	            try{
	                System.out.println("‚P`‚P‚O‚O‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢A  I—¹‚·‚é‚Æ‚«‚Í1000‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
	                String str = br.readLine();
	                int nu= Integer.parseInt(str);
	                if(nu==1000){
	                    break;
	                }
	                if(nu==ran){
	                    System.out.println("³‰ğ‚Å‚·I");
	                    end = 1;
	                }else{
	                    if(nu>ran){
	                        System.out.println("”š‚Í‚à‚Á‚Æ¬‚³‚¢‚Å‚·");
	                    }else{
	                        System.out.println("”š‚Í‚à‚Á‚Æ‘å‚«‚¢‚Å‚·");  
	                    }
	                }
	             }catch(Exception e){
	                 System.out.println("“ü—ÍƒGƒ‰[‚Å‚·"); 
	             }
	        }
	         System.out.println("I—¹‚µ‚Ü‚µ‚½");   
	    }
	}