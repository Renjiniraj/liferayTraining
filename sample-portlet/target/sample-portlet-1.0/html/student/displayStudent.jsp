<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List"%>
    <%@page import="net.opentrends.training.model.Student"%>
    <%@page import="net.opentrends.training.service.StudentLocalServiceUtil"%>
    <%@page import="javax.portlet.PortletURL"%>
    <%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
    <%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
    <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
    <portlet:defineObjects />
    <liferay-theme:defineObjects />

<% List<Student> students = StudentLocalServiceUtil.getStudents(-1, -1); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Displaying Student Details ...</title>
</head>
<body>
  <table class="studTable">
    <tr>
       <td class="studTable">ID</td>
       <td class="studTable">FirstName</td>
       <td class="studTable">LastName</td>
       <td class="studTable">Age</td>
       <td class="studTable">Branch</td>
       <td class="studTable">Email</td>
       <td class="studTableEdit">Edit</td>
       <td class="studTableDel">Delete</td>
    </tr>
      <% for(Student list:students) {%>
      <tr>
        <td class="studTable"><%=list.getStudentid()%></td>
       <td class="studTable"><%=list.getFname() %></td>
       <td class="studTable"><%=list.getLname() %></td>
       <td class="studTable"><%=list.getAge() %></td>
       <td class="studTable"><%=list.getBranch() %></td>
       <td class="studTable"><%=list.getEmail() %></td>
      
      
        <liferay-portlet:renderURL var="updateStudent">
          <portlet:param name="jspPage" value="/html/student/updateStudent.jsp" />
          <portlet:param name="id" value="<%=String.valueOf(list.getStudentid())%>"/>
          <portlet:param name="fname" value="<%=list.getFname()%>"/>
          <portlet:param name="lname" value="<%=list.getLname()%>"/>
          <portlet:param name="age" value="<%=String.valueOf(list.getAge())%>"/>
          <portlet:param name="branch" value="<%=list.getBranch()%>"/>
          <portlet:param name="email" value="<%=list.getEmail()%>"/>
        </liferay-portlet:renderURL>
         <td class="studTableEdit">
       <aui:button name="" value="Update" onClick="<%=updateStudent%>"/></td>
       
      
       
       <liferay-portlet:actionURL var="deleteStudentUrl" name="deleteStudent"></liferay-portlet:actionURL>
       <aui:form name="deleteStudent" action="<%=deleteStudentUrl %>" method="post">
           <aui:input name="id" type="hidden" value="<%=String.valueOf(list.getStudentid())%>"></aui:input>
            <td><aui:button name="" value="Delete" type="submit"/></td>
       </aui:form>
       
       </tr>
      <%} %>
  </table>
 
 
</body>
</html>