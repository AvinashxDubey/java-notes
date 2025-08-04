package org.javagenesis.oops.inheritance;

public class InheritanceUsingInterface {
    /**
     * when to use: Abstract classes vs interfaces
     * -Abstract classes could be used for single inheritance
     * -While interfaces could be used for single inheritance as well as
     * multiple inheritance(used more often in industry)
     */
}

interface Machine1{
    public void operate();
}

interface Machine2{
    public void operate();
}

class MachineImpl implements Machine1, Machine2{
// multiple inheritance in java is achieved through interfaces
    @Override
    public void operate() {
        System.out.println("Operating this bish!");
    }
}
