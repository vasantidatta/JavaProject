package arrays_Demo;

public class ArraysAddition1 {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{2,3,4},{3,4,5}};
		int b[][] = {{2,3,4},{1,2,3},{1,1,1}};
		int c[][] = new int [3][3];
		int i;
		int j;
		int k;
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				c[i][j] = 0;
				for(k=0;k<3;k++) {
					c[i][j]=a[i][k]*b[k][j];
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}

	}

}
