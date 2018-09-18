<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Tasks</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
<h2 class="hello-title">Here are my tasks</h2>
<a href="profile">My profile</a>
<a href="level">My level</a>
<a href="tasks">My tasks</a>
<a href="chat">Chat</a>
<a href="career">My career</a>

<#if tasks?has_content>

<div>
    <table border="1">
        <tr>
            <th>Task number</th>
            <th>Name</th>
            <th>Status</th>
        </tr>
        <#list tasks as task>
        <tr>
            <td>${task.number}</td>
            <td><a href="task/${task.number}">${task.name}</a></td>
            <td>${task.status}</td>
        </tr>
        </#list>
    </table>
</div>
<#else>
<p>No tasks yet</p>
</#if>
<script src="/js/main.js"></script>
</body>
</html>