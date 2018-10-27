package template.method;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompressedXMLgenerator implements FileGenerator {

	@Override
	public String generateContent(Map<String, Object> properties) {
		var propFileBuilder = new StringBuilder();
		propFileBuilder.append("<properties>");

		properties.forEach((key, value) -> {
			propFileBuilder.append("<" + key + ">" + value + "</" + key + ">");
		});
		
		propFileBuilder.append("</properties>");

		return propFileBuilder.toString();
	}

	@Override
	public byte[] process(byte[] bytes) throws IOException {
		var byteOut = new ByteArrayOutputStream();
		var out = new ZipOutputStream(byteOut);
		out.putNextEntry(new ZipEntry("XMLgenerator"));
		out.write(bytes);
		out.closeEntry();
		out.close();
		return byteOut.toByteArray();

	}

}
