package q1;

public class UniqStr {

	/*public void compChar(String str) {
		String str1 = str;
		//String str2 = "abcaefg";
		for(int i = 0;i< str1.length()-1;i++) {
			for(int j=i+1;j<str1.length();j++) {
				if(str1.charAt(i)==str1.charAt(j)){
					System.out.println("false");
					break;
				}
			}
		}
		
	}*/
	
	public boolean isUniq(String str) {
		boolean[] strVal = new boolean[256];
		for(int i=0;i<str.length();i++) {
			int val=str.charAt(i);
			System.out.println(val);
			if(strVal[val]==true) {
				//System.out.println(strVal[val]);
				return false;
			}
			System.out.println(strVal[val]);
			strVal[val] = true;
			System.out.println(strVal[val]);
		}
		return true;
		
	}
	public static void main(String[] args) {
		/*String str1 = "abcadefg";
		UniqStr newStr = new UniqStr();
		newStr.compChar(str1);*/
		String str="abcddefg";
		UniqStr test = new UniqStr();
		test.isUniq(str);
		
	}
}


