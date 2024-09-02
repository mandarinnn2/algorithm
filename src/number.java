import java.io.*;
import java.util.StringTokenizer;

public class number {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count  = st.countTokens();

        int x = 0;

        while(st.hasMoreTokens()){
            x += Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(x));

        bw.flush();
        bw.close();
    }
}
