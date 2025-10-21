import java.util.Scanner;
class AmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = sc.nextInt();
		int digit=0;
		int sum=0;
		int temp=num;
		while (temp>0)
		{
			digit++;
			temp=temp/10;
		}
		temp=num;
		while (temp>0)
		{
			int ld=temp%10;
			int power=1;
			for (int i=0;i<digit ;i++ )
			{
				power=power*ld;
			}
			sum=sum+power;
			temp=temp/10;
		}
		if (sum==num)
		{
			System.out.println("this number is amstrong number");
			System.out.println("The Given number is : "+num);
			System.out.println("The Sum Number is : "+sum);
		}
		else
		{
			System.out.println("this number is not amstrong number");
			System.out.println("The Given number is : "+num);
			System.out.println("The Sum Number is : "+sum);
		}
	}
}
