
<%@page import="net.opentrends.training.service.permission.StudentPermission"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@page import="com.liferay.portal.security.permission.PermissionChecker"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
 <%@page import="com.liferay.portal.kernel.util.WebKeys"%>
 <%@page import="java.util.List"%>
 <%@page import="net.opentrends.training.service.StudentLocalServiceUtil"%>
 <%@page import ="net.opentrends.training.model.student" %>
 <%@page import="com.liferay.portal.theme.ThemeDisplay"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@page import="com.liferay.portal.theme.PortletDisplay"%>
 <%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
 <theme:defineObjects />
 
 

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />

<portlet:actionURL name="addStudent" var="addStudent"/>
<%
List<Object[]> studentsList = StudentLocalServiceUtil.findByGroupId(themeDisplay.getScopeGroupId(), 0, 10);

PermissionChecker permissionCheck =  themeDisplay.getPermissionChecker();
long groupid = themeDisplay.getScopeGroupId();
%>


<h4>Enter Student  Details</h4>


<aui:form action="${addStudent}" method="POST">
 <aui:fieldset label="Add Student">
		<aui:layout>
			<aui:column>
   <aui:input type="text" name="studentName"></aui:input><br>
   <aui:input type="text" name="departmentId"></aui:input><br>
   <aui:input type="text" name="rollId"></aui:input><br>
   
  
<c:if test='<%=StudentPermission.contains(permissionCheck,groupid,"ADD_STUDENT") %>'>    
  <aui:button type="submit" name ="" value="Add" url="<%=addStudent.toString() %>"></aui:button>
</c:if>

<c:if test='<%=!StudentPermission.contains(permissionCheck,groupid,"ADD_STUDENT") %>'>      
  <aui:button type="submit" name ="" value="Cancel" url=""></aui:button>
</c:if>
</aui:column>
</aui:layout>
</aui:fieldset>
</aui:form> 


