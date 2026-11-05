public class AnimaisMain {

    public static void main(String[] args) {

        Animais  cachorro1 = new Animais();
        Animais cachorro2 = new Animais ();
        Animais cachorro3 = new Animais();

        cachorro1.nome = "Rex";
        cachorro1.raca = "Labrador";
        cachorro1.idade = 3;

        cachorro2.nome = "Luna";
        cachorro2.raca = "Poodle";
        cachorro2.idade = 2;

        cachorro3.nome = "Thor";
        cachorro3.raca = "Pastor Alemão";
        cachorro3.idade = 5;

        cachorro1.exibirDados();
        cachorro1.latir();
        cachorro1.brincar();

        cachorro2.exibirDados();
        cachorro2.latir();
        cachorro2.brincar();

        cachorro3.exibirDados();
        cachorro3.latir();
        cachorro3.brincar();

    }
}