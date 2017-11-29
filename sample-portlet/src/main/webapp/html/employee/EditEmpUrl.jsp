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


 <%
   ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
   String id = renderRequest.getParameter("id");
   
      Employee employee = EmployeeLocalServiceUtil.getEmployee(Integer.parseInt(id));
      long fileEntryId = employee.getFileEntryId();
	  String imageUrl = StringPool.BLANK;
    if(Validator.isNotNull(fileEntryId)) {
    	 FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(fileEntryId);
   	     FileVersion fileVersion = (FileVersion) fileEntry.getLatestFileVersion();
   	     imageUrl = DLUtil.getPreviewURL(fileEntry, fileVersion, themeDisplay, StringPool.BLANK, false, true); 
    }
	    
 %>
 <h4>Updating Student Details...............</h4>
 <portlet:actionURL name="editEmpAction" var="editEmpActionUrl">
 </portlet:actionURL>

 <aui:form action="<%=editEmpActionUrl.toString()%>" method="post" name="editEmpAction" enctype="multipart/form-data">
   <div>
     <div>
      
       <aui:input name="id" type="number" value="<%=employee.getEmpId()%>"></aui:input> 
       <aui:input name="name" type="text" value="<%=employee.getEmployeeName()%>"></aui:input> 
       <aui:input name="age" type="text" value="<%=employee.getAge() %>"></aui:input> 
       <aui:input name="salary" type="number" value="<%=employee.getSalary()%>"></aui:input>
       <aui:input name="unit" type="text" value="<%=employee.getUnit() %>"></aui:input> 
     </div>
     <div>
          <img src="<%=imageUrl%>" alt="photo" height="100" width="100">
         <aui:input type="file" class="multi" maxlength="10" name="Photo" value="Upload Photo"/>
      </div>
    <div>
       <aui:button-row>
          <aui:button type="submit" value="Update" name="update"></aui:button>
          <liferay-portlet:renderURL var="cancelUrl">
              <portlet:param name="jspPage" value="/html/employee/view.jsp" /> 
          </liferay-portlet:renderURL>
          <aui:button  href="<%=cancelUrl%>" value="Cancel" name="cancel"></aui:button>
      </aui:button-row>
    </div>
   </div>  
 </aui:form>
