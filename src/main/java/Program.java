/*Урок 3. Продвинутая работа с исключениями в Java
Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
Фамилия Имя Отчество датарождения номертелефона пол

Форматы данных:
фамилия, имя, отчество - строки
датарождения - строка формата dd.mm.yyyy
номертелефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m.

Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида

<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

Не забудьте закрыть соединение с файлом.

При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.

Данная промежуточная аттестация оценивается по системе "зачет" / "не зачет"

"Зачет" ставится, если слушатель успешно выполнил
"Незачет"" ставится, если слушатель успешно выполнил

Критерии оценивания:
Слушатель напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробело

 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;



public class Program {
    public static <User> void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Фамилия Имя Отчество через пробел. Пример (Иванов Иван Иванович)");

        String input = scanner.nextLine();

        String[] name = input.split(" ");
        String  dataName = String.join("", name);
        nameVerification.nameVerification(dataName);


        System.out.println("Введите дату рождения через точку. Пример(12.12.2012)");
        String inputData = scanner.nextLine();
        dataVerification.dataVerification(inputData);

        System.out.println("Введите телефона . Пример(89111234567)");
        String inputNumder = scanner.nextLine();
        numberVerification.numberVerification(inputNumder);

        System.out.println("Введите пол, пол можно обозначить только символом f или m. ");
        String inputGender = scanner.nextLine();
        genderVerification.genderVerification(inputGender);

saveFile(name ,inputData ,inputNumder,inputGender);

    }
    public  static void saveFile(String[]  name,String inputData,String inputNumder, String inputGender ) throws IOException {


           FileWriter fileWriter = new FileWriter(name[0]  + ".txt", true);
           fileWriter.write(name[0] + " " + name[1] + " " + name[2] + " " + inputData + " "  + inputNumder + " " + inputGender + "\n");
           fileWriter.close();
        }
    }

//Иванов Иван Ивановч
//Иванов Петр Иванович
//Сидоров Иван ванович
//Иванова Ольга Ивановна
// 12.12.2022
// 89111234567