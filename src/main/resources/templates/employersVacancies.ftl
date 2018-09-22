
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>vacancyModel list</h1>
<table>
    <tr>
        <th>vacancyId</th>
        <th>companyName</th>
        <th>positionName</th>
        <th>salary</th>
        <th>currencyId</th>
        <th>vacancy_description</th>
    </tr>
<#list vacancies as vacancyModel>
    <tr>
        <td><a href="/vacancyModel/${vacancyModel.vacancyId}">${vacancyModel.vacancyId}</a></td>
        <td>${vacancyModel.vacancyId}</td>
        <td>${vacancyModel.companyName}</td>
        <td>${vacancyModel.positionName}</td>
        <td>${vacancyModel.salary}</td>
        <td>${vacancyModel.currencyId}</td>
        <td>${vacancyModel.vacancyDescription}</td>
        <td><a href="/removeVacancy/${vacancyModel.vacancyId}">Remove</a></td>
        <td><a href="/updateVacancy/${vacancyModel.vacancyId}">Update</a></td>
    </tr>
</#list>
</table>

<a href="/addVacancy">Add new vacancyModel</a>
</body>
</html>