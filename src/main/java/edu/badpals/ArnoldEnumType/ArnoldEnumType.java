package edu.badpals.ArnoldEnumType;

public class ArnoldEnumType {

    public static void main(String[] args) {
        Double peso = Double.parseDouble(args[0]);

        for(Planeta planeta : Planeta.values()){
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }

        System.out.println("\nYour weight only on the terrestrial planets: ");
        for(Planeta planeta: Planeta.getPlanetasTerrestres()){
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }

        System.out.println("\nYour weight only on the gas giant planets: ");
        for(Planeta planeta: Planeta.getGigantesGaseosos()){
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }
    }

}