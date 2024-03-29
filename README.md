# _🎥 Movie Kiosk_ (9조)

---

## 🙋 Team Member

| 이름   | Github                                         |
| ------ | ---------------------------------------------- |
| 진솔미 | [@solmi26](https://github.com/solmi26)         |
| 이원진 | [@Wonjin0138](https://github.com/Wonjin0138)   |
| 김다현 | [@KIMDAHYUN98](https://github.com/KIMDAHYUN98) |
| 문기용 | [@mkyoung24](https://github.com/mkyoung24)     |
| 강병관 | [@G-Lake](https://github.com/G-Lake)           |

---

## 📝 _Environment_

> UI
>
> > Java Swing

> Programming Language
>
> > Java

> DataBase
>
> > Oracle, DBeaver
> >
> > > 외부 라이브러리
> > >
> > > > ojdbc8.jar/HikariCP.jar/slf4j-api-1.7.21.jar

---

## 📝 _ER Diagram_

![erd](./MovieKiosk/image/movie/ERD.jpg)

---

## 🍿 _Project_

- 디자인 패턴

  - MVC 패턴을 기반으로한 패키지 구성

![mvc](https://user-images.githubusercontent.com/84116965/129394319-e93b844f-7ddc-4608-b708-b31ccc3b31bb.png)

- Java Swing에 영상 출력

  - Adobe After Effects을 이용하여 영상 제작
  - mp4파일을 gif로 변환 후 화면에 출력(https://ezgif.com/video-to-gif)

---

<!-- ## 📌 _Issue_

```java
public Detail_P2_C(String img_path, String name, String price, String quantity, JFrame frame) {
	      LineBorder lineColor = new LineBorder(new Color(87,149,255));

	      setBackground(new Color(255, 255, 255));
	      setLayout(new BorderLayout());
	      setBorder(lineColor);

	      ChkImg img = new ChkImg(img_path,94,87);

	      add(img,"West");

	      JPanel centerPanel = new JPanel();
	      centerPanel.setBackground(Color.white);
	      centerPanel.setLayout(null);

	      JLabel proName = new JLabel(name);
	      proName.setFont(new Font("Lao MN", Font.BOLD | Font.ITALIC, 15));
	      proName.setForeground(Color.black);
	      proName.setBounds(20, 30, 200, 30);

	      JLabel proPrice = new JLabel(price + "원");
	      proPrice.setBounds(220, 30, 78, 31);

	      JLabel proQuan = new JLabel(quantity + "개");
	      proQuan.setBounds(342, 35, 32, 16);

	      JButton deleteBtn = new RoundedButton("Delete");
	      deleteBtn.setBounds(410, 30, 50, 50);
	      deleteBtn.setForeground(new Color(255, 0, 0));
	      deleteBtn.setBackground(new Color(255, 30, 255));

	      centerPanel.add(proName);
	      centerPanel.add(proPrice);
	      centerPanel.add(proQuan);
	      centerPanel.add(deleteBtn);

	      add(centerPanel,"Center");

	      deleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ProductsBasketsDAO().basketDelete(new ProductsBasket(proName.getText()));
				frame.setVisible(false);
				new DetailFrame();
			}
		});
	   }
```

> **ScrollPane Issue**
>
> > 장바구니 품목들은 각각 JPanel로 이루어져 있다.<br>
> > 그 패널 안에는 해당 품목의 이미지/이름/가격/수량이 들어가는데,<br>
> > 이 때 Panel의 Layout을 null로 지정해주어야 setBounds 함수로 원하는 위치에 삽입할 수 있다.<br>
> > 하지만 JScrollPane Component의 Layout을 Null로 지정하면 전체 장바구니의 스크롤기능이 들어가지를 않는다.<br>
> > 이 부분을 해결하기 위해서는, 각각의 품목 Panel의 요소들을 setBounds로 원하는 위치에 넣은 후에<br>
> > 그 JPanel을 다시 JPanel2에 넣어주고,JPanel2의 Layout을 Default값 BorderLayout으로 지정한다.<br>
> > 여기서 주위할점은 Scroll 기능은 양 사이드의 끝을 컴퓨터가 인지해야 들어가기 때문에<br>
> > JScrollPane의 Component로 들어가는 JPanel안에 요소(JButton,JLabel)중 하나라도 "East","West"에 지정이 되있어야 한다.<br>

```java
public class ProductList {
  public static void main(String[] args) {

    if(pbDAO.basketList().size() == 0) {
			JPanel noData = new JPanel();
			noData.setBackground(new Color(255,254,230));
			JLabel msg = new JLabel("장바구니에 상품이 없습니다");
			msg.setFont(new Font("Lucida Grande", Font.BOLD, 20));
			noData.add(msg);
			scroll = new JScrollPane(noData);
			add(scroll);
			scroll.setBounds(0, 67, 600, 383);
			scroll.setVisible(true);
		} else {

			for(int i = 0; i < pbDAO.basketList().size(); ++i) {

				panel2_1.add(new Detail_P2_C(
						pbDAO.basketList().get(i).getImgPath(),
						pbDAO.basketList().get(i).getName(),
						pbDAO.basketList().get(i).getPrice(),
						pbDAO.basketList().get(i).getQuantity(),
						this));

				panel2.add(panel2_1.get(i));

				prices.add(Integer.parseInt(pbDAO.basketList().get(i).getPrice()));
			}
			scroll = new JScrollPane(panel2);
			add(scroll);

			scroll.setBounds(0, 67, 600, 383);
			scroll.setVisible(true);
		}
  }
}
``` -->

<!-- ## 📝 _Troubles_ -->

## 📝 _Issue_

<details>
	<summary>ScrollPane</summary>

```java
public Detail_P2_C(String img_path, String name, String price, String quantity, JFrame frame) {
	      LineBorder lineColor = new LineBorder(new Color(87,149,255));

	      setBackground(new Color(255, 255, 255));
	      setLayout(new BorderLayout());
	      setBorder(lineColor);

	      ChkImg img = new ChkImg(img_path,94,87);

	      add(img,"West");

	      JPanel centerPanel = new JPanel();
	      centerPanel.setBackground(Color.white);
	      centerPanel.setLayout(null);

	      JLabel proName = new JLabel(name);
	      proName.setFont(new Font("Lao MN", Font.BOLD | Font.ITALIC, 15));
	      proName.setForeground(Color.black);
	      proName.setBounds(20, 30, 200, 30);

	      JLabel proPrice = new JLabel(price + "원");
	      proPrice.setBounds(220, 30, 78, 31);

	      JLabel proQuan = new JLabel(quantity + "개");
	      proQuan.setBounds(342, 35, 32, 16);

	      JButton deleteBtn = new RoundedButton("Delete");
	      deleteBtn.setBounds(410, 30, 50, 50);
	      deleteBtn.setForeground(new Color(255, 0, 0));
	      deleteBtn.setBackground(new Color(255, 30, 255));

	      centerPanel.add(proName);
	      centerPanel.add(proPrice);
	      centerPanel.add(proQuan);
	      centerPanel.add(deleteBtn);

	      add(centerPanel,"Center");

	      deleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ProductsBasketsDAO().basketDelete(new ProductsBasket(proName.getText()));
				frame.setVisible(false);
				new DetailFrame();
			}
		});
	   }
```

<!-- > **ScrollPane Issue** -->

> Problem
>
> > 장바구니 품목들은 각각 JPanel로 이루어져 있다.<br>그 패널 안에는 해당 품목의 이미지/이름/가격/수량이 들어가는데,<br>이 때 Panel의 Layout을 null로 지정해주어야 setBounds 함수로 원하는 위치에 삽입할 수 있다.<br> 하지만 JScrollPane Component의 Layout을 Null로 지정하면 전체 장바구니의 스크롤기능이 들어가지를 않는다.<br>
> >
> > > Solution
> > >
> > > > 이 부분을 해결하기 위해서는, 각각의 품목 Panel의 요소들을 setBounds로 원하는 위치에 넣은 후에<br>그 JPanel을 다시 JPanel2에 넣어주고,JPanel2의 Layout을 Default값 BorderLayout으로 지정한다.<br> 여기서 주위할점은 Scroll 기능은 양 사이드의 끝을 컴퓨터가 인지해야 들어가기 때문에<br>JScrollPane의 Component로 들어가는 JPanel안에 요소(JButton,JLabel)중 하나라도 "East","West"에 지정이 되있어야 한다.<br>

```java
public class ProductList {
  public static void main(String[] args) {

    if(pbDAO.basketList().size() == 0) {
			JPanel noData = new JPanel();
			noData.setBackground(new Color(255,254,230));
			JLabel msg = new JLabel("장바구니에 상품이 없습니다");
			msg.setFont(new Font("Lucida Grande", Font.BOLD, 20));
			noData.add(msg);
			scroll = new JScrollPane(noData);
			add(scroll);
			scroll.setBounds(0, 67, 600, 383);
			scroll.setVisible(true);
		} else {

			for(int i = 0; i < pbDAO.basketList().size(); ++i) {

				panel2_1.add(new Detail_P2_C(
						pbDAO.basketList().get(i).getImgPath(),
						pbDAO.basketList().get(i).getName(),
						pbDAO.basketList().get(i).getPrice(),
						pbDAO.basketList().get(i).getQuantity(),
						this));

				panel2.add(panel2_1.get(i));

				prices.add(Integer.parseInt(pbDAO.basketList().get(i).getPrice()));
			}
			scroll = new JScrollPane(panel2);
			add(scroll);

			scroll.setBounds(0, 67, 600, 383);
			scroll.setVisible(true);
		}
  }
}
```

</details>

<details>
	<summary>Cancel Seats & Rollback Button</summary>      
	
> Problem
> > 좌석을 고르는 과정에서 좌석을 선택한 후 마음이 바뀌어서 골랐던 것을 취소하기 위해 <br>한 번 더 클릭하면 원래의 색으로 돌아와야 했으나 버튼의 색깔을 받아오는 메서드를 찾지 못함.
> > > Solution 
> > > >각 버튼이 현재 선택이 되었는지 안되었는지 담아둘 배열을 전역변수로 만들어 두어 상태를 확인할 수 있다면 될 것 같다는 아이디어 반영.<br> 클래스에 boolean 타입의 배열을 만든뒤 false상태에서 클릭을 했을 경우 해당 index의 값을 true로 바꿔주고 색깔을 바꿔주었으며<br> true에서 다시 클릭을 했을 경우 false로 바꾼 뒤 원래의 색깔로 나오게 수정했다.

```java
	if(SeatChoice_1.th1e_btn_selected[index - 1])
         {
            SeatChoice_1.th1e_btn_selected[index - 1] = false;
            btn.setBackground(new Color(0x404040));
            SeatChoice_1.selected_cnt--;
            SeatChoice_1.ticket_price -= SeatChoice_1.th1e_btn_price[index - 1];
            SeatChoice_1.price_label.setText("일반: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "장애인: " + PeopleCheck.disable_cnt + "              " + "가격: " + SeatChoice_1.ticket_price);

         }
         else
         {
            if(SeatChoice_1.peoples > SeatChoice_1.selected_cnt)
            {
               SeatChoice_1.th1e_btn_selected[index - 1] = true;
               btn.setBackground(new Color(0xFF3333));
               SeatChoice_1.selected_cnt++;
               SeatChoice_1.ticket_price += SeatChoice_1.th1e_btn_price[index - 1];
               SeatChoice_1.price_label.setText("일반: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "장애인: " + PeopleCheck.disable_cnt + "              " + "가격: " + SeatChoice_1.ticket_price);
            }

```

</details>

<details>
	<summary>Duplicate selection error</summary>
	
> Problem
> > 인원수를 고르는 과정에서 인원수를 클릭한 뒤 마음이 바뀌어 다른 영화를 선택했을 때 <br>인원수를 고르는 프레임에 기존에 클릭돼있던 버튼이 그대로 클릭되어있는 문제가 발생함.
> > > Solution 
> > > > 인원수를 고르는 프레임이 떴을때 마다 버튼들을 초기화해준다면 해결이 될 것 같다는 아이디어 반영.<br>인원수를 고르다가 또는 좌석을 고르다가 다른 영화를 보고 싶어진 경우 이전으로 돌아가도 항상 0명에 버튼이 체크돼있도록 수정함.

```java
for(int i = 1; i < btns1.size(); i++) {
				adult_btn.get(i).setBackground(new Color(0x404040));
				child_btn.get(i).setBackground(new Color(0x404040));
				disable_btn.get(i).setBackground(new Color(0x404040));
				old_btn.get(i).setBackground(new Color(0x404040));
			}
			adult_cnt = 0;
			child_cnt = 0;
			disable_cnt = 0;
			old_cnt = 0;
			pre_adult_btn_num = 0;
			now_adult_btn_num = 0;
			pre_child_btn_num = 0;
			now_child_btn_num = 0;
			pre_disable_btn_num = 0;
			now_disable_btn_num = 0;
			pre_old_btn_num = 0;
			now_old_btn_num = 0;

		adult_btn.get(0).setBackground(new Color(0xCC0066));
		child_btn.get(0).setBackground(new Color(0xCC0066));
		disable_btn.get(0).setBackground(new Color(0xCC0066));
		old_btn.get(0).setBackground(new Color(0xCC0066));

```

</details>
	
<details>
	<summary>Check Type Verification</summary>   
	
> Problem
> > 좌석 선택중 장애인석의 숫자는 한정적인데 장애인이 아닌 사람이 장애인석을 예약하는 경우 오류 메시지를 띄워야 된다고 생각했으나<br> 사람 인원 중에서 장애인의 숫자를 알 수가 없었음.
> > > Solution 
> > > > 인원수를 전체인원이 아닌 장애인 인원을 변수에 따로 저장해두어 인원 수를 확인하면 될 것 같다는 아이디어 반영.<br>장애인 인원수보다 많은 수를 예약하려고 하면 에러 메시지를 나오게 설정해두어서 장애인석은 장애인만 예약할 수 있게 수정.

```java
if(PeopleCheck.disable_cnt == 0)
                  {
                     ErrorFrame frame = new ErrorFrame();
                     frame.getContentPane().setBackground(new Color(0x404040));
                     frame.setDefaultOptions();
                     JLabel label = new JLabel();
                     label.setText("장애인만 예약 가능합니다.");
                     label.setFont(new Font("돋움", Font.PLAIN|Font.BOLD, 30));
                     label.setForeground(Color.white);
                     label.setHorizontalAlignment(JLabel.CENTER);
                     frame.add(label);
                  }
                  else
                  {
                     if(PeopleCheck.disable_cnt > SeatChoice_1.disable_btn_cnt)
                     {
                        SeatChoice_1.th1a_btn_selected[index - 1] = true;
                        btn.setBackground(new Color(0xFF3333));
                        SeatChoice_1.disable_btn_cnt++;
                        SeatChoice_1.selected_cnt++;
                        SeatChoice_1.ticket_price += SeatChoice_1.th1a_btn_price[index - 1];
                        SeatChoice_1.price_label.setText("일반: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "장애인: " + PeopleCheck.disable_cnt + "              " + "가격: " + SeatChoice_1.ticket_price);
                     }
                     else
                     {
                        ErrorFrame frame = new ErrorFrame();
                        frame.getContentPane().setBackground(new Color(0x404040));
                        frame.setDefaultOptions();
                        JLabel label = new JLabel();
                        label.setText("장애인만 예약 가능합니다.");
                        label.setFont(new Font("돋움", Font.PLAIN|Font.BOLD, 30));
                        label.setForeground(Color.white);
                        label.setHorizontalAlignment(JLabel.CENTER);
                        frame.add(label);
                     }

```

</details>

</details>
	
<details>
	<summary>Get movie information</summary>

> Problem
>
> > 영화 시간을 선택하면 그에 따른 영화 정보와 다른 정보들이 같이 와야 하는 상황이 있었는데<br>
> > 버튼에서 가져올 수 있는것은 영화가 시작하는 시간 하나라서 이것으로 다른 정보들을 연결해서 찾기가 어려웠음<br>
> > 만약 같은 시간대에 상영하는 다른 영화들이 존재하면 어떤 영화의 시간인지 알 수 없기에 원하는 정보를 얻을 수 없었음<br>
> >
> > > Solution
> > >
> > > > 버튼을 만들 때 영화마다 영화 정보가 담겨있는 클래스를 따로 만들어서 <br>
> > > > 버튼의 리스너 기능을 추가할 때 그에 맞는 영화 클래스 정보를 담아 놓는 방법을 선택함.<br>
> > > > 1번 영화를 선택하면 버튼이 구현되어 있는 클래스 자체에 1번 영화의 정보를 담아 놓고
> > > > 시간 정보는 버튼의 이름에 설정해놓은 다음<br>
> > > > 버튼을 클릭하면 1번 영화가 담겨져 있는 클래스로 넘어가고<br>
> > > > 클래스에는 이미 데이터베이스에서 가져온 시간 정보와 영화 정보들이 담겨 있기에<br>
> > > > 시간대를 비교해서 해당 영화가 가지고 있는 다른 정보들을 가져오는 방식을 사용함.<br>

```java


```

</details>

---

## 📸 _ScreenShot_

<details>
<summary>로딩 화면</summary>
<div markdown="1">

![main](./MovieKiosk/image/md/%EB%A1%9C%EB%94%A9%EC%B0%BD.jpg)

</div>
</details>

<details>
<summary>메인 화면</summary>
<div markdown="1">

![main](./MovieKiosk/image/md/%EB%A9%94%EC%9D%B8%ED%99%94%EB%A9%B4.jpg)

</div>
</details>

<details>
<summary>가장 빨리 볼 수 있는 영화</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 012](./MovieKiosk/image/md/%EB%B9%A0%EB%A5%B8%EC%98%88%EB%A7%A4.jpg)

</div>
</details>     
	
<details>
<summary>전체 상영 시간표</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 011](./MovieKiosk/image/md/%EC%A0%84%EC%B2%B4.jpg)

</div>
</details>    
	
<details>
<summary>영화 인원 선택</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 004](./MovieKiosk/image/md/%EC%98%88%EB%A7%A4%EC%B0%BD.jpg)

</div>
</details>     
	
	
<details>
<summary>영화 좌석 선택</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 004](./MovieKiosk/image/md/%EC%98%88%EB%A7%A4%EC%B0%BD2.jpg/)

</div>
</details>     
	
	
<details>
<summary>영화 티켓 출력</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 002](./MovieKiosk/image/md/%EC%98%88%EB%A7%A4%EC%99%84%EB%A3%8C.jpg)

</div>
</details>

<details>
<summary>예매 번호로 현장 발권</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 002](./MovieKiosk/image/md/%ED%98%84%EC%9E%A5%EB%B0%9C%EA%B6%8C.jpg)
![KakaoTalk_Photo_2021-08-24-12-40-06 002](./MovieKiosk/image/md/%EC%B6%9C%EB%A0%A5.jpg)

</div>
</details>    
	
	
<details>
<summary>매점 메인 화면</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 007](https://user-images.githubusercontent.com/77534863/130552585-173b7a7c-d9fa-468f-86d0-9fc50fd2880e.jpeg)

</div>
</details>      
	
<details>
<summary>음식 상품 선택</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 010](./MovieKiosk/image/md/%EB%A7%A4%EC%A0%90.jpg)

</div>
</details>     
	
	
<details>
<summary>음식 장바구니 화면</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 008](./MovieKiosk/image/md/%EC%9E%A5%EB%B0%94%EA%B5%AC%EB%8B%88.jpg)

</div>
</details>

## 📸 _Demonstration Video_

<details>
<summary>GUI 화면 영상</summary>
<div markdown="1">

https://www.youtube.com/watch?v=glsCLeQRryQ

</div>
</details>

## 📂 _Reference_

- https://github.com/TeamProjectGroupNo1/movieKiosk
- https://github.com/seohyun319/Elderly_People_Kiosk_Project
- https://github.com/WoojaeJang/CafeKioskSystem-JavaWebProject
- https://woongbin96.tistory.com/m/70
