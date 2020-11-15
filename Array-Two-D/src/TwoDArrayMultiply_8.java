import java.util.Scanner;
public class TwoDArrayMultiply_8
{
	public static void main(String[] args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Rows And Coolumn Of First Matrix ?");
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int first[][]=new int[m][n];
		System.out.println("Enter First Matrix Element ?");
		for(int c=0;c<m;c++)
		{
			for(int d=0;d<n;d++)
			{
				first[c][d]=sc.nextInt();
			}	
		}
		
		System.out.println("Enter Number Of Rows And Column Of Second Matrix ?");
		int p=sc.nextInt();
		int q=sc.nextInt();
		
		if(n!=p)
		{
			System.out.println("Matrix of the entered order can't be Multiplied.");
		}
		else
		{
			int second[][]=new int[p][q];
			int multiply[][]=new int[m][q];
			System.out.println("Enter Second Matrix Elements ?");
			for(int c=0;c<p;c++)
			{
				for(int d=0;d<q;d++)
				{
					second[c][d]=sc.nextInt();
				}
			}
			System.out.println("Multiplying both Matrix...");
			for(int c=0;c<m;c++)
			{
				for(int d=0;d<q;d++)
				{
					for(int k=0;k<p;k++)
					{
						 sum=sum+first[c][k]*second[k][d];
					}
					multiply[c][d]=sum;
					sum=0;
				}
			}
			System.out.println("Multiplication SuccessFully perform...");
			System.out.println("Now Matrix Multiplication Result is .");
			for(int c=0;c<m;c++)
			{
				for(int d=0;d<q;d++)
				{
					System.out.print(multiply[c][d] +  "   ");
				}
				System.out.println("  ");
			}
		}		
	}
}

		/*
		 * Enter Number Of Rows And Coolumn Of First Matrix ?
3
3
Enter First Matrix Element ?
1
2
3
4
5
6
7
8
9
Enter Number Of Rows And Column Of Second Matrix ?
3
3
Enter Second Matrix Elements ?

9
8
7
6
5
4
3
2
1
Multiplying both Matrix...
Multiplication SuccessFully perform...
Now Matrix Multiplication Result is .
30   24   18     
84   69   54     
138   114   90     

		 */
		
		
		
		
		
		
		
		
		
	