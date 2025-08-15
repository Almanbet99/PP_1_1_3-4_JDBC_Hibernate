//package jm.task.core.jdbc;
//
//import java.sql.Connection;
//
//public class TestConnection {
//    public static void main(String[] args) {
//        try {
//            Connection c = Util.getConnection();
//
//            if (c == null) {
//                System.out.println("❌ Соединение = null");
//            } else {
//                System.out.println("Соединение открыто: " + !c.isClosed());
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
