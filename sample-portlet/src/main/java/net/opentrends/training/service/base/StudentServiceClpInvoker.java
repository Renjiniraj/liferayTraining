package net.opentrends.training.service.base;

import net.opentrends.training.service.StudentServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StudentServiceClpInvoker {
    private String _methodName32;
    private String[] _methodParameterTypes32;
    private String _methodName33;
    private String[] _methodParameterTypes33;

    public StudentServiceClpInvoker() {
        _methodName32 = "getBeanIdentifier";

        _methodParameterTypes32 = new String[] {  };

        _methodName33 = "setBeanIdentifier";

        _methodParameterTypes33 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName32.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
            return StudentServiceUtil.getBeanIdentifier();
        }

        if (_methodName33.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes33, parameterTypes)) {
            StudentServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
