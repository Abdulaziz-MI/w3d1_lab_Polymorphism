import java.util.ArrayList;

public abstract class Player {
    protected  String name;
protected  int age;
protected int height;
protected ArrayList<StrengthAttribute> strengths;





public Player (String name, int age, int height){
    this.name= name;
this.age = age;
this.height = height;
    this.strengths = new  ArrayList<StrengthAttribute>();

}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public ArrayList<StrengthAttribute> getStrengths() {
        return strengths;
    }


    public void addStrengthAttribute(String attribute, int score){
    this.strengths.add( new StrengthAttribute(name,score));
    }

}
