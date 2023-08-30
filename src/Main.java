
public class Main {
    public static void main(String[] args) {


        Cardiologista c1 = new Cardiologista();
        Oftalmologista c2=new Oftalmologista();
        Endocrinologista c3=new Endocrinologista();
        Pediatria c4=new Pediatria();
        Cirurgiao c5=new Cirurgiao();
        //Medico m1=new Medico();
        CirurgiaoPlastico m2=new CirurgiaoPlastico();
        Rinoplastia r1=new Rinoplastia();



        c1.setNome("Camila");
        c1.setCRM("123456");
        c1.setAnoFormacao(2010);

        System.out.println(c1.getNome());
        System.out.println(c1.getCRM());
        System.out.println(c1.getAnoFormacao());

        c2.setNome("Paloma");
        c2.setCRM("123457");
        c2.setAnoFormacao(2012);

        System.out.println(c2.getNome());
        System.out.println(c2.getCRM());
        System.out.println(c2.getAnoFormacao());

        c3.setNome("Pedro");
        c3.setCRM("123458");
        c3.setAnoFormacao(2013);

        System.out.println(c3.getNome());
        System.out.println(c3.getCRM());
        System.out.println(c3.getAnoFormacao());

        c4.setNome("Carolita");
        c4.setCRM("123459");
        c4.setAnoFormacao(2014);

        System.out.println(c4.getNome());
        System.out.println(c4.getCRM());
        System.out.println(c4.getAnoFormacao());

        c5.setNome("Helena");
        c5.setCRM("123451");
        c5.setAnoFormacao(2015);

        System.out.println(c5.getNome());
        System.out.println(c5.getCRM());
        System.out.println(c5.getAnoFormacao());
    }
}