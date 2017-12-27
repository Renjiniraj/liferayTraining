package net.opentrends.training;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ResourceLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

import net.opentrends.training.model.Department;
import net.opentrends.training.model.Marks;
import net.opentrends.training.model.Student;
import net.opentrends.training.model.student;
import net.opentrends.training.model.impl.DepartmentImpl;
import net.opentrends.training.model.impl.MarksImpl;
import net.opentrends.training.model.impl.StudentImpl;
import net.opentrends.training.service.DepartmentLocalServiceUtil;
import net.opentrends.training.service.MarksLocalServiceUtil;
import net.opentrends.training.service.StudentLocalServiceUtil;

/**
 * Portlet implementation class StudentDetailsPortlet
 */
public class StudentDetailsPortlet extends MVCPortlet {
	private static Log _log = LogFactoryUtil.getLog(student.class);

	
	public void addStudent(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException, PortletException, SystemException {
		final ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY) ;
 
		long studentId = CounterLocalServiceUtil.increment(Student.class.getName());
		System.out.println("studentId : - "+studentId);
        String studentName =  ParamUtil.getString(actionRequest, "studentName");
        long departmentId = ParamUtil.getLong(actionRequest, "departmentId");
        int rollNo = ParamUtil.getInteger(actionRequest, "rollId");
        long userId = themeDisplay.getUserId();
        long groupId = themeDisplay.getScopeGroupId();
        
       try {
    	   
    	   Student stud = new StudentImpl();
    	   if(Validator.isNotNull(studentId)) {
    		   stud.setStudentid(studentId);  
    	   }
           if(Validator.isNotNull(studentName)) {
        	   stud.setName(studentName);
           }
           if(Validator.isNotNull(departmentId)) {
        	   stud.setDept_id(departmentId);
           }
           if(Validator.isNotNull(rollNo)) {
        	   stud.setRollNo(rollNo);
           }
           if(Validator.isNotNull(userId)) {
        	   stud.setUserId(userId);
           }
           if(Validator.isNotNull(groupId)) {
        	   stud.setGroupId(groupId);
           }
		ResourceLocalServiceUtil.addResources(themeDisplay.getCompanyId(), themeDisplay.getScopeGroupId(), themeDisplay.getUserId(), Student.class.getName(), stud.getStudentid(), false, true, true);
		Student student = StudentLocalServiceUtil.addStudent(stud);
           System.out.println("stud : - "+stud);
           System.out.println("studList ---------------------------------->>   "+student);

       } catch (Exception e) {
    	   _log.error(e);
	}

actionRequest.setAttribute("selectedTab", "Student");
}

     public void addDepartment(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException, PortletException, SystemException {
  		final ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY) ;

 		long depatId = CounterLocalServiceUtil.increment(Department.class.getName());
        String departmenttName =  ParamUtil.getString(actionRequest, "departmentName");
        
        try {
        	Department department = new DepartmentImpl();
        	
        	if(Validator.isNotNull(depatId)) {
        		department.setDepartmentid(depatId);
        	}
        	if(Validator.isNotNull(departmenttName)) {
        		department.setDeptName(departmenttName);
        	}
    		ResourceLocalServiceUtil.addResources(themeDisplay.getCompanyId(), themeDisplay.getScopeGroupId(), themeDisplay.getUserId(), Department.class.getName(), department.getDepartmentid(), false, true, true);

        	DepartmentLocalServiceUtil.addDepartment(department);
        	System.out.println("department : -"+department);
        } catch (Exception e) {
           _log.error(e);		}


       actionRequest.setAttribute("selectedTab", "Department");
     }
     
     public void addMarks(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException, PortletException, SystemException {
 		final ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY) ;

    	long id = CounterLocalServiceUtil.increment(Marks.class.getName());
  		int rollNo = ParamUtil.getInteger(actionRequest, "rollNo");
        int percentage = ParamUtil.getInteger(actionRequest, "percentage");
        long userId = themeDisplay.getUserId();
        long groupId = themeDisplay.getScopeGroupId();
        
         try {
        	 Marks marks = new MarksImpl();
         	
         	if(Validator.isNotNull(id)) {
         		marks.setMarksid(id);
         	}
         	if(Validator.isNotNull(rollNo)){
         		marks.setRollNo(rollNo);
         	}
         	if(Validator.isNotNull(percentage)){
         		marks.setPercentage(percentage);
         	}
         	if(Validator.isNotNull(userId)){
         		marks.setUserId(userId);
         	}
         	if(Validator.isNotNull(groupId)){
         		marks.setGroupId(groupId);
         	}
    		ResourceLocalServiceUtil.addResources(themeDisplay.getCompanyId(), themeDisplay.getScopeGroupId(), themeDisplay.getUserId(), Marks.class.getName(), marks.getMarksid(), false, true, true);

         	MarksLocalServiceUtil.addMarks(marks);
         	System.out.println("marks : -"+marks);
         } catch (Exception e) {
            _log.error(e);		}


        actionRequest.setAttribute("selectedTab", "Marks");
      }

     public void updateStudentAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		 
		 String studName = ParamUtil.getString(actionRequest, "studentName");
		 String deptName = ParamUtil.getString(actionRequest, "deptName");
		 int rollno = ParamUtil.getInteger(actionRequest, "rollno");
		 int percentage = ParamUtil.getInteger(actionRequest, "percentage");
		 
		 String studId = actionRequest.getParameter("studId");

		 String depId =  actionRequest.getParameter("depId");
		 String markId =  actionRequest.getParameter("markId");
		 
		 Student student = StudentLocalServiceUtil.getStudent(Integer.parseInt(studId));
		 if(Validator.isNotNull(studName)) {
			 student.setName(studName);
		 }
		 if(Validator.isNotNull(rollno)) {
			 student.setRollNo(rollno);
		 }
		 
		 Department department = DepartmentLocalServiceUtil.getDepartment(Integer.parseInt(depId));
		 if(Validator.isNotNull(deptName)) {
			 department.setDeptName(deptName);
		 }
		  
		 Marks marks = MarksLocalServiceUtil.getMarks(Integer.parseInt(markId));
		 if(Validator.isNotNull(percentage)) {
			 marks.setPercentage(percentage);
		 }
		 
		 StudentLocalServiceUtil.updateStudent(student);
		 DepartmentLocalServiceUtil.updateDepartment(department);
		 MarksLocalServiceUtil.updateMarks(marks);
		 
		actionResponse.setRenderParameter("mvcPath",  "/html/studentdetails/view.jsp");
		 
	 } 
     
     
	 public void deleteStudent(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
	 		final ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY) ;

		 long stidentId = ParamUtil.getLong(actionRequest, "studId");
		 Student student = StudentLocalServiceUtil.deleteStudent(stidentId);
		
		 
		 actionResponse.setRenderParameter("mvcPath", "/html/studentdetails/view.jsp");
	 }

}
