
package pkg3etapa.ejerciciogui.pkg3;

/**
 *
 * @author Cristian
 */
public class Producto {
    private String categoria;
    private String producto;
    private double precio;

    public Producto(String categoria, String producto, double precio) {
        this.categoria = categoria;
        this.producto = producto;
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "categoria=" + categoria + ", producto=" + producto + ", precio=" + precio + '}';
    }
    
    

}
