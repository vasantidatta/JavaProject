package arrays_Demo;

public class Arrays_multiplication {

	public static void main(String[] args) {
		
		int x[][] = {{1,2},{1,3}};
		int y[][] = {{2,1},{2,2}};
		int z[][] = new int [2][2]; 
		int i;
		int j;
		int k;
		
		for (i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				z[i][j]=0;
				for(k=0;k<2;k++) {
					z[i][j]=x[i][k]*y[k][j];
					System.out.print(z[i][j]+" ");
				}
				System.out.println();
				
			}
		}
	}

}
