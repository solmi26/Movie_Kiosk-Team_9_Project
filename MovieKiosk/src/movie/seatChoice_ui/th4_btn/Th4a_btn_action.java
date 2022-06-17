package movie.seatChoice_ui.th4_btn;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import movie.peopleCheck_ui.ErrorFrame;
import movie.peopleCheck_ui.PeopleCheck;
import movie.seatChoice_ui.SeatChoice_1;
import movie.seatChoice_ui.SeatChoice_2;
import movie.seatChoice_ui.SeatChoice_3;
import movie.seatChoice_ui.SeatChoice_4;

public class Th4a_btn_action implements ActionListener {

   Th4a_btn btn;


   public Th4a_btn_action(Th4a_btn btn) {

      this.btn = btn;

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      int index = Integer.parseInt(btn.getText());
      SeatChoice_4.peoples = PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.disable_cnt + PeopleCheck.old_cnt;
      if(SeatChoice_4.th4a_btn_soldout[index - 1]) 
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
         if(SeatChoice_4.th4a_btn_selected[index - 1])
         {
            SeatChoice_4.th4a_btn_selected[index - 1] = false;
            if( index > 6)
            {
               btn.setBackground(new Color(0x404040));
            }
            else
            {
               SeatChoice_4.disable_btn_cnt--;
               btn.setBackground(new Color(0x4C9900));
            }
            SeatChoice_4.selected_cnt--;
            SeatChoice_4.ticket_price -= SeatChoice_4.th4a_btn_price[index - 1];
            SeatChoice_4.price_label.setText("일반: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "장애인: " + PeopleCheck.disable_cnt + "              " + "가격: " + SeatChoice_4.ticket_price);

         }
         else
         {
            if(SeatChoice_4.peoples > SeatChoice_4.selected_cnt)
            {
               if(index > 6) 
               {
                  SeatChoice_4.th4a_btn_selected[index - 1] = true;
                  btn.setBackground(new Color(0xFF3333));
                  SeatChoice_4.selected_cnt++;
                  SeatChoice_4.ticket_price += SeatChoice_4.th4a_btn_price[index - 1];
                  SeatChoice_4.price_label.setText("일반: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "장애인: " + PeopleCheck.disable_cnt + "              " + "가격: " + SeatChoice_4.ticket_price);

               }

               else
               {
                  if(PeopleCheck.disable_cnt == 0)
                  {
                     ErrorFrame frame = new ErrorFrame();
                     frame.getContentPane().setBackground(new Color(0x404040));
                     frame.setDefaultOptions();
                     JLabel label = new JLabel();
                     label.setText("장애인만 예매가능합니다.");
                     label.setFont(new Font("    ", Font.PLAIN|Font.BOLD, 30));
                     label.setForeground(Color.white);
                     label.setHorizontalAlignment(JLabel.CENTER);
                     frame.add(label);
                  }
                  else
                  {
                     if(PeopleCheck.disable_cnt > SeatChoice_4.disable_btn_cnt)
                     {
                        SeatChoice_4.th4a_btn_selected[index - 1] = true;
                        btn.setBackground(new Color(0xFF3333));
                        SeatChoice_4.disable_btn_cnt++;
                        SeatChoice_4.selected_cnt++;
                        SeatChoice_4.ticket_price += SeatChoice_4.th4a_btn_price[index - 1];
                        SeatChoice_4.price_label.setText("일반: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "장애인: " + PeopleCheck.disable_cnt + "              " + "가격: " + SeatChoice_4.ticket_price);

                     }
                     else
                     {
                        ErrorFrame frame = new ErrorFrame();
                        frame.getContentPane().setBackground(new Color(0x404040));
                        frame.setDefaultOptions();
                        JLabel label = new JLabel();
                        label.setText("장애인만 예매가능합니다.");
                        label.setFont(new Font("    ", Font.PLAIN|Font.BOLD, 30));
                        label.setForeground(Color.white);
                        label.setHorizontalAlignment(JLabel.CENTER);
                        frame.add(label);
                     }

                  }
               }
            }

            else
            {
               ErrorFrame frame = new ErrorFrame();
               frame.getContentPane().setBackground(new Color(0x404040));
               frame.setDefaultOptions();
               JLabel label = new JLabel();
               label.setText("선택인원이 "+ SeatChoice_4.peoples + "명을 초과했습니다.");
               label.setFont(new Font("    ", Font.PLAIN|Font.BOLD, 30));
               label.setForeground(Color.white);
               label.setHorizontalAlignment(JLabel.CENTER);
               frame.add(label);

            }
         }
      }
   }

}
