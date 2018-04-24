
//esta clase sirve para acceder al servicio.java a travez de esta
package modelo;

import java.util.ArrayList;
import javax.ejb.Local;


@Local
public interface ServicioLocal {

    void addProducto(Producto p);

    ArrayList<Producto> getProductos();
    
}
