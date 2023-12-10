import java.io.PrintStream;
import java.util.Scanner;


public class Presentacion extends DatosTienda{

    // atributos de clase
    static PrintStream p = new PrintStream(System.out);
    static Scanner leer = new Scanner(System.in);

    // Metodo que ayuda a orientar a la persona que utiliza la aplicacion
    public String introduccion(){

        String opcion;

 p.println("\t\tESTA APLICACION LLEVA EL CONTROL DE LAS VENTAS POR DIA  DE PRODUCTOS ALIMENTICIOS EN LA TIENDA LA MASCOTA");
 p.println("\t\tSE PUEDE VENDER COMIDA PARA LOS SIGUIENTES TIPOS DE ANIMALES, LAS VENTAS SE IRAN ACUMULANDO HASTA QUE SE");
 p.println("\t\tELIJA LA OPCION DE SALIR, SI SE ELIGE LA OPCION SALIR,  SE GUARDAN LAS VENTAS REALIZADAS DESDE QUE SE EJECUTO ");        
 p.println("\t\tEL PROGRAMA EN UN ARCHIVO\n\n");
            

        p.println("\t\t\t// // // // // // // // //");
        p.println("\t\t\t//\t1.  "+ lista_animales.get(0) + "\t//");
        p.println("\t\t\t//\t2.  "+ lista_animales.get(1) + "\t//");
        p.println("\t\t\t//\t3.  "+ lista_animales.get(2) + "\t//");
        p.println("\t\t\t//\t4.  "+ lista_animales.get(3) + "\t//");
        p.println("\t\t\t//\t5.  "+ lista_animales.get(4) + "\t//");
        p.println("\t\t\t//\t6.  SALIR\t//");

        p.println("\n\n\t\t\tElegir una de las opciones.");
        p.print("\n\t\t\t\t\tOpcion ==>   ");

        opcion = leer.nextLine();

        return opcion;

    }//introduccion


