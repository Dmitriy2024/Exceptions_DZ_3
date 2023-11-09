import java.util.zip.DataFormatException;

public class genderVerification {

    public static void genderVerification(String inputGender) throws Exception {

        if (inputGender.isEmpty()){
            throw new DataFormatException("Строка пол пуста. Повторите Ввод");
        }

        if (!(inputGender.equals("f")) && !(inputGender.equals("m"))){
        throw new Exception("Пол обозначин не врно. Повторите ввод.");

}
}
}