package template.method;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("serial")
		Map<String, Object> properties = new HashMap<String, Object>() {
			{
				put("first", "1");
				put("second", "2");
				put("third", "3");
			}
		};

		FileGenerator file = new CompressedXMLgenerator();

		file.generate("CompressedXMLgenerator.zip", properties);

		file = new EncryptedPropertyGenerator(3);
		
		file.generate("EncryptedPropertyGenerator", properties);
	}

}
