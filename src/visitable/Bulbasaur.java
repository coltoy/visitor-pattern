package visitable;

import visitor.IVisitor;

public class Bulbasaur implements IVisitable
{
    private int healthPoints;
    public Bulbasaur(int healthPoints)
    {
        this.healthPoints = healthPoints;
    }
    public int getHealthPoints()
    {
        return healthPoints;
    }
    @Override
    public int accept(IVisitor visitor)
    {
        return visitor.visit(this);
    }
}