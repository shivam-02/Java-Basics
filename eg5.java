class aaa
{
    public static void sam()
    {
        System.out.println("I have fixed behaviour");
    }
    public void tom()
    {
        System.out.println("I changed my behaviour");
    }
}
class eg5
{
    public static void main(String gg[])
    {
        aaa a=new aaa();
        a.tom();
        aaa.sam();
        a.sam();
    }
}