package OopPractice.BoxingGame;

public class Ring {
    Boxer boxer1;
    Boxer boxer2;
    int minWeight;
    int maxWeight;
    
    public Ring(Boxer boxer1, Boxer boxer2, int minWeight, int maxWeight) {
        this.boxer1 = boxer1;
        this.boxer2 = boxer2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void fight(){
        if(isCheck() == true){
            while(this.boxer1.health > 0 && this.boxer2.health > 0){
                if(!isBegin()){
                    System.out.println("------------New Round-----------");
                    this.boxer2.health = this.boxer1.hit(this.boxer2);
                    if(isWin()){
                        break;
                    }
                    this.boxer1.health = this.boxer2.hit(this.boxer1);
                    if (isWin()) {
                        break;
                    }
                System.out.println(this.boxer1.name + " health is " + this.boxer1.health + "\n" + this.boxer2.name + " health is " + this.boxer2.health);
                }
                if(isBegin()){
                    System.out.println("------------New Round-----------");
                    this.boxer2.health = this.boxer1.hit(this.boxer2);
                    if(isWin()){
                        break;
                    }
                    this.boxer1.health = this.boxer2.hit(this.boxer1);
                    if (isWin()) {
                        break;
                    }
                System.out.println(this.boxer1.name + " health is " + this.boxer1.health + "\n" + this.boxer2.name + " health is " + this.boxer2.health);
                }
            }
        }else{
            System.out.println("These are not same weight!!");
        }
    }
    boolean isCheck(){
        return ((this.boxer1.weight > minWeight && this.boxer1.weight <= maxWeight) && (this.boxer2.weight > minWeight && this.boxer2.weight <= maxWeight));
    }
    boolean isWin(){
        if(boxer1.health <= 0){
            System.out.println("Winner is " + this.boxer2.name);
            return true;
        }
        if(boxer2.health <= 0){
            System.out.println("Winner is " + this.boxer1.name);
            return true;
        }
        return false;
    }
    boolean isBegin(){
        double random = Math.random() * 100;
        if(random <= 50){
            return true;
        }else{
            return false;
        }
    }
}
