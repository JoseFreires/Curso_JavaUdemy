
public class Main {

	public static void main(String[] args) {
		String original = " abc ABC aa bc eedegg  klkl bc abc oioi   ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace("a", "j");
		String s07 = original.replace("abc", "jose");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original : -" + original + "-");
		System.out.println("toLowerCase : -" + s01 + "-");
		System.out.println("toUpperCase : -" + s02 + "-");
		System.out.println("trim : -" + s03 + "-");
		System.out.println("subString(2) : -" + s04 + "-");
		System.out.println("subString(2,9) : -" + s05 + "-");
		System.out.println("replace(a, j) : -" + s06 + "-");
		System.out.println("replace(abc, jose) : -" + s07 + "-");
		System.out.println("indexOf(bc) : " + i);
		System.out.println("lastIndexOf(bc) : " + j);
	}

}
