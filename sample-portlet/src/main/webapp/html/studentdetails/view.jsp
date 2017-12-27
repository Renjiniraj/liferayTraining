
<%@page import="net.opentrends.training.service.permission.StudentEditPermission"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="net.opentrends.training.service.StudentLocalServiceUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib prefix="liferay-util" uri="http://liferay.com/tld/util" %>


<%@ page import="net.opentrends.training.model.Student" %>
<%@ page import="net.opentrends.training.model.Department" %>

<%@ page import="net.opentrends.training.model.Marks" %>

<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.liferay.portal.kernel.json.JSONObject" %>
<%@ page import="net.opentrends.training.model.impl.StudentImpl" %>
<%@ page import="com.liferay.portal.kernel.json.JSONFactoryUtil" %>
<%@ page import=" net.opentrends.training.model.impl.StudentImpl" %>
<%@ page import=" net.opentrends.training.model.impl.DepartmentImpl" %>

<%@ page import=" net.opentrends.training.model.impl.MarksImpl" %>



<portlet:defineObjects />

<liferay-ui:tabs names="Student,Department,Marks" refresh="false" value="${selectedTab}">
    <liferay-ui:section>
        <%@ include file="student.jsp" %>
    </liferay-ui:section>
    <liferay-ui:section>
        <%@ include file="department.jsp" %>
    </liferay-ui:section>
    <liferay-ui:section>
        <%@ include file="marks.jsp" %>
    </liferay-ui:section>
</liferay-ui:tabs>



<%
final ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY) ;
List<Object[]> studentsList = StudentLocalServiceUtil.findByGroupId(themeDisplay.getScopeGroupId(), 0, 10);
PermissionChecker permissionCheck =  themeDisplay.getPermissionChecker();
long groupid = themeDisplay.getScopeGroupId();
%>

 <body>
 <table class="studTable">
    <tr>
       <td class="studTable">StudentName</td>
       <td class="studTable">DepartmentName</td>
       <td class="studTable">RollNo</td>
       <td class="studTable">Percentage</td>
    </tr>
     <% for(Object[] studentObj : studentsList) {%>
     
      <tr>
        <td class="studTable"><%=studentObj[0].toString()%></td>
       <td class="studTable"><%=studentObj[1].toString()%></td>
       <td class="studTable"><%=Integer.parseInt(studentObj[2].toString())%></td>
       <td class="studTable"><%=Integer.parseInt(studentObj[3].toString()) %></td>
       
       <liferay-portlet:renderURL var="updateStudent">
          <portlet:param name="jspPage" value="/html/studentdetails/updateStudent.jsp" />
        
          <portlet:param name="studentName" value="<%=studentObj[0].toString()%>"/>
          <portlet:param name="deptName" value="<%=studentObj[1].toString()%>"/>
          <portlet:param name="rollno" value="<%=studentObj[2].toString()%>"/>
          <portlet:param name="percentage" value="<%=studentObj[3].toString() %>"/>
          
          <portlet:param name="studId" value="<%=studentObj[4].toString() %>"/>
          <portlet:param name="depId" value="<%=studentObj[5].toString() %>"/>
          <portlet:param name="markId" value="<%=studentObj[6].toString() %>"/>
        </liferay-portlet:renderURL>
        
        <% long studentId = Long.parseLong(studentObj[4].toString()); %>
        
        <c:if test='<%=StudentEditPermission.contains(permissionCheck,studentId,"UPDATE",groupid) %>'>    
         <td class="studTableEdit"><aui:button name="" value="Update" onClick="<%=updateStudent%>"/></td>
       </c:if>
         
          <liferay-portlet:actionURL var="deleteStudentUrl" name="deleteStudent"></liferay-portlet:actionURL>
          
           <c:if test='<%=StudentEditPermission.contains(permissionCheck,studentId,"DELETE",groupid) %>'>    
            <aui:form name="deleteStudent" action="<%=deleteStudentUrl %>" method="post">
                <aui:input name="studId" type="hidden" value="<%=studentObj[4].toString()%>"></aui:input>
                <td><aui:button name="" value="Delete" type="submit"/></td>
            </aui:form>          
            </c:if>
          
      </tr>
     <%} %> 
    </table>
</body>




