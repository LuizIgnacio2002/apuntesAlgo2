package admininfo;

public class CEmpleado extends CTrabajdor {
    private int diasFaltas;
    private float descuentos;
    private float horasExtras;

    public CEmpleado(int codigo, String nombre, int basico, int dias, int horas) {
        super(codigo, nombre, basico); // Llama al constructor de la clase base

        this.diasFaltas = dias;
        this.horasExtras = horas;
        this.descuentos = 0; // Inicializa descuentos en 0
    }

    public int obtenerDiasFaltas() {
        return diasFaltas;
    }

    public float obtenerDescuentos() {
        return descuentos;
    }

    public float obtenerHorasExtras() {
        return horasExtras;
    }

    public void colocarDiasFaltas(int dias) {
        diasFaltas = dias;
    }

    public void colocarDescuentos(float desc) {
        descuentos = desc;
    }

    public void colocarHorasExtras(int horas) {
        horasExtras = horas;
    }
    
    public void calcularDescuento()
    {
        descuentos = (obtenerBasico() / 30) * diasFaltas;
    }
    
    public double calcularSueldoHoraExtra()
    {
        return ((super.obtenerBasico()/30)/8)*1.5;
    }
    
    public void calcularNeto(){
        colocarNeto((float) (super.obtenerBasico() - super.obtenerRetenciones() - descuentos + horasExtras * calcularSueldoHoraExtra()));
    }
}
