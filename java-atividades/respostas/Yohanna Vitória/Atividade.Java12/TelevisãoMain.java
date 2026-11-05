 public static void main(String[] args) {

        Televisão tv = new Televisão();

        tv.marca = "Samsung";
        tv.volume = 20;
        tv.canal = 5;

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();

        tv.mudarCanal(10);

        tv.mostrarInformacoes();
 
}
