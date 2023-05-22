package appliances;

public class WashMachine extends Appliance implements CanHeatWater, CanSpin {

    private byte temperature;
    private int rpm;
    
    public WashMachine(){   // constructor model 1
        super();
        temperature = 0;
        rpm=0;
    };
    
    public WashMachine(int rpm, int powerConsumption){   // constructor model 2
        super(powerConsumption);  
        setRpm(rpm);
    }

    public WashMachine(int rpm, int powerConsumption, byte temperature){  // constructor model 3
        super(powerConsumption);
        setRpm(rpm);
        setTemperature(temperature);
    }

    public WashMachine(byte temperature, int powerConsumption){   // constructor model 4
        super(powerConsumption);  
        setRpm(rpm);
    }



    
    
    public byte getTemperature() {
        return temperature;
    }

    public void setTemperature(byte temperature) {
        if(temperature < 0 && temperature >= 96){
        System.err.println("The temperature limit is exceeded ");
        }else{this.temperature = temperature;

        }
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        if(rpm > 30 && rpm <= 1000){
        this.rpm = rpm;
        }else{
            System.err.println("You have exceeded the rotation speed limit");
        }
    }


    

    
    
    @Override
    public void spin() {
        rpm = 1000;
    }

    @Override
    public void heat() {
        temperature = 50;
    }
    
}
