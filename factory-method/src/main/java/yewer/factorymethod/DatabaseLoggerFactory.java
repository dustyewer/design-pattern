package yewer.factorymethod;

public class DatabaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        // 链接数据库
        // 创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();
        return logger;
    }

}
