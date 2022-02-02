package com.modernjava.lambdavariablescope;

import com.modernjava.functionalinterface.Instructor;
import com.modernjava.functionalinterface.Instructors;

import java.util.List;
import java.util.function.Consumer;

/*
* Scope same as nested block
*
* you cannot declare a parameter or a local variable int he lambda that has same name as local variable
*
* you cannot modify local variable inside lambda expression
*
* There is no restriction on class level/instance variable
*
* Effectively Final: in Lambda we are allowed to use local variable but we cannot modify local variable even though it is not declared as
* final, this conditional is called effectively final
* */
public class VariableScope {
    static int i=10;
    public static void main(String[] args) {
        int a =10; // a is local variable
        //Consumer<Integer> consumer = a-> System.out.println(a*10); // CTE : Variable 'a' is already defined in the scope

        Consumer<Integer> consumer = b-> System.out.println(b*10);

        int k = 0;
        List<Instructor> instructors = Instructors.getAllInstructors();
        instructors.forEach(instructor -> {
           // System.out.println(instructor + k++); // CTE : Variable used in lambda expression should be final or effectively final
            System.out.println(instructor + "  "+k);
            System.out.println(instructor + "  "+i++); // NO CTE as i is a class level variable
        });

    }
}
