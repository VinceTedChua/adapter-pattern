package adapterPattern;

public class Refrigerator {
    public String startCooling()
    {
        return "Refrigerator is making grumbling sound- Now Starting!";
    }

    public String stopCooling()
    {
        return "Refrigerator is gradually turning off- Now Stopping!";
    }

    public String setVoltage()
    {
        return "Refrigerator Has: 220V";
    }

    public String setAmperage()
    {
        return "Refrigerator Has: 10AMP";
    }
}
