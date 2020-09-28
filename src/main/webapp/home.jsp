<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="emp" commandName="employee">
Enter Eno:<form:input path="eno" />
<form:errors path="eno"/><br/>
Enter Name:<form:input path="name"/>
<form:errors path="name"/><br/>
Enter Salary:<form:input path="salary"/>
<form:errors path="salary"/><br/>
<input type="submit" value="store"/>


</form:form>