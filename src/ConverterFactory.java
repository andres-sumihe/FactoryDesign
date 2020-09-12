public class ConverterFactory {
    public Converter getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("BINER")){
            return new Biner();
        }
        if(shapeType.equalsIgnoreCase("HEX")){
            return new Hex();
        }
        if(shapeType.equalsIgnoreCase("OKTAL")){
            return new Oktal();
        }
        return null;
    }
}