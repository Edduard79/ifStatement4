public class Person {
    public int age;

    public Person(){   //CONSTRUCTOR METHOD
        int max = 80;
        int min = 5;
        int casualNum = (int)Math.floor(Math.random()*(max-min+1)+min);
        this.age = casualNum;
        System.out.printf("Random age: %d y.o. \n", this.age);

    }
    String getLifeStage(){
        String stage;
            if(this.age <= 12){
                stage = "Child";
            }else if(this.age >= 13 && this.age <= 19){
                stage = "Teen";
            }else if (this.age >= 20 && this.age <= 59){
                stage = "Adult";
            }else{
                stage = "Senior Adult";
            }

    return stage;
    }
}
