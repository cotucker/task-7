import  java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Computer pc1 = new Computer();
        pc1.setScpecs();
        pc1.getSpecs();
        Computer pc2 = new Computer();
        pc2 = pc1;
        // System.out.println(pc1.equals(pc2));
        System.out.println(pc1.toString());
        pc1.getWorkStatus();
        pc2.HealthCheck();
        pc1.TurnOff();
        pc1.getWorkStatus();
    }
}

 