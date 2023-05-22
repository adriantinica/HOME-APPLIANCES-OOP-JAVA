package main;
import appliances.Blender;
import appliances.Boiler;
import appliances.WashMachine;
public class App {

    public static void main(String[] args) {
        Boiler b = new Boiler();  
        Boiler bb = new Boiler(100);  //watts
        Boiler bbb = new Boiler(10001, (byte)20);

        Blender bl = new Blender();
        Blender bll = new Blender(800);   
        Blender blll = new Blender(800, 2000);

        WashMachine wm = new WashMachine();
        WashMachine wmm = new WashMachine(1600, 1200);
        WashMachine wmmm = new WashMachine(800, 900);
        WashMachine wmmmm = new WashMachine(1000, 1500, (byte) 80);

        //System.out.println(b.getPowerConsumption());   // first constructor output
        //System.out.println(b.getTemperature());
        System.out.println();
        //System.out.println(bb.getPowerConsumption());  // second constructor output
        System.out.println();
        //System.out.println(bbb.getPowerConsumption());  // third constrctor output
        //System.out.println(bbb.getTemperature());

        //System.out.println(blll.getPowerConsumption());
        //System.out.println(blll.getRpm());

        System.out.println(wmm.getPowerConsumption());
        System.out.println(wmm.getRpm());



