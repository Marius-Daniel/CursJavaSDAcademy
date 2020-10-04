public class ProductFactory {

    public Product getProduct(String type){
        if(type.equalsIgnoreCase("camasa")){
            return new Camasa();
        }else if(type.equalsIgnoreCase("tricou")){
            return new Tricou();
        }else if(type.equalsIgnoreCase("jacheta")){
            return new Jacheta();
        }
        return null;
    }
}
