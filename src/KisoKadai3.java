import java.io.File;
import java.io.IOException;

/**
 * 
 */

/**
 * @author internous
 *
 */
public class KisoKadai3 {

	/**
	 * @param args
	 */
	public static void main(String args[]) {

        if ( args.length == 0 ) {
            System.out.println( "�p�����[�^�����w��" );
            return;
        }

        
        File newfile = new File(args[0]+".txt");

       
        if ( newfile.exists() ) {
            System.out.println("���̃t�@�C���͊��ɑ���");
            return;
        }

        try{
            if ( newfile.createNewFile() ) {
                
                String path = newfile.getPath();
                System.out.println(path+"���쐬");
            }else{
                
                System.out.println("�t�@�C���̍쐬�Ɏ��s");
            }
        }catch(IOException e){
            
            System.out.println(e);
        }
    }
}