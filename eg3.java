class calculator
{
    public void add(int e,int f,int g)
    {
        System.out.println("Total is "+(e+f+g));
    }
    public void add(int a,int b)
    {
        System.out.println("Total is "+(a+b));
    }
}
class eg3
{
    public static void main(String gg[])
    {
        calculator c=new calculator();
        c.add(12,34,56);
        c.add(10,20);
    }
}