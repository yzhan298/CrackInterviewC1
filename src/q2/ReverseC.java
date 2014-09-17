package q2;

public class ReverseC {

	public void reverse(String str) {
		String str1="";
		System.out.println(str);
		for(int i=str.length()-1;i>=0;i--) {
			str1 += str.charAt(i);
		}
		System.out.println(str1);
	}
	
	public static void main(String[] args) {
		ReverseC newStr = new ReverseC();
		String str = "abcdefg";
		newStr.reverse(str);
		
 	}

}
