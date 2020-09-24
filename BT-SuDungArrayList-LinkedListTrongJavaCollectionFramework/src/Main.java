import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;

public class Main {
 static  void disPlay(List<Product>productList) {
        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        System.out.println("===List===");
        List<Product> products;
        products = productManager.findAll();
        disPlay(products);

        System.out.println("==ADD==");

        Product product =new Product("iphone 8" , 115, 1000);
        productManager.add(product);
         products = productManager.findAll();
        disPlay(products);

//        System.out.println("===Delete===");
//        productManager.delete(112);
//        disPlay(products);

//        System.out.println("===FindName===");
//        products = productManager.findName("iphone5");
//        disPlay(products);

        System.out.println("==Dao nguoc gia tien: ");
        sort();

 }

     public static void sort() {
         Comparetor comparetor = new Comparetor();
         Collections.sort(ProductManager.listProduct,comparetor);
         for (Product cp:ProductManager.listProduct) {
             System.out.println(cp.toString());
         }
     }
}
