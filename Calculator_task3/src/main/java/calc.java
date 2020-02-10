import java.util.Scanner;

public class calc
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    double first=sc.nextDouble();
    double second=sc.nextDouble();
    System.out.println("Enter an operator (+, -, *, /): ");
    char operator=sc.next().charAt(0);
    double result=0;
        if(operator == '+')
        {
            OperationSum s=new OperationSum();
            result=s.arithmetic(first,second);
            System.out.println(first+"+"+second+"="+result);
        }
        else if(operator=='-')
        {
            OperationSub su=new OperationSub();
            result=su.arithmetic(first,second);
            System.out.println(first+"-"+second+ "="+result);
        } else if(operator=='/')
        {
            OperationDiv d=new OperationDiv();
            result=d.arithmetic(first,second);
            System.out.println(first+"/"+second+"=" +result);
        } else if(operator=='*')
        {
            OperationMul m=new OperationMul();
            result=m.arithmetic(first,second);
            System.out.println(first+"*"+second+"=" +result);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
