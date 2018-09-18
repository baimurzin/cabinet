<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Chat</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
<h2 class="hello-title">My career</h2>
<a href="profile">My profile</a>
<a href="level">My level</a>
<a href="tasks">My tasks</a>
<a href="chat">Chat</a>
<a href="career">My career</a>
<div style="width:60%">
    <div style="margin:20px; float: left">
        <h3>Мои навыки</h3>
        <ul>
        <#list careerModel.getUser().getSkills() as skill>
            <li>${skill}</li>
        </#list>
        </ul>
    </div>
    <div style="margin:20px;  float: right">
        <h3>Вакансии</h3>
        <ul>
        <#list careerModel.getVacancy() as vacancy>
            <li><a href="vacancy/${vacancy.getVacancyId()}">${vacancy.getCompanyName()} ${vacancy.getPositionName()} ${vacancy.getSalary()} руб/мес</a></li>
        </#list>
        </ul>
    </div>
</div>
<script src="/js/main.js"></script>
</body>
</html>