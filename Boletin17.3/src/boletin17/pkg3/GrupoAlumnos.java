package boletin17.pkg3;

import javax.swing.JOptionPane;

public class GrupoAlumnos {

    int numeroElementos = pedirNumeroElementos();
    int[] notas = new int[numeroElementos];
    String[] grupoalumnos = new String[numeroElementos];

    public void cargarArray() {
        for (int i = 0; i < numeroElementos; i++) {
            grupoalumnos[i] = pedirNombre();
            notas[i] = pedirNota();
            
        }
    }

    public int pedirNumeroElementos() {
        int resultado = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero de alumnos :"));
        return resultado;
    }

    public String pedirNombre() {
        String resultado = JOptionPane.showInputDialog("introduce el nombre del alumno: ");
        return resultado;
    }

    public int pedirNota() {
        int resultado = Integer.parseInt(JOptionPane.showInputDialog("introduce la nota del alumno :"));
        return resultado;
    }

    public void visualizarAlumnoAprobado() {
        String cadena = " ";
        for (int i = 0; i < numeroElementos; i++) {
            if (notas[i] >= 5) {
                cadena += grupoalumnos[i]+" " + notas[i]+"\n";
            }
        }
        JOptionPane.showMessageDialog(null, "los aprobados son: " + cadena);

    }

    public void listaNotas() {
        String aux = " ";
        int z = 0;
        for (int i = 0; i < numeroElementos - 1; i++) {
            for (int j = i; j < numeroElementos; j++) {
                if (notas[i] > notas[j]) {
                    z = notas[i];
                    notas[i] = notas[j];
                    notas[j] = z;
                    aux = grupoalumnos[i];
                    grupoalumnos[j] = aux;

                }
            }
        }

    }
    public void visualizaListaCompleta(){
        String cadena =" ";
        for (int i=0;i<numeroElementos;i++){
            cadena+=grupoalumnos[i]+ " " + notas[i];
        }
        JOptionPane.showMessageDialog(null, "Lista completa: \n"+cadena);
    }
    
    public void visualizarPosicionAlumno(){
        int resultado = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion del alumno en la lista :"));
        JOptionPane.showMessageDialog(null,"el alumno es : " + grupoalumnos[resultado-1]+ "nota :" + notas[resultado-1]);
    }
    public void consultarNotaAlumno(){
        String nombreBusqueda = JOptionPane.showInputDialog("introduce el nombre a buscar :");
        
        boolean encontrado=false;
        
        for (int i=0; i<numeroElementos;i++){
            if (grupoalumnos[i].compareToIgnoreCase(nombreBusqueda)==0){
                JOptionPane.showMessageDialog(null,"nota = "+ notas[i]);
                encontrado=true;
            }
        }
        if (encontrado==false)
            JOptionPane.showMessageDialog(null, "el alumno no se encuentra en la lista");
      
    }
}

