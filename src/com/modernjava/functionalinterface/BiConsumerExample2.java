package com.modernjava.functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAllInstructors();

        //print out name and gender of instructors
        BiConsumer<String,String> biConsumer = (x,y)-> System.out.println("name is "+x+" gender is "+y);
        instructors.forEach(instructor -> biConsumer.accept(instructor.getName(),instructor.getGender()));

        //print out name and list of courses
        BiConsumer<String,List<String>> biConsumer1=(x,y)-> System.out.println("name is "+x+
                " courses "+y);
        instructors.forEach(instructor -> biConsumer1.accept(instructor.getName(),instructor.getCourses()));

        //print out name and gender of instrucors whi teaches online
        instructors.forEach(instructor -> {
            if(instructor.isOnlineCourses())
                biConsumer.accept(instructor.getName(),instructor.getGender());
        });

    }
}
