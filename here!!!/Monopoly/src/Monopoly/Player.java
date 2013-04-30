package Monopoly;


public class Player{
    
   private String name;
   int position;
   int wallet;
   
    public Player(String name){
        this.name = name;
        position =1;
        wallet = 1500;
    }
    
    public void MyMove(int value)
    {
        System.out.print("hello");
        this.position += value;
            if (position > 23) 
            {
                position=position-24;
                this.wallet =+ 200; // because player passes on start plot
            }
                System.out.println(name +" lands on " +  position);
            
    }

    
}
