class Animal {
    // Atributo de la clase padre
    protected String tipo;

    // Constructor sin parámetros
    public Animal() {
        this.tipo = "Animal";
    }

    // Constructor con un parámetro para especificar el tipo de animal
    public Animal(String tipo) {
        this.tipo = tipo;
    }

    
    public void mostrarDatos() {
        System.out.println("Tipo: " + tipo);
    }
}

// Clase Hija 1 - Perro (no recibe parámetros)
class Perro extends Animal {
    // Constructor sin parámetros que llama al constructor de la clase padre
    public Perro() {
        super("Perro"); // Llama al constructor de la clase Animal con el tipo "Perro"
    }

    // Método específico del perro
    public void ladrar() {
        System.out.println("El perro ladra.");
    }
}

// Clase Hija 2 - Gato (recibe un parámetro en el constructor de la clase padre)
class Gato extends Animal {
    public Gato(String tipo) {
        super(tipo); // Llama al constructor de la clase Animal con el tipo recibido
    }

    // Método específico del gato
    public void maullar() {
        System.out.println("El gato maúlla.");
    }
}

// Clase Hija 3 - Pajaro (recibe un parámetro específico en esta clase)
class Pajaro extends Animal {
    private String color;

    public Pajaro(String color) {
        super("Pajaro"); // Llama al constructor de la clase Animal con el tipo "Pajaro"
        this.color = color; // Guarda el color específico de este pájaro
    }

    public void volar() {
        System.out.println("El pájaro vuela. Color: " + color);
    }
}

// Clase Hija 4 - Tortuga (recibe parámetros para la clase padre y la hija)
class Tortuga extends Animal {
    private int edad;

    public Tortuga(String tipo, int edad) {
        super(tipo); // Llama al constructor de la clase Animal con el tipo dado
        this.edad = edad; // Guarda la edad específica de esta tortuga
    }

    public void nadar() {
        System.out.println("La tortuga nada. Edad: " + edad);
    }
}

// Clase Hija 5 - Conejo (creado sin parámetros y luego se le asignan valores)
class Conejo extends Animal {
    private String tamaño;

    public Conejo() {
        super("Conejo"); // Llama al constructor de la clase Animal con el tipo "Conejo"
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño; // Establece el tamaño del conejo
    }

    public void mostrarDatos() {
        super.mostrarDatos(); // Llama al método mostrarDatos de la clase Animal
        System.out.println("Tamaño: " + tamaño);
    }
}


