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
            System.out.println( "パラメータが未指定" );
            return;
        }

        
        File newfile = new File(args[0]+".txt");

       
        if ( newfile.exists() ) {
            System.out.println("そのファイルは既に存在");
            return;
        }

        try{
            if ( newfile.createNewFile() ) {
                
                String path = newfile.getPath();
                System.out.println(path+"を作成");
            }else{
                
                System.out.println("ファイルの作成に失敗");
            }
        }catch(IOException e){
            
            System.out.println(e);
        }
    }
}
