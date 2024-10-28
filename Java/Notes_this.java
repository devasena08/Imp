public class Notes_this {
    /*
     * In the class Area, the variables length and breath that you declared at the class level are instance variables.
     *  These variables belong to each instance (or object) of the class Area.
     *  When you pass length and breath as parameters to the constructor, 
     *  are treated as local variables inside the constructor scope.
     *  The this.length refers to the instance variable length of the current object (the object that is being created).
        The length on the right-hand side is the local variable passed as an argument to the constructor.
     */
}
class Area{
    int length;
    int breath;

    Area(int length, int breath){
       this.length = length;
       this.breath = breath;
    }
    
}
