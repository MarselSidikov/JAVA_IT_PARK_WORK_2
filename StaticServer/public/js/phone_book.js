function getAllUsers() {
    $.ajax({
            url: "http://localhost:8080/users",
            type: "GET",
            contentType: "application/json",
            crossDomain: true,
            dataType: 'json',
            xhrFields: {
                withCredentials: true
            },
            success: function (data) {
                alert("Успешно");
            },
            failure: function (data) {
                alert("Не успешно " + data);
            }
        }
    )
}
