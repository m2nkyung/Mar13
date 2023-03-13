import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Week14_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String fileName = "src//test.txt";
			FileInputStream fis = new FileInputStream(fileName);
			FileReader fr = new FileReader(fileName);
			int data = 0;
			
			//FileInputStream 이용해 읽어서 출력
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
			} System.out.println("\n");
			fis.close();
			
			//FileReader 이용해 읽어서 출력
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			} System.out.println();
			fr.close();
			
		} catch(IOException e) {
			e.printStackTrace();			
		}
	}
}