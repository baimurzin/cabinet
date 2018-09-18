<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Vacancies</title>
</head>
<body>
<h1>Vacancies</h1>
<table>
    <tr>
        <th>vacancyId</th>
        <th>companyName</th>
        <th>positionName</th>
        <th>salary</th>
        <th>currencyId</th>
        <th>vacancy_description</th>

    </tr>
<#list vacancies as vacancy>
    <tr>
        <td>${vacancy.vacancyId}</td>
        <td>${vacancy.companyName}</td>
        <td>${vacancy.positionName}</td>
        <td>${vacancy.salary}</td>
        <td>${vacancy.currencyId}</td>
        <td>${vacancy.vacancyDescription}</td>

    </tr>
</#list>
</table>
</body>
</html>