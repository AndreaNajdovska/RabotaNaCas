public class Main {
    public static void main(String[] args) {
        Covek c = new Covek ();
        c.setIme("Andrea");
        c.setPrezime("Najdovska");
        c.setEmbg("1234567890123");

        System.out.println("Ime: " + c.getIme());
        System.out.println("Prezime: " + c.getPrezime());
        System.out.println("EMBG: " + c.getEmbg());
    }
}