package br.com.ftt.lpii.person;

public class PersonaOne extends Person implements IPersonActions{
    public PersonaOne(String name, int age) {
        super(name, age);
    }

    @Override
    public String hello() {
        return "Oi";
    }

    @Override
    public String sayName() {
        return "Meu nome é " + getName();
    }

    @Override
    public String sayAge() {
        return "Eu tenho " + getAge() + " anos";
    }
}
