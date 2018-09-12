<h1>List of groups:</h1>
<div>
    <#if groups??>
        <#list groups as group>
            <p>
                <a href="students.ftl">${group.title}</a>
            </p>
        </#list>
    </#if>
</div>
