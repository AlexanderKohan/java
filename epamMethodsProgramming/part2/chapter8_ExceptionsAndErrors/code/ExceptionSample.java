package epamMethodsProgramming.part2.chapter8_ExceptionsAndErrors.code;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by Alexander on 9/4/2016.
 */
public class ExceptionSample {
    public double parseFromFrance(String numberStr) {
        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);
        try {
            double numFr = nfFr.parse(numberStr).doubleValue();
            return numFr;
        } catch (ParseException e) { // проверяемое исключение
// 1. генерация стандартного исключения, н-р: IllegalArgumentException() — не очень хорошо
// 2. генерация собственного исключения
// 3. return 0 или другого значения по умолчанию; — нежелательно
        }return 0;
    }

    public double parseFromFrance2(String numberStr) throws ParseException {
        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);
        double numFr = nfFr.parse(numberStr).doubleValue();
        return numFr;
    }
}