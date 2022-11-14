package visitor;

import visitable.Bulbasaur;
import visitable.Squirtle;

//If adding a new Visitor, each implementation (of visitor) must include new visit.
//TOO MANY IMPLEMENTATIONS OF THIS WILL BECOME DIFFICULT.
public interface IVisitor
{
    int visit(Bulbasaur bulbasaur);
    int visit(Squirtle squirtle);
}