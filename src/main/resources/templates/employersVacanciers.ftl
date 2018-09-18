
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>vacancy list</h1>
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
        <td><a href="/vacancy/${vacancy.vacancyId}">${vacancy.vacancyId}</a></td>
        <td>${vacancy.vacancyId}</td>
        <td>${vacancy.companyName}</td>
        <td>${vacancy.positionName}</td>
        <td>${vacancy.salary}</td>
        <td>${vacancy.currencyId}</td>
        <td>${vacancy.vacancyDescription}</td>
        <td><a href="/removeVacancy/${vacancy.vacancyId}">Remove</a></td>
        <td><a href="/updateVacancy/${vacancy.vacancyId}">Update</a></td>
    </tr>
</#list>
</table>

<a href="/addVacancy">Add new vacancy</a>
</body>
</html>