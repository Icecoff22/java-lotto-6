package lotto.view;

public class LottoView {
    public static final String START_MESSAGE = "구입금액을 입력해 주세요.";
    public static final String NUMBER_OF_BUYS_MESSAGE = "%s개를 구매했습니다.";
    public static final String INPUT_MATCH_NUMBER_MESSAGE = "당첨 번호를 입력해 주세요.";
    public static final String INPUT_BONUS_NUMBER_MESSAGE = "보너스 번호를 입력해 주세요.";
    public static final String MATCH_STATISTICS_MESSAGE = "당첨 통계";
    public static final String TOTAL_RETURN_MESSAGE = "총 수익률은 %s입니다.";

    public void startMessage(){
        System.out.println(START_MESSAGE);
    }
    public void buyMessage(String numberOfBuys){
        System.out.printf(NUMBER_OF_BUYS_MESSAGE,numberOfBuys);
    }
    public void inputMatchNumberMessage(){
        System.out.println(INPUT_MATCH_NUMBER_MESSAGE);
    }
    public void inputBonusNumberMessage(){
        System.out.println(INPUT_BONUS_NUMBER_MESSAGE);
    }
    public void matchStatisticsMessage(){
        System.out.println(MATCH_STATISTICS_MESSAGE);
    }
    public void totalReturnMessage(){
        System.out.println(TOTAL_RETURN_MESSAGE);
    }
}
