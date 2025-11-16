
public class StringDemo {

	public static void main(String[] args) {
		
		String city = new String("Mumbai");
		System.out.println(city);//Invokes toString() of string class.
		System.out.println(city.length());
		System.out.println(city.charAt(0));
		System.out.println(city.equals("Mumbai"));
		System.out.println(city.equals("mumbai"));
		System.out.println(city.equalsIgnoreCase("mumbai"));
		System.out.println(city.substring(2));
		System.out.println(city.substring(2,4));	
		System.out.println(city.replace('M', 'S'));
		
		String newcity = city.replace('M', 'T');
				System.out.println(newcity);
		
		String s = new String(city);
		
		String s1 = new String("a");
		String s2 = new String("a");
		System.out.println("=======");
		System.out.println(s1.equals(s2)); //True
		System.out.println(s1==s2); //False
		
		String s3 = "a";
		String s4 = "a";
		System.out.println(s3.equals(s4)); //True
		System.out.println(s3 == s4);  //True
	}
}
