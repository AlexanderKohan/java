package progKievUa.javaOOP.classWork.lesson10.minServlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author bvanchuhov
 */
public class MinServlet implements Servlet {
    @Override
    public void execute(BufferedReader reader, PrintWriter writer) throws IOException {
        // Input
        String paramA = reader.readLine();
        String paramB = reader.readLine();

        if (!validateInput(writer, paramA, paramB)) return;

        int a = Integer.parseInt(paramA);
        int b = Integer.parseInt(paramB);

        // BL
        int min = Math.min(a, b);

        // Output
        writer.println("min = " + min);
    }

    private boolean validateInput(PrintWriter writer, String paramA, String paramB) {
        if (!Validator.isInt(paramA) || !Validator.isInt(paramB)) {
            writer.println("Illegal input");
            return false;
        }
        return true;
    }
}
