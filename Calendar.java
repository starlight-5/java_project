import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Calendar extends JFrame {
	public Calendar() {
		setSize(1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calendar");
		
		JPanel naljaPanel = new JPanel();
		naljaPanel.setLayout(new GridLayout(6,7));
		JLabel[] label = new JLabel[42];
		
		String[] nalja = {
				"월요일","화요일","수요일","목요일","금요일","토요일","일요일"
				,"1일","2일","3일","4일","5일","6일","7일"
				,"8일","9일","10일","11일","12일","13일","14일"
				,"15일","16일","17일","18일","19일","20일","21일"
				,"22일","23일","24일","25일","26일","28일"
				,"29일","30일","31일","","","","",""};
		
		for(int i=0; i<label.length; i++) {
			label[i] = new JLabel(nalja[i]);
			label[i].setOpaque(true);
			label[i].setBackground(new Color(230,242,255,100));
			label[i].setBorder(new LineBorder(Color.black,2,true));
			naljaPanel.add(label[i]);
		}
		
		
		JLabel nuunwal = new JLabel("2025년 5월", JLabel.CENTER);
		setLayout(new BorderLayout());
		add(nuunwal, BorderLayout.NORTH);
		add(naljaPanel, BorderLayout.CENTER);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Calendar c = new Calendar(); 
	}
}
