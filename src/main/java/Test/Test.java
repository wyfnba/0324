package Test;

import org.apache.commons.lang3.reflect.MethodUtils;
import sun.reflect.misc.MethodUtil;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz=Class.forName("Test.UserController");
        boolean result=clazz.isAnnotationPresent(Controller.class);
        System.out.println(result);
        Method method[]= MethodUtils.getMethodsWithAnnotation(clazz,RequestMapping.class);
        System.out.println(method.length);
        for(Method methods : method){
            RequestMapping requestMapping = methods.getAnnotation(RequestMapping.class);
            System.out.println("注解的属性值" + requestMapping.value());
        }
    }
}