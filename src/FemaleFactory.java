/**
 * 生产女性的工厂
 * @author qiaojy
 *
 */
public class FemaleFactory implements HumanFactory{

	//生产黄人女性
	@Override
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

	//生产白人女性
	@Override
	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

//	生产黑人女性
	@Override
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

}