    // Metodo que pone el nombre de la empresa en la pantalla de presentacion
   public void titulo(){

        p.println("\n\n\n ***********************************************************************************************************\n");

        p.println("\t\t\t\t\t\t TIENDA\n\n");
        p.println("\t==     ========   ======      ====    =======   =========   =====    ====  ============  =======");
        p.println("\t==     ===  ===   === ==     =====   ===  ===   ===       ==       ==   ==  ==========  ===  ===");
        p.println("\t==    ===    ===  ===   ==  == ===  ===    ===  =====    ==      ==      ==    ===    ===     ===");
        p.println("\t==    ===     === ===     =    =======      ===============      ==      ==    ===   ============");
        p.println("\t==   ================          ================       =====      ==      ==    ===  =============");
        p.println("\t====================           ================    ======  ==      ==  ==      === ===        ===");
        p.println("\t==========      ====           =====        =========        ====   ====       ======        =====");
        

        p.println("\n************************************************************************************************************\n");

        p.println("\t\t\tTrabajo de Introduccion a la Programacion");
        p.println("\t\t\tNombre: Gerson David Martinez Blas y Luis Eduardo Moraga Solorzano");
        p.println("\t\t\tMaestro:Msc Ing Danilo Noguera\n\n");

        // valores iniciales del dia para la tienda los animales que la tienda atiende
        if (lista_animales.size() == 0){
            ListadeAnimales();
            tamanioGatos();
            tamanioperros();
            tipos_caballos();
            tipos_cerdos();
            tipos_pollos();
            existencias();
        }//if
        

   }//titulo


// metodo que controla las opciones de venta en la tienda la mascota

public void opciones_tipo_animal(String opcion){

    int v;
    boolean checarSiesLetra;

    try{
        v = Integer.parseInt(opcion);
        checarSiesLetra = true;
    }//try
    catch (NumberFormatException ex){
        v =0;
        checarSiesLetra = false;
        
    }// catch

    if (checarSiesLetra == true && v != 0){
        int op_buena = v;
        if (op_buena == 1 || op_buena == 2 || op_buena == 3 || op_buena == 4 || op_buena == 5|| op_buena == 6){       
            switch(op_buena){
                case 1:
                    int op01;
                    op01 = menu_perros(); // aca no se utilizo objetos por la herencia
                    opciones_tamanio_perros(op01);
                break;

                case 2:
                    int op02;
                    op02 = menu_gatos(); // aca no se utilizo objetos por la herencia
                    opciones_tamanio_gatos(op02);
                break;

                case 3:
                    int op03;
                    op03 = menu_tipos_cerdos(); 
                    opciones_tipo_cerdos(op03);
                break;

                case 4:
                    int op04;
                    op04 = menu_tipos_caballos();
                    opciones_tipo_caballos(op04);
                break;

                case 5:
                    int op05;
                    op05 = menu_tipos_pollos();
                    opciones_tipo_pollos(op05);
                break;


                default: verificarSiHayDatos();            

            }//switch
    
        }// if
        else { 
            p.println("\n===============================================================================");
            p.println("Opcion no valida, elige un numero dentro del menu");
            p.println("===============================================================================\n");
            String op_animal = introduccion();
            opciones_tipo_animal(op_animal);
        }//else
    }//if
    else{
        p.println("\n===============================================================================");
        p.println("Opcion no valida, elige un numero dentro del menu");
        p.println("===============================================================================\n");
        String op_animal = introduccion();
        opciones_tipo_animal(op_animal);

    }//else      
  

}//control de opciones


// METODO PARA EL CONTROL DE QUE TIPO DE COMIDA DE PERRO ES LA QUE SE VENDERA
    public int menu_perros(){

        String opcion;  
        int op_buena =0; // esta es la opcion que debe regresar este metodo, que es la valida    

        System.out.println("En los perros hay comida para tres segun el tamaño");
        System.out.println("Escoger el tama\u00F1o: ");
        System.out.println("\t1. " + tam_perros.get(0));
        System.out.println("\t2. " + tam_perros.get(1));
        System.out.println("\t3. " + tam_perros.get(2));
        System.out.print("\t\t\tOpcion ==>  ");
        opcion = leer.nextLine();

        int v;
        boolean checarSiesLetra;

        try{
            v = Integer.parseInt(opcion);
            checarSiesLetra = true;
        }//try
        catch (NumberFormatException ex){
            v =0;
            checarSiesLetra = false;        
        }// catch

        if (checarSiesLetra == true && v != 0){
            if ( v==1 || v==2 || v== 3){
                op_buena = v; // op_buena es la opcion valida y buena
            }//if
            else{
                int op01;
                op01 = menu_perros(); // aca no se utilizo objetos por la herencia
                opciones_tamanio_perros(op01);
            }//else
        }//if
        else{
            int op01;
            op01 = menu_perros(); // aca no se utilizo objetos por la herencia
            opciones_tamanio_perros(op01);
        }//else

        return op_buena;
    }//tipos_comida



    // METODO PARA EL CONTROL DE QUE TIPO DE COMIDA DE GATO ES LA QUE SE VENDERA
    public int menu_gatos(){
       
        String opcion;  
        int op_buena =0; // esta es la opcion que debe regresar este metodo, que es la valida    

        System.out.println("En los gatos hay comida para dos segun el tamaño");
        System.out.println("Escoger el tama\u00F1o: ");
        System.out.println("1. " + tam_gatos.get(0));
        System.out.println("2  " + tam_gatos.get(1)); // EL \U00F1 es para imprimir la ene en la pantalla
        System.out.print("\t\t\tOpcion ==>  ");
        opcion = leer.nextLine();

        int v;
        boolean checarSiesLetra;

        try{
            v = Integer.parseInt(opcion);
            checarSiesLetra = true;
        }//try
        catch (NumberFormatException ex){
            v =0;
            checarSiesLetra = false;        
        }// catch

        if (checarSiesLetra == true && v != 0){           
            if ( v==1 || v==2){
                op_buena = v; // op_buena es la opcion valida y buena
            }//if
            else{
                  int op01;
                op01 = menu_gatos(); // aca no se utilizo objetos por la herencia
                opciones_tamanio_gatos(op01);
            }//else
        }//if
        else{
            int op01;
            op01 = menu_gatos(); // aca no se utilizo objetos por la herencia
            opciones_tamanio_gatos(op01);
        }//else

        return op_buena;    
    }//tipos_comida

