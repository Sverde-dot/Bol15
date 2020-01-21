package datos;

/**
 *
 * @author sverdecadilla
 */
public class personal {
    private String telefono;
    private String correo;

    public personal() {
    }

    public personal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
      
    @Override
    public String toString() {
        return "personal{" + "telefono=" + telefono + ", correo=" + correo + '}';
    }
    
}
