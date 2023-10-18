package adapterPattern;

public class Laptop {
    public String charge()
    {
        return "Laptop is plugged on- Now Charging!";
    }

    public String unCharge()
    {
        return "Laptop is plugged off- Stops Charging!";

    }

    public String setVoltage()
    {
        return "Laptop Has: 110V";
    }

    public String setAmperage()
    {
        return "Laptop Has: 3AMP";
    }
}
