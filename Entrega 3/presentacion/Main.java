package presentacion;
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

import java.util.Scanner;

import logica.EmpresaAlquiler;

public class Main {
	
	private EmpresaAlquiler empresa;
	
	public Main() {
		this.empresa = new EmpresaAlquiler();
		Scanner sc = new Scanner(System.in);
		int op;
		//TODO Aca hagan el menu. y relacionen con las demas clases
		do {
			System.out.println("Digite:\n"
					+ "0. Salir\n"
					+ "1. Cargar Archivo\n"
					+ "2. \n");			
			op = sc.nextInt();
			
			if(op == 1) {				
				this.empresa.leerArchivos();
			}else if(op == 2) {
				
			}
		}while(op != 0);
		sc.close();
	}
	
	//TODO IMPLEMENTAR
	private void iniciarSesion() {
	}
	//Username password, de la clase abstracta usuario
	
	// private elegirMenu()
	
	//if user.cargo = Roles.ADMINISTRADORGENERAL{MOSTRARR MENU ADMIN}
	
	// mapa =  empresa.getmapa(usuario)
	// usuarioBuscado = mapa.get(usuario)
	// if usuarioBuscado.cargo = Roles.ADMINISTRADORGENERAL {MOSTRAR OPCIONES ADMIN }
	
	// if opcion == anadir sede
	//usuarioBuscado.addSede(nombreSede, empresa.listaSede)
	
	//TODO IMPLEMENTAR
	private void crearCuenta() {
	}
	
	
	public static void main(String[] args) {
		new Main();
	}
	
}