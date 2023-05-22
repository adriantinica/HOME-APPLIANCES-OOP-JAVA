package appliances;

public class Blender extends Appliance implements CanSpin {
    private int rpm;
    
    public Blender(){         // constructor 1
       super(); 
       rpm = 0;
    }

    public Blender(int powerConsumption){       // constructor 2
       super(powerConsumption); 
    }

    public Blender(int powerConsumption, int rpm){  // constructor 3 
        super(powerConsumption);
        setRpm(rpm);
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        if(rpm < 1 || rpm > 1500){ 
            this.rpm = rpm;
        }else{
            System.err.println("You have exceeded the rotation speed limit");
        }
        
    }
    
    //Implemented method

    @Override
    public void spin() {
        rpm = 1500;
    }

    
    

}
