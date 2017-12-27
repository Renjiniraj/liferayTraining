
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletMode"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="java.util.List"%>
<%@ page import="com.liferay.taglib.ui.SearchContainerTag" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@page import ="net.opentrends.training.model.Employee" %>
<%@page import ="net.opentrends.training.service.EmployeeLocalServiceUtil" %>
 <%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
 
 
<portlet:defineObjects />

<!-- Action URL  -->
<liferay-portlet:actionURL var="addEmployeeURL" name="addEmployee">
</liferay-portlet:actionURL>


<!-- Render URLs -->
<portlet:renderURL var="viewRenderURL">
 <portlet:param name="mvcPath" value="/html/friendlyurl/view.jsp"/>
</portlet:renderURL>
<%
List<Employee> employeesList = EmployeeLocalServiceUtil.getEmployees(-1, -1);
%>

<aui:form action="<%=addEmployeeURL.toString()%>" method="post" name="addEmployee" enctype="multipart/form-data">
   <aui:input name="name" > <aui:validator name="required" errorMessage="This field is required"/></aui:input>
   <aui:input name="age" ></aui:input> 
   <aui:input name="salary" ></aui:input>
   <aui:input name="unit" ></aui:input> 
   <aui:input type="file" class="multi" maxlength="10" name="photo" value="Upload Photo"/> 
   <aui:button href="<%= viewRenderURL%>" value="View"></aui:button>
   <aui:button type="submit" href="<%= addEmployeeURL%>" value="Add"></aui:button>
</aui:form>




<liferay-ui:search-container var="searchContainer"  delta="2"  deltaConfigurable="true" total="<%=employeesList.size() %>" >

 <%-- <liferay-ui:search-container> --%>
   
    <liferay-ui:search-container-results  results="<%= ListUtil.subList(employeesList, searchContainer.getStart(), searchContainer.getEnd()) %>" total="<%=employeesList.size() %>" />
          <liferay-ui:search-container-row className="net.opentrends.training.model.Employee" keyProperty="id" modelVar="empItem">
                 <liferay-ui:search-container-column-text name="id" value="<%=String.valueOf(empItem.getEmpId())%>"/>
                 <liferay-ui:search-container-column-text name="Employee" value="<%=empItem.getEmployeeName() %>"/>
          </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>

