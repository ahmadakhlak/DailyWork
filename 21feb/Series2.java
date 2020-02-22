package cognizant;

import java.util.ArrayList;

public class Series2 {

		public static void main(String[] args) {
			String[] input={"100","111","10100","10","1111"};
			gteCount(input);}
		public static void gteCount(String[] input) {
			int op=0;
			ArrayList<String> l1=new ArrayList<String>();
			for(String s:input)
				if(s.startsWith("10")  &&(s.length()>2))
					l1.add(s);
			op=l1.size();
			System.out.println("having prefix 10: "+ op);

	}

}
