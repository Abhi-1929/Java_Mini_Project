package Swing_awt;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.*;
class MyFrame10 extends JFrame implements ActionListener , ListSelectionListener, ChangeListener {
	JTextField tf1,tf2,tf3,tf4 ;
	JComboBox cb ;
	JList l ;
	JSpinner sp1 ,sp2;
	JScrollPane jsp;
	JLabel l1,l2;
	JButton b1;
	MyFrame10(){
		super("JSprinner_JList");
		//String countries[] = {"インド","アメリカ","イギリス","ブラジル"};
		String Months[] = { "IchiGatstu","NiGastsu","SanGastsu","YoGastsu","GoGastsu","RokuGastu","NanaGastsu","ShichiGastsu","KuGastsu","JyuGastsu"};
		String Days[] = {"にちようび","げつようび","かようび","すいようび","もくようび","きんようび","どようび"};
		String Date[] = {"Tsuitachi","Futsuka","Mik-ka","Yok-ka","Itsuka","Muika","Nanoka","Youka","Kokonoka","Touka"};
		l1 = new JLabel("Select Your Tanjobi ");
		l2 = new JLabel("  ");
		b1 = new JButton("Click");
		//cb = new JComboBox(countries);
		 l = new JList(Months);
		 l.setVisibleRowCount(5);
		 jsp = new JScrollPane(l);
		 //tf1 = new JTextField(10);
		 tf2 = new JTextField(10);
		 tf3 = new JTextField(10);
		 tf4 = new JTextField(10);
		 sp1 = new JSpinner(new SpinnerListModel(Date));
		 sp2 = new JSpinner(new SpinnerListModel(Days));
		 setLayout(new FlowLayout());
		 add(l1,BorderLayout.NORTH);
		// add(cb,BorderLayout.WEST);
		 add(jsp);
		 //add(tf1,BorderLayout.CENTER);
		 add(tf2);
		 add(tf3);
		 add(tf4);
		 add(sp1);
		 add(sp2);
		 add(b1);
		 add(l2);
		 //cb.addActionListener(this);
		 b1.addActionListener(this);
		 l.addListSelectionListener(this);
		 sp1.addChangeListener(this);
		 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//tf1.setText((String)cb.getSelectedItem());
		l2.setText("Happy_Tanjobi_"+tf4.getText()+ " :) ");
		
		
			
	
		
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		tf2.setText((String)l.getSelectedValue());
		
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		if(e.getSource()== sp1)
			tf3.setText((String)sp1.getValue());
		//if(e.getSource()== sp2)
			//tf4.setText((String)sp2.getValue());
		
	}
	
}
public class JSpinner_JList_JCoboBox {
	public static void main(String args[]) {
		MyFrame10 f = new MyFrame10();
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}
