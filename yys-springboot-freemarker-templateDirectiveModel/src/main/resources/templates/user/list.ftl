<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>一生猿，一世猿。</title>
</head>
<style>
    .table-div table{ border:1px solid black; }
    .table-div table td{ border:1px solid black; }
</style>
<body>
<div class="table-div">

    <@userDirective name='${name}'; user, userList>

        <#-- 通过名称获取用户宏 -->
        <table class="table" style="margin-bottom: 10px;">
            <thead>通过名称获取用户：</thead>
            <tbody>
            <tr>
                <td>花名</td>
                <td>年龄</td>
                <td>创建时间</td>
            </tr>
            <tr>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.createTime?datetime}</td>
                <#-- ?date：yyyy-MM-dd  ?time：HH:mm:ss  ?datetime：yyyy-MM-dd HH:mm:ss -->
            </tr>
            </tbody>
        </table>

        <#-- 获取用户列表宏 -->
        <table class="table">
            <thead>获取用户列表：</thead>
            <tbody>
            <tr>
                <td>花名</td>
                <td>年龄</td>
                <td>创建时间</td>
            </tr>
            <#if userList?? && userList?size gt 0>
                <#list userList as user>
                    <tr>
                        <td>${user.name}</td>
                        <td>${user.age}</td>
                        <td>${user.createTime?datetime}</td>
                    </tr>
                </#list>
            </#if>
            </tbody>
        </table>
    </@userDirective>

</div>
</body>
</html>