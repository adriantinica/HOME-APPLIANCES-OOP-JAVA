package main;
import appliances.Boiler;
public class App {

    public static void main(String[] args) {
        Boiler b = new Boiler();  
        Boiler bb = new Boiler(100);  //watts
        Boiler bbb = new Boiler(10001, (byte)20);
        

        //System.out.println(b.getPowerConsumption());   // first constructor output
        //System.out.println(b.getTemperature());
        System.out.println();
        //System.out.println(bb.getPowerConsumption());  // second constructor output
        System.out.println();
        System.out.println(bbb.getPowerConsumption());  // third constrctor output
        System.out.println(bbb.getTemperature());





    }
}