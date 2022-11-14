package visitable;

import visitor.IVisitor;

//this allows access to accept method
public interface IVisitable
{
    int accept(IVisitor visitor);
}