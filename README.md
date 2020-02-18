# Circle-override-_Test_200218_maria5845

[문제27]오버라이드(override)를 이용하여 다음 프로그램을 작성하시오
(1)클래스명: Circle
   필드명  : #r:int        
           #size:double     
           #PI:double       ==>초기값 3.141592, final


   메서드  : +Circle(r:int)   ==> 반지름 대입
           +compute():void       
           +output():void 

(2)클래스명 :  CircleArea     ==> Circle클래스를 상속하시오
   메서드   :  +CircleArea(r:int)
             +compute():void      ==> 원의 넓이=반지름 *반지름*3.141592
             +output():void         ==> 출력      
       
(3)클래스명 :  CircleRound    ==> Circle클래스를 상속하시오
   메서드    :  +CircleRound(r:int)
              +compute():void      ==>원의둘레=반지름 * 2 * 3.141592
              +output():void       ==>출력

(4)처리방법
   CircleArea, CircleRound클래스로 메모리할당 받고
   compute(),output()메서드를  Overriding(재정의)하여 각각 값을 구하시오.

(5)main()에 추가
   CircleArea   ob1 = new CircleArea(10);
   CircleRound  ob2 = new CircleRound(10);
   ob1.compute();
   ob1.output();
   ob2.compute();
   ob2.output();

[출력결과]
원의넓이 : 314.1592
원의둘레 : 62.83184
