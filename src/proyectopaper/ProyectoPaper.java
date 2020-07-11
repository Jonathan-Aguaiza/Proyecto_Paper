/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopaper;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
import java.util.Scanner;
public class ProyectoPaper {

    public static String Determinar_condiciones_trafico(){
        Scanner sc=new Scanner(System.in);
        Scanner cd=new Scanner(System.in);
        int codigo, numero_condicion;
        String tipo_condicion;
        String tipo_trafico;
        System.out.println("INGRESE EL CÓDIGO DE LA CONDICIÓN: ");
        codigo=sc.nextInt();
        System.out.println("INGRESE EL NÚMERO DE LAS CONDICIONES: ");
        numero_condicion=sc.nextInt();
        System.out.println("INGRESE EL TIPO DE CONDICIÓN: ");
        tipo_condicion=cd.nextLine();
        System.out.println("INGRESE EL TIPO DE TRÁFICO: ");
        tipo_trafico=cd.nextLine();
        return "El tipo de trafico es "+tipo_trafico+" en condiciones "+tipo_condicion
                +" con "+numero_condicion+" condiciones ambientales y con un código "
                +codigo+" establecido.\n";
        
    }
    public static String Especificar_condiciones_conduccion(){
        Scanner sc=new Scanner(System.in);
        Scanner cd=new Scanner(System.in);
        int codigo_conduccion, numero_condicion;
        String tipo_conduccion;
        System.out.println("INGRESE EL CÓDIGO DE CONDICIONES DE CONDUCCIÓN: ");
        codigo_conduccion=sc.nextInt();
        System.out.println("INGRESE EL NÚMERO DE LAS CONDICIONES DE CONDUCCIÓN: ");
        numero_condicion=sc.nextInt();
        System.out.println("INGRESE EL TIPO DE CONDUCCIÓN: ");
        tipo_conduccion=cd.nextLine();
        return "El tipo de conducción es "+tipo_conduccion+" con "+numero_condicion
                +" condiciones de conducción con un código de conducción "+codigo_conduccion+".";
    }
    public static String Realizar_reconocimientos(){
        Scanner sc=new Scanner(System.in);
        Scanner cd=new Scanner(System.in);
        int codigo, tiempo_reconocimiento;
        String tipo_reconocimiento;
        System.out.println("INGRESE EL CÓDIGO DE RECONOCIMENTO: ");
        codigo=sc.nextInt();
        System.out.println("INGRESE EL TIEMPO DE RECONOCIMIENTO: ");
        tiempo_reconocimiento=sc.nextInt();
        System.out.println("INGRESE EL TIPO DE RECONOCIMIENTO: ");
        tipo_reconocimiento=cd.nextLine();
        return "Es un reconocimiento tipo "+tipo_reconocimiento+" con un tiempo "
                + "de reconocimiento de "+tiempo_reconocimiento+" segundos "
                +"con el siguiente código "+codigo+".";
    }
    public static String Comparar_consumo_combustible(){
        Scanner sc=new Scanner(System.in);
        Scanner cd=new Scanner(System.in);
        Scanner ft=new Scanner(System.in);
        int codigo;
        float cantidad_consumo;
        String tipo_combustible;
        System.out.println("INGRESE EL CÓDIGO DEL COMBUSTIBLE: ");
        codigo=sc.nextInt();
        System.out.println("INGRESE CANTIDAD DE CONSUMO DEL COMBUSTIBLE: ");
        cantidad_consumo=ft.nextFloat();
        System.out.println("INGRESE EL TIPO DE COMBUSTIBLE: ");
        tipo_combustible=cd.nextLine();
        return "El tipo de combustible es: "+tipo_combustible+" con un código de consumo de "
                +codigo+ " y una cantidad de consumo de "+cantidad_consumo+" galones de "+tipo_combustible+".";
    }
    public static String Verificar_emisiones(){
        Scanner sc=new Scanner(System.in);
        Scanner cd=new Scanner(System.in);
        Scanner ft=new Scanner(System.in);
        int codigo;
        float cantidad_emision;
        String tipo_emision;
        System.out.println("INGRESE EL CÓDIGO DE EMISIÓN: ");
        codigo=sc.nextInt();
        System.out.println("INGRESE LA CANTIDAD DE EMISIÓN: ");
        cantidad_emision=ft.nextFloat();
        System.out.println("INGRESE EL TIPO DE EMISIÓN: ");
        tipo_emision=cd.nextLine();
        return "Tiene una emisión tipo: "+tipo_emision+", con una cantidad de "
                +cantidad_emision+ " de emisones y un codigo de contaminacion del "+codigo+".";
    }
    public static String Establecer_control_inteligente(){
        Scanner sc=new Scanner(System.in);
        Scanner cd=new Scanner(System.in);
        int codigo;
        String tipo_control;
        System.out.println("INGRESE EL CÓDIGO DE CONTROL INTELIGENTE: ");
        codigo=sc.nextInt();
        System.out.println("INGRESE EL TIPO DE CONTROLAMIENTO: ");
        tipo_control=cd.nextLine();
        return "Tiene un control tipo: "+tipo_control+", con un código "+codigo+" del sistema.";
    }
    public static String Ordenar_series_velocidad(){
        Scanner sc=new Scanner(System.in);
        int codigo, maxima_velocidad, minima_velocidad, tiempo_velocidad, tipo_serie;
        System.out.println("INGRESE EL CÓDIGO DE VELOCIDAD: ");
        codigo=sc.nextInt();
        System.out.println("INGRESE LA MAXIMA VELOCIDAD DEL VEHÍCULO: ");
        maxima_velocidad=sc.nextInt();
        System.out.println("INGRESE LA MINIMA VELOCIDAD DEL VEHÍCULO: ");
        minima_velocidad=sc.nextInt();
        System.out.println("INGRESE EL TIEMPO DE VELOCIDAD DEL VEHÍCULO: ");
        tiempo_velocidad=sc.nextInt();
        System.out.println("INGRESE LA SERIE DEL VEHÍCULO: ");
        tipo_serie=sc.nextInt();
        return "El vehículo tiene la serie "+tipo_serie+" con un código de velocidad "+
                +codigo+" con una variante de tiempo de velocidad de "+tiempo_velocidad+
                "\n con una velocidad minima de "+minima_velocidad+" km/h y una máxima"
                + "de "+maxima_velocidad+" km/h.";
    }
        public static String Disponer_series_conduccion(){
        Scanner sc=new Scanner(System.in);
        Scanner cd=new Scanner(System.in);
        int codigo, numero_conduccion, tiempo_conduccion, serie_conduccion;
        String tipo_conduccion;
        System.out.println("INGRESE EL CÓDIGO DE LA SERIE DE CONDUCCIÓN: ");
        codigo=sc.nextInt();
        System.out.println("INGRESE EL TIEMPO DE CONDUCCIÓN: ");
        tiempo_conduccion=sc.nextInt();
        System.out.println("INGRESE INTENTOS DE CONDUCCIÓN: ");
        numero_conduccion=sc.nextInt();
        System.out.println("INGRESE LA SERIE DE CONDUCCIÓN: ");
        serie_conduccion=sc.nextInt();
        System.out.println("INGRESE EL TIPO DE CONDUCCION: ");
        tipo_conduccion=cd.nextLine();
        return "El tipo de conducción es "+tipo_conduccion+" con un código y una serie\n"
                +" de "+codigo+" y "+serie_conduccion+" con un tiempo de conducción de "+tiempo_conduccion
                +" segundos y "+numero_conduccion+" intentos de conducción.";
    }
    public static String Producir_repeticiones(){
        Scanner sc=new Scanner(System.in);
        int codigo, numero_repeticion;
        System.out.println("INGRESE EL CÓDIGO DE REPETICIONES: ");
        codigo=sc.nextInt();
        System.out.println("INGRESE EL NÚMERO DE CADA REPETICIÓN: ");
        numero_repeticion=sc.nextInt();
        return "El código de cada repetición es "+codigo+" con "+numero_repeticion+" cada repetición.";
    }
    public static String Probar_predicciones_conducción(){
        Scanner sc=new Scanner(System.in);
        Scanner cd=new Scanner(System.in);
        int codigo, tiempo_trafico, tiempo_conduccion, cantidad_emision;
        String velocidad;
        String tipo_conduccion;
        String consumo_combustible;
        System.out.println("INGRESE EL CÓDIGO COMPROBACION: ");
        codigo=sc.nextInt();
        System.out.println("INGRESE EL TIEMPO TRANSCURRIDO EN EL TRÁFICO: ");
        tiempo_trafico=sc.nextInt();
        System.out.println("INGRESE EL TIEMPO DE CONDUCCIÓN: ");
        tiempo_conduccion=sc.nextInt();
        System.out.println("INGRESE LA CANTIDAD DE EMISIÓN CONTAMINANTE: ");
        cantidad_emision=sc.nextInt();
        System.out.println("INGRESE LA VELOCIDAD A LA QUE VA IR EL VEHÍCULO: ");
        velocidad=cd.nextLine();
        System.out.println("INGRESE EL TIPO DE CONDUCCIÓN QUE SE ESTA OCUPANDO: ");
        tipo_conduccion=cd.nextLine();
        System.out.println("INGRESE LA CANTIDAD DE COMBUSTIBLE OCUPADO: ");
        consumo_combustible=cd.nextLine();
        return "El código de comprobación es "+codigo+" en un vehículo que se esta \n"
                +" conduciendo de forma "+tipo_conduccion+" por un tiempo normal de "+tiempo_conduccion
                +" minutos contando los "+tiempo_trafico+" minutos que se perdieron en el tráfico \n"
                + ". El consumo de combustible fue "+consumo_combustible+" con una cantidad de emisiones "
                + "del "+cantidad_emision+"% menos, en una velocidad "+velocidad+".";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Determinar_condiciones_trafico());
        System.out.println(Especificar_condiciones_conduccion());
        System.out.println(Realizar_reconocimientos());
        System.out.println(Comparar_consumo_combustible());
        System.out.println(Verificar_emisiones());
        System.out.println(Establecer_control_inteligente());
        System.out.println(Ordenar_series_velocidad());
        System.out.println(Disponer_series_conduccion());
        System.out.println(Producir_repeticiones());
        System.out.println(Probar_predicciones_conducción());
        // TODO code application logic here
    }
    
}
