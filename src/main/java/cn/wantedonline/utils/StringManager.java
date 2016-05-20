/**
 * Copyright [2016-2026] wangcheng(wantedonline@outlook.com)
 *
 *Licensed under the Apache License, Version 2.0 (the "License");
 *you may not use this file except in compliance with the License.
 *You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *Unless required by applicable law or agreed to in writing, software
 *distributed under the License is distributed on an "AS IS" BASIS,
 *WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *See the License for the specific language governing permissions and
 *limitations under the License.
 */
package cn.wantedonline.utils;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * 字符串管理工具类<br />
 * 借助于ResourceBundle类，管理国际化文件
 * 通过key获取相应的value
 * 用途：
 * 项目代码中嵌套的字符串打印字符国际化处理
 * @author wangcheng
 *
 */
public class StringManager {
	
	private ResourceBundle bundle = null;
	
	private static HashMap<String,StringManager> managers = new HashMap<>();
	
	private StringManager(String packageName,String localString) {
		String bundleName = packageName + "." + localString;
		this.bundle = ResourceBundle.getBundle(bundleName);
	}
	
	public String getString(String key) {
		if (null == key) {
			String msg = "key is null";
			throw new NullPointerException(msg);
		}
		
		String str = null;
		try {
			str = bundle.getString(key);
			
		} catch (MissingResourceException mre) {
			str = "Cannot find message associated with key '" + key + "'";
			
		}
		return str;
	}
	
	public String getString(String key, Object[] args) {
		String iString = null;
		String value = getString(key);
		
		try {
			Object[] nonNullArgs = args;
			for (int i = 0; i < nonNullArgs.length; i++) {
				if (null == args[i]) {
					if (nonNullArgs == args) nonNullArgs = args.clone();
					nonNullArgs[i] = "null";
				}
			}
			
			iString = MessageFormat.format(value, nonNullArgs);
			
		} catch (IllegalArgumentException iae) {
			StringBuilder sb = new StringBuilder();
			sb.append(value);
			for (int i = 0; i < args.length; i++) {
				sb.append("args [" + i + "] =" + args[i]);
			}
			iString = sb.toString();
		}
		return iString;
	}
	
	public String getString(String key, Object arg1) {
		Object[] args = {arg1};
		return getString(key, args);
	}
	
	public String getString(String key, Object arg1, Object arg2) {
		Object[] args = {arg1, arg2};
		return getString(key, args);
	}
	
	public String getString(String key, Object arg1, Object arg2, Object arg3) {
		Object[] args = {arg1, arg2, arg3};
		return getString(key,args);
	}
	
	/**
	 * 工厂类方法，资源文件名自定义
	 * 此时文件命名规范为：
	 * <strong>your_str_filename_zh_CN.properties</strong>
	 * @param packageName 资源文件所在包包名，指定后该包所有类文件字符串将从该字符串管理器中获取
	 * @param localString 资源文件名
	 * @return
	 */
	public static StringManager getManager(String packageName, String localString) {
		if (null == packageName) {
			String msg = "key is null";
			throw new NullPointerException(msg);
		}
		
		if (null == localString) {
			String msg = "no localString";
			throw new NullPointerException(msg);
		}
		
		StringManager manager = managers.get(packageName);
		if (null == manager) {
			manager = new StringManager(packageName , localString);
			managers.put(packageName, manager);
		}
		
		return manager;
	}
	
	/**
	 * 工厂类方法:将资源文件名默认设置为"localString"
	 * 此时文件命名规范为:
	 * <strong>localString_zh_CN.properties</strong>
	 * <strong>localString_en_US.properties</strong>
	 * @param packageName
	 * @return
	 */
	public static StringManager getManager(String packageName) {
		return getManager(packageName,"localString");
	}
}
