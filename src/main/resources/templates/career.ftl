<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Chat</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
<h2 class="hello-title">My career</h2>
<script src="/js/main.js"></script>
<a href="level">My level</a>
<a href="tasks">My tasks</a>
<a href="chat">Chat</a>
<a href="career">My career</a>
<div style="width:60%">
    <div style="margin:20px; float: left">
        <h3>Мои навыки</h3>
        <ul>
            <li>${careerModel.getUser().getSkills(0)}</li>
            <li>${careerModel.getUser().getSkills(1)}</li>
            <li>${careerModel.getUser().getSkills(2)}</li>
        </ul>
    </div>
    <div style="margin:20px;  float: right">
        <h3>Вакансии</h3>
        <ul>
            <li><a href="vacancy?id=${careerModel.getVacancy(0).getVacancyId()}">${careerModel.getVacancy(0).getCompanyName()} ${careerModel.getVacancy(0).getPositionName()} ${careerModel.getVacancy(0).getSalary()} руб/мес</a></li>
            <li><a href="vacancy?id=${careerModel.getVacancy(1).getVacancyId()}">${careerModel.getVacancy(1).getCompanyName()} ${careerModel.getVacancy(1).getPositionName()} ${careerModel.getVacancy(1).getSalary()} руб/мес</a></li>
            <li><a href="vacancy?id=${careerModel.getVacancy(2).getVacancyId()}">${careerModel.getVacancy(2).getCompanyName()} ${careerModel.getVacancy(2).getPositionName()} ${careerModel.getVacancy(2).getSalary()} руб/мес</a></li>
            <li><a href="vacancy?id=${careerModel.getVacancy(3).getVacancyId()}">${careerModel.getVacancy(3).getCompanyName()} ${careerModel.getVacancy(3).getPositionName()} ${careerModel.getVacancy(3).getSalary()} руб/мес</a></li>
        </ul>
    </div>
</div>
</body>
</html>