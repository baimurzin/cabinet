<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />

<h1>List of groups:</h1>
<div>
    <#if groups??>
        <ul>
            <#list groups as group>
                <li>
                    <a href="<@spring.url "/groups/${group.id}"/>">${group.title}</a>
                </li>
            </#list>
        </ul>
    </#if>
</div>
<p>
    <a href="<@spring.url "/programs"/>">Список программ</a>
</p>
