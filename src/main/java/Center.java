public class Center extends Player {
    public Center(String name, int age, String heightInFeet) {
        super(name, age, heightInFeet);
    }


    @Override
    public String defensivePlay(){
        return this.name + " with a block!";
    }


    @Override
    public String offensivePlay(){
        return this.name +" with big-man dunk!";
    }

}

