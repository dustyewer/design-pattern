package yewer.factorymethod;

import org.junit.Test;

public class LoggerTest {
    @Test
    public void loggerTest() {
        LoggerFactory loggerFactory = null;
        Logger logger = null;
        loggerFactory = new FileLoggerFactory(); // 真实应该是使用配置文件,或者反射
        logger = loggerFactory.createLogger();
        logger.writeLog();
    }

}
