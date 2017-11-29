<%@page import="net.opentrends.training.service.StudentLocalServiceUtil"%>
<%@page import="net.opentrends.training.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List"%>
    <%@page import="com.liferay.portal.util.PortalUtil"%>
    <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
    <%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
    <%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
    <%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
    <%@page import="javax.portlet.PortletURL"%>
    <%@ page import="com.liferay.taglib.ui.SearchContainerTag" %>
     <%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>

<portlet:defineObjects />
<theme:defineObjects />

<h4>Search Container in Liferay</h4>
 
    
<% 
String currentURL = PortalUtil.getCurrentURL(request);
List<Student> studentList = StudentLocalServiceUtil.getStudents(-1, -1);
%>
<liferay-portlet:renderURL varImpl="iteratorURL">
       <portlet:param name="mvcPath" value="/html/new/searchStudent.jsp" />
</liferay-portlet:renderURL>

<%-- <liferay-portlet:actionURL var="portletActionURL" ></liferay-portlet:actionURL> --%>
<liferay-portlet:actionURL var="fileAttachmentActionURL" name="fileAttachmentAction">
      </liferay-portlet:actionURL>
<aui:form action="<%=fileAttachmentActionURL %>" method="POST" name="fileAttachmentAction" enctype="multipart/form-data">

 <liferay-ui:search-container var="searchContainer"  delta="10"  deltaConfigurable="true" iteratorURL="<%=iteratorURL %>" >

 <%-- <liferay-ui:search-container> --%>
   
    <liferay-ui:search-container-results  results="<%= ListUtil.subList(studentList, searchContainer.getStart(), searchContainer.getEnd()) %>" total="${studentList.size()}" />
          <liferay-ui:search-container-row className="net.opentrends.training.model.Student" keyProperty="id" modelVar="studentItem">
             <portlet:renderURL var="rowURL">
	            <portlet:param name="backURL" value="<%=currentURL %>" />
	            <portlet:param name="studentId" value="<%=String.valueOf(studentItem.getStudentid() )%>" />
	            <portlet:param name="mvcPath" value="/html/new/search.jsp"/>
             </portlet:renderURL>
             <liferay-portlet:renderURL var="updateStudent">
                  <portlet:param name="jspPage" value="/html/new/updateStudent.jsp" />
                  <portlet:param name="id" value="<%=String.valueOf(studentItem.getStudentid())%>"/>
                  <portlet:param name="fname" value="<%=studentItem.getFname()%>"/>
                  <portlet:param name="lname" value="<%=studentItem.getLname()%>"/>
                  <portlet:param name="age" value="<%=String.valueOf(studentItem.getAge())%>"/>
                  <portlet:param name="branch" value="<%=studentItem.getBranch()%>"/>
                  <portlet:param name="email" value="<%=studentItem.getEmail()%>"/>
                   <portlet:param name="backURL" value="<%=currentURL %>" />
            </liferay-portlet:renderURL>
             <liferay-portlet:actionURL var="deleteStudentUrl" name="deleteStudent">
                 <portlet:param name="id" value="<%=String.valueOf(studentItem.getStudentid())%>"/>
             </liferay-portlet:actionURL>
             
                 <liferay-ui:search-container-column-text name="id" value="<%=String.valueOf(studentItem.getStudentid() )%>"/>
                 <liferay-ui:search-container-column-text name="firstname" value="<%=studentItem.getFname() %>"/>
                 <liferay-ui:search-container-column-text name="lname" value="<%=studentItem.getLname() %>"/>
                 <liferay-ui:search-container-column-text name="age" value="<%=String.valueOf(studentItem.getAge()) %>"/>
                 <liferay-ui:search-container-column-text name="branch" value="<%=studentItem.getBranch() %>"/>
                 <liferay-ui:search-container-column-text name="email" value="<%=studentItem.getEmail()%>"/>
                 <liferay-ui:search-container-column-text href="${rowURL}" name="Detail" value="Click Here For Detail"/> 
                 <liferay-ui:search-container-column-text href="${updateStudent}" name="Edit" value="Edit"/>
                 <liferay-ui:search-container-column-text href="${deleteStudentUrl}" name="Delete" value="Delete"/>
                 
                 
                 <liferay-ui:search-container-column-jsp  path="/html/new/fileAttach.jsp" align="right"/>
                 <liferay-ui:search-container-column-jsp  path="/html/new/updateStudentUrl.jsp" align="right"/> 

          </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>


     <aui:button type="submit" name="AttachFile"></aui:button>
</aui:form>
    
    





   