package epamMethodsProgramming.part1.chapter6_InterfacesAndAnnotations.code.annotations;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Alexander on 9/3/2016.
 */

public class SecurityFactory {
    public static IAccountOperationManager createSecurityObject(
            IAccountOperationManager targetObject) {
        return (IAccountOperationManager) Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                new SecurityInvokationHandler(targetObject));
    }

    private static class SecurityInvokationHandler implements InvocationHandler {
        private Object targetObject = null;

        public SecurityInvokationHandler(Object targetObject) {
            this.targetObject = targetObject;
        }

        public Object invoke(Object proxy, Method method, Object[] args)
                throws Throwable {
            //SecurityLogic logic = new SecurityLogic();
            Method realMethod = targetObject.getClass().getMethod(
                    method.getName(),
                    (Class[]) method.getGenericParameterTypes());
            BankingAnnotation annotation = realMethod
                    .getAnnotation(BankingAnnotation.class);
            if (annotation != null) {
// доступны и аннотация и параметры метода
                //logic.onInvoke(annotation.securityLevel(), realMethod, args);
                try {
                    return method.invoke(targetObject, args);
                } catch (InvocationTargetException e) {
                    System.out.println(annotation.securityLevel());
                    throw e.getCause();
                }
            }else{
/* в случае если аннотирование метода обязательно следует
генерировать исключение на факт ее отсутствия */
/* throw new InvocationTargetException(null, "method "
+ realMethod + " should be annotated "); */
// в случае если допустимо отсутствие аннотации у метода
                    return null;
                }
        }
    }
}