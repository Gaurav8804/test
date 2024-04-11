package day2programming;

public class StringProgram3 {
	public static void main(String[] args) {
		String s="Hi Hello Welcome To";
		String s1=s.replace(" ","");
		 int j=s1.length()-1;
		for(int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)!=' ') 
			{
				System.out.print(s1.charAt(j--));
			}else 
			{
				System.out.print(s.charAt(i));
			}
		}
		
		
	}
	

}
