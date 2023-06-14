import java.util.Scanner;

public class mensajesService {

    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Tu nombre:");
        String nombre = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeDB(registro);
    }

    public static void listarMensajes(){
        MensajesDAO.leerMensajeDB();
    }

    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el ID del mensaje ha eliminar");
        int id_mensaje =sc.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensaje);
    }

    public static  void editarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nuevo mensaje");
        String newMensaje = sc.nextLine();

        System.out.println("Indica el ID del mensaje ha actualizar");
        int id_mensaje = sc.nextInt();

        Mensajes newRegistro = new Mensajes();
        newRegistro.setMensaje(newMensaje);
        newRegistro.setId_mensaje(id_mensaje);
        MensajesDAO.actualizarMensajeDB(newRegistro);
    }
}
