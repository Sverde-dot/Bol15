package datos;

/**
 *
 * @author sverdecadilla
 */
public class personal {
    private String telefono;
    private String correo;

    public personal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }
    
    @Override
    public String toString() {
        return "personal{" + "telefono=" + telefono + ", correo=" + correo + '}';
    }
    
}
