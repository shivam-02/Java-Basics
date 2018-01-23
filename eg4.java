class Rectangle
{
    private int length;
    private int breadth;
    public void setLength(int length)
    {
        this.length=length;
    }
    public int getLength()
    {
        return this.length;
    }
    public void setBreadth(int breadth)
    {
        this.breadth=breadth;
    }
    public int getBreadth()
    {
        return this.breadth;
    }
}
class Box extends Rectangle
{
    private int height;
    public void setHeight(int height)
    {
        this.height=height;
    }
    public int getHeight()
    {
        return this.height;
    }
}
class eg4
{
    public static void main(String gg[])
    {
        Box x=new Box();
        x.setLength(4);
        x.setBreadth(5);
        x.setHeight(12);
        System.out.println("Length is "+x.getLength());
        System.out.println("Breadth is "+x.getBreadth());
        System.out.println("Height is "+x.getHeight());
    }
}