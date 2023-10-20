package Exemplo02;

public class TestaHeroi {
    public static void main(String[] args) {
        Flash flash = new Flash();
        Speedster speedster = new Speedster();

        System.out.println("Flash, o super-herói da velocidade:");
        flash.runFast();
        flash.savePeople();
        flash.useSuperpower();

        System.out.println("\nSpeedster, outro super-herói veloz:");
        speedster.runFast();
        speedster.savePeople();
        speedster.useSuperpower();
    }
}