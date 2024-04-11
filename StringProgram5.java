package day2programming;

public class StringProgram5 {

	public static void main(String[] args) {
		 String s1="Tester";
		 for(int i=0;i<s1.length();i++) 
		 {
			 System.out.print(s1.charAt(i));
			 for(int j=0;j<=i;j++) 
			 {
				 System.out.print(" ");
			 }
			 
		 }

	}

}
