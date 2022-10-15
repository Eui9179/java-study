package constuctor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstructorStudy {
    String a;
    String b;

    // 기본 생성자
    ConstructorStudy(){}

    // this 를 이용해서 인스턴스 생
    ConstructorStudy(String a){
        this(a, "btest");
    }

    ConstructorStudy(String a, String b){
        this.a = a;
        this.b = b;
    }

    // 인스턴스 복사
    ConstructorStudy(ConstructorStudy constructorStudy){
        this(constructorStudy.a, constructorStudy.b);
    }

    public static void main(String[] args){
        ConstructorStudy cs1 = new ConstructorStudy("a", "b");
        ConstructorStudy cs2 = new ConstructorStudy(cs1);

        System.out.println(cs2.b);
    }
}
