public class HelloWorld implements Hello {

	private String msg;

	public HelloWorld(String msg) {
		this.msg = msg;
	}

	@Override
	public void sayHello() {
		System.out.println("Hello " + msg);
	}

}
