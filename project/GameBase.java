
//Filename GameBase.java
//Written by Brady Bierman
//Written on 10/8/24

import java.util.Random;

public abstract class GameBase{

    public int Money_Values[] = {10, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000, 1000000, 5000000, 10000000};

    public Game_Start(){

        Box[] Boxes = new Box[12];
        boolean Box_Filled[] = {false, false, false, false, false, false, false, false, false, false, false, false};
        int x;
        boolean y = false;
        Random rand = new Random();

        for(x = 0; x < Boxes.length; ++x){

            while(!y){

                int Rand_Box = rand.nextInt(12);
                if(Box_Filled[Rand_Box] == false){

                    Boxes[x] = new Make_Box(x, Money_Values[Rand_Box]);
                    y = false;

                }
               

            }
            

        }

    }

}




