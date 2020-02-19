package cognizant;

public class String1 {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
String City1="pune";
String City2="mumbai";
String City3="pune";

String City4= new String("pune");
String City5= new String("mumbai");
String City6= new String("pune");
System.out.println(City1==City3); 

System.out.println(City3.contentEquals(City6)); 
System.out.println(City1==City4);
String msg="I am an engineer";
//System.out.println(msg.length()); 
//String year="of 2020";
msg=msg.concat(" of 2020");
System.out.println(msg);


String s1="I am an engineer";  
System.out.println(s1.substring(2,4));
System.out.println(s1.substring(2));

String name="I am an engineer";  
char ch=name.charAt(5); 
System.out.println(ch);  


String s6="hello";  
String s2="hello";  
String s3="meklo";  
String s4="hemlo";  
String s5="flag";  
System.out.println(s6.compareTo(s2));  
System.out.println(s6.compareTo(s3));  
System.out.println(s6.compareTo(s4)); 
System.out.println(s6.compareTo(s5));


String nam="what do you know about me";  
System.out.println(nam.contains("do you know"));  
System.out.println(nam.contains("about"));  
System.out.println(nam.contains("hello"));  


String s11="java";  
String s12="java";  
String s13="JAVA";  
String s14="python";  
System.out.println(s11.equalsIgnoreCase(s12));  
System.out.println(s11.equalsIgnoreCase(s13));
System.out.println(s11.equalsIgnoreCase(s14));



String s19="I am an engineer";  
byte[] barr=s19.getBytes();  
for(int i=0;i<barr.length;i++){  
System.out.println(barr[i]);  
}  



String str = new String("I am an engineer");  
char[] chh = new char[10];  
try{  
   str.getChars(6, 16, chh, 0);  
   System.out.println(chh);  
}catch(Exception ex){System.out.println(ex);}  



String p1="this is index of example";  
  
int index1=p1.indexOf("is");
int index2=p1.indexOf("index"); 
System.out.println(index1+"  "+index2);  


String m1=new String("hello");  
String m2="hello";  
String m3=s1.intern();  
System.out.println(m1==m2);
System.out.println(m2==m3);

	}

}
