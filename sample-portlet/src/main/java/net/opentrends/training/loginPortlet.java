package net.opentrends.training;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.NoRedirectActionResponse;
import com.liferay.portal.kernel.struts.PortletActionInvoker;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class loginPortlet
 */
public class loginPortlet extends MVCPortlet {

	@Override
	public void processAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws IOException, PortletException {

		String className = "com.liferay.portlet.login.action.LoginAction";
		PortletConfig portletConfig = getPortletConfig();
		NoRedirectActionResponse noRedirectActionResponse =
			new NoRedirectActionResponse(actionResponse);

		try {
			PortletActionInvoker.processAction(
				className, portletConfig, actionRequest,
				noRedirectActionResponse);
		}
		catch (Exception e) {
			_log.error(e, e);
		}

		String login = ParamUtil.getString(actionRequest, "login");
		String password = ParamUtil.getString(actionRequest, "password");
		String rememberMe = ParamUtil.getString(actionRequest, "rememberMe");

		if (Validator.isNull(noRedirectActionResponse.getRedirectLocation())) {
			actionResponse.setRenderParameter("login", login);
			actionResponse.setRenderParameter("rememberMe", rememberMe);
		}
		else {
			String redirect =
				PortalUtil.getPathMain() + "/c/portal/login?login=" + login +
					"&password=" + password + "&rememberMe=" + rememberMe;

			actionResponse.sendRedirect(redirect);
		}
	}

	private static Log _log = LogFactoryUtil.getLog(loginPortlet.class);

}
