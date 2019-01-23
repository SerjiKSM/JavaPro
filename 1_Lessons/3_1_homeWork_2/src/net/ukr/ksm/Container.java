package net.ukr.ksm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface SaveToPath {
    String path();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Save {
}

@SaveToPath(path = "D:\\Test\\text.txt")
class Container {
    private String string = "Hello https://prog.kiev.ua/forum";

    @Save
    public void save(String path) {

        FileWriter writerFile = null;

        try {
            File file = new File(path);
            writerFile = new FileWriter(file);
            writerFile.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writerFile != null) {
                try {
                    writerFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
