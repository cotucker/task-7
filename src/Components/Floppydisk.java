package Components;

import java.util.Scanner;

public class Floppydisk {
    Scanner input = new Scanner(System.in);
    private double Speed;
    public Floppydisk(){

    }
    public Floppydisk(double speed){
        this.Speed = speed;
    }
    public void setScpecs(){
        System.out.print("Enter floppydisk's specs:\n");
        this.Speed = input.nextDouble();
    }
    public void  getSpecs(){
        System.out.print(" ·Floppydisk's specs:\nReading speed: " + this.Speed+ " Mb/s\n");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Floppydisk) {
            Floppydisk other = (Floppydisk) obj;
            return (this.Speed == other.Speed);
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return Double.hashCode(this.Speed);
    }
    @Override
    public String toString() {
        return "Floppydisk[" + this.Speed + "Mb/s]";
    }
}
