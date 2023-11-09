import java.util.zip.DataFormatException;

public class numberVerification {
    public static void numberVerification(String inputNumber) throws Exception {



        if (inputNumber.isEmpty() ){
            throw new Exception("Строка с номером пуста. Повторите Ввод");
        }



        if (inputNumber.matches("\\d+")) {
        }
        else {
            throw  new Exception ("Строка содержит другие символы кроме цифр. Повторите ввод");
        }


        if(inputNumber.length() != 11) {
            throw  new Exception("Неверное колличество символов в номере. Повторите ввод");
        }
}
}
