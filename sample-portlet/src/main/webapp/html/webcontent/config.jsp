<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
    <%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
     <%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
    <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
    <%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
  
<portlet:defineObjects />

<liferay-portlet:actionURL var="configurationActionURL"
	portletConfiguration="true"></liferay-portlet:actionURL>
<%
   String structureName = (String)renderRequest.getAttribute("structureName");
%>
<aui:form action="<%=configurationActionURL%>" name="saveConfiguration"	method="post">
	
	<div class="row-fields" style="display: flex;">
	<aui:input label="Structure Name" name="structureName"></aui:input>
	</div>
	
	<aui:button type="submit" name="submit"	value="submit"></aui:button>
	</aui:form>