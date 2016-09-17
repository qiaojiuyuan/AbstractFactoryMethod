
public abstract class AbstractYellowHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("黄种人皮肤是黄色的");
	}
	
	@Override
	public void talk() {
		System.out.println("黄种人说话是双字节的");
	}
}
