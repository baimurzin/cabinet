<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />

<h1>Student of :</h1>
<div>
<#if programs??>
    <ul>
        <#list programs as program>
            <li>
                <a href="<@spring.url "/programs/${program.id}"/>">${program.title}</a>
            </li>
        </#list>
    </ul>
</#if>
</div>