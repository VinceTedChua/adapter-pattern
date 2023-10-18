package adapterPattern;

public interface PowerOutletFunction {
    public String plugIn();
    public String plugOff();

    public String getVoltageData();

    public String getAmperageData();
}
