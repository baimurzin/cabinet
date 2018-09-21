<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Task</title>
</head>
<body>
<h2 class="hello-title">Current task</h2>
<script src="/js/main.js"></script>
<a href="/profile">My profile</a>
<a href="/level">My level</a>
<a href="/tasks">My tasks</a>
<a href="/chat">Chat</a>

<h2>Задание ID#${task.id}</h2>
<h2>${task.name}</h2>
<h3>Описание</h3>
<p>${task.description}</p>

<p>СТАТУС: ${task.status}</p>

<h1>Изменение статуса задания</h1>
<form action="/task/${task.id}" method="post">
    <select name="status">
        <option value="">Выберите статус...</option>
        <option>Новое</option>
        <option>Делается</option>
        <option>Закончено</option>
    </select>
    <p><input type="submit" value="Подтвердить изменение"/></p>
</form>
</body>
</html>