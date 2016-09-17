/**
 * 生产男性的工厂
 * @author qiaojy
 *
 */
public class MaleFactory implements HumanFactory{

	@Override
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

	@Override
	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

	@Override
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

}
