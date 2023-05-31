package be.intecbrussel.factorypattern;

import java.util.Optional;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("What sort of computer do you want? (pc or server)");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        System.out.println("How much GB of memory RAM?");
        String ram = scanner.nextLine();

        System.out.println("How much GHz for the CPU?");
        String cpu = scanner.nextLine();

        System.out.println("How much TB of HDD memory?");
        String hdd = scanner.nextLine();

        Optional<Computer> computer = ComputerFactory.createComputer(type, ram, cpu, hdd);

        if (computer.isEmpty()) {
            System.out.println("We don't have that sort computer!");
            return;
        }

        System.out.printf("You created an %s with %s memory RAM, %s CPU processing speed and %s of HDD memory.", type, computer.get().getRam(), computer.get().getCpu(), computer.get().getHdd());
    }
}
