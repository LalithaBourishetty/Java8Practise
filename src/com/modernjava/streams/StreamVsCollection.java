package com.modernjava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Collection iterates explicitly, Stream iterates internally
//Can add/remove elements in collection in stream we cannot perform add/reove operations
//Collection holds elements, Stream is not a data structure
//Streams are lazily consrtucted means no stream constructed while performing intermediate operation until terminal operation called.
//Collection we can traverse multiple times stream we can iterate only once, it is one directional once the terminal operation called stream is closed


public class StreamVsCollection {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Asha","Raju","sayed"));
        System.out.println(names);

        names.remove("sayed");
        System.out.println(names);

        for (String s:names) {
            System.out.println(s);
        }
        //Streams
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        //nameStream.forEach(System.out::println); cannot traverse multiple times

        // nameStream.filter(s->s.startsWith("R")); nothing will happen util we have a terminal operation
        names.stream().filter(s->s.startsWith("R")).collect(Collectors.toList());

    }
}
