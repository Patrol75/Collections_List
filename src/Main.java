import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //list.add("Помидор");
        //list.add("Помидор Азербайджан");
        //list.add("Молоко");
        //list.add("Помидор Краснодар");
        while (true) {
            System.out.println("Выберите операцию:\n 1. Добавить \n 2. Показать\n 3. Удалить \n 4. Найти\n 5. Закончить выполнение");
            int command = scanner.nextInt();
            System.out.println();
            scanner.nextLine();
            switch (command) {
                case (1):
                    System.out.println("Какую покупку хотите добавить?");
                    String item = scanner.nextLine();
                    list.add(item);
                    System.out.println("Итого в списке покупок: " + list.size() + "\n");
                    break;
                case (2):
                    System.out.println("Список покупок:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(i + 1 + ". " + list.get(i));
                    }
                    System.out.println();
                    break;
                case (3):
                    System.out.println("Какую хотите удалить? Введите номер или название");
                    String delete = scanner.nextLine();
                    try {
                        int intDelete = Integer.parseInt(delete);
                        list.remove(intDelete - 1);
                    } catch (NumberFormatException exception) {
                        list.remove(delete);
                    }
                    System.out.println();
                    break;
                case (4):
                    System.out.println("Введите текст для поиска:");
                    String queryLower = scanner.nextLine().toLowerCase();
                    for (int i = 0; i < list.size(); i++) {
                        String itemLower = list.get(i).toLowerCase();
                        if (itemLower.contains(queryLower)) {
                            System.out.println(i + 1 + ". " + list.get(i));
                        }
                    }
                    System.out.println();
                    break;
                default:
                    break;
            }
            if (command < 1 || command > 4) {
                System.out.println("Процесс завершен");
                break;
            }
        }
    }

}
