public class Profesores extends Thread {

    public Profesores(String nombre) {
        super(nombre);
    }


    public void run() {
        for (int i = 0; i < 4; i++) {
            if (i < 3) {
                System.out.println("[" + getName() + "] Cabreo nivel: " + i);
            }
            if (i == 3) {
                System.out.println("[" + getName() + "] Cabreo nivel: " + i + "... ¡He llegado a mi límite!");
            }
        }

    }

    public static class Profesores2 implements Runnable {

        private String nombre;

        public Profesores2(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public void run() {
            for (int i = 0; i < 4; i++) {
                if (i < 3) {
                    System.out.println("[" + this.nombre + "] Cabreo nivel: " + i);
                } else {
                    System.out.println("[" + this.nombre + "] Cabreo nivel: " + i + "... ¡He llegado a mi límite!");
                }
            }
        }

    }
        public static void main(String[] args) {
            new Profesores("Diego").start();
            new Profesores("Damian").start();
            new Thread(new Profesores2("El malvado Araujo")).start();
            new Thread(new Profesores2("Manuel")).start();
            System.out.println("Programa principal terminado.");

        }


    }

