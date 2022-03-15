package es.cipfpbatoi.ed.refactoringanddocumenting;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        System.out.println( "Bienvenido al Programa" );
        
        Estudiante estudiante1 = new Estudiante(10,"pepe");
        
        String textoEstudiante = "El estudiante ";
		if ( Estudiante.esMayorDeEdad (estudiante1.edad) ) {
        	System.out.println(textoEstudiante + estudiante1.nombre + " es mayor de edad");
        } else {
        	System.out.println(textoEstudiante + estudiante1.nombre + " es menor de edad");
        }
        
    }
}
