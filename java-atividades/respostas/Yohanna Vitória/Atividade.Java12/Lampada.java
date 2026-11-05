public class Lampada {

    String cor;
    int potencia;
    boolean ligada;

    void ligar() {
        ligada = true;
        System.out.println("Lâmpada ligada!");
    }

    void desligar() {
        ligada = false;
        System.out.println("Lâmpada desligada!");
    }

    void mostrarEstado() {
        System.out.println("Cor: " + cor);
        System.out.println("Potência: " + potencia + "W");
        System.out.println("Ligada: " + ligada);
        System.out.println("----------------------");
    }

}