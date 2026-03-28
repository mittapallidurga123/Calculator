import java.util.*;
class Calculator
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter a value : "+" ");
int a=sc.nextInt();

System.out.println("Enter b value : "+" ");
int b=sc.nextInt();

System.out.println("Enter the operator :"+"(+,-,*,/,%):");
char op=sc.next().charAt(0);

if(op=='+')

System.out.println("Result = "+(a+b));
else if(op=='-')
System.out.println("Result = "+(a-b));
else if(op=='*')
System.out.println("Result = "+(a*b));
else if(op=='/')
System.out.println("Result = "+(a/b));
else if(op=='%')
System.out.println("Result ="+(a%b));
else
System.out.println("Invalid opertaor");

}
}