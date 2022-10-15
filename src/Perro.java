public class Perro extends Anmal {
    private String raza;
    public Perro(String nombre,String raza) {
        super(nombre);
        this.raza = raza;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void sonido(){
        System.out.println(this.getNombre()+" dice GUAU");
    }

    public void muerde(){System.out.println("El perro cuando modió a una niña");}
}
