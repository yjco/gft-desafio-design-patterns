public class HelloProxy implements Hello {

	private HelloWorld hw;

	public HelloProxy(String msg) {
		hw = new HelloWorld(msg);
	}

	@Override
	public void sayHello() {
		System.out.print("Proxy: ");
		hw.sayHello();
	}

}
