package net.opentrends.training.config;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ValidatorException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

public class WedcontentConfiguration implements ConfigurationAction{
	private static Log log = LogFactoryUtil.getLog(WedcontentConfiguration.class.getName());

	@Override
	public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {
		
		addConfiguration(actionRequest);
	}

	private void addConfiguration(ActionRequest actionRequest) throws PortalException, SystemException {
		String portletResource = ParamUtil.getString(actionRequest, "portletResource");
		PortletPreferences preferences = PortletPreferencesFactoryUtil.getPortletSetup(actionRequest, portletResource);
		String structureName=actionRequest.getParameter("structureName");
		try {
		preferences.setValue("structureName", structureName);
		preferences.store();
		
		} catch (ReadOnlyException e) {
		} catch (ValidatorException e) {
			log.info(e.getMessage());
		} catch (IOException e) {
			log.info(e.getMessage());
		}
}

	@Override
	public String render(PortletConfig portletConfig, RenderRequest renderRequest, RenderResponse renderResponse)
			throws Exception {
		String portletResource = ParamUtil.getString(renderRequest, "portletResource");
		PortletPreferences preferences = PortletPreferencesFactoryUtil.getPortletSetup(renderRequest, portletResource);
		String structureName = preferences.getValue("structureName", StringPool.BLANK);
		log.info("structureName : "+structureName);

		renderRequest.setAttribute("structureName", structureName);
		return "/html/webcontent/config.jsp";
		
	}
}

