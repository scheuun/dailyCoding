package echo;

import java.util.*;
import java.net.*;
import java.io.*;

public class EchoServer {
    public static final int PORT = 12345; // 포트 지정

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(PORT); // 소켓 생성
        System.out.println("서버 연결 완료 PORT: " + PORT);
        System.out.println("클라이언트 연결 대기중");

        Socket clientSocket = serverSocket.accept(); // 대기 및 연결 수락
        System.out.println("클라이언트 연결 완료 IP 주소: " + clientSocket.getInetAddress()
                + "PORT 번호" + clientSocket.getPort());

        BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
        Scanner sc = new Scanner(System.in);

        while (true) {
            String in = reader.readLine(); // 메세지 수신
            if ("q".equals(in)) break; // 연결 종료
            System.out.println("클라이언트 메세지: " + in);

            System.out.print("전송할 메세지를 입력하세요 (종료하려면 'q' 입력): ");
            String out = sc.nextLine();
            System.out.println("서버 메세지: " + out);

            writer.println(out);
            writer.flush(); // 메세지 송신
            if ("q".equals(out)) break; // 연결 종료
        }
        clientSocket.close(); // 소켓 닫음
    }
}