import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductManager implements IProduct<Product> {
    static List<Product> listProduct;
    static {
        listProduct = new ArrayList<>();
        Product product = new Product("iphone5", 111, 500);
        Product product1 = new Product("iphone7", 112, 700);
        Product product2 = new Product("samsung", 113, 600);
        listProduct.add(new Product("iphone5", 111, 500));
        listProduct.add(product1);
        listProduct.add(product2);
    }

    @Override
    public void add(Product object) {

        for (int i = 0; i < listProduct.size(); i++) {
            if (object.getId() == listProduct.get(i).getId()) {
                break;
            }else {
                listProduct.add(object);
                break;
            }
        }
    }


    @Override
    public void update(int id, Product newProduct) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == listProduct.get(i).getId()) {
                listProduct.set(i, newProduct);
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == listProduct.get(i).getId()) {
                listProduct.remove(i);
            }
        }
    }

    @Override
    public List<Product> findName(String name) {
        List<Product> listName = new ArrayList<>();
        for (int i = 0; i < listProduct.size(); i++) {
            if (name == listProduct.get(i).getName()) {
                listName.add(listProduct.get(i));
            }
        }
        return listName;
    }
@Override
    public List<Product> findAll() {
        List<Product> listAll = new ArrayList<>();
        Iterator<Product> iterator = listProduct.iterator();
        while (iterator.hasNext())
            listAll.add(iterator.next());

        return listAll;
    }





}
