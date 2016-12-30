package testGenerator;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class myGenerator {

//	public static void main(String []args)throws Exception{
//		List<String> warnings = new ArrayList<String>();
//		File configFile=new File(System.getProperty("user.dir").replaceAll("\\\\", "\\\\")+"\\generatorConfig.xml");
//		File configFile=new File(myGenerator.class.getResource("/generatorConfig.xml").toURI());
//		ConfigurationParser cp = new ConfigurationParser(warnings);
//		Configuration config = cp.parseConfiguration(configFile);
//		DefaultShellCallback shellCallback = new DefaultShellCallback(true);
//		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
//		myBatisGenerator.generate(null);
//		System.out.println(warnings);
//	}
	public static void main(String []args)throws Exception{
		List<String> warnings = new ArrayList<String>();
//		File configFile=new File(myGenerator.class.getResource("/generatorConfig.xml").toURI());
		File configFile=new File(System.getProperty("user.dir").replaceAll("\\\\", "\\\\")+"\\generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		for (Iterator<Context> it=config.getContexts().iterator(); it.hasNext();) {
			it.next().setServicePackage("service");
		}
		DefaultShellCallback shellCallback = new DefaultShellCallback(true);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
		myBatisGenerator.generate(null);
		System.out.println(warnings);
		}
}
