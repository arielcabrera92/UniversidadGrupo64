
package universidadgrupo64;

//import java.sql.Connection;

import java.time.LocalDate;
import universidadgrupo64.AccesoADatos.AlumnoData;
import universidadgrupo64.Entidades.Alumno;

//import universidadgrupo64.AccesoADatos.Conexion;


public class UniversidadGrupo64 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Connection con = Conexion.getConexion();
        Alumno juan=new Alumno(12312311,"Luna","Pedro",LocalDate.of(1980, 4, 25),true);
        AlumnoData alu=new AlumnoData();
        alu.guardarAlumno(juan);
        
        
    }
    
}
