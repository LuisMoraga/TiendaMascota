import java.util.ArrayList;
import java.io.PrintStream;
import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class DatosTienda implements Interf_elementos {


    // atributos de clase
     static PrintStream p = new PrintStream(System.out);
     static Scanner leer = new Scanner(System.in);


    // metodos para asignar los tipos de animales que se atienden
    public void ListadeAnimales(){

        lista_animales.add("PERROS");
        lista_animales.add("GATOS");
        lista_animales.add("CERDOS");
        lista_animales.add("CABALLOS");
        lista_animales.add("POLLOS");

        return;

    }//ListadeAnimales

    public void tamanioperros(){

        tam_perros.add("PERRO GRANDE");
        tam_perros.add("PERRO MEDIANO");
        tam_perros.add("PERRO PEQUE\u00F1O");

        return;

    }// tamanioperros

    public void tamanioGatos(){

        tam_gatos.add("GATO GRANDE");      
        tam_gatos.add("GATO PEQUE\u00F1O");

        return;

    }// tamaniocerdos

    public void tipos_cerdos(){

        tip_cerdos.add("COMIDA CERDO PREDESTETE");
        tip_cerdos.add("COMIDA CERDO INICIADOR");
        tip_cerdos.add("COMIDA CERDO RENDI");

        return;

    }// tamaniocerdos

    public void tipos_caballos(){

        tip_caballos.add("COMIDA CABALLO FIEL PLUS");
        tip_caballos.add("COMIDA CABALLO JORNALERO");
        tip_caballos.add("COMIDA CABALLO POTRO");

        return;

    }// tamaniocaballo

    public void tipos_pollos(){

        tip_pollos.add("COMIDA POLLO FORTIPOLLO");
        tip_pollos.add("COMIDA POLLO MAXIPOLLO");
        tip_pollos.add("COMIDA POLLO CRECIMIENTO");

        return;

    }// tamaniocaballo


    public void existencias(){

        cant_comid_perro_grande.add(200.00);
        cant_comid_perro_mediano.add(200.00);
        cant_comid_perro_peque.add(200.00);
        
        cant_comid_gato_grande.add(200.00);
        cant_comid_gato_peque.add(200.00);
        
        cant_comid_cerdo_predestete.add(200.00);
        cant_comid_cerdo_iniciador.add(200.00);
        cant_comid_cerdo_Rendi.add(200.00);

        cant_comid_FielPlus.add(200.00);
        cant_comid_jornalero.add(200.00);
        cant_comid_potro.add(200.00);

        cant_comid_fortipollo.add(200.00);
        cant_comid_maxipollo.add(200.00);
        cant_comid_crecimiento.add(200.00);


    }//existencias


    public char cotejo(){

        p.println("Desea realizar otra venta ?");
        p.println("Teclee \"s\" para ir a menu principal o  \"n\" para Guardar las ventas hasta este momento y SALIR");
        p.print("Opciones [s/n] ==> " );
        char opcion = leer.next().charAt(0);
        return opcion;
    }//cotejo

//----------------------------------------------------------------------------------------  

    // implementacion de los metodos de la interface
    public void otra_venta(char opcion){
        Presentacion present = new Presentacion();

        if ( opcion == 's'){
                    //llamar al menu
                    present.titulo();
                    String op_animal = present.introduccion();
                    present.opciones_tipo_animal(op_animal); 
         }//if
         else if (opcion == 'n'){            
            verificarSiHayDatos();            
        }//else if
         else{
            char resp = cotejo();
                otra_venta(resp);
         }//else

    }//otra_venta

//---------------------------------------------------------------------------------------------------------
    // metodo para guardar los datos en un archivo de texto
    public void save_data(ArrayList<Double> datos, String producto){    

    // nombre de los archivos a crear
    String file_name = new String("Ventas_Comida_Animales.txt");

    try{
        FileWriter fw = new FileWriter(file_name, true);
        BufferedWriter archivoEscritura = new BufferedWriter(fw);
        
        archivoEscritura.write("Ventas comida de  " + producto + "   \n");
          
            for (int i=0; i< datos.size(); i++){                             
                archivoEscritura.write(datos.get(i).toString());
                archivoEscritura.write(", ");           
            }//for i
            archivoEscritura.write("\n");   

        // liberar el buffer y cerrar el archivo
        archivoEscritura.flush();
        archivoEscritura.close();
    }//try
    catch(IOException e){
        p.println("Error al escribir en el archivo");
        e.printStackTrace();

    }//catch     
   

}//save_data

//--------------------------------------------------------------------------------------

public void verificarSiHayDatos(){

    // ventas realizadas
    if (ventas_comid_perro_grande.size() > 0)
        save_data(ventas_comid_perro_grande, tam_perros.get(0));

   if (ventas_comid_perro_mediano.size() > 0)
        save_data(ventas_comid_perro_mediano, tam_perros.get(1));

    if(ventas_comid_perro_pequenio.size() > 0) 
        save_data(ventas_comid_perro_pequenio, tam_perros.get(2));;

    if (ventas_comid_gato_grande.size() > 0)
        save_data(ventas_comid_gato_grande, tam_gatos.get(0));
    
    if(ventas_comid_gato_pequenio.size() > 0)
        save_data(ventas_comid_gato_pequenio, tam_gatos.get(1));

    if (ventas_comid_cerdo_predestete.size() > 0)
        save_data(ventas_comid_cerdo_predestete, tip_cerdos.get(0));

    if (ventas_comid_cerdo_iniciador.size() > 0)
        save_data(ventas_comid_cerdo_iniciador, tip_cerdos.get(1));

    if (ventas_comid_cerdo_Rendi.size() > 0)
        save_data(ventas_comid_cerdo_Rendi, tip_cerdos.get(2));

    if (ventas_comid_FielPlus.size() > 0)
        save_data(ventas_comid_FielPlus, tip_caballos.get(0));

    if (ventas_comid_jornalero.size() > 0)
        save_data(ventas_comid_jornalero, tip_caballos.get(1));
          
    if (ventas_comid_potro.size() > 0)
        save_data(ventas_comid_potro, tip_caballos.get(2));

    if (ventas_comid_fortipollo.size() > 0)
        save_data(ventas_comid_fortipollo, tip_pollos.get(0));

    if (ventas_comid_maxipollo.size() > 0)
        save_data(ventas_comid_maxipollo, tip_pollos.get(1));

     if (ventas_comid_crecimiento.size() > 0)
        save_data(ventas_comid_crecimiento, tip_pollos.get(2));

     
    if ((ventas_comid_perro_grande.size() == 0) && (ventas_comid_perro_mediano.size() == 0) &&
        (ventas_comid_perro_pequenio.size() == 0) && (ventas_comid_gato_grande.size() == 0) &&
        (ventas_comid_gato_pequenio.size() == 0) && (ventas_comid_cerdo_predestete.size() == 0) &&
        (ventas_comid_cerdo_iniciador.size() == 0) && (ventas_comid_cerdo_Rendi.size() == 0) &&
        (ventas_comid_FielPlus.size() == 0) && (ventas_comid_jornalero.size() == 0) && 
        (ventas_comid_potro.size() == 0) && (ventas_comid_fortipollo.size() == 0) && 
        (ventas_comid_maxipollo.size() == 0) && (ventas_comid_crecimiento.size() == 0))
        p.println("NO HAY DATOS QUE GUARDAR");
           
}// veririficarSiHayDatos
    
}// fin de la clase
