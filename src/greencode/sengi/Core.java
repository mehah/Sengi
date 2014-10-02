package greencode.sengi;

import java.io.IOException;

import javax.servlet.ServletContext;

import greencode.kernel.CoreFileJS;
import greencode.kernel.implementation.PluginImplementation;

public class Core implements PluginImplementation {
	public void init(String projectName, ClassLoader classLoader, ServletContext context, CoreFileJS coreFileJS) {
		try {
			coreFileJS.append(classLoader.getResource("greencode/sengi/jsfiles/sengiCore.js"));
			coreFileJS.save();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}		
	}

	public void destroy() {
		
	}
}
