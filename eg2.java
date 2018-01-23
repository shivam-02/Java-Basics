class Bulb
{
    private int w;
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

}
class eg2
{
    public static void main(String gg[])
    {
        Bulb b=new Bulb();
        b.setWattage(-30);
        System.out.println("Wattage is "+b.getWattage());
        Bulb r=new Bulb();
        r.setWattage(100);
        System.out.println("Wattage is "+r.getWattage());
        Bulb g=null;
        g.setWattage(40);
        System.out.println("Wattage is "+g.getWattage());
    }
}