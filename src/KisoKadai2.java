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
	        System.out.println("��������͂��Ă��������B");
	                
	        while(end==0){
	            try{
	                System.out.println("�P�`�P�O�O�̐�������͂��Ă��������A  �I������Ƃ���1000����͂��Ă�������");
	                String str = br.readLine();
	                int nu= Integer.parseInt(str);
	                if(nu==1000){
	                    break;
	                }
	                if(nu==ran){
	                    System.out.println("�����ł��I");
	                    end = 1;
	                }else{
	                    if(nu>ran){
	                        System.out.println("�����͂����Ə������ł�");
	                    }else{
	                        System.out.println("�����͂����Ƒ傫���ł�");  
	                    }
	                }
	             }catch(Exception e){
	                 System.out.println("���̓G���[�ł�"); 
	             }
	        }
	         System.out.println("�I�����܂���");   
	    }
	}