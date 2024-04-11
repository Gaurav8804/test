package day2programming;

public class StringProgramming4 {

	public static void main(String[] args) {
		String s1="Hi Hello Welcome To";
		String[] s = s1.split(" ");
		 
		 
		String temp;
//		for(int i=0;i<s.length;i++) 
		{
			temp=s[0]; //swaping four times
			s[0]=s[1];
			s[1]=s[2];//hard coding is not recommended 
			s[2]=s[3];
			s[3]=temp;
			for(int j=0;j<s.length;j++) 
			{
//				System.out.print(s[j]+" ");//printing four times
			}
//			System.out.println();
//			System.out.println("---------------------------------------------");
			StringProgramming4 sp=new StringProgramming4();
			sp.newString();
			System.out.println("----------------------------------------------------");
			sp.newString1();
		}
		

	}
	public void newString() 
	{
		String s1="Hi Hello Welcome To";
		String[] s = s1.split(" ");
		
		for(int i=0;i<s.length;i++) 
		{
			String temp=s[0];
			for(int j=1;j<s.length;j++) 
			{
			 s[j-1]=s[j];
//			 System.out.print(s[j-1]+" " );
			}
			s[s.length-1]=temp;
//			System.out.print(s[s.length-1]=temp);
			
			for(int k=0;k<s.length;k++) 
			{
				System.out.print(s[k]+" ");
			}	
			System.out.println();
		}
		
}
	public void newString1() 
	{
		String s1="Hi Hello Welcome To";
		String[] s = s1.split(" ");
		
		for(int i=0;i<s.length;i++) 
		{
			String temp=s[0];
			for(int j=1;j<s.length;j++) 
			{
			 s[j-1]=s[j];
			 System.out.print(s[j-1]+" " );
			}
			System.out.print(s[s.length-1]=temp);
			System.out.println();
		}
	}
	
	
}