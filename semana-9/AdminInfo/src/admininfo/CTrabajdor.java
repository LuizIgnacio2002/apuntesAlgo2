package admininfo;

public class CTrabajdor {
    private int codigo;
    private String nombre;
    private float basico;
    private float retenciones;
    private float neto;

    public CTrabajdor(int codigo, String nombre, float basico) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.basico = basico;
        this.retenciones = 0; // Inicializamos retenciones en 0
        this.neto = 0; // Inicializamos neto en 0
    }

    public int obtenerCodigo() {
        return codigo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public float obtenerBasico() {
        return basico;
    }

    public float obtenerRetenciones() {
        return retenciones;
    }

    public float obtenerNeto() {
        return neto;
    }

    public void colocarCodigo(int nCodigo) {
        codigo = nCodigo;
    }

    public void colocarNombre(String sNombre) {
        nombre = sNombre;
    }

    public void colocarBasico(float nBasico) {
        basico = nBasico;
    }

    public void colocarRetenciones(float nRetenciones) {
        retenciones = nRetenciones;
    }

    public void colocarNeto(float nNeto) {
        neto = nNeto;
    }

    public void calcularRetenciones(float nTasa) {
        retenciones = basico * (nTasa);
    }

    public void calcularNeto(float nNeto) {
        neto = nNeto;
    }
}
