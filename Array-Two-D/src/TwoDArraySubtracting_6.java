import java.util.Scanner;

public class TwoDArraySubtracting_6
{
	public static void main(String[] args)
	{
		int mat1[][]=new int[3][3];
		int mat2[][]=new int[3][3];
		int mat3[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Matrix ?");
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1.length;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter Second Matrix ?");
		for(int i=0;i<mat2.length;i++)
		{
			for(int j=0;j<mat2.length;j++)
			{
				mat2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Subtracting Matrix ? ");
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat2.length;j++)
			{
				mat3[i][j]=mat1[i][j] - mat2[i][j];
			}
		}
		System.out.println("The Two Matrix Subtracting SuccessFully...");
		System.out.println("The new Matrix will be : ");
		for(int i=0;i<mat3.length;i++)
		{
			for(int j=0;j<mat3.length;j++)
			{
				System.out.print(mat3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
