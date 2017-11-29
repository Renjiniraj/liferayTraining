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
    <%@page import="javax.portlet.PortletURL"%>
     <%@page import="com.liferay.portal.theme.ThemeDisplay"%>
    <%@page import="com.liferay.portal.kernel.util.StringPool"%>
    <%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
    <%@page import="com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil"%>
    <%@page import="com.liferay.portal.kernel.repository.model.FileVersion"%>
    <%@page import="com.liferay.portlet.documentlibrary.util.DLUtil"%>
    <%@page import="net.opentrends.training.model.Employee"%>
    <%@page import="java.util.List"%>
    <%@page import ="net.opentrends.training.service.EmployeeLocalServiceUtil" %>
     <%@page import ="com.liferay.portal.kernel.util.Validator" %>
    

<portlet:defineObjects/>
<portlet:actionURL name="updateEmpAction" var="updateEmpActionUrl"/>

 <%
 ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

 String id = renderRequest.getParameter("id");
   String name = renderRequest.getParameter("name");
   String age = renderRequest.getParameter("age");
   String salary = renderRequest.getParameter("salary");
   String unit = renderRequest.getParameter("unit");
   String fileEntryId = renderRequest.getParameter("fileEntryId");
   
      Employee employee = EmployeeLocalServiceUtil.getEmployee(Integer.parseInt(id));
	  String imageUrl = StringPool.BLANK;
   // if(employee.getFileEntryId()>0) {
    if(Validator.isNotNull(employee.getFileEntryId())) {
    	 FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(Integer.parseInt(fileEntryId));
   	     FileVersion fileVersion = (FileVersion) fileEntry.getLatestFileVersion();
   	     imageUrl = DLUtil.getPreviewURL(fileEntry, fileVersion, themeDisplay, StringPool.BLANK, false, true); 
   	     // out.println("imageUrl  ; "+imageUrl);
   	 
    }
	 
	
   
 %>
 <h4>Updating Student Details...............</h4>

 <aui:form action="<%=updateEmpActionUrl.toString()%>" method="post" name="updateEmpAction">
   
    <aui:input name="id" type="number" value="<%=id%>"></aui:input> 
    <aui:input name="name" type="text" value="<%=name%>"></aui:input> 
    <aui:input name="age" type="text" value="<%=age %>"></aui:input> 
    <aui:input name="salary" type="number" value="<%=salary%>"></aui:input>
    <aui:input name="unit" type="text" value="<%=unit %>"></aui:input> 
    <img src="<%=imageUrl%>" alt="Photo" height="100" width="100">
    <div>
    <aui:button-row>
    <aui:button type="submit" value="Update" name="update"></aui:button>
      <liferay-portlet:renderURL var="cancelUrl">
         <portlet:param name="jspPage" value="/html/employee/view.jsp" /> 
      </liferay-portlet:renderURL>
     <aui:button  href="${cancelUrl}" value="Cancel" name="cancel"></aui:button>
    </aui:button-row>
          
    </div>
 </aui:form>
