
public class Temperatura {

    String marca;
    int temperatura;
    boolean ligado;

    public void ligar() {
        ligado = true;
        System.out.println("Ar-condicionado ligado!");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Ar-condicionado desligado!");
    }

    public void aumentarTemperatura() {
        if (temperatura < 30) {
            temperatura++;
        } else {
            System.out.println("Temperatura máxima atingida!");
        }
    }

    public void diminuirTemperatura() {
        if (temperatura > 16) {
            temperatura--;
        } else {
            System.out.println("Temperatura mínima atingida!");
        }
    }

    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Temperatura: " + temperatura + " °C");
        System.out.println("Ligado: " + ligado);
    }
}
    