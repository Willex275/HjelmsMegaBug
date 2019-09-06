import java.util.ArrayList;

public class BoxjClassJava {

	private static ArrayList<String> Hej = new ArrayList<String>();
	
	public static void add(String a) {
		
		Hej.add(a);
	}
	
	public static ArrayList<String> retunera(){
		return Hej;
	}

}
