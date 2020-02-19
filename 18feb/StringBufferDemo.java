package cognizant;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Hello to java version 8");
		System.out.println(sb.capacity());
		sb.append("This is my question for development");
		System.out.println(sb.capacity());
		sb.insert(6,"Dear");
		System.out.println(sb);
		sb.replace(6, 20, "Akhlak Ahmad");
		System.out.println(sb);
		sb.delete(6, 20);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		

	}

}
