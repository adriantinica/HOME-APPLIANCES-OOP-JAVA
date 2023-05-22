package appliances;

public abstract class Appliance {
    private int powerConsumption;

    //CONSTRUCTOR

    public Appliance() {
        powerConsumption =0;
    }  

    public Appliance(int powerConsumption){
        setPowerConsumption(powerConsumption);
    }


    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        if(powerConsumption >=1 && powerConsumption <= 10000){ // watts
            this.powerConsumption = powerConsumption;
        }else{
            System.err.println();
            System.err.println("Power Consumption is too high");
        }
    }

    

}
