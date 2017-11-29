
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletMode"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:defineObjects />
<%-- <portlet:renderURL var="homeURL"></portlet:renderURL>
<portlet:actionURL var="addStudentActionURL" windowState="normal"
 name="addStudent">
</portlet:actionURL> --%>

<%
 PortletURL homeURL = renderResponse.createRenderURL();

%>
<portlet:actionURL name="addStudentAction" var="addStudentActionURL"/>
<h2>Add Student Form here !</h2>
<a href="<%=homeURL.toString()%>">Home</a>
<br />
<br />
<aui:form action="<%=addStudentActionURL.toString()%>" method="post" name="addStudent">
<aui:input name="firstName" > <aui:validator name="required" errorMessage="This field is required"/></aui:input>
<aui:input name="lastName" ></aui:input> 
<aui:input name="branch" ></aui:input>
<aui:input name="age"></aui:input>  
<aui:input name="email" ><aui:validator name="required" errorMessage="Please enter valid email address"/>
                         <aui:validator name="email"/></aui:input>
<aui:button type="submit" name="" value="Submit"></aui:button>

</aui:form>