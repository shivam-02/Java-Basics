class Dog {

    public void printName()
    {
    System.out.println("Tommy"); 
    }
    final public void bark()
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
    public void bark()
    {
        System.out.println("Meow Meow");
    }
}
class eg11
{
    public static void main(String gg[])
    {
        GermanShepard gs=new GermanShepard();
        gs.printName();
        gs.bark();
        gs.jump();
    }
}