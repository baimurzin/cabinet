<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Tasks</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
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
    <table class="tasklist" border="1">
        <tr>
            <th>Number</th>
            <th>Name</th>
            <th>Status</th>
        </tr>

        <#list tasks as task>
            <tr>
                <td></td>
                <td><a href="task/${task.id}">${task.name}</a></td>
                <td>${task.status}</td>
            </tr>
        </#list>

    </table>
</div>

<#else>
<p>No tasks yet</p>
</#if>

<script>
    $('.tasklist tr').each(function (i) {
        i && $(this).find('td:first').text(i);
    });
</script>
</body>
</html>