public class Forward extends Player{
    public Forward(String name, int age, String heightInFeet) {
        super(name, age, heightInFeet);
    }


    @Override
    public String defensivePlay(){
        return this.name + " with a shot contest!";
    }


    @Override
    public String offensivePlay(){
        return this.name +" with a dunk!";
    }

}

