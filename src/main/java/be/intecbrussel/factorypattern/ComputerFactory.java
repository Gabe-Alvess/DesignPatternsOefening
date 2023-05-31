package be.intecbrussel.factorypattern;

import java.util.Optional;

public class ComputerFactory {

    public static Optional<Computer> createComputer(String type, String ram, String cpu, String hdd) {

        switch (type.toLowerCase()) {
            case "pc" -> {
                return Optional.of(new PC(ram,cpu,hdd));
            }
            case "server" -> {
                return Optional.of(new Server(ram, cpu, hdd));
            }
            default -> {
                return Optional.empty();
            }
        }
    }
}
