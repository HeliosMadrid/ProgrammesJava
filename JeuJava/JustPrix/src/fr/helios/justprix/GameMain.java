package fr.helios.justprix;

import java.util.Random;

public class GameMain
{

    public static void main(String[] args)
    {
        Random r = new Random();
        int justPrix = r.nextInt(1000);
        System.out.println(justPrix);
    }

}
