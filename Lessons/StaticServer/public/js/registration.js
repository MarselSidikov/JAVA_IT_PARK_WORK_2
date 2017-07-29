function sendUserData(name, surname, login, password) {
    // создали json-объект
    let json = {};
    // положили туда данные
    json["name"] = name;
    json["surname"] = surname;
    json["login"] = login;
    json["password"] = password;
    // отправляем запрос на сервер
    $.ajax({
            url: "http://localhost:8080/users",
            type: "POST",
            contentType: "application/json",
            dataType: "json",
            data: JSON.stringify(json),
            success: function (data) {
                alert("Успешно");
            },
            failure: function (data) {
                alert("Не успешно " + data);
            }
        }
    )
}
