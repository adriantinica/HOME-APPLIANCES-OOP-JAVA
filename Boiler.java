package appliances;

public class Boiler extends Appliance {
    
    private byte temperature;

    public Boiler() {                        // default constructor 1
        super();
        temperature = 0;
    }  

    public Boiler(int powerConsumption) {    // construct type 2 (1 parameter)
        super(powerConsumption);
    }

    public Boiler(int powerConsumption, byte temperature) {    // construct type 3 ( 2 parameters)
        super(powerConsumption);
        setTemperature(temperature);
    }

    // GETTER AND SETTER


    public byte getTemperature() {
        return temperature;
    }

    public void setTemperature(byte temperature) {
        this.temperature = temperature;
    }
    
}
