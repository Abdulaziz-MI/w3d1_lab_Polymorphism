public class Guard extends Player {



    public Guard(String name, int age, String heightInFeet) {
        super(name, age, heightInFeet);
    }
@Override
public String defensivePlay(){
    return this.name + " with a steal!";
    }


    @Override
    public String offensivePlay(){
       return this.name +" with a layup!";
    }

}


