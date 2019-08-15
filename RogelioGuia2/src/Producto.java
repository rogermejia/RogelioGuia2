
public class Producto implements Envios {
	private String nomproProducto;
	private String categoria;
	private Double precio;

	// CONSTRUCTOR POR DEFECTO
	public Producto() {

	}
	
	//Constructor con todos los parametros
	public Producto(String nomproProducto, String categoria, Double precio) {
     this.nomproProducto = nomproProducto;
     this.categoria = categoria;
     this.precio = precio;
	}
	
	//CONSTRUCTOR COPIA
	public Producto(Producto p) {
		nomproProducto = p.getNomproProducto();
		categoria = p.getCategoria();
		precio = p.getPrecio();
	}

	// METODO PARA LA IMPLEMENTACION DE LA INTERFAZ
	@Override
	public void calcularEnvio() {

	}

	// GETTERS Y SETTERS DE LOS CAMPOS DE CLASE

	public String getNomproProducto() {
		return nomproProducto;
	}

	public void setNomproProducto(String nomproProducto) {
		this.nomproProducto = nomproProducto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
