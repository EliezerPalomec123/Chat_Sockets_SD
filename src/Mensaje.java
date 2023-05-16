
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eliezer
 */
/*Esta clase tiene que ser Serializable para que cualquier objeto que sea
instancia de esta clase pueda convertirse en una serie de bytes y pueda así
viajar por la red
*/
public class Mensaje implements Serializable{
    //Declaración de los datos que estarán empaquetados
    
    //Nombre de usuario que se quiere conectar
    private String nomUser;
    
    //Dirección Ip del cliente con el que se desea comunicar
    private String ipDestino;
    
    //Mensaje que quiere enviarle
    private String mensaje;
    
    public Mensaje(String nomUser, String ipDestino,String mensaje){
        this.nomUser=nomUser;
        this.ipDestino=ipDestino;
        this.mensaje=mensaje;
    }

    public String getNomUser() {
        return nomUser;
    }

    public String getIpDestino() {
        return ipDestino;
    }

    public String getMensaje() {
        return mensaje;
    }
    
    
}
