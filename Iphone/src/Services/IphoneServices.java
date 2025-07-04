package Services;

import Exceptions.CallPhoneException;
import Exceptions.InvalidUrlException;
import Exceptions.MusicEmptyException;
import Models.IphoneModel;
import Validations.IphoneValidations;

import java.util.Scanner;


public class IphoneServices {
    private static final Scanner scanner = new Scanner(System.in);

    public static void selectMusic(IphoneModel iphone) {
        try {
            System.out.println("Digite a música que deseja escutar:");
            String music = scanner.nextLine();

            IphoneValidations.musicIsEmpty(music);

            iphone.selectMusic(music);
        } catch (MusicEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void callPhone(IphoneModel iphone) {
        try {
            System.out.println("Digite o número de telefone (somente números de 0 - 9):");
            String number = scanner.next();

            IphoneValidations.callPhoneValidations(number);

            iphone.call(number);
        } catch (CallPhoneException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void displayPage(IphoneModel iphone) {
        try {
            System.out.println("Insira a url dá página que deseja acessar:");
            String url = scanner.nextLine();

            IphoneValidations.urlValidation(url);

            iphone.displayPage(url);
        } catch (InvalidUrlException e) {
            System.out.println(e.getMessage());
        }

    }
}
