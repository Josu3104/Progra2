/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week_4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue Gavidia
 */
public class BlockBuster {

    ArrayList<BlockBusterItem> Items;

    public BlockBuster() {
        Items = new ArrayList();
    }

    public BlockBusterItem buscarItem(int codigo, String tipo) {
        for (BlockBusterItem it : Items) {
            if (it.codigo == codigo && ((tipo.equalsIgnoreCase("game") && it instanceof MovieItem) || (tipo.equalsIgnoreCase("game") && it instanceof VideoGameItem))) {
                return it;
            }
        }
        return null;
    }

    public void agregarItem(int codigo, String nombre, String tipoItem) {
        BlockBusterItem itemExistente = buscarItem(codigo, tipoItem);
        if (itemExistente == null) {
            if (tipoItem.equalsIgnoreCase("movie")) {
                Items.add(new MovieItem(codigo, nombre, 0));
            } else if(tipoItem.equalsIgnoreCase("game")) {
                Items.add(new VideoGameItem(VideoGameItem.c1,codigo,tipoItem));
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ya existe un item con el código " + codigo + " y tipo " + tipoItem);

        }
    }

    public void rentar(int codigo, String tipoItem, int dias) {
        BlockBusterItem temp = buscarItem(codigo, tipoItem);
        if (temp != null) {

        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTE");
        }
    }

}
