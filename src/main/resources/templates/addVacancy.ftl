<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create user page</title>
</head>
<body>
<h1>AddNewOneVacancy</h1>
<form name="user" action="/addVacancy" method="post">
    <p>companyName</p>
    <input title="companyName" type="text" name="companyName">
    <p>positionName</p>
    <input title="positionName" type="text" name="positionName">
    <p>currencyId</p>
    <input title="currencyId" type="text" name="currencyId">
    <p>vacancyDescription</p>
    <input title="vacancyDescription" type="text" name="vacancyDescription">
    <p>salary</p>
    <input title="salary" type="text" name="salary">
    <br><input id="user_model" type="text" name="user_model" value="${creator_id}" style="display: none" readonly>

    <input type="submit" value="OK">
</form>

</body>
</html>