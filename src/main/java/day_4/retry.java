package day_4;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry implements IRetryAnalyzer {
    int count = 0;
    int maxRetry = 2;  // test max 2 baar retry hoga

    @Override
    public boolean retry(ITestResult result) {
        if (count < maxRetry) {
            count++;
            System.out.println("Retrying test: " + result.getName() + " | Attempt " + (count + 1));
            return true;
        }
        return false;
    }
}
