import java.util.*;

class Task {
    String description;
    Date date;

    public Task(String description, Date date) {
        this.description = description;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Дата: " + date + ", Задача: " + description;
    }
}

public class CalendarPlan {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, List<Task>> tasksByDate = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистить буфер
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    modifyTask();
                    break;
                case 3:
                    deleteTask();
                    break;
                case 4:
                    showTasksByDate();
                    break;
                case 5:
                    showTasksByMonth();
                    break;
                case 6:
                    System.out.println("Выход из программы...");
                    return;
                default:
                    System.out.println("Некорректный выбор, попробуйте снова.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nКалендарный план:");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Изменить задачу");
        System.out.println("3. Удалить задачу");
        System.out.println("4. Показать задачи по дате");
        System.out.println("5. Показать задачи по месяцу");
        System.out.println("6. Выход");
        System.out.print("Выберите действие: ");
    }

    private static void addTask() {
        System.out.print("Введите описание задачи: ");
        String description = scanner.nextLine();

        System.out.print("Введите дату задачи (в формате гггг-ММ-дд): ");
        String dateString = scanner.nextLine();

        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
            Task task = new Task(description, date);
            String dateKey = new SimpleDateFormat("yyyy-MM-dd").format(date);
            tasksByDate.computeIfAbsent(dateKey, k -> new ArrayList<>()).add(task);
            System.out.println("Задача добавлена.");
        } catch (Exception e) {
            System.out.println("Неверный формат даты.");
        }
    }

    private static void modifyTask() {
        System.out.print("Введите дату задачи, которую хотите изменить (в формате гггг-ММ-дд): ");
        String dateString = scanner.nextLine();

        String dateKey = new SimpleDateFormat("yyyy-MM-dd").format(dateString);
        if (tasksByDate.containsKey(dateKey)) {
            List<Task> tasks = tasksByDate.get(dateKey);
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ". " + tasks.get(i));
            }

            System.out.print("Введите номер задачи, которую хотите изменить: ");
            int taskIndex = scanner.nextInt();
            scanner.nextLine(); // очистить буфер

            if (taskIndex >= 0 && taskIndex < tasks.size()) {
                Task task = tasks.get(taskIndex);

                System.out.print("Введите новое описание задачи: ");
                String newDescription = scanner.nextLine();

                task.description = newDescription;
                System.out.println("Задача обновлена.");
            } else {
                System.out.println("Некорректный номер задачи.");
            }
        } else {
            System.out.println("Задачи на эту дату не найдены.");
        }
    }

    private static void deleteTask() {
        System.out.print("Введите дату задачи, которую хотите удалить (в формате гггг-ММ-дд): ");
        String dateString = scanner.nextLine();

        String dateKey = new SimpleDateFormat("yyyy-MM-dd").format(dateString);
        if (tasksByDate.containsKey(dateKey)) {
            List<Task> tasks = tasksByDate.get(dateKey);
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ". " + tasks.get(i));
            }

            System.out.print("Введите номер задачи, которую хотите удалить: ");
            int taskIndex = scanner.nextInt();
            scanner.nextLine(); // очистить буфер

            if (taskIndex >= 0 && taskIndex < tasks.size()) {
                tasks.remove(taskIndex);
                System.out.println("Задача удалена.");
            } else {
                System.out.println("Некорректный номер задачи.");
            }
        } else {
            System.out.println("Задачи на эту дату не найдены.");
        }
    }

    private static void showTasksByDate() {
        System.out.print("Введите дату для отображения задач (в формате гггг-ММ-дд): ");
        String dateString = scanner.nextLine();

        String dateKey = new SimpleDateFormat("yyyy-MM-dd").format(dateString);
        if (tasksByDate.containsKey(dateKey)) {
            List<Task> tasks = tasksByDate.get(dateKey);
            for (Task task : tasks) {
                System.out.println(task);
            }
        } else {
            System.out.println("Задачи на эту дату не найдены.");
        }
    }

    private static void showTasksByMonth() {
        System.out.print("Введите месяц и год (в формате гггг-ММ): ");
        String monthString = scanner.nextLine();

        for (Map.Entry<String, List<Task>> entry : tasksByDate.entrySet()) {
            String date = entry.getKey();
            if (date.startsWith(monthString)) {
                for (Task task : entry.getValue()) {
                    System.out.println(task);
                }
            }
        }
    }
}