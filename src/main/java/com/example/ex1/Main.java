package com.example.ex1;

import java.util.ArrayList;

import static com.example.ex1.Library.*;

public class Main {
    public static void main(String[] args) {
        //도서관 객체 생성

        //책 객체 4개 생성
        Book bookA = new Book("책1","김작가",true);
        Book bookB = new Book("책2","이작가",true);
        Book bookC = new Book("책3","박작가",true);
        Book bookD = new Book("책4","최작가",true);

        //도서관에 책 4개 추가
        books.add(0,bookA);
        books.add(1,bookB);
        books.add(2,bookC);
        books.add(3,bookD);

        //도서관에서 책 제거
        books.remove(bookD);

        //도서관의 모든 책 출력

        //도서관에서 책 대여
        if (bookA.isAvailable() == true) {
            System.out.println("책을 대여합니다");
            bookA.isAvailable() = false;
        }else System.out.println("지금은 대여 할 수 없습니다.");

    }
}

class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public static void getTile() {
        System.out.println();
    }

    //책 제목 조희
    public String getTitle() {
        return title;
    }

    //대여여부 조회
    public boolean isAvailable() {
        return isAvailable;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    //책 상세정보 출력
    public void getBookDetail(String Bookname) {
        System.out.println("책 제목: " + title +" 저자 : " + author);
    }
}

class Library {

    static ArrayList<> books = new ArrayList<>();

    Library.books.remove();
}