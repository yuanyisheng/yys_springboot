
<#-- 宏模板引入 -->
<#include "../macro_global_library.ftl" />


<@header title="一生猿，一世猿。" ; param>
    <link rel="stylesheet" type='text/css' href="/static/css/common.css"/>
    <div class="table">--------- ${param} ---------</div>
</@header>


<@htmlBody>
    <div class="table-div">
        <table class="table">
            <thead>简介：</thead>
            <tbody>
                <tr>
                    <td>花名</td>
                    <td>年龄</td>
                    <td>创建时间</td>
                </tr>
                <#list userList as user>
                    <tr>
                        <td>${user.name}</td>
                        <td>${user.age}</td>
                        <td>${user.createTime?datetime}</td>
                    </tr>
                </#list>
            </tbody>
        </table>
    </div>
</@htmlBody>


<@footer ; param>
    <div class="div">--------- ${param} ---------</div>
</@footer>
