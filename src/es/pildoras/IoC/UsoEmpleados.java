package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {
	public static void main(String[] args) {
	/*//Creaci�n de objetos de tipo enpleado
	Empleados Empleado1 = new DirectorEmpleado();
	// Uso de los objetos creados
	System.out.println(Empleado1.getTareas());*/
		//Primer Paso
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Segundo Paso
		/*Empleados Juan=contexto.getBean("miEmpleado", Empleados.class);
		//Tercer Paso
		System.out.println(Juan.getTareas());
		//Impresi�n del Informe
		System.out.println(Juan.getInforme());*/
		
		// Inyecci�n de Dependencias por Setter
		Empleados Maria=contexto.getBean("miSecretarioEmpleado", Empleados.class);
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInforme());
		
		//Cuarto Paso
		contexto.close();
	}	
}
