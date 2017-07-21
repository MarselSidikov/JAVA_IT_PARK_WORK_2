<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<@spring.bind "model" />
<!DOCTYPE html>
<head>
    <title>Домашняя страница</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
</head>
<body>
<div class="table">
    <h1>Пользователи</h1>
    <table align="center">
        <th>ID</th>
        <th>Имя</th>
        <th>Возраст</th>
        <th>Рост</th>
    <#list model.usersList as user>
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.height}</td>
        </tr>
    </#list>
    </table>
    <form name="user" action="/addUser" method="post">
        <input type="text" name="name" placeholder="Имя">
        <input type="text" name="age" placeholder="Возраст">
        <input type="text" name="height" placeholder="Рост">
        <input type="submit" value="Отправить">
    </form>
</div>

</body>