package _06.IS_A;

public class Notes {

}


// IS-A

class Animal {
	
}

class Dog extends Animal {
	
}

class Kangal extends Dog {
	
}

class Cat extends Animal {
	
}

// Dog IS-A Animal DOGRUDUR!
// Cat IS-A Animal DOGRUDUR
// Dog IS-A Cat yanlistir.

// Animal IS-A Dog
// Animal IS-A Cat onermeleri YANLISTIR!


// Kangal IS-A Dog
// Kangal IS-A Animal onermeleri dogrudur!


interface Speedy {
	
}

class Car {
	
}

class Hummer extends Car implements Speedy{
	
}


// Hummer IS-A Car
// Hummer IS-A Speedy onermeleri DOGRUDUR!

// Car IS-A Speedy onermesi YANLISTIR.
