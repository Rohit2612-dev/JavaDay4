
public class DemoWrapper {

	public static void main(String[] args) {
		
		//Primitive
		int i =10;
		
		//Primitive to wrapper
		Integer iObj = new Integer(i);
		
		//wrapper to primitive
		int j = iObj.intValue();
		
		//String to wrapper
		Integer o = Integer.valueOf("777");
		
		//Wrapper to string
		String str = o.toString();
		
		//String to Primitive
		int p =Integer.parseInt("888");
		
		//Primitive to string
		String data = Integer.toString(p);	
	}
}
