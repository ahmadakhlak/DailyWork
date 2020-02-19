package cognizant;

public class Alphanumeric {
	//To check whether string has alphanumeric characters or not.
	

		public static boolean isAlphaNumeric(String s) {

			return s != null && s.matches("^[a-zA-Z0-9]*$");
		
	}

		public static void main(String[] args)
		{
		
		String s = "Global Warming";
		
		System.out.println("IsAlphaNumeric: " + isAlphaNumeric(s));
		
		
		}
	}



