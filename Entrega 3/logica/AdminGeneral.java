package logica;


/**
 * <!-- ACA DOCUMENTACION -->
 * <!--  TODO: Implementar los metodos -->
 */

public class AdminGeneral extends Usuario
{
	protected Roles cargo;
	
	/**
	 * <!-- CONSTRUCTOR -->
	 */

	public AdminGeneral(String username, String password, Roles cargo) {
		super(username, password);
		this.cargo = Roles.EMPLEADO;
		}
	
	/**
	 * <!-- METODOS DEL ADMIN -->
	 */
	
	public void manejarEmpleados() {
		// TODO implement me	
	}

	public void crearAdminSede() {
		// TODO implement me	
	}
	
	public void eliminarAdminSede() {
		// TODO implement me	
	}

	public void nuevoVehiculo() {
		// TODO implement me	
	}
	
	public void borrarVehiculo() {
		// TODO implement me	
	}
	
	public void addSede() {
		// TODO implement me, tiene que agregar a EmpresaAlquiler.listaSedes	
	}
	
	public void eliminarSedes() {
		// TODO implement me	
	}
	
	//NO SE PUSO getters y setters porque no se necesitan y siempre daria el cargo.
}

