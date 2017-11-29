package net.opentrends.training.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import net.opentrends.training.service.ClpSerializer;
import net.opentrends.training.service.EmployeeLocalServiceUtil;
import net.opentrends.training.service.EmployeeServiceUtil;
import net.opentrends.training.service.FooLocalServiceUtil;
import net.opentrends.training.service.FooServiceUtil;
import net.opentrends.training.service.StudentLocalServiceUtil;
import net.opentrends.training.service.StudentServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            EmployeeLocalServiceUtil.clearService();

            EmployeeServiceUtil.clearService();
            FooLocalServiceUtil.clearService();

            FooServiceUtil.clearService();
            StudentLocalServiceUtil.clearService();

            StudentServiceUtil.clearService();
        }
    }
}
