package Buoi10;
//5.	Interface Storable với save(), load();
// class FileStorage, MemoryStorage implement — "bản nháp tư duy" của Repository pattern.
interface Storable{
    public void save();
    public void load();
}
class FileStorage implements Storable{

    @Override
    public void save() {
        System.out.println("Lưu File");
    }

    @Override
    public void load() {
        System.out.println("Load File");
    }
}
class MemoryStorage implements Storable{

    @Override
    public void save() {
        System.out.println("Lưu bộ nhớ");
    }

    @Override
    public void load() {
        System.out.println("Load bộ nhớ");
    }
}
public class Bai5 {
    public static void main(String[] args) {
        Storable[] storages = {
                new FileStorage(),
                new MemoryStorage()
        };

        for (int i = 0; i< storages.length; i++) {
            storages[i].save();
            storages[i].load();
        }
    }
}
