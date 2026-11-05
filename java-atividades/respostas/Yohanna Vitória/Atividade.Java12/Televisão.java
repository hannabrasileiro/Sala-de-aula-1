
public class Televisão {

    String marca;
    int volume;
    int canal;

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
    }
}