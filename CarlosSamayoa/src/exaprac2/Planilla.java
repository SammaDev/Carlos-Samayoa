/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac2;

import javax.swing.JOptionPane;


public class Planilla {


    public static void main (String[] args)
    {
     
     /**
    Problema: Crear  un  programa  que  permita  registrar  datos  de  una  planilla  de  trabajadores  
    * (“n” trabajadores), por cada empleado se ingresará: Nombre del empleado, Salario x horay la cantidad 
    * de horas trabajadas.
    * 
    * El programa debe mostrar al final por medio de un JOPtionPane el detalle de la planillay el total de 
    * la planilla. En otro Cuadro de dialogo se mostrará el nombre del empleado que más gano en esa planilla.
     */
     double totalplanilla =0;
     int cant = 0;
     String DetallePlanilla="Detallle de empleados agregados a planilla \n";
     double maxtotal=0;
     int posicion=-1;
     cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de trabajadores que agregara a la planilla"));
     
     String Nombre[] = new String[cant];
     int canthoras[] = new int[cant];
     double salxhoras[] = new double[cant];

     
     for ( int i=0; i<cant;i++ )
     {
      Nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre del trabajador #"+ (i+1));
      canthoras[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas para el trabajador "+ Nombre[i]));
      salxhoras[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario por horas para trabajador #"+ (i+1)));   
      totalplanilla += canthoras[i]*salxhoras[i];
      DetallePlanilla +="Nombre: "+Nombre[i]+ " Cantidad de horas: "+ canthoras[i] + " Salario por hora: "+ salxhoras[i] + " Total: "+ (canthoras[i]*salxhoras[i])+ "\n";
      
      if ((canthoras[i]*salxhoras[i]) > maxtotal)
      {
          maxtotal = (canthoras[i]*salxhoras[i]);
          posicion = i;
      }
      
     }
     
    JOptionPane.showMessageDialog(null, DetallePlanilla + "El total a pagar en plania es de: $"+totalplanilla+"\n"+
            "El nombre del trabajador que gano mas es: " +Nombre[posicion]);
    
}
}
