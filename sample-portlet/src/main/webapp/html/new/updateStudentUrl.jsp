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
   
    Student stud=(Student)results.getObject();
    String id=String.valueOf(stud.getStudentid());
    String studentFname = stud.getFname();
    String studentLname = stud.getLname();
    String studentAge = String.valueOf(stud.getAge());
    String studentBranch = stud.getBranch();
    String studentEmail = stud.getEmail();
    
    %>

<liferay-ui:icon-menu>

        <portlet:renderURL var="updateStudentUrl">
           <portlet:param name="jspPage" value="/html/new/updateStudent.jsp" />
           <portlet:param name="id" value="<%=id%>" />
           <portlet:param name="fname" value="<%=studentFname%>" />
           <portlet:param name="lname" value="<%=studentLname%>" />
           <portlet:param name="age" value="<%=studentAge%>" />
           <portlet:param name="branch" value="<%=studentBranch%>" />
           <portlet:param name="email" value="<%=studentEmail%>" />
       </portlet:renderURL>

       <liferay-ui:icon image="edit" message="Edit" url="<%=updateStudentUrl.toString() %>" /> 
      
</liferay-ui:icon-menu>