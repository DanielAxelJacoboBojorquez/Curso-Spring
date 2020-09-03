package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {
	//Creación de campo tipo CreactionInforme (interfaz)
	private CreacionInformes informeNuevo;
	//Creación de Constructor que inyecta la dependencia
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
	
	//Inyección de Campos

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
	
	//Método init. Ejecutar tareas antes de que el bean éste disponible
	public void metodoInicial() {
		System.out.println("Dentro del método init. Aquí irúan las tareas ejecutar "+" antes de que el bean esté listo");
	}
	//Método destroy. Ejecutar tareas después de que el bean haya sido utilizado
	public void metodoFinal() {
		System.out.println("Dentro del método destroy. Aquí irúan las tareas ejecutar "+" después de que el bean esté listo");
	}
	
	private String email;
	private String nombreEmpresa;
}
