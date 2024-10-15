package animal;

//Animalクラスを継承し、Thinkableインターフェイスの実装
public class Human extends Animal implements Thinkable {

    //趣味フィールドの定義
    private String hobby;

    // コンストラクタ
    public Human(String name, int age, String hobby) {

        super(name, age); //スーパークラスのコンストラクタを利用
        this.hobby = hobby; //hobbyの初期値の設定
    }

    @Override
    //thinkメソッドの実装
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }

}
