package myGenerator;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class ServiceGenerator {

	/**
	 * @author fengchao
	 * @data 2017年1月1日
	 * @注释 根据generator.xml在指定包路径下生成service以及ServiceImpl文件,generator.xml必须在根路径下
	 * @param targetPackage 生成service包的全限定名
	 * 
	 */
	public static void generator(String targetPackage) {
		List<String> warnings = new ArrayList<String>();
		File configFile = new File(System.getProperty("user.dir").replaceAll("\\\\", "\\\\") + "\\generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config;
		try {
			config = cp.parseConfiguration(configFile);
			for (Iterator<Context> it = config.getContexts().iterator(); it.hasNext();) {
				it.next().setServicePackage(targetPackage);
			}
			DefaultShellCallback shellCallback = new DefaultShellCallback(true);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
			myBatisGenerator.generate(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(warnings.size()>0){
			System.out.println(warnings);
		}
	}
}
