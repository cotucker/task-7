import Components.CPU;
import Components.Floppydisk;
import Components.Harddrive;
import Components.RAM;


public class Computer {
    private boolean WorkStatus;
    private boolean Health;
    private CPU cpu;
    private Harddrive hd;
    private Floppydisk flppydisk;
    private RAM ram;

    public Computer(){
        this.WorkStatus = true;
        this.Health = false;
        this.cpu = new CPU();
        this.hd = new Harddrive();
        this.ram = new RAM();
        this.flppydisk = new Floppydisk();
    }

    public void getWorkStatus() {
        if(this.WorkStatus == true){
            System.out.print(" PC is turned on ···\n");
        }else{
            System.out.print(" PC is turned off ···\n");
        }
    }
    public void TurnOn(){
        if(this.WorkStatus == true){
            System.out.print(" PC is already turned on ···\n");
        }else{
            this.WorkStatus = true;
            System.out.print(" [ -> ] PC is turned on ···\n");
        }
    }
    public void TurnOff(){
        if(this.WorkStatus == false){
            System.out.print(" PC is already turned off ···\n");
        }else{
            this.WorkStatus = false;
            System.out.print(" [ -> ] PC is turned off ···\n");
        }
    }

    boolean HealthCheck(){
        if(this.Health == true) {
            System.out.print(" PC is infected ···\n");
        }else{
            System.out.print(" PC isn't infected ···\n");
        }
        return this.Health == true;
    }

    public void InfectPC(){
        this.Health = true;
        System.out.print(" PC is infected ···\n");
    }
    public void HealPC(){
        this.Health = false;
        System.out.print(" PC isn't infected ···\n");
    }
    public Computer(CPU Cpu, Harddrive HD, Floppydisk fd, RAM Ram){
        this.cpu = new CPU();
        this.cpu = Cpu;
        this.hd = new Harddrive();
        this.hd = HD;
        this.ram = new RAM();
        this.ram = Ram;
        this.flppydisk = new Floppydisk();
        this.flppydisk = fd;
    }
    public void setScpecs(){
        System.out.print("Enter PC's specs:\n");
        this.cpu.setScpecs();
        this.hd.setScpecs();
        this.flppydisk.setScpecs();
        this.ram.setScpecs();
    }
    public void getSpecs() {
        System.out.print("PC's specs:\n");
        this.cpu.getSpecs();
        this.hd.getSpecs();
        this.flppydisk.getSpecs();
        this.ram.getSpecs();
        System.out.print("\n");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Computer) {
            Computer other = (Computer) obj;
            return (this.ram.equals(other.ram) && this.cpu.equals(other.cpu) && this.hd.equals(other.hd) && this.flppydisk.equals(other.flppydisk));
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return this.cpu.hashCode() + this.hd.hashCode() + this.flppydisk.hashCode() + this.ram.hashCode();
    }
    @Override
    public String toString() {
        return "Computer( "+ this.cpu.toString() + ", " + this.ram.toString() + ", " + this.hd.toString() + ", " + this.flppydisk.toString() + " )";
    }
}
