
public class Candy{
	
	int m_nCalories;
	int m_nPrice;
	
	public Candy(int cal, int price)
	{
		m_nCalories = cal;
		m_nPrice = price;
	}
	
	void SetCalories(int cal)
	{
		m_nCalories = cal;
	}
	
	void SetPrice(int price)
	{
		m_nPrice = price;
	}
	
	int GetCalories()
	{
		return m_nCalories;
	}
	
	int GetPrice()
	{
		return m_nPrice;
	}

}
