package animal;

public class Animal {

    // フィールドの定義
    private String name; // 名前
    private int age; //年齢

    // コンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //sayメソッドの追加
    public void say() {
        System.out.println(this.name + "です。" + this.age + "歳です。");
    }

}
