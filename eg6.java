class Bulb1
{
    private int w;
    private static int p;
    public void setWattage(int w)
    {
        if(w>=0 && w <=240)
            {
                this.w=w;
            }
            else
                {
                    w=0;
                }
    }
    public int getWattage()
    {
        return w;
    }
    public void setPrice(int p)
    {
        this.p=p;
    }
    public int getPrice()
    {
        return this.p;
    }

}
class eg6
{
    public static void main(String gg[])
    {
        Bulb1 b=new Bulb1();
        b.setWattage(50);
        b.setPrice(60);
        System.out.println("Wattage is "+b.getWattage());
        System.out.println("Price is "+b.getPrice());
        Bulb1 r=new Bulb1();
        r.setWattage(80);
        r.setPrice(90);
        System.out.println("Wattage is "+r.getWattage());
        System.out.println("Price is "+r.getPrice());
        System.out.println("Wattage is "+b.getWattage());
        System.out.println("Price is "+b.getPrice());
    }
}