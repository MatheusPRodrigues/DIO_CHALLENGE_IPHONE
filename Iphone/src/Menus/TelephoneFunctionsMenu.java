package Menus;

import Models.IphoneModel;
import Services.IphoneServices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TelephoneFunctionsMenu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void menu(IphoneModel iphone) {
        int option;

        do {
            System.out.println("===== Aparelho telefônico =====");
            System.out.println("1 - Ligar");
            System.out.println("2 - Atender");
            System.out.println("3 - Inicar correio de voz");
            System.out.println("4 - Retornar");

            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();

                option = -1;
            }

            switch (option) {
                case 1 -> IphoneServices.callPhone(iphone);
                case 2 -> iphone.answer();
                case 3 -> iphone.startVoicemail();
                case 4 -> {
                    System.out.println("Retornando ao menu principal");
                    return;
                }
                default -> System.out.println("Opção Inválida! Tente novamente!");
            }
        } while (true);
    }
}
