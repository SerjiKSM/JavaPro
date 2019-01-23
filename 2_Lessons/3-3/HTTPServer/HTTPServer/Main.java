package ua.kiev.prog;

public class Main {
    public static void main(String[] args) {
//        final HTTPServer server = new HTTPServer(8080, "C:\\temp");
        //final HTTPServer server = new HTTPServer(8082, "D:\\КурсыJAVA\\JavaPro\\tasksInClass\\2_Lessons\\3-3\\HTTPServer\\HTTPServer");
        final HTTPServer server = new HTTPServer(8082, "D:\\temp");
        server.start();

        System.out.println("Server started...");

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                server.stop();
                System.out.println("Server stopped!");
            }
        });
    }
}
