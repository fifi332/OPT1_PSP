public class Buzon {
    private String mensaje = null;

    public synchronized void escribir(String texto, String escritor) throws InterruptedException {
        while (mensaje != null) {
            System.out.println(escritor + "el buzon esta lleno. Espera..");
            wait();
        }

        mensaje = texto;
        System.out.println(escritor + "escribe: " + mensaje);
        notifyAll();

    }

    public synchronized void leer(String lector) throws InterruptedException{
        while (mensaje == null){
            System.out.println(lector + "el buzon esta vacio. Espera..");
            wait();
        }

        String mensajeLeido = mensaje;
        mensaje = null;
        System.out.println(lector + "lee: " + mensajeLeido);
        notifyAll();
    }

    void main() {
    }
}