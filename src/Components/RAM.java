package Components;

import java.util.Scanner;

public class RAM {
    Scanner input = new Scanner(System.in);
    private double Size;
    private double Frequency;

    public RAM(){

    }
    public RAM(double size){
        this.Size = size;
    }
    public void setScpecs(){
        System.out.print("Enter RAM's specs:\n");
        this.Size = input.nextDouble();
        this.Frequency = input.nextDouble();
    }
    public void  getSpecs(){
        System.out.print(" ·RAM's specs:\ncapacity: " + this.Size + " Gb\nFrequency: " + this.Frequency+ " MHz\n");
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RAM) {
            RAM other = (RAM) obj;
            return (this.Size == other.Size && this.Frequency == other.Frequency);
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return Double.hashCode(this.Size) + Double.hashCode(this.Frequency);
    }
    @Override
    public String toString() {
        return "RAM[" + this.Size + "Gb, " + this.Frequency + " MHz]";
    }
}
