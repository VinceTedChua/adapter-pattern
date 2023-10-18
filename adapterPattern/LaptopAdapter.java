package adapterPattern;

public class LaptopAdapter implements  PowerOutletFunction {
    private Laptop laptop;

    public LaptopAdapter(Laptop laptop)
    {
        this.laptop = laptop;
    }


    @Override
    public String plugIn()
    {
        return laptop.charge();
    }

    @Override
    public String plugOff()
    {
        return laptop.unCharge();
    }

    @Override
    public String getVoltageData()
    {
        return laptop.setVoltage();
    }

    @Override
    public String getAmperageData()
    {
        return laptop.setAmperage();
    }
}
