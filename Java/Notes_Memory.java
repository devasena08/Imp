public class Notes_Memory {
    /*
     * Jvm has 2 type of memory
     * stack and heap
     * stack memory is LIFO
     * heap mem is used to store the object ....it is larger than stack
     * each method in a program have its own stack frame..so, method ku ula irka variaables (ie )local variable
     * stack la store akum
     * stack mem ----->store local var
     *           ----->store the address of the obj created in heap memo
     * stack has 2 sec ...key part and value part
     * heap ----->stores instance variable
     * static var ----> stored in class area
     * this classs area is shared by all obj of the class and it is allocated when the class is loaded into the memory
     * class area is seperate from stack and heap
     * JVM does not have its own memory; it borrows memory from the host machine's RAM
     * When the JVM starts, it requests memory from the operating system.
    The operating system allocates a portion of the physical RAM to the JVM
    based on the specified (or default) heap and stack sizes.
    Heap Memory is then used for object creation, 
    and Stack Memory is used for managing method calls and local variables.
    The JVM uses garbage collection to manage memory in the heap by
    reclaiming memory used by objects that are no longer referenced, ensuring efficient memory usage.
     */
}
