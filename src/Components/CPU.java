package Components;

import java.util.Scanner;

public class CPU {
    Scanner input = new Scanner(System.in);
    private double FREQUENCY;
    private double TDP;
    private int CORES;
    private int THREADS;
    private double BOOST;
    public CPU() {
    }
    public CPU(int CORES, int THREADS, double FREQUENCY) {
        this.CORES = CORES;
        this.THREADS = THREADS;
        this.FREQUENCY = FREQUENCY;
    }
    public void setScpecs() {
        System.out.print("Enter CPU's specs:\n");
        this.CORES = input.nextInt();
        this.THREADS = input.nextInt();
        this.FREQUENCY = input.nextDouble();
        this.TDP = input.nextDouble();
    }
    public void getSpecs() {
        System.out.print(" ·CPU's specs:\n" + this.CORES + " cores\n" + this.THREADS + " threads\nFrequency: " + this.FREQUENCY + " Ghz\n");
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CPU) {
            CPU other = (CPU) obj;
            return (this.CORES == other.THREADS && this.FREQUENCY == other.FREQUENCY && this.TDP == other.TDP);
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(this.CORES) + Integer.hashCode(this.THREADS) + Double.hashCode(this.FREQUENCY) + Double.hashCode(this.TDP);
    }
    @Override
    public String toString() {
        return "CPU[" + this.CORES + " cores, " + this.THREADS + " threads, " + this.FREQUENCY + " Ghz, " + this.TDP + " Watt]";
    }
}
