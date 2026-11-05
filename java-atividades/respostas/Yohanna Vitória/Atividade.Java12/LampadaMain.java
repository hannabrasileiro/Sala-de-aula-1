public class LampadaMain {

    public static void main(String[] args) {

        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();

        lampada1.cor = "Branca";
        lampada1.potencia = 12;
        lampada1.ligada = true;

        lampada2.cor = "Amarela";
        lampada2.potencia = 9;
        lampada2.ligada = false;

        lampada1.mostrarEstado();
        lampada2.mostrarEstado();

    }
}