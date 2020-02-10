public class Main
{
    public double first;
    public double second;
    public double result;
    public double arithmetic(double first,double second)
    {
        return 0;
    }
}

class OperationSum extends Main
{
   public double arithmetic(double first,double second)
   {
       result=first+second;
       return result;
   }
}

class OperationSub extends Main
{
    public double arithmetic(double first,double second)
    {
        result=first-second;
        return result;
    }
}

class OperationMul extends Main
{
    public double arithmetic(double first,double second)
    {
        result=first*second;
        return result;
    }
}

class OperationDiv extends Main
{
    public double arithmetic(double first,double second)
    {
        result=first/second;
        return result;
    }
}
