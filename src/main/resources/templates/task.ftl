<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Task</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
<h2 class="hello-title">Current task</h2>
<script src="/js/main.js"></script>
<a href="profile">My profile</a>
<a href="level">My level</a>
<a href="tasks">My tasks</a>
<a href="chat">Chat</a>

<h2>Задание ${task.taskId}</h2>
<h2>${task.taskName}</h2>
<h3>Описание</h3>
<p>${task.taskDescription}</p>

<p>СТАТУС: ${task.taskStatus}</p>

</body>
</html>