
public class uppgift2laxa {

	public static void main(String[] args) {
		System.out.println(reverse("Bengt"));
	}

	public static String reverse(String bokstav) {
		if(bokstav.length()== 1) {
			return bokstav;
			
		} else {
			return bokstav.substring(bokstav.length() - 1) + reverse(bokstav.substring(0, bokstav.length() - 1));
			
		}
		
		
	}
}
