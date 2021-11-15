public class Main {
    public static void main(String[] args) {
        Restoran rest = new Restoran();
        rest.setIme("Oskar");
        rest.setLokacija("Bitola");
        rest.setTelefon("047/123-123");
        rest.setBrSedishta(150);

        System.out.println("Kontakt telefonot na restoranot " + rest.getIme() + " koj se naogja vo " + rest.getLokacija() + " e: " + rest.getTelefon());
        System.out.println("Restoranot ima kapacitet od: " + rest.getBrSedishta() + " sedishta.");
    }
}
