
package renos;

/**
 *
 * @author Erick
 */
public class Renos {
    String genero;
    String nombre;
    String apellido;
    String DNI;
    String celular;
    String correo;
    String fechanacimiento;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Renos(String genero, String nombre, String apellido, String DNI, String celular, String correo, String fechanacimiento) {
        this.genero = genero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.celular = celular;
        this.correo = correo;
        this.fechanacimiento = fechanacimiento;
    }
    
            
    public static void main(String[] args) {
        
    }
    
}
