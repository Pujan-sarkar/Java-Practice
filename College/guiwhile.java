import javax.swing.JOptionPane;
public class guiwhile
{
	public static void main(String [] args)
	{
		int i = 0;
		while(i < 10)
			{
				JOptionPane.showMessageDialog (null, "Count till 10 is : " +i);
				i++;
			}
	}
}