package yewer.factorymethod;

import org.junit.Test;

public class LoggerByXmlTest {
    @Test
    public void loggerByXmlTest() {
        LoggerFactory loggerFactory = null;
        Logger logger = null;
        loggerFactory = (LoggerFactory) XmlUtil.getBean();
        logger = loggerFactory.createLogger();
        logger.writeLog();
    }
}
