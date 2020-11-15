import java.util.Scanner;
public class TwoDArray_4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[10][10];
		System.out.println("Enter Number Of Row For Array ?");
		int row=sc.nextInt();
		System.out.println("Enter Number Of Column for Array ? ");
		int column=sc.nextInt();
		
		System.out.println("Enter " +(row*column)+ " Array Elements :" );
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The Array is :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
