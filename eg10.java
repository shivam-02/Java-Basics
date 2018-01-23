class Dog {

    public void printName()
    {
    System.out.println("Tommy"); 
    }
    public void bark()
    {
    System.out.println("Bhow Bhow");
    }
}
    class GermanShepard extends Dog 
    {
    public void jump() 
    {
    System.out.println("Jump Jump"); 
    }
    public void printName()
    {
    System.out.println("Bruno");
    }
}
class eg10
{
    public static void main(String gg[])
    {
        GermanShepard gs=new GermanShepard();
        gs.printName();
        gs.bark();
        gs.jump();
    }
}