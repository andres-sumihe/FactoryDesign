public class Oktal implements Converter {

    @Override
    public void converter(int desimal){
        String Oktal = Integer.toOctalString(desimal);
        System.out.println("\nHasil Konversi "+desimal+" ke Oktal Adalah "+Oktal);
        System.out.println("");
    }
}
