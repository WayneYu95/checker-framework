package qualifiedlocations;

import testlib.qualifiedlocations.qual.Bottom;

interface Test {
    void foo();
}

//:: error: (implements.annotation.forbidden) :: error: (type_declaration.annotation.forbidden) :: error: (type.invalid)
public class Implements implements @Bottom Test {
    public void foo() {
        return;
    }
}