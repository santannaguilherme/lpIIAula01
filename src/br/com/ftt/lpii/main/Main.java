package br.com.ftt.lpii.main;

import br.com.ftt.lpii.person.Person;
import br.com.ftt.lpii.person.PersonaOne;
import br.com.ftt.lpii.person.PersonaTwo;

public class Main {
    public static void main(String[] args) {

        PersonaOne person01 = new PersonaOne("Claude",18);
        PersonaTwo person02 = new PersonaTwo("Dimitri",19);
        System.out.println(person01.hello());
        System.out.println(person02.hello());
        System.out.println(person01.sayName());
        System.out.println(person02.sayName());
        System.out.println(person01.sayAge());
        System.out.println(person02.sayAge());

    }
}
