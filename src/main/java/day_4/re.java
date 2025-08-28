package day_4;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class re implements IRetryAnalyzer {
    int count = 0;
    int maxRetry = 2; 

    @Override
    public boolean retry(ITestResult result) {
        if (count < maxRetry) {
            count++;
            return true; 
        }
        return false; 
    }
}



