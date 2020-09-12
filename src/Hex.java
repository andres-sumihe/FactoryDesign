public class Hex implements Converter{
    @Override
    public void converter(int desimal){
       String Hex = Integer.toHexString(desimal);
       System.out.println("\nHasil Konversi "+desimal+" ke Hexadesimal Adalah "+Hex);
       System.out.println("");
    }
}
