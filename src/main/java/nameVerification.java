import java.util.Objects;

public class nameVerification {
    public static void nameVerification(String dataNeme) throws RuntimeException {
        // Проверяем, что строка не пустая



            if (dataNeme.isEmpty()) {
                System.out.println("Строка с именем пуста. Повторите Ввод");
            }

            // Проверяем, что длина строки не меньше 17 символов
            if (dataNeme.length() < 17) {
                System.out.println("Длина строки меньше 17 символов. Повторите Ввод");

            }
        }
    }

//    public static void main(String[] args) {
//        try {
//            nameVerification("Иван Иванович Иванов"); // Пример строки с именем
//            System.out.println("Имя прошло валидацию.");
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }
//    }
