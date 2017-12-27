package net.opentrends.training.service.base;

import net.opentrends.training.service.FooServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FooServiceClpInvoker {
    private String _methodName66;
    private String[] _methodParameterTypes66;
    private String _methodName67;
    private String[] _methodParameterTypes67;

    public FooServiceClpInvoker() {
        _methodName66 = "getBeanIdentifier";

        _methodParameterTypes66 = new String[] {  };

        _methodName67 = "setBeanIdentifier";

        _methodParameterTypes67 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName66.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes66, parameterTypes)) {
            return FooServiceUtil.getBeanIdentifier();
        }

        if (_methodName67.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes67, parameterTypes)) {
            FooServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
