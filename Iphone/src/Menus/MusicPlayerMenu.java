package Menus;

import Models.IphoneModel;
import Services.IphoneServices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MusicPlayerMenu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void menu(IphoneModel iphone) {
        int option;

        do {
            System.out.println("===== Reprodutor Musical =====");
            System.out.println("1 - Selecionar música");
            System.out.println("2 - Tocar");
            System.out.println("3 - Pausar");
            System.out.println("4 - Retornar");

            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();

                option = -1;
            }

            switch (option) {
                case 1 -> IphoneServices.selectMusic(iphone);
                case 2 -> iphone.play();
                case 3 -> iphone.pause();
                case 4 -> {
                    System.out.println("Retornando ao menu principal");
                    return;
                }
                default -> System.out.println("Opção Inválida! Tente novamente!");
            }
        } while (true);
    }
}
