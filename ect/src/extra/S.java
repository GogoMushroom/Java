package extra;

import java.io.BufferedReader;
import java.io.FileReader;

public class S {
	public void txt() {
	
	
try {
	String path = "flight/ICNCJU.txt";
BufferedReader br = new BufferedReader(new FileReader(path));

String temp = br.readLine();
while((temp = br.readLine())!=null) {
System.out.println(temp);}

}catch(Exception e) {e.printStackTrace();}
}


}
