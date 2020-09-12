public class Biner implements Converter {
    @Override
    public void converter(int desimal){
       String Biner = Integer.toBinaryString(desimal);
       System.out.println("\nHasil Konversi "+desimal+" ke Biner Adalah "+Biner);
       System.out.println(""); 
    }
}
