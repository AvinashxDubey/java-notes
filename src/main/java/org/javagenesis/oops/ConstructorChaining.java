package org.javagenesis.oops;

public class ConstructorChaining {
    int oneVar;
    int twoVar;
    String threeStr;

//    public ConstructorChaining(int oneVar, int twoVar, String threeStr) {
//        this.oneVar = oneVar;
//        this.twoVar = twoVar;
//        this.threeStr = threeStr;
//    }

    public ConstructorChaining(int oneVar, int twoVar) {
        this.oneVar = oneVar;
        this.twoVar = twoVar;
    }

//    demonstrating constructor chaining
    public ConstructorChaining(int oneVar, int twoVar, String threeStr) {
        this(oneVar, twoVar);   // calling the above constructor - cons chaining
        this.threeStr = threeStr;
    }


}
