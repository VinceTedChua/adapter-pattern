package adapterPattern;

public class SmartPhoneAdapter implements PowerOutletFunction {
    private SmartPhone smartPhone;

    public SmartPhoneAdapter(SmartPhone smartPhone){
        this.smartPhone = smartPhone;
    }

    @Override
    public String plugIn() {
        return smartPhone.chargePhone();
    }

    @Override
    public String plugOff() {
        return smartPhone.unChargePhone();
    }

    @Override
    public String getVoltageData() {
        return smartPhone.setVoltage();
    }

    @Override
    public String getAmperageData() {
        return smartPhone.setAmperage();
    }
}
