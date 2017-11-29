<%@page import="net.opentrends.training.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="net.opentrends.training.service.StudentLocalServiceUtil"%>
    <%@page import="net.opentrends.training.model.Student"%>
    <%@page import="com.liferay.portal.kernel.util.WebKeys"%>
    <%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
    <%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
    <%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
    <%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
    <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
   
    <%
    ResultRow results=(ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Employee emp=(Employee)results.getObject();
    %>

<liferay-ui:icon-menu>

        <portlet:renderURL var="editEmpUrl">
           <portlet:param name="jspPage" value="/html/employee/EditEmpUrl.jsp" />
           <portlet:param name="id" value="<%=String.valueOf(emp.getEmpId())%>" />
       </portlet:renderURL>
        <liferay-portlet:actionURL var="deleteEmpUrl" name="deleteEmp">
            <portlet:param name="id" value="<%=String.valueOf(emp.getEmpId())%>"/>
        </liferay-portlet:actionURL>

       <liferay-ui:icon image="edit" message="Edit" url="<%=editEmpUrl.toString() %>" /> 
       <liferay-ui:icon image="delete" message="Delete" url="<%=deleteEmpUrl.toString() %>" />
      
</liferay-ui:icon-menu>