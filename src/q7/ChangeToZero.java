//Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0.
package q7;

public class ChangeToZero {
	
	public void checkZero(int[][] mtx) {
		int i=0, j=0;
		int[] row = new int[mtx.length];
		int[] col = new int[mtx[0].length];
		for(i=0;i<mtx.length;i++) {
			for(j=0;j<mtx[0].length;j++) {
				if(mtx[i][j]==0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		for(i=0;i<mtx.length;i++) {
			for(j=0;j<mtx[0].length;j++) {
				if(row[i]==1 || col[j]==1) {
					mtx[i][j] = 0;
				}
			}
		}
	}
	
	public void show(int[][] mtx) {
		for(int i=0;i<mtx.length;i++) {
			for(int j=0;j<mtx[0].length;j++) {
				System.out.print(mtx[i][j]);
				if(mtx[i][j]>9)
					System.out.print("  ");
				else
					System.out.print("   ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		ChangeToZero newTest = new ChangeToZero();
		int[][] mtx = {{1,0,3},{4,5,6},{7,8,9},{10,11,12}};
		newTest.show(mtx);
		System.out.println("***********************");
		newTest.checkZero(mtx);
		newTest.show(mtx);
		
	}

}
