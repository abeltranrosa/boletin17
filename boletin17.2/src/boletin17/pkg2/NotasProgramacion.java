package boletin17.pkg2;

import javax.swing.JOptionPane;

public class NotasProgramacion {

    int[] Notas = new int[30];

    public void cargarArray() {
        for (int i = 0; i < Notas.length; i++) {
            Notas[i] = pedirNotas();
        }

    }

    public int pedirNotas() {
        int resultado;
        do {
            resultado = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota"));
            if (resultado < 1 || resultado > 10) {
                JOptionPane.showMessageDialog(null, "Introduce la nota");
            }
        } while (resultado < 1 || resultado > 10);
        return resultado;
    }

    public void visualizaAprobados() {
        int aprobados = 0;
        int suspensos = 0;

        for (int i = 0; i < Notas.length; i++) {
            if (Notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("Numero de Aprobados :" + aprobados);
        System.out.println("Numero de Suspensos :" + suspensos);
    }

    public void calcularNotaMedia() {
        int acumulador = 0;
        for (int i = 0; i < Notas.length; i++) {
            acumulador += Notas[i];
        }
        System.out.println("La nota media de la clase es :" + (acumulador / Notas.length));
    }

    public void calcularNotaMaxima() {
        int NotaMaxima = 0;

        for (int i = 0; i < Notas.length; i++) {
            if (Notas[i] > NotaMaxima) {
                NotaMaxima = Notas[i];
            }
            System.out.println("La nota mas alta es :" + NotaMaxima);
        }
    }
}