    public int menu_tipos_cerdos(){
        
        String opcion;  
        int op_buena =0; // esta es la opcion que debe regresar este metodo, que es la valida    

        System.out.println("En los cerdos hay comida para tres tipos");
        System.out.println("Escoger el tipoo: ");

        for(int i=0; i<tip_cerdos.size(); i++){
             System.out.println("\t" + (i+1)+ "." + tip_cerdos.get(i));
        }//for
        
        System.out.print("\t\t\tOpcion ==>  ");
        opcion = leer.nextLine();
        int v;
        boolean checarSiesLetra;

        try{
            v = Integer.parseInt(opcion);
            checarSiesLetra = true;
        }//try
        catch (NumberFormatException ex){
            v =0;
            checarSiesLetra = false;        
        }// catch

        if (checarSiesLetra == true && v != 0){
            if ( v==1 || v==2 || v==3){
                op_buena = v; // op_buena es la opcion valida y buena
            }//if
            else{
                int op01;
                op01 = menu_tipos_cerdos(); // aca no se utilizo objetos por la herencia
                opciones_tipo_cerdos(op01);
            }//else
        }//if
        else{
            int op01;
            op01 = menu_tipos_cerdos(); // aca no se utilizo objetos por la herencia
            opciones_tipo_cerdos(op01);
        }//else

        return op_buena;    
    }//tipos_comida

    public int menu_tipos_caballos(){
      
        String opcion;  
        int op_buena =0; // esta es la opcion que debe regresar este metodo, que es la valida    

        System.out.println("En los Caballos hay comida para "+ tip_caballos.size() + " tipos");
        System.out.println("Escoger el tipo: ");

        for(int i=0; i<tip_caballos.size(); i++){
            System.out.println("\t" + (i+1) +". " + tip_caballos.get(i));

        }//for        
  
        System.out.print("\t\t\tOpcion ==>  ");
        opcion = leer.nextLine();
        int v;
        boolean checarSiesLetra;

        try{
            v = Integer.parseInt(opcion);
            checarSiesLetra = true;
        }//try
        catch (NumberFormatException ex){
            v =0;
            checarSiesLetra = false;        
        }// catch

        if (checarSiesLetra == true && v != 0){
            if ( v==1 || v==2 || v==3){
                op_buena = v; // op_buena es la opcion valida y buena
            }//if
            else{
                int op01;
                op01 = menu_tipos_caballos(); // aca no se utilizo objetos por la herencia
                opciones_tipo_caballos(op01);
            }//else
        }//if
        else{
            int op01;
            op01 = menu_tipos_caballos(); // aca no se utilizo objetos por la herencia
            opciones_tipo_caballos(op01);
        }//else

        return op_buena;    
    }//tipos_comida

