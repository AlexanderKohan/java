package epamMethodsProgramming.part2.chapter8_ExceptionsAndErrors.code.inheritanceAndExceptions.resourse;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Alexander on 9/4/2016.
 */

class Resource { // ранее созданный класс
    public Resource(String filename) throws FileNotFoundException {
// more code
    }
}

class ConcreteResource extends Resource { // ранее созданный класс
    // ранее созданный конструктор
    public ConcreteResource(String name) throws FileNotFoundException {
        super(name);
// more code
    }

    // ранее созданный конструктор
    public ConcreteResource() throws IOException {
        super("file.txt");
// more code
    }

//    // новый конструктор
//    public ConcreteResource(String name, int mode) { /* ошибка компиляции */
//        super(name);
//// more code
//    }
//
//    public ConcreteResource(String name, int mode, String type) throws ParseException {
///* ошибка компиляции */
//        super(name);
//// more code
//    }
}