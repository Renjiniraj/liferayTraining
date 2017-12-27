
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

<liferay-ui:success key="success-key" message="Successfully" />
<liferay-ui:error key="error-key" message="Error - Delete operation only for Admin"/>

<%
List<Employee> employeesList = EmployeeLocalServiceUtil.getEmployees(-1, -1);
%>
<portlet:actionURL name="addEmpAction" var="addEmpActionURL"/>
<h4>Add Employee Details Form here !</h4>
<br />
<br />
<aui:form action="<%=addEmpActionURL.toString()%>" method="post" name="addEmpAction" enctype="multipart/form-data">
   <aui:input name="name" > <aui:validator name="required" errorMessage="This field is required"/></aui:input>
   <aui:input name="age" ></aui:input> 
   <aui:input name="salary" ></aui:input>
   <aui:input name="unit" ></aui:input> 
   <aui:input type="file" class="multi" maxlength="10" name="photo" value="Upload Photo"/> 
   <aui:button type="submit" name="" value="Submit"></aui:button>
</aui:form>
<%-- 
  <portlet:resourceURL var="resourceUrl">
            <portlet:param name="param1" value=""/>
       </portlet:resourceURL>
  <a href="${resourceUrl}">Export Details into ExcelSheet</a>
 --%>
<liferay-portlet:renderURL varImpl="iteratorURL">
       <portlet:param name="mvcPath" value="/html/employee/view.jsp" />
</liferay-portlet:renderURL>

<liferay-ui:search-container var="searchContainer"  delta="2"  deltaConfigurable="true" total="<%=employeesList.size() %>" >

 <%-- <liferay-ui:search-container> --%>
   
    <liferay-ui:search-container-results  results="<%= ListUtil.subList(employeesList, searchContainer.getStart(), searchContainer.getEnd()) %>" total="<%=employeesList.size() %>" />
          <liferay-ui:search-container-row className="net.opentrends.training.model.Employee" keyProperty="id" modelVar="empItem">
                 <liferay-ui:search-container-column-text name="id" value="<%=String.valueOf(empItem.getEmpId())%>"/>
                 <liferay-ui:search-container-column-text name="Employee" value="<%=empItem.getEmployeeName() %>"/>
                 <liferay-ui:search-container-column-jsp  path="/html/employee/EditEmployee.jsp" align="right"/> 
          </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>