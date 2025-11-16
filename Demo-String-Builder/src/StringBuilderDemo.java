
public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("abcd");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.insert(2,"jkl"));
		System.out.println(sb.reverse());	
	}
}
