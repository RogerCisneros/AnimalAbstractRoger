public class Main {
    public static void main(String[] args) {
        Anmal p = new Perro();

        p.setNombre("Choca");
        p.comer();
        p.caminar();
        p.sonido();

        System.out.println("----------------------------------");
        Anmal g = new Perro();
        g.setNombre("Mochita");
        g.comer();
        g.caminar();
        g.sonido();

    }
}
