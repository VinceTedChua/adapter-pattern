package adapterPattern;

public class SmartPhone {
    public String chargePhone(){
        return "Smart Phone is Plugged in- Charging.....!";
    }

    public String unChargePhone(){
        return "Smart Phone is Plugged Off- Stops Charging._._.!";
    }

    public String setVoltage(){
        return "IPhone Has: 10V";
    }

    public String setAmperage(){
        return "IPhone Has: 2AMP";
    }

}
