<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />

<#--<h1>Program info</h1>-->
<div>
    <h1>${program.title}</h1>
    <h4>${program.description}</h4>
    <#if tasks??>
    <ol>
        <#list program.tasks as task>
            <li>
                <strong>${task.name}</strong>
                <p>${task.description}</p>
            </li>
        </#list>
    </ol>
    </#if>
</div>