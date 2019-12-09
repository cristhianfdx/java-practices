
package ejemploenum;


public enum Miclase {
    
    CRISTHIAN("Forero"),
    MARIA("Dominguez");
    
    private final String apellido;

    private Miclase(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
    return apellido;
    }
    
    
    
    
}
