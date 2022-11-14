package visitor;

import visitable.Bulbasaur;
import visitable.Squirtle;

public class Surf implements IVisitor
{
    public static final int SUP_EFF = 75;
    public static final int IMMUNE = 0;
    public static final int NOT_EFF = 25;

    //decreasing health points per atk (by type)
    @Override
    public int visit(Bulbasaur bulbasaur)
    {
        System.out.println("That attack is not effective! -" + NOT_EFF + "hp.");
        return bulbasaur.getHealthPoints() - NOT_EFF;
    }

    @Override
    public int visit(Squirtle squirtle)
    {
        System.out.println("This pokemon is immune! -" + IMMUNE + "hp.");
        return squirtle.getHealthPoints() - IMMUNE;
    }
}