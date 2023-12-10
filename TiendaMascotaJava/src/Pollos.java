import java.io.PrintStream;
import java.util.Scanner;

public class Pollos extends ventas{


    // atributos de clase
    static PrintStream p = new PrintStream(System.out);
    Scanner leer = new Scanner(System.in);

    
    // metodos de clase

    // metodo que implementa la clase abstracta venta para pollo
    public void venta(int opc){
         
        Double existencia,valor=0.0;
        String valor_leido;
            
        p.println("\nANALISIS DE LA CANTIDAD VENDIDA");

        if (opc == 1){
            p.println("\nExistencia de comida para  "+ tip_pollos.get(opc-1) + "  :" + cant_comid_fortipollo.get(cant_comid_fortipollo.size()-1) + "  lbs");
        }//if
        else if (opc == 2){
            p.println("\nExistencia de comida para "+ tip_pollos.get(opc-1) + "  :" + cant_comid_maxipollo.get(cant_comid_maxipollo.size()-1) + "  lbs");
        }
        else if (opc == 3){
            p.println("\nExistencia de comida para "+ tip_pollos.get(opc-1) + "  :" + cant_comid_crecimiento.get(cant_comid_crecimiento.size()-1) + "  lbs");
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
                ventas_comid_fortipollo.add(valor);
                existencia = cant_comid_fortipollo.get(cant_comid_fortipollo.size()-1) - ventas_comid_fortipollo.get(ventas_comid_fortipollo.size()-1);
                cant_comid_fortipollo.add(existencia);
                p.print("\nDespues de esta venta la existencia es de  " + existencia + "  lbs");
            }//if
            else if (opc == 2){
            ventas_comid_maxipollo.add(valor);
            existencia = cant_comid_maxipollo.get(cant_comid_maxipollo.size()-1) - ventas_comid_maxipollo.get(ventas_comid_maxipollo.size()-1);
            cant_comid_maxipollo.add(existencia);
            p.print("\nDespues de esta venta la existencia es de  " + existencia + "  lbs");
            }// else if
            else if (opc == 3){
                ventas_comid_crecimiento.add(valor);
                existencia = cant_comid_crecimiento.get(cant_comid_crecimiento.size()-1) - ventas_comid_crecimiento.get(ventas_comid_crecimiento.size()-1);
                cant_comid_crecimiento.add(existencia);
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
            p.println("Comida para " + tip_pollos.get(opc-1));    
            p.print("Cantidad de la venta ==> " + ventas_comid_fortipollo.get(ventas_comid_fortipollo.size()-1)+" lbs");
            p.print("\tPrecio de venta unitario ==>  C$" + precio_comida_fortipollo);
            p.print("\tVenta total ==> C$ " + precio_comida_fortipollo*ventas_comid_fortipollo.get(ventas_comid_fortipollo.size()-1));
         }//if
        else if (opc == 2){       
            p.println("Comida para " + tip_pollos.get(opc-1));   
            p.println("Cantidad de la venta ==> " + ventas_comid_maxipollo.get(ventas_comid_maxipollo.size()-1)+" lbs");
            p.print("\tPrecio de venta unitario ==> C$  " + precio_comida_maxipollo);
            p.print("\tVenta total ==>  C$ " + precio_comida_maxipollo*ventas_comid_maxipollo.get(ventas_comid_maxipollo.size()-1));
         }//if
        else if (opc == 3){    
            p.println("Comida para " + tip_pollos.get(opc-1));      
            p.println("Cantidad de la venta ==> " + ventas_comid_crecimiento.get(ventas_comid_crecimiento.size()-1)+" lbs");
            p.print("\tPrecio de venta unitario ==>  C$ " + precio_comida_crecimiento);
            p.print("\tVenta total ==>  C$ " + precio_comida_crecimiento*ventas_comid_crecimiento.get(ventas_comid_crecimiento.size()-1));
         }//if
          
         p.println("\n\n");
        return;
    }//factura

    
}// de la clase
