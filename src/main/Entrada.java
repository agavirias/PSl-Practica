package main;

import javax.swing.JOptionPane;

public class Entrada {

public Entrada(String entrada){
 ImpresorLCD lcd = new ImpresorLCD();
    if (!(entrada.equals("0,0"))){
      if (entrada.contains(" ")){
            String[] ContNum = entrada.split(" ");
            for (int i = 0; i < ContNum.length; i++) {
                String Num = String.valueOf(i+1);
                Num  = ContNum[i];
                if(!(Num.equals("0,0"))){
                lcd.procesar(Num, i);  
                }
                
            }

        }
        else{
            lcd.procesar(entrada, 0);
        }      
    }
    else{
        JOptionPane.showMessageDialog(null, "     Gracias", "SALIR", JOptionPane.INFORMATION_MESSAGE);
    }
   
  }    
}