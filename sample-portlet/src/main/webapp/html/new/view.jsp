<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />
<liferay-theme:defineObjects />



<h4>Registration form submission</h4>

<%
PortletURL addStudent = renderResponse.createRenderURL();
addStudent.setParameter("mvcPath", "/html/new/addStudent.jsp");
PortletURL updateStudent = renderResponse.createRenderURL();
updateStudent.setParameter("mvcPath", "/html/new/searchStudent.jsp");
PortletURL dislayStudent = renderResponse.createRenderURL();
dislayStudent.setParameter("mvcPath", "/html/new/displayStudent.jsp");
PortletURL updateStudentURL=renderResponse.createRenderURL();
updateStudentURL.setParameter("mvcPath", "/html/new/updateStudentUrl.jsp");
PortletURL searchByName=renderResponse.createRenderURL();
searchByName.setParameter("mvcPath", "/html/new/searchStudent.jsp");
%>
<br/>
<a href="<%=addStudent.toString()%>">Add Student</a><br/>
<a href="<%=updateStudent.toString()%>">Update Student</a><br/>
<a href="<%=dislayStudent.toString()%>">Display Student</a><br/>
<a href="<%=searchByName.toString()%>">Search</a>