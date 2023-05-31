package be.intecbrussel.factorypattern;

public abstract class Computer {
    private final String ram;
    private final String cpu;
    private final String hdd;

    public Computer(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public String getHdd() {
        return hdd;
    }
}
