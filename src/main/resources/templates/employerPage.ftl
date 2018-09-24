
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<#assign creator_id = 0 >
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
        <td>${vacancyModel.vacancyId}</td>
        <td>${vacancyModel.vacancyId}</td>
        <td>${vacancyModel.companyName}</td>
        <td>${vacancyModel.positionName}</td>
        <td>${vacancyModel.salary}</td>
        <td>${vacancyModel.currencyId}</td>
        <td>${vacancyModel.vacancyDescription}</td>
        <td><a href="/removeVacancy/${vacancyModel.vacancyId}/${vacancyModel.user_model.id}">Remove</a></td>
        <td><a href="/updateVacancy/${vacancyModel.vacancyId}">Update</a></td>
    <#assign creator_id=vacancyModel.user_model.id>
    </tr>
</#list>
</table>

<a href="/addVacancy/${creator_id}">Add new vacancyModel</a>
</body>
</html>
