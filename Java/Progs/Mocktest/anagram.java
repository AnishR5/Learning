import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string");
		String s1 = sc.nextLine();
		System.out.println("Enter 2nd string");
		String s2 = sc.nextLine();
		boolean flag=false;
		int count=0;
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				count=0;
				for (int j=0;j<s2.length();j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						count++;
					}
				}
				if(count==0) {
					flag=true;
					break;
				}
			}
				
		
		if(flag==true) {
			System.out.println("Not Anagram");
		}else {
			System.out.println("Is Anagram");
		}
		}else {
			System.out.println("Strings are not valid");
		}
	}

}
