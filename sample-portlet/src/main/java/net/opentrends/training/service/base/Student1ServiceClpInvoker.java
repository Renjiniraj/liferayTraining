package net.opentrends.training.service.base;

import net.opentrends.training.service.Student1ServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Student1ServiceClpInvoker {
    private String _methodName54;
    private String[] _methodParameterTypes54;
    private String _methodName55;
    private String[] _methodParameterTypes55;

    public Student1ServiceClpInvoker() {
        _methodName54 = "getBeanIdentifier";

        _methodParameterTypes54 = new String[] {  };

        _methodName55 = "setBeanIdentifier";

        _methodParameterTypes55 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName54.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
            return Student1ServiceUtil.getBeanIdentifier();
        }

        if (_methodName55.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
            Student1ServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
