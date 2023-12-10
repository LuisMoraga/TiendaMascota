import java.io.PrintStream;
import java.util.Scanner;

public class Perros extends ventas {


    // atributos de clase
    static PrintStream p = new PrintStream(System.out);
    Scanner leer = new Scanner(System.in);

    
    // metodos de clase

    // metodo que implementa la clase abstracta venta para perros grandes
    public void venta(int opc){
         
        Double existencia, valor=0.0;
        String valor_leido;
            
        p.println("\nANALISIS DE LA CANTIDAD VENDIDA");

        if (opc == 1){
            p.println("\nExistencia de comida para  "+ tam_perros.get(opc-1) + "  :" + cant_comid_perro_grande.get(cant_comid_perro_grande.size()-1) + "  lbs");
        }//if
        else if (opc == 2){
            p.println("\nExistencia de comida para "+ tam_perros.get(opc-1) + "  :" + cant_comid_perro_mediano.get(cant_comid_perro_mediano.size()-1) + "  lbs");
        }
        else if (opc == 3){
            p.println("\nExistencia de comida para "+ tam_perros.get(opc-1) + "  :" + cant_comid_perro_peque.get(cant_comid_perro_peque.size()-1) + "  lbs");
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
                ventas_comid_perro_grande.add(valor);
                existencia = cant_comid_perro_grande.get(cant_comid_perro_grande.size()-1) - ventas_comid_perro_grande.get(ventas_comid_perro_grande.size()-1);
                cant_comid_perro_grande.add(existencia);
                p.print("\nDespues de esta venta la existencia es de  " + existencia + "  lbs");
            }//if
            else if (opc == 2){
            ventas_comid_perro_mediano.add(valor);
            existencia = cant_comid_perro_mediano.get(cant_comid_perro_mediano.size()-1) - ventas_comid_perro_mediano.get(ventas_comid_perro_mediano.size()-1);
            cant_comid_perro_mediano.add(existencia);
            p.print("\nDespues de esta venta la existencia es de  " + existencia + "  lbs");
            }// else if
            else if (opc == 3){
                ventas_comid_perro_pequenio.add(valor);
                existencia = cant_comid_perro_peque.get(cant_comid_perro_peque.size()-1) - ventas_comid_perro_pequenio.get(ventas_comid_perro_pequenio.size()-1);
                cant_comid_perro_peque.add(existencia);
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
            p.println("Comida para Perro Grande");    
            p.print("Cantidad de la venta ==> " + ventas_comid_perro_grande.get(ventas_comid_perro_grande.size()-1)+" lbs");
            p.print("\tPrecio de venta unitario ==>  C$" + precio_comida_perro_grande);
            p.print("\tVenta total ==> C$ " + precio_comida_perro_grande*ventas_comid_perro_grande.get(ventas_comid_perro_grande.size()-1));
         }//if
        else if (opc == 2){       
            p.println("Comida para Perro Mediano");   
            p.println("Cantidad de la venta ==> " + ventas_comid_perro_mediano.get(ventas_comid_perro_mediano.size()-1)+" lbs");
            p.print("\tPrecio de venta unitario ==> C$  " + precio_comida_perro_mediano);
            p.print("\tVenta total ==>  C$ " + precio_comida_perro_mediano*ventas_comid_perro_mediano.get(ventas_comid_perro_mediano.size()-1));
         }//if
        else if (opc == 3){    
            p.println("Comida para Perro peque\u00F1o");      
            p.println("Cantidad de la venta ==> " + ventas_comid_perro_pequenio.get(ventas_comid_perro_pequenio.size()-1)+" lbs");
            p.print("\tPrecio de venta unitario ==>  C$ " + precio_comida_perro_peque);
            p.print("\tVenta total ==>  C$ " + precio_comida_perro_peque*ventas_comid_perro_pequenio.get(ventas_comid_perro_pequenio.size()-1));
         }//if
          
         p.println("\n\n");
        return;
    }//factura


    
}// de la clase