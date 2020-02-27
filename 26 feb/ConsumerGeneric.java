package array;

 class Test<T> {
	private T obj;

	public T get() {
		return this.obj;
	}

	public void set(T obj) {
		this.obj = obj;
	}

}

class ConsumerGeneric {
	public static void main(String[] args) {
		Test<Integer> t=new Test<>();
		t.set(5);
		int i=(int)t.get();
		System.out.println(i);
		
	}
}