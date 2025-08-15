package jm.task.core.jdbc;

import jm.task.core.jdbc.util.Util;
import java.sql.Connection;

public class Testconnection {
    public static void main(String[] args) {
        Connection c = null;
        try {
            c = Util.getConnection();
            System.out.println("OK: " + (c != null && !c.isClosed()));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (c != null) c.close();
            } catch (Exception ignored) {}
        }
    }
}


