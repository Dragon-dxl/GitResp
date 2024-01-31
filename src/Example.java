import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static String generatePrdTrueId(String prodIdStr, String excelFileName, String keyWord) {
        Pattern pattern = Pattern.compile(keyWord);
        Matcher matcher = pattern.matcher(excelFileName);

        if (matcher.find()) {
            String digits = matcher.group().replaceAll("[^0-9]+", "");
            return prodIdStr.replaceAll("\\[.*?\\}", digits);
        } else {
            return prodIdStr;
        }
    }

    public static void main(String[] args) {
        String prodIdStr = "CTZQYFS00[0-9]{1}";
        String keyWord = "赢丰收([0-9]{1})号";
        String excelFileName = "年年赢丰收9号";

        String prdTrueId = generatePrdTrueId(prodIdStr, excelFileName, keyWord);
        System.out.println(prdTrueId);

        excelFileName = "年年赢丰收3号";
        prdTrueId = generatePrdTrueId(prodIdStr, excelFileName, keyWord);
        System.out.println(prdTrueId);
    }
}