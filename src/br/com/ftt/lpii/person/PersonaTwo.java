package br.com.ftt.lpii.person;

public class PersonaTwo  extends Person implements IPersonActions{
    @Override
    public String hello() {
        return "Olá";
    }

    @Override
    public String sayName() {
        return "Eu me chamo " + getName();
    }

    @Override
    public String sayAge() {
        return "Eu tenho " + getAge() + " anos de idade";
    }
}
