<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />

<h1>List of groups:</h1>
<div>
    <#if groups??>
        <#list groups as group>
            <p>
                <a href="<@spring.url "/groups/${group.id}"/>">${group.title}</a>
            </p>
        </#list>
    </#if>
</div>
