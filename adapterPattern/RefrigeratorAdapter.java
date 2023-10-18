package adapterPattern;

public class RefrigeratorAdapter implements PowerOutletFunction {
    private Refrigerator ref;

    public RefrigeratorAdapter(Refrigerator newRef)
    {
        this.ref = newRef;
    }

    @Override
    public String plugIn()
    {
        return ref.startCooling();
    }

    @Override
    public String plugOff()
    {
        return ref.stopCooling();
    }

    @Override
    public String getVoltageData()
    {
        return ref.setVoltage();
    }

    @Override
    public String getAmperageData()
    {
        return ref.setAmperage();
    }
}
