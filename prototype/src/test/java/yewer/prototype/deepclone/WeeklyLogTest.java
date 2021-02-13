package yewer.prototype.deepclone;

import org.junit.Test;

public class WeeklyLogTest {
    @Test
    public void test01() {
        WeeklyLog log_previous, log_new = null;
        log_previous = new WeeklyLog();
        Attachment attachment = new Attachment();
        log_previous.setAttachment(attachment);
        try {
            log_new = log_previous.deepClone();
        } catch (Exception e) {
            System.out.println("deep clone error");
        }
        System.out.println("周报是否相同" + log_previous + log_new);
        System.out.println("附件是否相同" + log_previous.getAttachment() + log_new.getAttachment());

    }
}
