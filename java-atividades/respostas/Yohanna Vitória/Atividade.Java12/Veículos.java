public class Veículos {

    String modelo;
    String marca;
    int ano;
    boolean ligado;

    void ligar() {
        if (ligado == false) {
            ligado = true;
            System.out.println("O carro foi ligado!");
        } else {
            System.out.println("O carro já está ligado!");
        }
    }

    void desligar() {
        if (ligado == true) {
            ligado = false;
            System.out.println("O carro foi desligado!");
        } else {
            System.out.println("O carro já está desligado!");
        }
    }

    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Ligado: " + ligado);
        System.out.println("----------------------");
    }

}
    

