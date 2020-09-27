import java.util.Comparator;
import java.util.stream.Collector;

public class Comparetor implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getVnd() > o2.getVnd()) {
            return -1;
        } else if (o1.getVnd() == o2.getVnd()) {
            return 0;
        } else {
            return 1;
        }
    }


}
class Comparetor2 implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
            if (o1.getVnd() > o2.getVnd()) {
                return 1;
            } else if (o1.getVnd() == o2.getVnd()) {
                return 0;
            } else {
                return -1;
            }
        }
    }

