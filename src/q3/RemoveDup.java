package q3;

public class RemoveDup {
	
	/*// This method contains extra memory space
	public void removeDup(String str) {
		int[] count = new int[256];
		for(int i=0;i<str.length();i++) {
			int val = str.charAt(i);
			count[val]++;
			if(count[val]>1)
				//str.charAt(i)='-';
				str = str.replace(str.charAt(i),' ');
			if(str.charAt(i)!=' ')
				System.out.print(str.charAt(i));
		}
	}*/
	
	// This method will be in place
	public void removeDup(char[] str) {
		int i=0,j=0;
		for(i=0;i<str.length-1;i++) {
			for(j=i+1;j<str.length;j++) {
				if(str[i]==str[j])
					str[j]=' ';
			}
			if(str[i]!=' ')
				System.out.print(str[i]);
				
		}
	}
	
	public static void main(String[] args) {
		
		/*// This method contains extra memory space
		RemoveDup newStr = new RemoveDup();
		String str="abcdaaa";
		newStr.removeDup(str);*/
		
		// This method will be in place
		RemoveDup newStr = new RemoveDup();
		char[] str={'a','b','c','d','a'};
		newStr.removeDup(str);
	}

}
