package movie.seatChoice_ui.th3_btn;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Th3k_btn extends JButton {
	
	List<JButton> btns;
	int cnt;
	
	public Th3k_btn(List<JButton> btns, int cnt) {
		this.btns = btns;
		this.cnt = cnt;
		setText("" + (cnt + 1));
		setFont(new Font("돋움", Font.PLAIN, 15));
		setForeground(Color.white);
		setBackground(new Color(0x404040));
		setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
		addActionListener(new Th3k_btn_action(this));
		
	}

}
