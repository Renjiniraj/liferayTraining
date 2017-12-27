<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@page import="net.opentrends.training.service.permission.MarksPermission"%>
<%@page import="com.liferay.portal.security.permission.PermissionChecker"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
 <%@page import="com.liferay.portal.kernel.util.WebKeys"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<%
ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

PermissionChecker permissionChecker =  themeDisplay.getPermissionChecker();
%>

<portlet:actionURL name="addMarks" var="addMarks"/>
<h4>Enter Student Marks Details</h4>
<aui:form action="${addMarks}" method="POST">

<aui:input type="text" name="rollNo"></aui:input><br>
 <aui:input type="text" name="percentage"></aui:input><br>
<%-- <aui:button type="submit" name ="" value="Add"></aui:button> --%>



<c:if test='<%=MarksPermission.contains(permissionChecker,themeDisplay.getScopeGroupId(),"ADD_DEPARTMENT") %>'>  
<aui:button type="submit" name ="" value="Add"></aui:button>
</c:if>

<c:if test='<%=!MarksPermission.contains(permissionChecker,themeDisplay.getScopeGroupId(),"ADD_DEPARTMENT") %>'>      
  <aui:button type="submit" name ="" value="Cancel" url=""></aui:button>
</c:if>

</aui:form>