package progKievUa.javaOOP.classWork.lesson10.minServlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author bvanchuhov
 */
public interface Servlet {
    void execute(BufferedReader reader, PrintWriter writer) throws IOException;
}