    public int menu_tipos_pollos(){

        String opcion;  
        int op_buena =0; // esta es la opcion que debe regresar este metodo, que es la valida    

        System.out.println("En los pollos hay comida para " +  tip_pollos.size() +" tipos");
        System.out.println("Escoger el tipoo: ");

        for(int i=0; i<tip_pollos.size(); i++){
             System.out.println("\t" + (i+1) +". " + tip_pollos.get(i));
        }//for
       
        System.out.print("\t\t\tOpcion ==>  ");
        opcion = leer.nextLine();
        int v;
        boolean checarSiesLetra;

        try{
            v = Integer.parseInt(opcion);
            checarSiesLetra = true;
        }//try
        catch (NumberFormatException ex){
            v =0;
            checarSiesLetra = false;        
        }// catch

        if (checarSiesLetra == true && v != 0){
            if ( v==1 || v==2 || v==3){
                op_buena = v; // op_buena es la opcion valida y buena
            }//if
            else{
                int op01;
                op01 = menu_tipos_pollos(); // aca no se utilizo objetos por la herencia
                opciones_tipo_pollos(op01);
            }//else
        }//if
        else{
            int op01;
            op01 = menu_tipos_pollos(); // aca no se utilizo objetos por la herencia
            opciones_tipo_pollos(op01);
        }//else

        return op_buena;    
    }//tipos_comida

    
    // control de opciones para tamanio de perros
    public void opciones_tamanio_perros(int op){
        Perros prr = new Perros();
        char resp;

        switch(op){

            case 1:
                prr.venta(op);   
                prr.factura(op); 
                resp = cotejo();
                otra_venta(resp);        
            break;

            case 2:               
                prr.venta(op); 
                prr.factura(op);  
                resp = cotejo();
                otra_venta(resp);           
            break;

            case 3:                
                prr.venta(op);  
                prr.factura(op);  
                resp = cotejo();
                otra_venta(resp);            
            break;
            
            default:
                
            break;

        }//switch

    }//opciones_tamanio_perros

     // control de opciones para tamanio de gatos
    public void opciones_tamanio_gatos(int op){
        Gatos gat = new Gatos();
        char resp;

        switch(op){

            case 1:
                gat.venta(op);   
                gat.factura(op);
                resp = cotejo();
                otra_venta(resp);         
            break;

            case 2:               
                gat.venta(op); 
                gat.factura(op); 
                resp = cotejo();
                otra_venta(resp);            
            break;

           
            default:
                
            break;

        }//switch

    }//opciones_tamanio_gatos



    // control de opciones para tipos de cerdos
    public void opciones_tipo_cerdos(int op){
        Cerdos cerd = new Cerdos();
        char resp;

        switch(op){

            case 1:
                cerd.venta(op);   
                cerd.factura(op);     
                resp = cotejo();
                otra_venta(resp);                
            break;

            case 2:               
                cerd.venta(op); 
                cerd.factura(op);
                resp = cotejo();
                otra_venta(resp);             
            break;

            case 3:                
                cerd.venta(op);  
                cerd.factura(op);
                resp = cotejo();
                otra_venta(resp);              
            break;
            
            default:
                
            break;

        }//switch

    }//opciones_tamanio_cerdos


 // control de opciones para tipos de caballos
    public void opciones_tipo_caballos(int op){
        Caballos cab = new Caballos();
        char resp;

        switch(op){

            case 1:
                cab.venta(op);   
                cab.factura(op);
                resp = cotejo();
                otra_venta(resp);         
            break;

            case 2:               
                cab.venta(op); 
                cab.factura(op);
                resp = cotejo();
                otra_venta(resp);             
            break;

            case 3:                
                cab.venta(op);  
                cab.factura(op);
                resp = cotejo();
                otra_venta(resp);              
            break;
            
            default:
                
            break;

        }//switch

    }//opciones_tamanio_caballos

     // control de opciones para tipos de pollos
    public void opciones_tipo_pollos(int op){
        Pollos poll = new Pollos();
        char resp;

        switch(op){

            case 1:
                poll.venta(op);   
                poll.factura(op);
                resp = cotejo();
                otra_venta(resp);         
            break;

            case 2:               
                poll.venta(op); 
                poll.factura(op);
                resp = cotejo();
                otra_venta(resp);             
            break;

            case 3:                
                poll.venta(op);  
                poll.factura(op);
                resp = cotejo();
                otra_venta(resp);              
            break;
            
            default:
                
            break;

        }//switch

    }//opciones_tamanio_pollos





}//class