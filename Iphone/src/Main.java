import Menus.MusicPlayerMenu;
import Menus.TelephoneFunctionsMenu;
import Menus.WebBrowserMenu;
import Models.IphoneModel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        IphoneModel iphone = new IphoneModel();
        int option;

        do {
            System.out.println("===== Escolha uma das funções do seu Iphone =====");
            System.out.println("1 - Reprodutor musical");
            System.out.println("2 - Aparelho telefônico");
            System.out.println("3 - Navegador de internet");
            System.out.println("4 - Encerrar sistema");

            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();

                option = -1;
            }

            switch (option) {
                case 1 -> MusicPlayerMenu.menu(iphone);
                case 2 -> TelephoneFunctionsMenu.menu(iphone);
                case 3 -> WebBrowserMenu.menu(iphone);
                case 4 -> {
                    System.out.println("Encerrando sistema");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida! Tente novamente!");
            }
        }while (true);
    }
}