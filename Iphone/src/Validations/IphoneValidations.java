package Validations;

import Exceptions.CallPhoneException;
import Exceptions.InvalidUrlException;
import Exceptions.MusicEmptyException;

public class IphoneValidations {

    public static void musicIsEmpty(String music) {
        if (music.isEmpty()) throw new MusicEmptyException("É necessário inserir uma música!");
    }

    public static void callPhoneValidations(String number) {
        if (number.isEmpty()) throw new CallPhoneException("É necessário inserir um número de telefone!");

        if (!(number.matches("\\d+"))) throw new CallPhoneException("Número inválido");

        if (number.length() < 8 || number.length() > 9 ) throw new CallPhoneException("Número inválido");
    }

    public static void urlValidation(String url) {
        if (url.isEmpty()) throw new InvalidUrlException("É preciso inserir uma url!");

        if (!url.matches("^www\\..+") || url.contains(" ")) throw new InvalidUrlException("Url inválida!");
    }
}
