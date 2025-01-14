package agencia;

public class Atraccion extends Producto {
	private String nombre;
	private double precio;
	private int cupo;
	private int cupoDisponible;
	private double tiempoNecesario;
	protected boolean atraccionConCupo = true;
	
	
	public Atraccion(tipoDeProducto tipo, 
			tipoDeAtraccion tipoDeAtraccion,
			String nombre,
			double precio,
			int cupo,
			double tiempoNecesario) {
		
		super(tipo, tipoDeAtraccion);
		this.nombre = nombre;
		this.precio = precio;
		this.cupo = cupo;
		this.tiempoNecesario = tiempoNecesario;
	}
	
	
	
	
	@Override
	public String toString() {
		String quienSoy = "";
		quienSoy += getNombre() + " " + getTipoDeAtraccion().name()+ " " + getPrecio() + " " + getCupo() + " " + getTiempoNecesario();
		return quienSoy;
		
	}
	//Getters and setters
	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public int getCupo() {
		return cupo;
	}

	public void setCupo(int cupo) {
		this.cupo = cupo;
	}

	public int getCupoDisponible() {
		return cupoDisponible;
	}

	public void setCupoDisponible(int cupoDisponible) {
		this.cupoDisponible = cupoDisponible;
	}

	public double getTiempoNecesario() {
		return tiempoNecesario;
	}

	public void setTiempoNecesario(double tiempoNecesario) {
		this.tiempoNecesario = tiempoNecesario;
	}
	@Override
	public boolean getAtraccionConCupo() {
		return atraccionConCupo;
	}

	public void setAtraccionConCupo(boolean atraccionConCupo) {
		this.atraccionConCupo = atraccionConCupo;
	}




	//metodos
	public void comprobarCupo() {
		atraccionConCupo = cupoDisponible > 0;
	}
	
	@Override
	public void reducirCupo() {
		setCupo(getCupoDisponible()-1);
		comprobarCupo();
	}

	@Override
	public boolean equals(String nombre) {
		int uno = nombre.hashCode();
		return uno == this.getNombre().hashCode();
	}
}
