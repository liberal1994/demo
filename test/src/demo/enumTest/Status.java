package demo.enumTest;

import java.util.Enumeration;

public enum Status {
    READ_UNCOMMITTED(0, "读未提交"),
    READ_COMMITTED(1, "读已提交"),
    REPEATED_READ(2, "可重复读"),
    SERIALIZABLE(3, "串行");
    private int status;
    private String info;

    Status(int status, String info) {
        this.status = status;
        this.info = info;
    }

    public static Status selectByStatus(int status) {
        Status[] values = Status.values();
        for (Status element : values) {
            if (element.status == status) {
                return element;
            }
        }
        return null;
    }
}
