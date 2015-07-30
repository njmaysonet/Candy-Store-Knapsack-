
public class Algorithm {
	
	int[][] m_nSolutionArray;
	Candy[] m_objCandyArray;
	int items;
	int weight;
	
	public Algorithm(Candy[] buffer, int items, int weight)
	{
		m_objCandyArray = buffer;
		m_nSolutionArray = new int[items+1][weight+1];
		this.items = items;
		this.weight = weight;
		
	}
	
	int SolveIt()
	{
		int distance;
		//i is item number
		for(int i = 1; i < items+1; i++)
		{
			//j is weight number
			for(int j = 1; j < weight+1; j++)
			{
				//System.out.print("i = " + i);
				//System.out.println(" j = " + j);
				if(m_objCandyArray[i].GetPrice() > j)
				{
					m_nSolutionArray[i][j] = m_nSolutionArray[i-1][j];
					//System.out.println(m_nSolutionArray[i][j]);
				}
				else
				{
					distance = j - (int)m_objCandyArray[i].GetPrice();
					if(m_objCandyArray[i].GetCalories() + m_nSolutionArray[i-1][(int)m_objCandyArray[i].GetPrice()] > m_nSolutionArray[i-1][j])
					{
						m_nSolutionArray[i][j] = Math.max( m_objCandyArray[i].GetCalories() + m_nSolutionArray[i][distance], m_nSolutionArray[i-1][j]);
						
						//System.out.println(m_nSolutionArray[i][j]);
					}
					else
					{
						m_nSolutionArray[i][j] = m_nSolutionArray[i-1][j];
						if(distance > 0)
						{
							m_nSolutionArray[i][j] = Math.max(m_nSolutionArray[i][j], m_nSolutionArray[i][distance] + m_objCandyArray[i].GetCalories());
						}
						//System.out.println(m_nSolutionArray[i][j]);
					}
				}
			}
		}
		return m_nSolutionArray[items][weight];
	}

}
