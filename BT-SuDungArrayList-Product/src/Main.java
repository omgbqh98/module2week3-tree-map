import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

public class Main {
 static  void disPlay(List<Product>productList) {
        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    static void menu() {
        System.out.println("menu: ");
        System.out.println("1: add");
        System.out.println("2: update");
        System.out.println("3: delete");
        System.out.println("4: find Id product");
        System.out.println("5: buy");
        System.out.println("6: sap xep gia tien");
    }
    public static void main(String[] args) {
//        Product product1 = new Product();
        ProductManager productManager = new ProductManager();
        System.out.println("===List===");
        List<Product> products;
        products = productManager.findAll();
        disPlay(products);
        menu();
        Scanner scanner = new Scanner(System.in);
        int select;
        System.out.println("select: ");
        select = scanner.nextInt();
        while (select >= 1 && select <= 6) {
            switch (select) {
                case 1:
                    System.out.println("==ADD==");
                    System.out.println("ban muon them bao nhieu san pham: ");
                    int newProduct = scanner.nextInt();
                    for (int i = 0; i < newProduct; i++) {
                        System.out.println("input ten san pham muon them:");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("input id: ");
                        int id = scanner.nextInt();
                        System.out.println("input gia tien: ");
                        int vnd = scanner.nextInt();
                        Product product =new Product( name, id, vnd);
                        productManager.add(product);
                    }
                    products = productManager.findAll();
                    disPlay(products);
                    menu();
                    System.out.println("select: ");
                    select = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("===update===");
                    System.out.println("input id produt muon update: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("input newName: ");
                    String newName = scanner.nextLine();
                    System.out.println("input newId: ");
                    int newId = scanner.nextInt();
                    System.out.println("input newGia: ");
                    int newGia = scanner.nextInt();
                    Product product = new Product(newName, newId, newGia);
                    productManager.update(id,product);
                    products = productManager.findAll();
                    disPlay(products);
                    menu();
                    System.out.println("select: ");
                    select = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("===delete===");
                    System.out.println("input id product muon xoa : ");
                    int idDelete = scanner.nextInt();
                    productManager.delete(idDelete);
                    products = productManager.findAll();
                    disPlay(products);
                    menu();
                    System.out.println("select: ");
                    select = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("===FindId===");
                    System.out.println("input id product muon tim: ");
                    int finId = scanner.nextInt();
                    System.out.println(productManager.findId(finId));
                    System.out.println("ban co muon mua khong: ");
                    System.out.println("1: yes ");
                    System.out.println("2: no ");
                    int select1 = scanner.nextInt();

                    for (int i = 0; i < 1; i++) {
                        switch (select1) {
                            case 1:
                                System.out.println("input kg");
                                int kg = scanner.nextInt();
                                System.out.println("input giá:");
                                int gia = scanner.nextInt();
                                System.out.println("thành tiền: ");
                                System.out.println(productManager.buy(kg,gia));
                                productManager.delete(finId);
                                break;
                            case 2:
                                products = productManager.findAll();
                                disPlay(products);
                                menu();
                                System.out.println("select: ");
                               break;
                        }
                    }
                    products = productManager.findAll();
                    disPlay(products);
                    menu();
                    System.out.println("select: ");
                    select = scanner.nextInt();
                   break;

                case 5:
                    System.out.println("===buy===");
                    System.out.println("input id muon buy:");
                    int idBuy = scanner.nextInt();
                    System.out.println(productManager.findId(idBuy));
                    System.out.println("input kg");
                    int kg = scanner.nextInt();
                    System.out.println("input giá:");
                    int gia = scanner.nextInt();
                    System.out.println("thành tiền: ");
                    System.out.println(productManager.buy(kg,gia));
                    products = productManager.findAll();
                    disPlay(products);
                    menu();
                    System.out.println("select: ");
                    select = scanner.nextInt();
                    break;
                case 6:
                    System.out.println("chon gia muon săp xep: ");
                    System.out.println("1. tu cao xuong thap");
                    System.out.println("2. tu thap len cao");
                    int selectGia = scanner.nextInt();
                    for (int i = 0; i < 1; i++) {
                        switch (selectGia) {
                            case 1:
                                sort();
                                break;
                            case 2:
                                sort2();
                                break;
                        }
                    }
//
                    menu();
                    System.out.println("select: ");
                    select = scanner.nextInt();
            }
        }
        System.out.println("ko co trong menu!!! ");
        products = productManager.findAll();
        disPlay(products);
        menu();
        System.out.println("select: ");
        select = scanner.nextInt();


//        System.out.println("===Delete===");
//        productManager.delete(112);
//        disPlay(products);

//        System.out.println("===FindName===");
//        products = productManager.findName("iphone5");
//        disPlay(products);

//        System.out.println("==Dao nguoc gia tien: ");
//        sort();

 }

     public static void sort() {
         Comparetor comparetor = new Comparetor();
         Collections.sort(ProductManager.listProduct,comparetor);
         for (Product cp:ProductManager.listProduct) {
             System.out.println(cp.toString());
         }
     }

    public static void sort2() {
        Comparetor2 comparetor1 = new Comparetor2();
        Collections.sort(ProductManager.listProduct, comparetor1);
        for (Product product : ProductManager.listProduct) {
            System.out.println(product.toString());
        }

    }
}
