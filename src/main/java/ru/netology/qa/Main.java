package ru.netology.qa;

public class Main {
    public static void main(String[] args){
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иваныч";
        post.phone = "8-800-888-88-88";
        post.passport = "4444№44444444";
        post.subscription = true;


        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 2;
        post.birthday.year = 1998;
    }
}
