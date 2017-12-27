<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@page import="net.opentrends.training.service.permission.DepartmentPermission"%>
<%@page import="com.liferay.portal.security.permission.PermissionChecker"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
 <%@page import="com.liferay.portal.kernel.util.WebKeys"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 


<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />

<portlet:actionURL name="addDepartment" var="addDepartment"/>

<%
ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

PermissionChecker permissionChecker =  themeDisplay.getPermissionChecker();
%>
<h4>Enter Student Department Details</h4>

<aui:form action="${addDepartment}" method="POST">
  <aui:input type="text" name="departmentName"></aui:input><br>
<%-- <aui:button type="submit" name ="" value="Add"></aui:button> --%>


<c:if test='<%=DepartmentPermission.contains(permissionChecker,themeDisplay.getScopeGroupId(),"ADD_DEPARTMENT") %>'>  
  <aui:button type="submit" name ="" value="Add"></aui:button>  
</c:if>

<c:if test='<%=!DepartmentPermission.contains(permissionChecker,themeDisplay.getScopeGroupId(),"ADD_DEPARTMENT") %>'>      
  <aui:button type="submit" name ="" value="Cancel" url=""></aui:button>
</c:if>

</aui:form>