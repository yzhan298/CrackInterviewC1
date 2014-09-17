
public class IsSubstring {
	
	public static boolean isRotation(String str1, String str2) {
		if(str1.length()!=str2.length()||str1.length()<=0)
			return false;
		return isSubString(str1+str1,str2); 
	}
	
	public static boolean isSubString(String str1,String str2) {
		return str1.contains(str2);
	}
	
	public static void main(String[] args) {
		String s1 = "apple";
		String s2 = "pplea";
		System.out.println(isRotation(s1,s2)); 
	}

}
