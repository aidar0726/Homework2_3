package animals;

public final class Amphibians extends Animal {

    public Amphibians(String name, int age, String livingEnviroment) {
        super(name,age,livingEnviroment);
    }

    @Override
    public void eat() {System.out.println("Питается насекомыми");}

    @Override
    public void sleep() {System.out.println("Спит в воде");}

    @Override
    public void go() {System.out.println("Перемещается по воде и суше");}

    public void hunting() {System.out.println("Охотится на насекомых");}
}

