import javax.swing.JOptionPane;

public class Mascotas {
    private String nombre;
    private String especie;
    private int edad;

   
    
	


	public void setTipo(String especie) {
		this.especie = especie;
	}
	public String getTipo() {
		return especie;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}



    
    
    public void mostrarInformacion() {
    	String info = "Detalles del insecto:\n"
                + "Nombre: " + nombre + "\n"
                + "Tipo: " + especie + "\n"
                + "edad: " + edad +  "\n";
    			hacerSonido();
        JOptionPane.showMessageDialog(null, info);
    }

   
    public void hacerSonido() {
    	
    	if (especie.equalsIgnoreCase("perro")) {
            System.out.println("¡Guau guau!");
        } else if (especie.equalsIgnoreCase("gato")) {
            System.out.println("¡Miau miau!");
        } else if (especie.equalsIgnoreCase("pato")) {
            System.out.println("¡Cua Cua!");
        } else if (especie.equalsIgnoreCase("paloma")) {
            System.out.println("¡ruu ruu!");
        } else if (especie.equalsIgnoreCase("vaca")) {
            System.out.println("¡muu muu!");
        } else if (especie.equalsIgnoreCase("pollo")) {
            System.out.println("¡pio pio!");
        } else {
            System.out.println("La mascota no hace sonidos conocidos.");
        }
    }
    }


