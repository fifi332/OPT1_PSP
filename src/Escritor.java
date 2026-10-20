class Escritor extends Thread {
    private Buzon buzon;

    public Escritor(String nombre, Buzon buzon) {
        super(nombre);
        this.buzon = buzon;
    }

@Override
    public void run() {
        for(int i = 1; i <= 3; i++){
            String texto = getName() + " - mensaje " + i;
        }

    }
}
