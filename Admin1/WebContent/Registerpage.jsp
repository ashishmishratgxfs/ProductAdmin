<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>registration page</title>
</head>
<body>
<form method = "post" action ="Register">

Emp-id : <input type = "number" name = "Empid"/>
<p> </p>
Emp-name : <input type = "text" name ="Empname"/>
<p> </p>
DeptName :<select name="dropdownvalue"> 
<option value ="Admin"> Admin </option>
<option value ="Cashier"> Cashier </option>

</select>
<p> </p>
DateOfJoining :<input type = "date" name = "DOJ"/>
<p> </p>
Expiredate :<input type = "date" name = "DOE" />
<p> </p>
Password : <input type = "password" name = "Password" />
<p> </p>

<input type ="submit" value="submit" />

</form>
<form method = "get" action ="Register">
<input type ="submit" value="Login" />

</form>
</body>
</html>