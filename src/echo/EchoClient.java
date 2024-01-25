package echo;

import java.util.*;
import java.net.*;
import java.io.*;

public class EchoClient {
    public static final String SERVER_IP = "127.0.0.1";
    public static final int PORT = 12345;

    public static void main(String[] args) throws IOException {

        Socket clientSocket = new Socket(SERVER_IP, PORT); //소켓 생성 및 연결
        System.out.println("클라이언트가 서버에 연결되었습니다.");

        BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 메세지를 입력하세요 (종료하려면 'q' 입력): ");
            String out = sc.nextLine();
            System.out.println("클라이언트 메세지: " + out);

            writer.println(out);
            writer.flush();// 데이터 송신
            if("q".equals(out)) break; // 연결 종료

            String in = reader.readLine(); // 데이터 수신
            System.out.println("서버 메세지: " + in);
            if("q".equals(in)) break; // 연결 종료
        }
        clientSocket.close(); // 소켓 닫음
    }
}