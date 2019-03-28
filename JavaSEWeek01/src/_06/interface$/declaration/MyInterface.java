package _06.interface$.declaration;

interface A {
	
}

interface B {
	
}

// bir interface birden fazla interface si kalitabilir (extends)
// fakat implements edemez!!!
public interface MyInterface extends A , B{

}



class SuperClass {
	
}

// hem extends hem implements varsa bu durumda once extends olmalidir!

class SubClass extends SuperClass implements MyInterface {
	
}