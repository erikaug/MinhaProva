import java.util.Scanner;
import java.util.ArrayList;
public class Jogador {
        private String nome;
        private int votar;
        public Jogador(String nome) {
                this.nome = nome;
                this.votar = 0;
        }
        public String getNome() {
                return nome;
        }
        public int getVotos() {
                return votar;
        }
        public void votacao() {
                this.votar++;
        }
        public static void main(String[] args) {
                Scanner ler = new Scanner(System.in);
                ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
                jogadores.add(new Jogador("Alane Dias"));
                jogadores.add(new Jogador("Beatriz Reis"));
                jogadores.add(new Jogador("Davi Brito"));
                jogadores.add(new Jogador("Deniziane Ferreira"));
                jogadores.add(new Jogador("Fernanda Bande"));
                jogadores.add(new Jogador("Giovanna Lima"));
                jogadores.add(new Jogador("Giovanna Pitel"));
                jogadores.add(new Jogador("Isabelle Nogueira"));
                jogadores.add(new Jogador("Juninho"));
                jogadores.add(new Jogador("Leidy Elin"));
                jogadores.add(new Jogador("Lucas Henrique"));
                jogadores.add(new Jogador("Lucas Luigi"));
                jogadores.add(new Jogador("Lucas Pizane"));
                jogadores.add(new Jogador("Marcus Vinicius"));
                jogadores.add(new Jogador("Matteus Amaral"));
                jogadores.add(new Jogador("MC Bin Laden"));
                jogadores.add(new Jogador("Michel Nogueira"));
                jogadores.add(new Jogador("Nizam"));
                jogadores.add(new Jogador("Raquele Cardozo"));
                jogadores.add(new Jogador("Rodriguinho"));
                jogadores.add(new Jogador("Thalyta Alves"));
                jogadores.add(new Jogador("Vanessa Lopes"));
                jogadores.add(new Jogador("Vinicius Rodrigues"));
                jogadores.add(new Jogador("Wanessa Camargo"));
                jogadores.add(new Jogador("Yasmin Brunet"));
                System.out.println("Digite o nome do jogador que você quer votar depois escreva 'sair' para encerrar os votos):");
                String voto = ler.nextLine();
                while (!voto.equalsIgnoreCase("sair")) {
                        boolean votook = false;
                        for (Jogador jogador : jogadores) {
                                if (jogador.getNome().equalsIgnoreCase(voto)) {
                                        jogador.votacao();
                                        votook = true;
                                        break;
                                }
                        }
                        if (!votook) {
                                System.out.println("Nome inexistente, escreva um dos participantes do BBB24");
                        }
                        voto = ler.nextLine();
                }

                Jogador jogadorotario = jogadores.get(0);
                for (Jogador jogador : jogadores) {
                        if (jogador.getVotos() > jogadorotario.getVotos()) {
                                jogadorotario = jogador;
                        }
                }

                System.out.println("Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir " +
                        "domar o sol, " + "se eu conseguir fazer o mar virar sertão," + "e o sertão virar mar, se eu " +
                        "conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu vou conseguir " +
                        "te eliminar com alegria. Com " + jogadorotario.getVotos() + " votos, é você quem sai " + jogadorotario.getNome());
        }
}
