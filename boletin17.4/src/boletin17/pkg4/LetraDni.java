package boletin17.pkg4;

import javax.swing.JOptionPane;

public class LetraDni {

    String [] Letra = {"A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"
    int[] numero = {3, 11, 20, 9, 22, 7, 4, 18, 13, 21, 19, 5, 12, 8, 16, 1, 15, 0, 17, 2, 10, 6, 14};

    public int pedirDNI() {
        String resultado;
        int respuesta;
        do {
            resultado = (JOptionPane.showInputDialog("Introduzca el numero de DNI"));
            if (resultado.length() > 8) {
                JOptionPane.showMessageDialog(null, "el DNI no es valido");
            }
        } while (resultado.length() > 8);
        respuesta = Integer.parseInt(resultado);
        return respuesta;

    }
    public int calcularLetra(){
        int resultado = pedirDNI();
        int numeroDNI = resultado %23;
        return numeroDNI;
    }
    public void visualizar(){
        int numeroDNI = calcularLetra();
        for(int i=0;i<Letra.length; i++){
            if (numero[i]==numeroDNI){
                JOptionPane.showMessageDialog(null,"la letra de su DNI es: "+ Letra[i]);
            }
        }
    }
}
