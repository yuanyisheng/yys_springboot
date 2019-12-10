
<#-- 宏模板引入 -->
<#include "../macro_global_library.ftl" />


<@header title="一生猿，一世猿。" ; param>
    <link rel="stylesheet" type='text/css' href="/static/css/common.css"/>
    <div class="table">--------- ${param} ---------</div>
</@header>


<@htmlBody>
    <div class="table-div">

        <#-- 通过名称获取用户宏 -->
        <table class="table" style="margin-bottom: 10px;">
            <thead>通过名称获取用户：</thead>
            <tbody>
                <tr>
                    <td>花名</td>
                    <td>年龄</td>
                    <td>创建时间</td>
                </tr>
                <@userDirective method='user' name='${name}'; user>
                    <tr>
                        <td>${user.name}</td>
                        <td>${user.age}</td>
                        <td>${user.createTime?datetime}</td>
                        <#-- ?date：yyyy-MM-dd  ?time：HH:mm:ss  ?datetime：yyyy-MM-dd HH:mm:ss -->
                    </tr>
                </@userDirective>
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
                <@userDirective method='userList';userList>
                    <#if userList?? && userList?size gt 0>
                        <#list userList as user>
                            <tr>
                                <td>${user.name}</td>
                                <td>${user.age}</td>
                                <td>${user.createTime?datetime}</td>
                            </tr>
                        </#list>
                    </#if>
                </@userDirective>
            </tbody>
        </table>

    </div>
</@htmlBody>


<@footer ; param>
    <div class="div">--------- ${param} ---------</div>
</@footer>
