import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

       List<Product> products = new ArrayList<>();
       List<Product> camasi = new ArrayList<>();
       List<Product> tricouri = new ArrayList<>();
       Map<String, ArrayList<Product>> jachete = new HashMap<String, ArrayList<Product>>();

        jachete.put("negru", new ArrayList<>());
        jachete.put("alb", new ArrayList<>());
        jachete.put("rosu",new ArrayList<>());

            ProductFactory productFactory = new ProductFactory();
            ReadFile readFile = ReadFile.getInstance();

            List<String> list = readFile.readLines("D:\\produse.txt");
            System.out.println("de aici incepe lista");
            for(String string : list){
                String [] words = string.split(",");
                Product product = productFactory.getProduct(words[0]);
                product.setType(words[0]);
                product.setMark(words[1]);
                product.setColor(words[2]);
                product.setSize(words[3]);
                product.setPrice(Integer.parseInt(words[4]));
                if(product.getType().equalsIgnoreCase("camasa")){
                    camasi.add(product);
                }else if(product.getType().equalsIgnoreCase("tricou")){
                    tricouri.add(product);
                }else if(product.getType().equalsIgnoreCase("jacheta")){
                    if(product.getColor().equalsIgnoreCase("rosu")){
                        jachete.get("rosu").add(product);
                    }else if(product.getColor().equalsIgnoreCase("negru")){
                        jachete.get("negru").add(product);
                    }else if(product.getColor().equalsIgnoreCase("alb")){
                        jachete.get("alb").add(product);
                    }
                }
            }
            for(Product camasa : camasi){
                System.out.println(camasa);
            }
            
        List<Product> red = jachete.get("rosu");
        for ( Product jacheta : red){
            System.out.println(jacheta);
        }

        List<Product> white = jachete.get("alb");
        for (Product jacheta : white){
            System.out.println(jacheta);
        }

        List<Product> black = jachete.get("negru");
        for (Product jacheta : white){
            System.out.println(jacheta);
        }
            System.out.println("aici se termina lista");

    }
}
