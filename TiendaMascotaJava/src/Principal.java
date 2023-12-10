import java.io.PrintStream;

public class Principal  {


// atributos de clase
static PrintStream p = new PrintStream(System.out);
static Presentacion present = new Presentacion();

public static void main(String[] args){

    present.titulo();
    // llamar al menu
    String op_animal = present.introduccion();
    present.opciones_tipo_animal(op_animal);
   

return;
}//main


}// clase