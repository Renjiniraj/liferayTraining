
<%@page import="net.opentrends.training.service.StudentLocalServiceUtil"%>
<%@page import="net.opentrends.training.model.Student"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<portlet:defineObjects />



 <%--   <%
 ResultRow resulrRow=(ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
   Student img= resulrRow.getObject();
   String prk=String.valueOf(img.getPrimaryKey());
%>
 --%>
<%
String redirect = ParamUtil.getString(request, "backURL");
int studentId = ParamUtil.getInteger(request, "studentId");
Student student = StudentLocalServiceUtil.getStudent(studentId);
request.setAttribute("student", student);
%>

<h3>Student Information</h3>
<h4>Name : ${student.fname}  ${student.lname} </h4>
<h4>Age :${student.age}</h4>
<h4>Branch :${student.branch}</h4>
<h4>Email :${student.email}</h4>
<br><br>
<a href="<%= redirect %>">Back to All</a>