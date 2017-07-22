package ru.itis.models;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import javax.persistence.*;
import java.util.List;

@Entity // данная аннотация говорит нам о том,
// что объекты данного класса могут быть сохранены в БД
// автоматически и быть managed
@Table(name = "human")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;
    private int height;

    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    private List<Auto> autos;

    public User() {
    }

    public User(int id, String name, int age, int height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .add("age", age)
                .add("height", height)
                .toString();
    }

    @Override
    public boolean equals(Object object) {
        // если ссылки равны - сразу говорим - все правильно
        if (this == object) return true;
        // если ссылка нулевая, либо не совпали классы - говорим не правильно
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        // сравниваем все поля между собой
        return id == user.id &&
                age == user.age &&
                height == user.height &&
                Objects.equal(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, name, age, height);
    }
}
