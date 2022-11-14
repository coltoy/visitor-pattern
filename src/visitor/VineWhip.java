package visitor;

import visitable.Bulbasaur;
import visitable.Squirtle;

public class VineWhip implements IVisitor
{
    public static final int SUP_EFF = 75;
    public static final int IMMUNE = 0;
    public static final int NOT_EFF = 25;

    @Override
    public int visit(Bulbasaur bulbasaur)
    {
        System.out.println("This pokemon is immune! -" + IMMUNE);
        return bulbasaur.getHealthPoints() - IMMUNE;
    }

    @Override
    public int visit(Squirtle squirtle)
    {
        System.out.println("That attack is super effective! -" + SUP_EFF + "hp.");
        return squirtle.getHealthPoints() - SUP_EFF;
    }
}