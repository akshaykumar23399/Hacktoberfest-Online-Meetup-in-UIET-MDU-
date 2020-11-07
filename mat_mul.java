import java.util.*;

class matrix
{
	static int r1,c1,r2,c2;
	public static void readMatrix(int[][] a,int r,int c)
	{
		int i,j;
		Scanner scan=new Scanner(System.in);
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Matrix is ");
		matrix.printMatrix(a,r,c);
	}
	public static void multiply(int[][] a1,int[][] a2,int r1,int c2,int r)
	{
		int i,j,k;
		int[][] res= new int[r1][c2];
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				res[i][j]=0;
				for(k=0;k<r;k++)
				{
					res[i][j]=res[i][j]+a1[i][k]*a2[k][j];
				}
			}
		}
		System.out.println("Matrix after multipication");
		matrix.printMatrix(res,r1,c2);
		System.out.println("Transpose is ");
		matrix.transpose(res,r1,c2);
	}
	
	public static void transpose(int[][] t,int row,int col)
	{
		int[][] trans=new int[col][row];
		int i,j;
		for(i=0;i<col;i++)
		{
			for(j=0;j<row;j++)
			{
				trans[i][j]=t[j][i];	
			}
		}
		printMatrix(trans,col,row);	
	}

	public static void printMatrix(int[][] result,int r,int c)
	{
		int i,j;
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(result[i][j]+"  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{

		System.out.println("enter the values of r1 and c1");
		Scanner scan=new Scanner(System.in);
		r1=scan.nextInt();
		c1=scan.nextInt();
		System.out.println("enter the values of r2 and c2");
		r2=scan.nextInt();
		c2=scan.nextInt();
		if(c1 == r2)
		{
			int[][] arr1= new int[r1][c1];
			int[][] arr2= new int[r2][c2];
			System.out.println("enter the values in arr1");
			matrix.readMatrix(arr1,r1,c1);
			System.out.println("enter the values in arr2");
			matrix.readMatrix(arr2,r2,c2);
			matrix.multiply(arr1,arr2,r1,c2,c1);
		}
		else
		{
			System.out.println("matrix multipication of given order is not possible");
		}
	}
}

