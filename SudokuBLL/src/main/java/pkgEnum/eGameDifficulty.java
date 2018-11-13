package pkgEnum;

public enum eGameDifficulty {
EASY, MEDIUM, HARD;
	
	private static int iDifficulty;

	private static java.util.Map<java.lang.Integer,eGameDifficulty>	lookup;
	
	public static eGameDifficulty get(int iDifficulty)
	{
		return lookup.get(iDifficulty);
	}
	
	public static int getiDifficulty()
	{
		return iDifficulty;
	}
	
	public static eGameDifficulty valueOf(java.lang.String name)
	{
		for(eGameDifficulty d : eGameDifficulty.values())
			lookup.put(d.getiDifficulty(), d);
	}
	
}
