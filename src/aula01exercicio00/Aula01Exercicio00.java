package aula01exercicio00;

import javax.swing.JOptionPane;

public class Aula01Exercicio00 {

    public static void main(String[] args) {
        String largura;
        String comprimento;
        String alturaCm;

        largura = JOptionPane.showInputDialog("Digite a largura:");
        comprimento = JOptionPane.showInputDialog("Digite o comprimento:");
        alturaCm = JOptionPane.showInputDialog("Digite a altura em cm:");

        Double la = Double.parseDouble(largura);
        Double com = Double.parseDouble(comprimento);
        Double al = Double.parseDouble(alturaCm);

        JOptionPane.showMessageDialog(null, "O volume é: " + la * com * al, "Resultado", JOptionPane.PLAIN_MESSAGE);
        
        //Consertar o autor.
    }

}
