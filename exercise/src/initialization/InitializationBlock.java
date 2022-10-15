package initialization;

public class InitializationBlock {
    /*
    * 초기화 블럭에는 '클래스 초기화 블럭'과 '인스턴스 초기화 블럭' 두 가지 종류가 있다.
    * 인스턴스 초기화 블럭은 클래스 내에 블럭 {}을 만들고 그 안에 코드만 작성하면 된다.
    * 클래스 초기화 블럭은 단순히 static을 덧붙이기만 하면 된다.
    * */

    static { /* 클래스 초기화 블럭: 클래스가 메모리에 처음 로딩될 때 한만만 수행됨 */}
    { /* 인스턴스 초기화 블럭: 인스턴스를 생성할 때마다 수행됨 */ }

    public class Car{
        static int count = 0;
        int serialNo;
        String name;
        {
            count++;
            serialNo = count;
        }

        public Car(String name){
            this.name = name;
        }
    }
}

