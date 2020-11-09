package StreamTasks.WrapperForAmigoOutputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionFileOutputStream implements AmigoOutputStream{

    private AmigoOutputStream aos;

    public QuestionFileOutputStream(AmigoOutputStream aos){
        this.aos = aos;
    }

    @Override
    public void flush() throws IOException {
        aos.flush();
    }

    @Override
    public void write(int b) throws IOException {
        aos.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        aos.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        aos.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line.equals("Д")){
            aos.close();
        }
    }
}
