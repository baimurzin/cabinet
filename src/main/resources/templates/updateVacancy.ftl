<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create user page</title>
</head>
<body>
        <h1>ChangeValuesOfThisVacancy</h1>
<form name="user" action="/updateVacancy" method="post">
    <p>companyName</p>
    <input title="companyName" type="text" name="companyName" value="${vacancy.companyName}">
    <p>positionName</p>
    <input title="positionName" type="text" name="positionName" value="${vacancy.positionName}">
    <p>currencyId</p>
    <input title="currencyId" type="text" name="currencyId" value="${vacancy.currencyId}">
    <p>vacancyDescription</p>
    <input title="vacancyDescription" type="text" name="vacancyDescription" value="${vacancy.vacancyDescription}">
    <p>salary</p>
    <input title="salary" type="text" name="salary" value="${vacancy.salary}">
    <br><input id="vacancyId" type="text" name="vacancyId" value="${vacancy.vacancyId}" style="display: none" readonly>
    <input type="submit" value="OK">
</form>

</body>
</html>