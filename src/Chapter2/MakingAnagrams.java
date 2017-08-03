package Chapter2;

import java.util.Scanner;

public class MakingAnagrams {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		String s1=sc.next();
		String s2=sc.next();
		String temp=s2;
		
		for(char c:s1.toCharArray()){
			for(int i=0;i<s2.length();i++)
			{
				if((char)c==s2.charAt(i)){
					s2=s2.substring(0, i)+s2.substring(i+1);
					break;
				}
			}
		}
		int same=temp.length()-s2.length();
		System.out.println(s2.length()+(s1.length()-same));
	}

}
