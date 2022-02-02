package com.modernjava.functionalinterface;

import java.util.Arrays;
import java.util.List;

public class Instructors {
 public static List<Instructor> getAllInstructors(){
     Instructor instr1 = new Instructor("ranga",15,"Evangelist","Male",true,
             Arrays.asList("Microservices","Springboot","Java"));
     Instructor instr2 = new Instructor("Koushik",15,"VicePresident","Male",false,
             Arrays.asList("Microservices","Springboot","Java","Maven"));
     Instructor instr3 = new Instructor("Stephen",5,"AWS Architect","Male",true,
             Arrays.asList("AWS","GCP"));
     Instructor instr4 = new Instructor("AbdulBari",15,"Professor","Male",false,
             Arrays.asList("DSA","Java","Algorithms"));
     Instructor instr5 = new Instructor("syed",15,"Principal Engineer","Male",true,
             Arrays.asList("Java Programming","React Native","Java Multi Threaded Programming"));

     List<Instructor> list = Arrays.asList(instr1,instr2,instr3,instr4,instr5);
     return list;
 }
}
