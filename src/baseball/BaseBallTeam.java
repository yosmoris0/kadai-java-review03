package baseball;

public class BaseBallTeam {

    // フィールド
    private String name; // チーム名
    private int win; // 勝利数
    private int lose; // 敗北数
    private int draw; // 引き分け数
    
    // コンストラクタ
    public BaseBallTeam() {
    }

    // 引数ありコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // 勝率計算メソッド
    public double getRate() {
        double rate = (double)win / (win + lose);
        return rate;
    }

    // 報告するメソッド
    public void report() {
        double rate = getRate();
        System.out.println(name + " の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、"
            + "勝率は " + rate + "です。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
}

