/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1_area3;
import javax.swing.*;
/**
 *
 * @author Alumno103
 */
public class ACTIVIDAD1_AREA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int pin=123;  int c=0;  int SI=1000;
               
               while(c<3){
                     int entrada=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu pin ")); c++;
                      if (entrada==pin){
                          JOptionPane.showMessageDialog(null,"Bienvenido");
                           Object seleccion =JOptionPane.showOptionDialog(null,"Seleccione una opción","Selecciona",JOptionPane.YES_NO_CANCEL_OPTION,
                             JOptionPane.QUESTION_MESSAGE,null,new Object[]{"Consultar saldo","Retirar saldo ","Histórico de Movimientos "},"seleccione");
                           
                           if(seleccion!=null){ JOptionPane.showMessageDialog(null,"Saldo es"+ seleccion);} //else
                               
                             //  if(dato!=1){ JOptionPane.showMessageDialog(null,"Retirar saldo "+ seleccion);}
                          break;
                      } else{JOptionPane.showMessageDialog(null,"DATOS INCORRECTOS");}
                    }

        
       
    }
    
}
