import java.util.ArrayList;

public class Uppgift5_BoxClass_laxa {

	private static ArrayList<Object> a = new ArrayList<Object>();

	public Uppgift5_BoxClass_laxa() {

	}

	public <T> void add(T t) {
		a.add(t);
	}

	public Object get(int i) {
		return a.get(i);
	}

	public <T1, T2> boolean compare(T1 t1, T2 t2) {
		if (t1.getClass() == t2.getClass()) {
			return true;
		} else {
			return false;
		}
	}

}
