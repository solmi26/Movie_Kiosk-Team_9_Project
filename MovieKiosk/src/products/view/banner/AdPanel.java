package products.view.banner;

import javax.swing.JPanel;

public class AdPanel extends JPanel {
	
	// 광고배열 구성 
	String[] ads = {"./img/mainFrame/콤보광고1.png","./img/mainFrame/콤보광고2.png","./img/mainFrame/콤보광고3.png","./img/mainFrame/콤보광고4.png"};
	
	public AdPanel() {
		setBounds(0, 0, 700, 116);
		setLayout(null);
		setVisible(true);
		
		ImageSlide img_slide = new ImageSlide(ads);
		img_slide.setBounds(0, 0, 700, 116);
		add(img_slide);
		
		// 광고시작 (메인생성자에서 호출 할 코드)
		img_slide.tm.start();
		
	}
}
