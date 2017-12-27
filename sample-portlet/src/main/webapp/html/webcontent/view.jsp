<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<% JSONObject object = (JSONObject) renderRequest.getAttribute("ResultContent");  
out.println(object);


  String text = object.getString("Text");
  String desc = object.getString("Description");
  out.println(text);
  out.println(desc);
%>