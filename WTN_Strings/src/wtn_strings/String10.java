package wtn_strings;

public class String10 {
	public static void main(String[] args) {
		String a="Helloo";
		String b="World123abc";

		String bigger=a.length()>b.length() ? a : b;
		String smaller=a.length()<b.length() ? a : b;

		StringBuffer sb=new StringBuffer();

		for (int i=0;i<smaller.length();i++) {
			sb.append(a.charAt(i)).append(b.charAt(i));
		}
		
		sb.append(bigger.substring(smaller.length(),bigger.length()));
		
		System.out.println(sb);
	}
}