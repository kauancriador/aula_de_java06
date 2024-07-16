/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descobriimpar;

import javax.swing.JOptionPane;

/**
 *
 * @author caio.alunos
 */
public class Descobriimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nivel;
        double quantidade,salario=0;
        
       nivel = Integer.parseInt(JOptionPane.showInputDialog("Qual é o nivel do prof"));
       quantidade = Double.parseDouble(JOptionPane.showInputDialog( "Digite a quantidade de horas")); 
       
       //processamento
       
       if(nivel==1){
       
           salario= quantidade * 12;
             JOptionPane.showMessageDialog(null,"O salario do professor é: "  + salario);
       
       }
       else if (nivel==2){
       
           salario= quantidade * 17;
             JOptionPane.showMessageDialog(null,"O salario do professor é: "  + salario);
       
       }
       else if (nivel==3){
       
           salario= quantidade * 25;
           
           JOptionPane.showMessageDialog(null,"O salario do professor é: " + salario);
       
       }
       
 
    
    
    }
       
}
