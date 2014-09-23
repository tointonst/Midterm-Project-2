public class Player
	{
	private String nameOfPlayer;
	private double freeThrowPercentage;
	private double threePointPercentage;
	private double midRangePercentage;
	private double layupPercentage;
	private double backwardsShotPercentage;

	public Player(String nop, double ftp, double tpp, double mrp, double lp,
			double dsp)
		{
		nameOfPlayer = nop;
		freeThrowPercentage = ftp;
		threePointPercentage = tpp;
		midRangePercentage = mrp;
		layupPercentage = lp;
		backwardsShotPercentage = dsp;
		}

	public String getNameOfPlayer()
		{
		return nameOfPlayer;
		}

	public double getFreeThrowPercentage()
		{
		return freeThrowPercentage;
		}

	public double getThreePointPercentage()
		{
		return threePointPercentage;
		}

	public double getMidRangePercentage()
		{
		return midRangePercentage;
		}

	public double getLayupPercentage()
		{
		return layupPercentage;
		}

	public double getBackwardsShotPercentage()
		{
		return backwardsShotPercentage;
		}

	public void setNameOfPlayer(String nameOfPlayer)
		{
		this.nameOfPlayer = nameOfPlayer;
		}

	public void setFreeThrowPercentage(double freeThrowPercentage)
		{
		this.freeThrowPercentage = freeThrowPercentage;
		}

	public void setThreePointPercentage(double threePointPercentage)
		{
		this.threePointPercentage = threePointPercentage;
		}
	}
