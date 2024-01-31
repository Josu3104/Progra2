package HW;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Transito {

    private Multa[] multas;
    private int contador;

    public Transito() {
        multas = new Multa[100];
        contador = 0;
    }

    public Multa buscarMulta(int code) {
        for (int i = 0; i < multas.length; i++) {
            if (multas[i] != null && multas[i].getCodigo() == code) {
                return multas[i];
            }
        }
        return null;
    }

    public void crearMulta(int code, String name, String tipo) {
        if (contador <= 100) {
            if (buscarMulta(code) == null) {
                multas[contador] = new Multa(code, name, tipo);
                contador++;
                JOptionPane.showMessageDialog(null, "MULTA AGREGADA");
            } else {
                JOptionPane.showMessageDialog(null, "YA EXISTE UNA MULTA CON DICHO CODIGO");
            }
        } else {
            JOptionPane.showMessageDialog(null, "YA NO QUEDA ESPACIO PARA MAS MULTAS");
        }
    }

    public void Pagar(int code) {
        Multa temp = buscarMulta(code);
        if (temp != null) {
            temp.pay();
        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTE UNA MULTA CON DICHO CODIGO");
        }
    }

    public void imprimirMultas(JTextArea printer) throws NullPointerException {

        for (int i = 0; i <= contador; i++) {
            
                printer.append("#" + i + " Infractor: " + multas[i].getNombreInfractor() + " - Codigo: "
                        + multas[i].getCodigo() + " - Tipo: " + multas[i].getTipo() + " - Monto: Lps."
                        + multas[i].getMonto() + " - Estado: " + multas[i].print());
            
        }
    }

    public void datosHistoricos(JTextArea printer2) {
        int pagados = 0;
        int pendientes = 0;
        double PagoPendiente = 0;
        double TotalPagado = 0;
        for (int i = 0; i < contador; i++) {
            if (multas[i].isPagada()) {
                pagados++;
                TotalPagado -= multas[i].getMonto();
            } else {
                pendientes++;
                PagoPendiente += multas[i].getMonto();

            }
        }

        printer2.setText("Multas generadas: " + contador + "\n"
                + "Multas Pagadas: " + pagados + " - Total: Lps." + TotalPagado + "\n"
                + "Multas Pendientes: " + pendientes + "- Total: Lps." + PagoPendiente);
    }

}
