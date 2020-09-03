package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {
	public static void main(String[] args) {
	/*//Creación de objetos de tipo enpleado
	Empleados Empleado1 = new DirectorEmpleado();
	// Uso de los objetos creados
	System.out.println(Empleado1.getTareas());*/
		//Primer Paso
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Segundo Paso
		DirectorEmpleado Juan=contexto.getBean("miEmpleado", DirectorEmpleado.class);
		//Tercer Paso
		System.out.println(Juan.getTareas());
		//Impresión del Informe
		System.out.println(Juan.getInforme());
		System.out.println(Juan.getEmail());
		System.out.println(Juan.getNombreEmpresa());
		
		/*// Inyección de Dependencias por Setter
		SecretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Pablo=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInforme());
		
		//Inyección de Dependencias de Campos
		System.out.println("Email: "+Maria.getEmail());
		System.out.println(Maria.getNombreEmpresa());
		System.out.println("Email Pablo: "+Pablo.getEmail());*/
		//Cuarto Paso
		contexto.close();
	}	
}
