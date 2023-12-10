import java.util.ArrayList;

public interface Interf_elementos {


    // atributos de clase
    
    // lista de animales
    ArrayList<String> lista_animales = new ArrayList <String>();
    ArrayList<String> tam_perros = new ArrayList<String>();
    ArrayList<String> tam_gatos = new ArrayList<String>();
    ArrayList<String> tip_cerdos = new ArrayList<String>();
    ArrayList<String> tip_caballos = new ArrayList<String>();
    ArrayList<String> tip_pollos = new ArrayList<String>();

    // existencia de cada alimento en libras
    ArrayList<Double> cant_comid_perro_grande = new ArrayList<Double>();
    ArrayList<Double> cant_comid_perro_mediano = new ArrayList<Double>();
    ArrayList<Double> cant_comid_perro_peque = new ArrayList<Double>();

    ArrayList<Double> cant_comid_gato_grande = new ArrayList<Double>();
    ArrayList<Double> cant_comid_gato_peque = new ArrayList<Double>();
    
    ArrayList<Double> cant_comid_cerdo_predestete = new ArrayList<Double>();
    ArrayList<Double> cant_comid_cerdo_iniciador = new ArrayList<Double>();
    ArrayList<Double> cant_comid_cerdo_Rendi = new ArrayList<Double>();

    ArrayList<Double> cant_comid_FielPlus = new ArrayList<Double>();
    ArrayList<Double> cant_comid_jornalero = new ArrayList<Double>();
    ArrayList<Double> cant_comid_potro = new ArrayList<Double>();

    ArrayList<Double> cant_comid_fortipollo = new ArrayList<Double>();
    ArrayList<Double> cant_comid_maxipollo = new ArrayList<Double>();
    ArrayList<Double> cant_comid_crecimiento = new ArrayList<Double>();


    // ventas realizadas
    ArrayList<Double> ventas_comid_perro_grande = new ArrayList<Double>();
    ArrayList<Double> ventas_comid_perro_mediano = new ArrayList<Double>();
    ArrayList<Double> ventas_comid_perro_pequenio = new ArrayList<Double>();

    ArrayList<Double> ventas_comid_gato_grande = new ArrayList<Double>();
    ArrayList<Double> ventas_comid_gato_pequenio = new ArrayList<Double>();

    ArrayList<Double> ventas_comid_cerdo_predestete = new ArrayList<Double>();
    ArrayList<Double> ventas_comid_cerdo_iniciador = new ArrayList<Double>();
    ArrayList<Double> ventas_comid_cerdo_Rendi = new ArrayList<Double>();

    ArrayList<Double> ventas_comid_FielPlus = new ArrayList<Double>();
    ArrayList<Double> ventas_comid_jornalero = new ArrayList<Double>();
    ArrayList<Double> ventas_comid_potro = new ArrayList<Double>();

    ArrayList<Double> ventas_comid_fortipollo = new ArrayList<Double>();
    ArrayList<Double> ventas_comid_maxipollo = new ArrayList<Double>();
    ArrayList<Double> ventas_comid_crecimiento = new ArrayList<Double>();


    // constantes a utilizar, las variables declaradas en una interfaz son constantes y las clases son abstractas,
    // osea no se definen en la interface
    double precio_comida_perro_grande = 23.00;
    double precio_comida_perro_mediano = 21.50;
    double precio_comida_perro_peque = 20.00;

    double precio_comida_gato_grande = 16.50;
    double precio_comida_gato_peque = 14.00;    
    
    double precio_comida_cerdo_predestete = 50.00;
    double precio_comida_cerdo_iniciador = 45.50;
    double precio_comida_cerdo_rendi = 45.50;

    double precio_comida_fielplus = 68.50;
    double precio_comida_jornalero = 68.50;
    double precio_comida_potro = 68.50;

    double precio_comida_fortipollo = 100.00;
    double precio_comida_maxipollo = 36.00;
    double precio_comida_crecimiento = 96.00;


    // metodos abstractos de la interface
    public void otra_venta(char opcion);

    
}// fin de interface
