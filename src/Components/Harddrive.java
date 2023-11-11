package Components;

import java.util.Scanner;

public class Harddrive {
    Scanner input = new Scanner(System.in);
    private double Size;
    private double Speed;
    public Harddrive(){

    }
    public Harddrive(double size){
        this.Size = size;
    }
    public void setScpecs(){
        System.out.print("Enter harddrive's spec:\n");
        this.Size = input.nextDouble();
        this.Speed = input.nextDouble();
    }
    public void  getSpecs(){
        System.out.print(" ·Harddrive's spec:\nОбъем: " + this.Size + " Tb\nСкорость: " + this.Speed+ " Mb/s\n");
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Harddrive) {
            Harddrive other = (Harddrive) obj;
            return (this.Speed == other.Speed && this.Size == other.Size);
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return Double.hashCode(this.Speed) + Double.hashCode(this.Size);
    }
    @Override
    public String toString() {
        return "Harddrive["+ this.Size + " Tb, " + this.Speed + " Mb/s]" ;
    }
}

