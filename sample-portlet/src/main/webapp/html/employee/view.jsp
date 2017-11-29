<%@page import="com.liferay.portal.model.Role"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="javax.portlet.PortletURL"%>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<liferay-theme:defineObjects />

<portlet:defineObjects />

<% List<Role> roleItems = themeDisplay.getUser().getRoles();
PortletURL addStudent = renderResponse.createRenderURL();
addStudent.setParameter("mvcPath", "/html/employee/addEmployee.jsp");
%>

<c:forEach var="role" items="<%= roleItems%>">
 <c:if test="${role.getName()== 'Manager' }">
    <h4><a href="<%=addStudent.toString()%>">Add Employee Details</a></h4>
 </c:if>
 <c:if test="${role.getName()== 'Employee' }">
    <h4>Employee Role</h4>
 </c:if>

</c:forEach>