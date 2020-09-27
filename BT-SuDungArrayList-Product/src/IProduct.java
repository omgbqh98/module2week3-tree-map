import java.util.List;

public interface IProduct<E> {
     void add(E object);
     void update(int id,E n );
     void delete(int id);
     List<E> findName(String name);
     List<E> findAll();

}
