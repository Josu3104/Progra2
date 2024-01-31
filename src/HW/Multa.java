
package HW;


public class Multa {

    private int codigo;
    private String nombreInfractor;
    private String tipo;
    private double monto;
    private boolean pagada;
    public double TIPO_GRAVE;
    public double TIPO_MEDIO;
    public double TIPO_LEVE;

    public Multa(int code, String nombre, String tipo) {
        codigo = code;
        nombreInfractor = nombre;
        this.tipo = tipo;
        pagada = false;
        TIPO_GRAVE = 2000;
        TIPO_MEDIO = 1000;
        TIPO_LEVE = 500;

        switch (tipo) {
            case "LEVE":
                monto = TIPO_LEVE;
                break;
            case "MEDIO":
                monto = TIPO_MEDIO;
                break;
            case "GRAVE":
                monto = TIPO_GRAVE;
                break;
            default:
                monto = TIPO_LEVE;
                break;
        }
    }

    public String print() {
        String temp;
        return temp = (pagada) ? "Pagada por un monto de Lps. " + monto : "Mula pendiente";
    }

    public String pay() {
        pagada = true;
        return "Multa con Código " + codigo + "fue pagada por un monto de Lps." + monto;
    }

    public String getNombreInfractor() {
        return nombreInfractor;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getMonto() {
        return monto;
    }

    public boolean isPagada() {
        return pagada;
    }

    public String getTipo() {
        return tipo;
    }
    
    

}
