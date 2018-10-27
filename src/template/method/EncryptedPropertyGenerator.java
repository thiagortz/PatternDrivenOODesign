package template.method;

import java.io.IOException;
import java.util.Map;

public class EncryptedPropertyGenerator implements FileGenerator {

	// Caesar cipher
	private int delay;

	public EncryptedPropertyGenerator(int delay) {
		this.delay = delay;
	}

	@Override
	public String generateContent(Map<String, Object> properties) {
		var propFileBuilder = new StringBuilder();

		properties.forEach((key, value) -> {
			propFileBuilder.append(key + "=" + value + "\n");
		});

		return propFileBuilder.toString();
	}

	@Override
	public byte[] process(byte[] bytes) throws IOException {
		var newBytes = new byte[bytes.length];
		for (int i = 0; i < bytes.length; i++) {
			newBytes[i] = (byte) ((bytes[i] + delay) % Byte.MAX_VALUE);

		}
		return newBytes;
	}

}
