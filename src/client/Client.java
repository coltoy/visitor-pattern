package client;

import visitable.Bulbasaur;
import visitable.Squirtle;
import visitor.IVisitor;
import visitor.Surf;
import visitor.VineWhip;

public class Client
{
    public static void main(String[] args)
    {
        IVisitor grassAttack = new VineWhip();

        Bulbasaur leafy = new Bulbasaur(125);
        Squirtle shelly = new Squirtle(150);

        System.out.println("Leafy HP: " + leafy.getHealthPoints());
        System.out.println("Remaining HP: " + leafy.accept(grassAttack));
        System.out.println();

        System.out.println("Shelly HP: " + shelly.getHealthPoints());
        System.out.println("Remaining HP: " + shelly.accept(grassAttack));
    }
}