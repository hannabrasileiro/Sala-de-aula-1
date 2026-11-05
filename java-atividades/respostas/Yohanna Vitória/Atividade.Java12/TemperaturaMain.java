public static void main(String[] args) {

        Temperatura ar = new Temperatura();

        ar.marca = "LG";
        ar.temperatura = 22;
        ar.ligado = false;

        ar.ligar();

        ar.aumentarTemperatura();
        ar.aumentarTemperatura();

        ar.diminuirTemperatura();

        ar.mostrarInformacoes();

        ar.desligar();
    }
