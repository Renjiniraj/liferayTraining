package net.opentrends.training.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import net.opentrends.training.service.ClpSerializer;
import net.opentrends.training.service.DepartmentLocalServiceUtil;
import net.opentrends.training.service.DepartmentServiceUtil;
import net.opentrends.training.service.MarksLocalServiceUtil;
import net.opentrends.training.service.MarksServiceUtil;
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
            DepartmentLocalServiceUtil.clearService();

            DepartmentServiceUtil.clearService();
            MarksLocalServiceUtil.clearService();

            MarksServiceUtil.clearService();
            StudentLocalServiceUtil.clearService();

            StudentServiceUtil.clearService();
        }
    }
}
