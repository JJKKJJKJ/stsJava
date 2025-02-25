package ch06.first;

public class Box<T> {
//   int a;
   
   private T t;
   
   public T getT() {
	   return t;
   }  
   public void setT(T t) {
	   this.t = t;
   }
   
/// generic -> 일단 정의하지않고 나중에 외부에서 쓸때 정의해줄께 생각하면됨.
///   <>  '인자'
}
