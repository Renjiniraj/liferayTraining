<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="net.opentrends.training.service.StudentLocalServiceUtil"%>
    <%@page import="net.opentrends.training.model.Student"%>
    <%@page import="com.liferay.portal.kernel.util.WebKeys"%>
    <%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
    <%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
    <%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
    <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
    <%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<%-- 
    <%
    ResultRow results=(ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
   
    Student stud=(Student)results.getObject();
    String id=String.valueOf(stud.getStudentid());
    %> --%>
    
      <liferay-portlet:actionURL var="deleteStudentURL" name="deleteStudent">
      </liferay-portlet:actionURL>
      
   <aui:form action="<%=deleteStudentURL%>" method="POST" name="deleteStudent" enctype="multipart/form-data"> 
    <aui:row>
        <aui:column columnWidth="50">
            <input type="file" class="multi" maxlength="10" name="attachedFile"/>
        </aui:column>
    </aui:row>

   </aui:form>