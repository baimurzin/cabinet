<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />

<h1>Student of group #${group.id}:</h1>
<div>
    <#if students??>
        <ol>
            <#list students as student>
                <li>
                    <a href="<@spring.url "/${student.id}"/>">${student.surname}</a>
                </li>
            </#list>
        </ol>
    </#if>
</div>
<p>
    <a href="<@spring.url "/programs/${program.id}"/>">Программа группы</a>
</p>
<p>
    Количество студентов в группе: ${num}
</p>

<p>
<#if allPoints == 0>
        Количество возможных баллов: 0.0
    <#else>
        Количество возможных баллов: ${allPoints?string}
</#if>
</p>

<p>
<#if allDoneTaskPoints == 0>
    Количество заработанных баллов: 0.0
<#else>
    Количество заработанных баллов: ${allDoneTaskPoints?string}
</#if>
</p>