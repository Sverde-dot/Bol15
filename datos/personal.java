package datos;

/**
 *
 * @author sverdecadilla
 */
public class personal {
    private String telefono;
    private char correo;

    public personal(String telefono, char correo) {
        this.telefono = telefono;
        this.correo = correo;
    }
    
    @Override
    public String toString() {
        return "personal{" + "telefono=" + telefono + ", correo=" + correo + '}';
    }
    
}
