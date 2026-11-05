public class CelularMain {

    public static void main(String[] args) {

        Celular celular1 = new Celular();
        Celular celular2 = new Celular();

        celular1.marca = "Samsung";
        celular1.modelo = "Galaxy S24";
        celular1.bateria = 35;

        celular2.marca = "Apple";
        celular2.modelo = "iPhone 15";
        celular2.bateria = 60;

        celular1.exibirInformacoes();
        celular2.exibirInformacoes();

        celular1.ligar();
        celular2.ligar();

        celular1.carregarBateria();
        celular2.carregarBateria();

        celular1.exibirInformacoes();
        celular2.exibirInformacoes();

    }
}