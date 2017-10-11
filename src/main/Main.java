package main;
import javax.swing.JOptionPane;

public class Main {
 /*
    Clase principal del programa
    */
    public static void main(String[] args) {
        /*
         Lanza un cuadro de dialogo con el fin de poder leer la entrada por teclado.
        */
       try{
        String Entrada1 = JOptionPane.showInputDialog("Digite el numero");
        Entrada ent1 = new Entrada(Entrada1);
        }
       //Captura la exception 
        catch(NullPointerException e){
        JOptionPane.showMessageDialog(null, "     Gracias", "SALIR", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
 



