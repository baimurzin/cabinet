<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Vacancy</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
<h2 class="hello-title">Here is the vacancyModel page</h2>
<a href="/profile">My profile</a>
<a href="/level">My level</a>
<a href="/tasks">My tasks</a>
<a href="/chat">Chat</a>
<a href="/career">My career</a>
<div style="margin:20px;">

    <h2>${vacancyModel.getCompanyName()}</h2>
    <h3>${vacancyModel.getPositionName()}</h3>
    <h3>${vacancyModel.getSalary()} руб/мес</h3>
    <p>${vacancyModel.getVacancyDescription()}</p>
</div>
<script src="/js/main.js"></script>
</body>
</html>