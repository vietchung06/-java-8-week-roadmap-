package lab;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository<T> {
    private List<T> data = new ArrayList<>();
    public void save(T employee){
        data.add(employee);
    }
    public List<T> findAll() {
        return data;
    }
}
