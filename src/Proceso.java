import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;


public class Proceso {
	
		public static ArrayList<Mascotas> listaAnimales = new ArrayList<>();
	    public static HashMap<String, Mascotas> mapaAnimales = new HashMap<>();
	    
	public static void main(String[] args) {
		
		        int opcion;

		        do {
		            String menu = ">>>Menu Mascotas<<<<\n"
		                    + "1. Registrar un nuevo animal\n"
		                    + "2. Consultar un animal\n"
		                    + "3. Mostrar lista de animales registrados\n"
		                    + "4. Salir\n"
		                    + "Ingrese una opción:";
		            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

		            switch (opcion) {
		                case 1:
		                    registrarMascota();
		                    break;
		                case 2:
		                    consultarMascota();
		                    break;
		                case 3:
		                    mostrarMascota();
		                    break;
		                case 4:
		                    JOptionPane.showMessageDialog(null, "Gracias por su trabajo ...");
		                    break;
		                default:
		                    JOptionPane.showMessageDialog(null, "La opcion no de encuentra.");
		            }
		        } while (opcion != 4);
		    }

		    public static void registrarMascota() {
		        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del animal:");
		        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de animal:");
		        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));

		        Mascotas animal = new Mascotas();
		        
		        animal.setNombre(nombre);
		        animal.setTipo(tipo);
		        animal.setEdad(edad);
		        
		        listaAnimales.add(animal);
		        mapaAnimales.put(nombre, animal);

		        JOptionPane.showMessageDialog(null, "¡Animal registrado exitosamente!");
		    }

		    public static void consultarMascota() {
		        String mati = JOptionPane.showInputDialog("Ingrese el nombre a buscar:");
		        Mascotas animal = mapaAnimales.get(mati);
        		
        		if(mapaAnimales.containsKey(mati)) {
        			animal.mostrarInformacion();
        		}else {
        			JOptionPane.showMessageDialog(null, "El insecto no existe");
        		}
    }
		    

		    public static void mostrarMascota() {
		        if (listaAnimales.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "No hay animales registrados.");
		        } else {
		        	String lista = "Lista de insectos registrados:\n";
		            for (Mascotas animalitos : listaAnimales) {
		                lista += "Nombre: " + animalitos.getNombre() + "\n";
		                lista += "Tipo: " + animalitos.getTipo() + "\n";
		                lista += "Edad: " + animalitos.getEdad() + "\n";
		                lista += "-------------------\n";
		            }
		            JOptionPane.showMessageDialog(null, lista);
		        }
		    }
	}


