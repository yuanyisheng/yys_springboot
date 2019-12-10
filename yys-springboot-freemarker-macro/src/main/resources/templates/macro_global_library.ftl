
<#-- 公共顶部 -->
<#macro header title keywords="default value" description="default value">
<!DOCTYPE html>
<html>
    <head lang="en">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0;" />
        <meta name="format-detection" content="telephone=no" />
        <title>${title}</title>
        <meta name="keywords" content="${keywords}" />
        <meta name="description" content="${description}" />

        <#nested "页面顶部">
    </head>
    <body>
</#macro>

<#-- 公共body -->
<#macro htmlBody>
<body>
　　<#nested>
</body>
</#macro>

<#-- 公共底部 -->
<#macro footer>
    <#nested "页面底部"><#-- 嵌套内容(自定义marco的模板片段)，而且支持传递参数 -->
</html>
</#macro>