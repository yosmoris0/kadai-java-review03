package baseball;

public class Review03 {

    public static void main(String[] args) {

        // チームを生成
        BaseBallTeam team01 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam team02 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam team03 = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam team04 = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam team05 = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam team06 = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        team01.report();     // 東京ヤクルトスワローズの報告
        team02.report();     // 横浜DeNAベイスターズの報告
        team03.report();     // 阪神タイガースの報告
        team04.report();     // 読売ジャイアンツの報告
        team05.report();     // 広島東洋カープの報告
        team06.report();     // 中日ドラゴンズの報告

        }
}