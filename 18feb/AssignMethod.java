package cognizant;

public class AssignMethod {
	public static void main (String ...args ) {
		
		//To display the last four characters.
		
		String input = "Global Warming";     
		String lastFourCharacter = "";    
		 
		if (input.length() > 4) 
		{
		    lastFourCharacter = input.substring(input.length() - 4);
		} 
		else
		{
		    lastFourCharacter = input;
		}
		 
		System.out.println(lastFourCharacter);
		
		
		//To display the substring starting from index 4 and ending at index 8.
		
		String s1="Global Warming";  
		System.out.println(s1.substring(4,8));
		
		//to check whether string has alphanumeric characters or not.
		System.out.println(s1.matches("[A-Za-z0-9]+"));
		
		//To trim the last four characters from the string.
		int len=s1.length();
		String tr=s1.substring(len-4);
		System.out.println(tr);
		
		
		// To trim the first four characters from the string.
		System.out.println(s1.substring(0,4));
		
		
		//To display the starting index for the substring "Wa".
		
	              
	        int index = s1.indexOf("Wa");  
	        System.out.println("index of substring "+index);      
		
		
		//To change the case of the given string.
		
			 
				String s1upper=s1.toUpperCase();  
				System.out.println(s1upper);
				
				//To replace all the occurrences of letter "a" in the string with "*"
				String replaceString=s1.replace('a','*');  
				System.out.println(replaceString);  
				
				
  
				
				
				
			
		
	}
	// To check if the string is in title case.
	public boolean isTitleCase (String s1) {
		boolean result=false;
		String arr[]= s1.split("\\s1+");
		for(int i=0;i<arr.length;i++) {
			char ch=arr[i].charAt(0);
			if(ch>=65&& ch<=90) {
				result=true;
			}
			else {
				result=false;
			}
			break;
		}                                                                                                                     
		return result;
	}

}



