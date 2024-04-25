import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class GUI extends JFrame{

    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("VOTAR");
    private JButton jButtonAposta2 = new JButton("APURAR RESULTADO");


    public GUI(){
        this.setTitle("** BBB24 - Interface Gráfica **");
        this.setSize(500,500);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255, 255, 255));

        jButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta1();
            }
        });

        jButtonAposta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta2();
            }
        });



        jButtonAposta1.setPreferredSize(new Dimension(150, 200));
        jButtonAposta2.setPreferredSize(new Dimension(150, 200));


        painel.add(jButtonAposta1);
        painel.add(jButtonAposta2);


        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void aposta2() {
        String letraApostada = JOptionPane.showInputDialog(null, "Professor me da pelo menos 1 ponto aqui ");
        char letraApostadaChar = letraApostada.charAt(0);
        char letraPremiada = 'J';

        if(Character.isLetter(letraApostadaChar)){
            char letraApostadaMaiusculo = Character.toUpperCase(letraApostadaChar);
            if(letraApostadaMaiusculo == letraPremiada){
                JOptionPane.showMessageDialog(null, "Professor me da pelo menos 1 ponto aqui.");
            }else{
                JOptionPane.showMessageDialog(null, "Professor me da pelo menos 1 ponto aqui " + letraPremiada);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Professor me da pelo menos 1 ponto aqui.");
        }
    }

    private static void aposta1() {
        ImageIcon icon = new ImageIcon("sorteio.png");
        Object numeroApostado = JOptionPane.showInputDialog
                (null,"Em quem você vota para sair da casa: ",
                        "Aposta 1",JOptionPane.INFORMATION_MESSAGE,
                        icon,null,"");
        int numeroApostadoInt = Integer.parseInt(numeroApostado.toString());
        Random rdn = new Random();
        int numeroSorteado = rdn.nextInt(101);
        if(numeroApostadoInt == numeroSorteado){
            JOptionPane.showMessageDialog(null,"Professor me da pelo menos 1 ponto aqui.",
                    "Aposta 1",JOptionPane.INFORMATION_MESSAGE,
                    icon);
        }else{
            JOptionPane.showMessageDialog(null,"Professor me da pelo menos 1 ponto aqui: " + numeroSorteado,
                    "Aposta 1",JOptionPane.INFORMATION_MESSAGE,
                    icon);
        }
    }


    public static void main(String[] args) {
        new GUI();
    }
}