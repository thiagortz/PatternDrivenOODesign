package template.method;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public interface FileGenerator {

	default void generate(String name, Map<String, Object> properties) throws IOException {
		String content = generateContent(properties);
		var bytes = content.getBytes();
		bytes = process(bytes);
		FileOutputStream fileOut = new FileOutputStream(name);
		fileOut.write(bytes);
		fileOut.close();
	}

	String generateContent(Map<String, Object> properties);

	byte[] process(byte[] bytes) throws IOException;

}
