<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
    <%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
    <%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
    <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
    <%@page import="net.opentrends.training.service.StudentLocalServiceUtil"%>
    <%@page import="net.opentrends.training.model.Student"%>
    <%@page import="com.liferay.portal.kernel.util.WebKeys"%>
    <%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>

<portlet:defineObjects/>
<portlet:actionURL name="updateStudentAction" var="updateStudentActionUrl"/>

 <%
 
   /*  ResultRow results=(ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Student stud=(Student)results.getObject();
    
    String studentId=String.valueOf(stud.getStudentid());
    String studentFname = stud.getFname();
    String studentLname = stud.getLname();
    String studentAge = String.valueOf(stud.getAge());
    String studentBranch = stud.getBranch();
    String studentEmail = stud.getEmail();
   */
   
   String studentId = renderRequest.getParameter("id");
   String studentFname = renderRequest.getParameter("fname");
   String studentLname = renderRequest.getParameter("lname");
   String studentAge = renderRequest.getParameter("age");
   String studentBranch = renderRequest.getParameter("branch");
   String studentEmail = renderRequest.getParameter("email"); 
   
 %>
 <h4>Updating Student Details...............</h4>

 <aui:form action="<%=updateStudentActionUrl.toString()%>" method="post" name="updateStudentAction">
    <aui:input name="id" type="number" value="<%=Integer.parseInt(studentId) %>"></aui:input> 
    <aui:input name="fname" type="text" value="<%=studentFname %>"></aui:input> 
    <aui:input name="lname" type="text" value="<%=studentLname %>"></aui:input> 
    <aui:input name="age" type="number" value="<%=Integer.parseInt(studentAge) %>"></aui:input>
    <aui:input name="branch" type="text" value="<%=studentBranch %>"></aui:input> 
    <aui:input name="email" type="text" value="<%=studentEmail %>"></aui:input>
    <aui:input type="submit" value="Update" name="update"></aui:input>
 </aui:form>
