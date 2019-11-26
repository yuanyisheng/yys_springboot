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
        <table class="table">
            <thead>简介：</thead>
            <tbody>
            <tr>
                <td>花名</td>
                <td>${name}</td>
            </tr>
            <tr>
                <td>性别</td>
                <td>
                    <#if sex == "1">
                        男
                    <#elseif sex == "2">
                        女
                    <#else>
                        other
                    </#if>
                </td>
            </tr>
            <tr>
                <td>爱好</td>
                <td>
                    <#list hobbys as hobby>
                        ${hobby}&nbsp;
                    </#list>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</body>
</html>