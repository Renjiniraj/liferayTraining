<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="net.opentrends.training.service.permission.EmployeePermission"%>
<%@page import="net.opentrends.training.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="net.opentrends.training.service.StudentLocalServiceUtil"%>
    <%@page import="net.opentrends.training.model.Student"%>
    <%@page import="com.liferay.portal.kernel.util.WebKeys"%>
    <%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
    <%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
     <%@page import="com.liferay.taglib.security.PermissionsURLTag"%>
     <%@page import="net.opentrends.training.service.permission.EmployeePermission"%>
     <%@page import="com.liferay.portal.security.permission.PermissionChecker"%>
     
    <%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
    <%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
    <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
    <%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    

   
    <%
    ResultRow results=(ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Employee emp=(Employee)results.getObject();
    ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

    PermissionChecker permissionChecker =  themeDisplay.getPermissionChecker();
    %>
<liferay-security:permissionsURL modelResource="<%= Employee.class.getName() %>" modelResourceDescription="" resourcePrimKey="" var="permissionsURL" />

<liferay-ui:icon-menu>

  <c:if test='<%=EmployeePermission.contains(permissionChecker, emp.getEmpId(),"EDIT") %>'>
        
        <portlet:renderURL var="editEmpUrl">
           <portlet:param name="jspPage" value="/html/employee/EditEmpUrl.jsp" />
           <portlet:param name="id" value="<%=String.valueOf(emp.getEmpId())%>" />
       </portlet:renderURL>
        
        <liferay-ui:icon image="edit" message="Edit" url="<%=editEmpUrl.toString() %>" /> 
  </c:if>

 <%--  <c:if test='<%=EmployeePermission.contains(permissionChecker, emp.getEmpId(), "DELETE") %>'> --%>
        
        <liferay-portlet:actionURL var="deleteEmpUrl" name="deleteEmp">
            <portlet:param name="id" value="<%=String.valueOf(emp.getEmpId())%>"/>
        </liferay-portlet:actionURL>
        
        <liferay-ui:icon image="delete" message="Delete" url="<%=deleteEmpUrl.toString() %>" />
 <%--  </c:if> --%>
 
        
        <liferay-portlet:actionURL var="permissionEmpUrl" name="permissionEmp">
            <portlet:param name="id" value="<%=String.valueOf(emp.getEmpId())%>"/>
        </liferay-portlet:actionURL>
    <liferay-ui:icon image="permissions" url="<%= permissionsURL %>" />
       


      
</liferay-ui:icon-menu>