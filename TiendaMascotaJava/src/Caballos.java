import java.io.PrintStream;
import java.util.Scanner;

public class Caballos extends ventas{


    // atributos de clase
    static PrintStream p = new PrintStream(System.out);
    Scanner leer = new Scanner(System.in);

    
    // metodos de clase

    // metodo que implementa la clase abstracta venta para caballos
    public void venta(int opc){
         
        Double existencia,valor=0.0;
        String valor_leido;
            
        p.println("\nANALISIS DE LA CANTIDAD VENDIDA");

        if (opc == 1){
            p.println("\nExistencia de comida para  "+ tip_caballos.get(opc-1) + "  :" + cant_comid_FielPlus.get(cant_comid_FielPlus.size()-1) + "  lbs");
        }//if
        else if (opc == 2){
            p.println("\nExistencia de comida para "+ tip_caballos.get(opc-1) + "  :" + cant_comid_jornalero.get(cant_comid_jornalero.size()-1) + "  lbs");
        }
        else if (opc == 3){
            p.println("\nExistencia de comida para "+ tip_caballos.get(opc-1) + "  :" + cant_comid_potro.get(cant_comid_potro.size()-1) + "  lbs");
        }//else

       
        p.print("Escriba la cantidad en libras de la actual venta : ");
        valor_leido = leer.nextLine();

        Double v=0.0;
        boolean checarSiesLetra;

        try{
            v = Double.parseDouble(valor_leido);
            checarSiesLetra = true;
        }//try
        catch (NumberFormatException ex){            
            checarSiesLetra = false;        
        }// catch

        if (checarSiesLetra == true && v != 0){
            valor = v;                
        
        
            if (opc == 1){
                ventas_comid_FielPlus.add(valor);
                existencia = cant_comid_FielPlus.get(cant_comid_FielPlus.size()-1) - ventas_comid_FielPlus.get(ventas_comid_FielPlus.size()-1);
                cant_comid_FielPlus.add(existencia);
                p.print("\nDespues de esta venta la existencia es de  " + existencia + "  lbs");
            }//if
            else if (opc == 2){
            ventas_comid_jornalero.add(valor);
            existencia = cant_comid_jornalero.get(cant_comid_jornalero.size()-1) - ventas_comid_jornalero.get(ventas_comid_jornalero.size()-1);
            cant_comid_jornalero.add(existencia);
            p.print("\nDespues de esta venta la existencia es de  " + existencia + "  lbs");
            }// else if
            else if (opc == 3){
                ventas_comid_potro.add(valor);
                existencia = cant_comid_potro.get(cant_comid_potro.size()-1) - ventas_comid_potro.get(ventas_comid_potro.size()-1);
                cant_comid_potro.add(existencia);
            p.print("\nDespues de esta venta la existencia es de  " + existencia + "  lbs");
            }//else if
        }//if
         else{
            char resp;
            venta(opc);   
            factura(opc); 
            resp = cotejo();
            otra_venta(resp);        
       }//else
       

        return;
    }//venta

    public void factura(int opc){

        p.println("\n==================================================================================");
        p.println("\n\nANALISIS DE LA VENTA REALIZADA\n");
        p.println("\n==================================================================================");
        p.println("TIENDA LA MASCOSTA\n");
        p.println("Direccion: Masatepe, colonia Veracruz, de los billares Nacho 2 cuadras al oeste");
        p.print("Descripcion del producto:\t");
        
        if (opc == 1){     
            p.println("Comida para " + tip_caballos.get(opc-1));    
            p.print("Cantidad de la venta ==> " + ventas_comid_FielPlus.get(ventas_comid_FielPlus.size()-1)+" lbs");
            p.print("\tPrecio de venta unitario ==>  C$" + precio_comida_fielplus);
            p.print("\tVenta total ==> C$ " + precio_comida_fielplus*ventas_comid_FielPlus.get(ventas_comid_FielPlus.size()-1));
         }//if
        else if (opc == 2){       
            p.println("Comida para " + tip_caballos.get(opc-1));   
            p.println("Cantidad de la venta ==> " + ventas_comid_jornalero.get(ventas_comid_jornalero.size()-1)+" lbs");
            p.print("\tPrecio de venta unitario ==> C$  " + precio_comida_jornalero);
            p.print("\tVenta total ==>  C$ " + precio_comida_jornalero*ventas_comid_jornalero.get(ventas_comid_jornalero.size()-1));
         }//if
        else if (opc == 3){    
            p.println("Comida para " + tip_caballos.get(opc-1));      
            p.println("Cantidad de la venta ==> " + ventas_comid_potro.get(ventas_comid_potro.size()-1)+" lbs");
            p.print("\tPrecio de venta unitario ==>  C$ " + precio_comida_potro);
            p.print("\tVenta total ==>  C$ " + precio_comida_potro*ventas_comid_potro.get(ventas_comid_potro.size()-1));
         }//if
          
         p.println("\n\n");
        return;
    }//factura

    
}// de la clase