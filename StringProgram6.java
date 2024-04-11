package day2programming;

public class StringProgram6 {

	public static void main(String[] args) {
//		 String s="a^2c&d4";
//		 String s1=s.replaceAll("[^a-z]", "");
//		 String s2=s.replaceAll("[^0-9]", "");
//		 String s3=s.replaceAll("[0-9a-z]","");
//		 System.out.println(s1+" "+s2+" "+s3);
print();
	}
	
	public static void print()
	{
		String s="a^2c&d4";
		String alpha="";
		String num="";
		String spec="";
		for(int i=0;i<s.length();i++) 
		{
			char ch=s.charAt(i);
			if(s.charAt(i)>='a'&& s.charAt(i)<='z'||s.charAt(i)>='A'&& s.charAt(i)<='Z') 
			{
				alpha=alpha+ch;
			}else if(s.charAt(i)>='0'&&s.charAt(i)<='9') 
			{
				num=num+ch;
			}else 
			{
				spec=spec+ch;
			}
			 
		}
		System.out.println(alpha+num+spec);
	}

}
