package cognizant;

public class Person1 {
	  
		void display(){ 
			System.out.println("person name...");
			}  
		
			public static void main(String args[]){  
			hr p1=new hr();  
			p1.employee();  
			p1.manager();  
			p1.hr();  
			}
		}  
		class employee extends Person1{  
		void employee(){
			System.out.println("empoyee...");
			}  
		}  
		class manager extends employee{  
			void manager(){
				System.out.println("manager...");
				}  
			}  
		class hr extends manager{
			void hr() {
				System.out.println("hr...");
			}
		}
	
		

