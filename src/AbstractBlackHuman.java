
public abstract class AbstractBlackHuman implements Human{

	@Override
	public void getColor() {

		System.out.println("黑种人皮肤为黑色");
	}
	
	@Override
	public void talk() {

		System.out.println("黑种人说话一般人听不懂");
	}
}
