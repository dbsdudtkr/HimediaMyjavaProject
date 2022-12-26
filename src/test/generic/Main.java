package test.generic;

class A {}
class B extends A {}
class C extends B {}
class D extends C {
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

	//깃허브에 반영할 내용

public class Main {
	// 제네릭 클래스를 파라미터로 받아들이는 메서드를 정의
	static void method1(Goods<A> g){}
	static void method2(Goods<?> g){}
	static void method3(Goods<? extends B> g){}
	static void method4(Goods<? super B> g){}
	
	//asd//
	public static void main(String[] args) {
		// 제네릭 타입으로 A 객체만 가능
		method1(new Goods<A>());
		/*
		method1(new Goods<B>());
		method1(new Goods<C>());
		method1(new Goods<D>());
		*/

		// 제네릭 타입으로  자식 클래스인 객체만 가능
		//method3(new Goods<A>());
	}
}
