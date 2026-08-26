package Buoi13;
//6.	Viết Repository<T> generic tự chế: interface
// với save(T), findAll(), deleteAll(); cài InMemoryRepository<T> bằng ArrayList
import java.util.ArrayList;
import java.util.List;

interface Repository<T>{
    void saves(T item);
    List<T> findAll();
    void deleteAll();
}

class InMemoryRepository<T> implements Repository<T>{
    private List<T> list = new ArrayList<>();
    @Override
    public void saves(T item) {
         list.add(item);
    }

    @Override
    public List<T> findAll() {//lấy tất cả phần tử
        return list;
    }

    @Override
    public void deleteAll() {//xóa tất cả phần tử
        list.clear();
    }
}
public class Bai6 {
    public static void main(String[] args) {
        InMemoryRepository<String> repository = new InMemoryRepository<>();
        repository.saves("Chung");
        repository.saves("Nam");
        repository.saves("Anh");
        System.out.println("Danh sách");
        System.out.println(repository.findAll());
        System.out.println("Xóa danh sách");
        repository.deleteAll();
        System.out.println("Danh sách sau khi xóa");
        System.out.println(repository.findAll());
    }
}
