public class Gato extends Anmal {
        private String name;

        public Gato(String name) {
            this.name = name;
        }
        @Override
        public void sonido(){
            System.out.println(this.getNombre()+" dice: MIAU");
        }


}

