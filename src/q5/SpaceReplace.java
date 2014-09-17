package q5;

public class SpaceReplace {

	public void spaceReplace(String str) {
		//char[] sArray=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')
				str = str.replace(" ","%20");
		}
		System.out.print(str);
	}
	
	public static void main(String[] args) {
		SpaceReplace newStr = new SpaceReplace();
		String str="a b c de";
		newStr.spaceReplace(str);
	}

}
