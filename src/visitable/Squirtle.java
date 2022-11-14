package visitable;

import visitor.IVisitor;

public class Squirtle implements IVisitable
{
    private int healthPoints;

    public Squirtle(int healthPoints)
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