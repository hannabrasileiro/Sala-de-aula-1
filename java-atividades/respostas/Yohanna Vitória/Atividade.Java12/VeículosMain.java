public class VeículosMain {

    public static void main(String[] args) {

        Veículos carro1 = new Veículos();
        Veículos carro2 = new Veículos();

        carro1.modelo = "Civic";
        carro1.marca = "Honda";
        carro1.ano = 2022;
        carro1.ligado = false;

        carro2.modelo = "Onix";
        carro2.marca = "Chevrolet";
        carro2.ano = 2024;
        carro2.ligado = false;

        carro1.exibirInformacoes();
        carro1.ligar();
        carro1.ligar();
        carro1.desligar();

        carro2.exibirInformacoes();
        carro2.ligar();
        carro2.desligar();

        carro1.exibirInformacoes();
        carro2.exibirInformacoes();

    }
}