
public abstract class AbstractWhiteHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("白种人的皮肤是白色的");
	}
	
	@Override
	public void talk() {
		System.out.println("白种人说话为单字节");
	}
}
