package Models;

import Interfaces.IMusicPlayer;
import Interfaces.ITelephoneFunctions;
import Interfaces.IWebBrowser;

public class IphoneModel implements IMusicPlayer, ITelephoneFunctions, IWebBrowser {
    private String music;

    @Override
    public void play() {
        if (this.music != null) {
            System.out.printf("Tocando '%s'\n", this.music);
        } else {
            System.out.println("Selecione uma música primeiro!");
        }
    }

    @Override
    public void pause() {
        if (this.music != null) {
            System.out.printf("Pausando '%s'\n", this.music);
        } else {
            System.out.println("Selecione uma música primeiro!");
        }
    }

    @Override
    public void selectMusic(String music) {
        this.music = music;
        System.out.printf("'%s' selecionada!\n", this.music);
    }

    @Override
    public void call(String number) {
        System.out.printf("Ligando para o número: %s\n", number);
        System.out.println("Pi Pi Pi...");
    }

    @Override
    public void answer() {
        System.out.println("Atendendo telefone...");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void displayPage(String url) {
        System.out.printf("Acessando página, url='%s'\n", url);
    }

    @Override
    public void addNewTab() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void refreshPage() {
        System.out.println("Página recarregada!");
    }
}
