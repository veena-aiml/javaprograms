import java.util.Scanner;
class armstrong
{
public static void main(String args[])
{int r,sum=0,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter n value:");
int n=sc.nextInt();
temp=n;
while(n!=0)
{
r=n%10;
sum+=Math.pow(r,3);
n/=10;
}
if(sum==temp)
System.out.println(temp+"is an armstrong");
else
System.out.println(temp+"is not an armstrong");
}
}