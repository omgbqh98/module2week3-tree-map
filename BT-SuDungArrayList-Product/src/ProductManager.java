import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductManager implements IProduct<Product> {
    static List<Product> listProduct;
    static {
        listProduct = new LinkedList<>();
        Product product = new Product("quả táo", 111, 50000);
        Product product1 = new Product("quả bưởi", 112, 70000);
        Product product2 = new Product("quả vải", 113, 60000);
        listProduct.add(product);
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

    Product findId(int id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == listProduct.get(i).getId()) {
                return listProduct.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Product> findName(String name) {
        List<Product> listName = new LinkedList<>();
        for (int i = 0; i < listProduct.size(); i++) {
            if (name == listProduct.get(i).getName()) {
                listName.add(listProduct.get(i));
            }
        }
        return listName;
    }
@Override
    public List<Product> findAll() {
        List<Product> listAll = new LinkedList<>();
        Iterator<Product> iterator = listProduct.iterator();
        while (iterator.hasNext())
            listAll.add(iterator.next());

        return listAll;
    }

     int buy(int kg,int vnd) {
        int money = kg * vnd;
        return money;
    }



}
