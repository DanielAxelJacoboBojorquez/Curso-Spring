package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {
	//Creaci�n de campo tipo CreactionInforme (interfaz)
	private CreacionInformes informeNuevo;
	//Creaci�n de Constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo=informeNuevo;
	}
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: "+informeNuevo.getInforme();
	}
	
	//Inyecci�n de Campos

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	//M�todo init. Ejecutar tareas antes de que el bean �ste disponible
	public void metodoInicial() {
		System.out.println("Dentro del m�todo init. Aqu� ir�an las tareas ejecutar "+" antes de que el bean est� listo");
	}
	//M�todo destroy. Ejecutar tareas despu�s de que el bean haya sido utilizado
	public void metodoFinal() {
		System.out.println("Dentro del m�todo destroy. Aqu� ir�an las tareas ejecutar "+" despu�s de que el bean est� listo");
	}
	
	private String email;
	private String nombreEmpresa;
}
