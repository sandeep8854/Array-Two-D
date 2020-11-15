import java.util.Scanner;

public class TwoDArrayTranspose_7
{

	public static void main(String[] args) 
	{
		int arr1[][]=new int[3][3];
		int arr2[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3*3 Array Element ?");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Print Matrix");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("Transposing Array....");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				arr2[i][j]=arr1[j][i];
			}
		}
		System.out.println("Transpose of the Matrix is ");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				System.out.print(arr2[i][j]+ " ");
			}
			System.out.println();
		}

	}
}
/*
Enter 3*3 Array Element ?
1
2
3
4
5
6
7
8
9
Print Matrix
1 2 3 
4 5 6 
7 8 9 
Transposing Array....
Transpose of the Matrix is 
1 4 7 
2 5 8 
3 6 9 
*/