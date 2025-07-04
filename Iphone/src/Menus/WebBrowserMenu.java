package Menus;

import Models.IphoneModel;
import Services.IphoneServices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WebBrowserMenu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void menu(IphoneModel iphone) {
        int option;

        do {
            System.out.println("===== Navegador de internet =====");
            System.out.println("1 - Acessar página");
            System.out.println("2 - Adicionar nova aba");
            System.out.println("3 - atualizar página");
            System.out.println("4 - Retornar");

            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();

                option = -1;
            }

            switch (option) {
                case 1 -> IphoneServices.displayPage(iphone);
                case 2 -> iphone.addNewTab();
                case 3 -> iphone.refreshPage();
                case 4 -> {
                    System.out.println("Retornando ao menu principal");
                    return;
                }
                default -> System.out.println("Opção Inválida! Tente novamente!");
            }
        } while (true);
    }
}
