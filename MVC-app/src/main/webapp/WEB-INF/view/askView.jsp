<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h1>Please provide your details below</h1>

<form:form action="showDetails" modelAttribute="employee">

    Name<form:input path="name"/>
    <br>
    Surname<form:input path="surname"/>
    <br>
    Salary<form:input path="salary"/>
    <br>
    Department<form:select path="department">
    <form:options items="${employee.departments}"/>
    </form:select>
    <br>
    Which car do you have?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>

    <input type="submit" value="OK">

</form:form>

</body>
</html>