package py.edu.facitec.l3.model;

public class Cliente {
	private int codigo;
	private String nombre;
	private String apellido;
	private String direccion;
	private int cedulanumero;
	private boolean estado;
	
	
	public Cliente() {
		super();
		this.codigo=0;
		this.nombre="";
		this.apellido="";
		this.direccion="";
		this.estado=false;
}
	
	public Cliente(int codigo, String nombre, String apellido, String direccion, 
			boolean estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.estado = estado;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCedulanumero() {
		return cedulanumero;
	}

	public void setCedulanumero(int cedulanumero) {
		this.cedulanumero = cedulanumero;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}
