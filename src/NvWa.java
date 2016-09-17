
public class NvWa {

	public static void main(String[] args) {
		//男性生产线
		HumanFactory maleHumanFactory = new MaleFactory();
//		女性生产线
		HumanFactory fameleHumanFactory = new FemaleFactory();
		
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		Human femaleYellowHuman = fameleHumanFactory.createYellowHuman();
		
		maleYellowHuman.getColor();
		maleYellowHuman.getSex();
		maleYellowHuman.talk();
		
		femaleYellowHuman.getColor();
		femaleYellowHuman.getSex();
		femaleYellowHuman.talk();
	}
}
