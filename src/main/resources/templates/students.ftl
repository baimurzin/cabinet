<h1>Student of :</h1>
<div>
    <#if students??>
        <#list students as student>
            <p>
                <a href="<@spring.url "/${student.id}"/>">${student.surname}</a>
            </p>
        </#list>
    </#if>
</div>