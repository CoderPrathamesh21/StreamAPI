package JavaIntPrep;

public class StringNullExmpl {

	public static void main(String[] args) {
		
		String str = null;
		
//		str = str.toUpperCase();
//		System.out.println(str);
		
		str = (str != null) ? str.toUpperCase() : "default".toUpperCase();
		System.out.println(str);

	}

}
