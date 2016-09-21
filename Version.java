// cerner_2^5_2016
import java.util.ArrayList;
import java.util.List;

public class Version {
	public static void main(String[] args) {
		int javaVersion = getVersion(new ArrayList<>(),1);
		System.out.println("Compiled under java version: " + javaVersion);
	}
	
	public static int getVersion(List<Object> list, Integer i) {
		return 7;
	}	
	
	public static int getVersion(List<String> list, int i) {
		return 8;
	}

}
