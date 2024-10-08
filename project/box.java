
//Filename GameBase.java
//Written by Brady Bierman
//Written on 10/8/24

public class Box {

    private int Box_Num;
    private int Box_Money;
    private boolean Box_Picked;

    public Make_Box(int num, int money){

        this.Box_Num = num;
        this.Box_Money = money;
        this.Box_Picked = false;

    }

    public int Get_Num(){

        return Box_Num;

    }

    public int Get_Money(){

        return Box_Money;

    }

    public boolean Get_Picked(){

        return Box_Picked;

    }

    public boolean Set_Picked(){

        Box_Picked = true;

    }
    
}



