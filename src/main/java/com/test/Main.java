package com.test;

import com.test.bean.Card;
import com.test.bean.Student;
import com.test.config.MainConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        Student student = context.getBean(Student.class);
        System.out.println(student);
    }
}
