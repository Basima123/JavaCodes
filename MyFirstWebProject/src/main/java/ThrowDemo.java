import java.io.File;
import java.io.IOException;

public class ThrowDemo {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		
File f=new File("Abc.txt");
f.createNewFile();
	}

}
