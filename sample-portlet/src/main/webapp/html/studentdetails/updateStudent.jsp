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


 <%
 
   String studentName = renderRequest.getParameter("studentName");
   String deptName = renderRequest.getParameter("deptName");
   String rollno = renderRequest.getParameter("rollno");
   String percentage = renderRequest.getParameter("percentage");
   
   String studId = renderRequest.getParameter("studId");
   String deptId = renderRequest.getParameter("depId");
   String markId = renderRequest.getParameter("markId");


   
 %>
 
     <portlet:actionURL name="updateStudentAction" var="updateStudentActionUrl">
          <portlet:param name="studId" value="<%=studId %>"/>
          <portlet:param name="depId" value="<%=deptId%>"/>
          <portlet:param name="markId" value="<%=markId%>"/>
     </portlet:actionURL>
 
 <h4>Updating Student Details...............</h4>

 <aui:form action="<%=updateStudentActionUrl.toString()%>" method="post" name="updateStudentAction">
    <aui:input name="studentName" type="text" value="<%=studentName %>"></aui:input> 
    <aui:input name="deptName" type="text" value="<%=deptName %>"></aui:input> 
    <aui:input name="rollno" type="number" value="<%=Integer.parseInt(rollno) %>"></aui:input>
    <aui:input name="percentage" type="number" value="<%=Integer.parseInt(percentage)  %>"></aui:input> 
    
        <aui:input type="submit" value="Update" name="update"></aui:input>
 </aui:form>
