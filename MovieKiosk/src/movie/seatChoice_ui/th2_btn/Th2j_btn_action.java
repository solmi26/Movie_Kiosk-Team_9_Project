package movie.seatChoice_ui.th2_btn;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import movie.peopleCheck_ui.ErrorFrame;
import movie.peopleCheck_ui.PeopleCheck;
import movie.seatChoice_ui.SeatChoice_1;
import movie.seatChoice_ui.SeatChoice_2;

public class Th2j_btn_action implements ActionListener {

   Th2j_btn btn;


   public Th2j_btn_action(Th2j_btn btn) {

      this.btn = btn;

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      int index = Integer.parseInt(btn.getText());
      SeatChoice_2.peoples = PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.disable_cnt + PeopleCheck.old_cnt;
      if(SeatChoice_2.th2j_btn_soldout[index - 1]) 
      {
         ErrorFrame frame = new ErrorFrame();
         frame.getContentPane().setBackground(new Color(0x404040));
         frame.setDefaultOptions();
         JLabel label = new JLabel();
         label.setText("이미 예매된 좌석입니다.");
         label.setFont(new Font("    ", Font.PLAIN|Font.BOLD, 30));
         label.setForeground(Color.white);
         label.setHorizontalAlignment(JLabel.CENTER);
         frame.add(label);
      }
      else
      {
         if(SeatChoice_2.th2j_btn_selected[index - 1])
         {
            if(index > 2) 
            {
               SeatChoice_2.th2j_btn_selected[index - 1] = false;
               btn.setBackground(new Color(0x404040));
            }
            else
            {
               SeatChoice_2.th2j_btn_selected[index - 1] = false;
               btn.setBackground(new Color(0xFF66B2));
            }
            SeatChoice_2.selected_cnt--;
            SeatChoice_2.ticket_price -= SeatChoice_2.th2j_btn_price[index - 1];
            SeatChoice_2.price_label.setText("일반: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "장애인: " + PeopleCheck.disable_cnt + "              " + "가격: " + SeatChoice_2.ticket_price);

         }
         else
         {
            if(SeatChoice_2.peoples > SeatChoice_2.selected_cnt)
            {
               SeatChoice_2.th2j_btn_selected[index - 1] = true;
               btn.setBackground(new Color(0xFF3333));
               SeatChoice_2.selected_cnt++;
               SeatChoice_2.ticket_price += SeatChoice_2.th2j_btn_price[index - 1];
               SeatChoice_2.price_label.setText("일반: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "장애인: " + PeopleCheck.disable_cnt + "              " + "가격: " + SeatChoice_2.ticket_price);

            }
            else
            {
               ErrorFrame frame = new ErrorFrame();
               frame.getContentPane().setBackground(new Color(0x404040));
               frame.setDefaultOptions();
               JLabel label = new JLabel();
               label.setText("선택인원이 "+ SeatChoice_2.peoples + "명을 초과했습니다.");               label.setFont(new Font("    ", Font.PLAIN|Font.BOLD, 30));
               label.setFont(new Font("돋움", Font.PLAIN|Font.BOLD, 30));
               label.setForeground(Color.white);
               frame.add(label);

            }
         }
      }

   }

}
