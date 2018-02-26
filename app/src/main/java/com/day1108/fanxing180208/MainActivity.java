package com.day1108.fanxing180208;
//http://www.jikexueyuan.com/course/142.html
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**Top1 三种经纬度类型
         * int
         * float
         * String
         */
//        Top1();
//
//        Top2();

        /**
         * 构造方法中使用泛型
         */
//        Con3();


        /**
         * 指定多个泛型
         */
//        Gen4();


        /**
         * 通配符的使用
         */
//        Info5<String> i5 = new Info5<>();
//        i5.setKey("jikexueyuan");
//        Info5_F(i5);

        /**
         * 泛型接口
         */
//        GenInter6_F();

        /**
         * 泛型方法
         */
//        Gener7_F();


        /**
         * 泛型数组
         */
        GenerArray8_F();
    }



    /**
     * 泛型数组
     */
    private void GenerArray8_F() {
        String arr[] = {"www", "jikexueyuan", "com"};
        GenArray8 g8 = new GenArray8();
        g8.tell(arr);
    }

    /**
     * 泛型方法
     */
    private void Gener7_F() {
        Gener7 g7 = new Gener7();
        String str = g7.tell("jikexueyuan");
        LogCat.i("泛型方法str==========" + str);
        int i = g7.tell(10);
        LogCat.i("泛型方法i============" + i);


    }

    /**
     * 泛型接口
     */
    private void GenInter6_F() {
        Gin6<String> g6 = new Gin6<String>("jikexueyuan");

    }



    /**
     * 通配符的使用:无论什么类型都可以，用?号表示
     */
    private void Info5_F(Info5<?> i) {

        LogCat.i("通配符的使用=======" + i);

    }


    private void Gen4() {
        Gen4<String, Integer> g4 = new Gen4<>();
        g4.setKey("key");
        g4.setTake(10);
        LogCat.i("指定多个类型=====" + g4.getKey() + "====" + g4.getTake());
    }


    private void Con3() {
        Con3<String> con3 = new Con3<>("构造方法中使用泛型");
        LogCat.i("c.getValue()========" + con3.getValue());
    }


    private void Top2() {
        Point2<String> p2 = new Point2<>();
        p2.setX("经度为：10");
        p2.setX("㭏度为：100");

    }

    private void Top1() {
        Point p = new Point();
       /* p.setX(10);
        p.setY(10);*/
       p.setX(10.1f);
       p.setY(10.1f);
       float px = (Float) p.getX();
       float py = (Float) p.getY();
       LogCat.i("px================" + px);
       LogCat.i("py================" + py);
    }

}
