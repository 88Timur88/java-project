
import java.util.*;
import java.util.stream.Collectors;

class Notebook {
    String brand;
    int ram;
    int hdd;
    String os;
    String color;

    public Notebook(String brand, int ram, int hdd, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

public class GetSortNotebook {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Set<Notebook> notebook = new HashSet<>();
        notebook.add(new Notebook("Dell", 16, 512, "Windows", "Black"));
        notebook.add(new Notebook("Apple", 8, 256, "MacOS", "Silver"));
        notebook.add(new Notebook("Lenovo", 32, 1024, "Windows", "Gray"));
        notebook.add(new Notebook("Dell", 16, 512, "Windows", "Black"));
        notebook.add(new Notebook("Apple", 8, 256, "MacOS", "Black"));
        notebook.add(new Notebook("Lenovo", 8, 1024, "Windows", "Silver"));
        Map<String, Object> filters = new HashMap<>();

        Scanner scanner = new Scanner(System.in);



        int choice;
        while (true) {
            System.out.println("Выберите критерии для фильтрации(для завершения сортировки нажмите 0):");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.println("0 - Завершить выбор");
            choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Минимальный объем ОЗУ?");
                    filters.put("ram", scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Минимальный объем ЖД?");
                    filters.put("hdd", scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Операционная система(Windows, MacOS)?");
                    filters.put("os", scanner.next());
                    break;
                case 4:
                    System.out.println("Цвет(Black, Gray, Silver)?");
                    filters.put("color", scanner.next());
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
        scanner.close();

        Set<Notebook> filteredNotebooks = notebook.stream()
                .filter(notebok -> filters.getOrDefault("ram", 0) instanceof Integer
                        && notebok.ram >= (int) filters.getOrDefault("ram", 0))
                .filter(notebok -> filters.getOrDefault("hdd", 0) instanceof Integer
                        && notebok.hdd >= (int) filters.getOrDefault("hdd", 0))
                .filter(notebok -> filters.getOrDefault("os", "").equals("") 
                        || notebok.os.equalsIgnoreCase((String) filters.getOrDefault("os", "")))
                .filter(notebok -> filters.getOrDefault("color", "").equals("")
                        || notebok.color.equalsIgnoreCase((String) filters.getOrDefault("color", "")))
                .collect(Collectors.toSet());

        System.out.println("Отфильтрованные ноутбуки:");
        for (Notebook notebok : filteredNotebooks) {
            System.out.println(notebook);
        }
    }
}
