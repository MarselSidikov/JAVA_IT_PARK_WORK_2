// отделная js-функция, которая получает пользователей
// и выводит в табицу
function getUsers() {

    // создали переменную для запроса на сервер
    let xhr = new XMLHttpRequest();
    // опишем поведение, когда мы получили ответ
    // мы подставляем свою функцию
    // в функцию xhr
    xhr.onreadystatechange = function () {
        // получили ответ с сервера
        let response = xhr.response;
        // преобразовали его в json-объект
        let data = JSON.parse(response);
        // получили таблицу из html-страницы
        let table = document.getElementById('user_table');
        // теперь data - массив JSON-объектов

        // бежим по всем элементам массива
        for (let i = 0; i < data.length; i++) {
            // вставляем строку в таблицу и сразу ее получаем
            let row = table.insertRow(i + 1);
            // создаем набор ячеек
            const cellId = row.insertCell(0);
            const cellName = row.insertCell(1);
            const cellAge = row.insertCell(2);
            const cellHeight = row.insertCell(3);
            // задаем текст для каждой ячейки
            cellId.innerHTML = data[i]["id"];
            cellName.innerHTML = data[i]["name"];
            cellAge.innerHTML = data[i]["age"];
            cellHeight.innerHTML = data[i]["height"];
        }
    };
    // открываем запрос
    // true - значит, что запрос асинхронный
    xhr.open("GET", "http://localhost:8080/users", true);
    xhr.send();
}

