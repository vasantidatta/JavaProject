package arrays_Demo;

public class ArraysAddition {

	public static void main(String[] args) {
		int a[][] = {{1,2},{2,3}};
		int b[][] = {{2,1},{3,2}};
		int c[][] = new int[2][2];
		int i;
		int j;
		
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
