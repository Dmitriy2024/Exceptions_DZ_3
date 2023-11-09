import java.util.zip.DataFormatException;

public class dataVerification {

    public static void dataVerification(String inputData) throws DataFormatException {


        if (inputData.isEmpty() | inputData.equals(" ")){
            throw new DataFormatException("Строка с датой пуста. Повторите Ввод");
        }

        if(inputData.length() != 10) {
            throw  new DataFormatException("Неверное колличество символов. Повторите Ввод");
        }

        String[] data = inputData.split("\\.");

        if (Integer.parseInt(data[0]) == 0 | Integer.parseInt(data[0]) > 31) {
            throw new DataFormatException("Неверная дата. Повторите Ввод");
        }

        if (Integer.parseInt(data[1]) < 1 | Integer.parseInt(data[1]) >12) {
            throw new DataFormatException("Неверный месяц. Повторите Ввод");
        }

        if (Integer.parseInt(data[2])  < 1967 | Integer.parseInt(data[2]) > 2023) {
            throw new DataFormatException("Неверный год. Повторите Ввод");
        }

}
}



