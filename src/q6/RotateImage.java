package q6;

public class RotateImage {

	int N;
	int[][] mtx = new int[N][N];
	
	public void swap(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
	}

	public void rotation(int[][] m) {
		mtx = m;
		int i=0,j=0;
		for(i=0;i<N;i++) {
			for(j=i+1;j<N;j++) {
				/*if(i+j != N-1)
					swap(mtx[i][j],mtx[N-1-j][N-1-i]);
				else
					mtx[i][j] = mtx[i][j];*/
				swap(mtx[i][j],mtx[j][i]);
			}
		}
		
		for(i=0;i<N/2;i++) {
			for(j=0; j<N; j++) {
				swap(mtx[i][j],mtx[N-1-i][j]);				
			}
		}
	}

	public void showImage() {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(mtx[i][j]);
			}
			System.out.println(" ");
		}
	}


	public static void main(String[] args) {
		RotateImage newTest = new RotateImage();
		newTest.N=3;
		int[][] m={{1,2,3},{4,5,6},{7,8,9}};
		newTest.rotation(m);
		newTest.showImage();
	}

}
