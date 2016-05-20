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

/**
 * 参数校验工具类
 * @author wangcheng
 * 2016年5月20日
 */
public class Assert {
	/**
	 * 私有化构造函数，使其静态单例化
	 */
	private Assert(){}
	
	/**
	 * 校验参数是否不为空，如果为空则抛出异常
	 * @param obj
	 */
	public static void isNotNull(Object obj) {
		isNotNull(obj, "[Assert Failed] the obj is null");
	}
	
	/**
	 * 校验参数是否不为空，如果为空则抛出异常
	 * @param obj
	 * @param message 自定义异常打印信息
	 */
	public static void isNotNull(Object obj, String message) {
		if (null == obj) {
			throw new IllegalArgumentException(message);
		}
	}
	
	/**
	 * 校验参数是否为空
	 * @param obj
	 * @param message
	 */
	public static void isNull(Object obj, String message) {
		if (null != obj) {
			throw new IllegalArgumentException(message);
		}
	}
	
	public static void isNull(Object obj) {
		isNull(obj, "[Assert Failed] the obj is not null");
	}
	
	/**
	 * 校验参数是否为True
	 * @param param
	 * @param message 自定义异常打印信息
	 */
	public static void isTrue(boolean param, String message) {
		if (!param) {
			throw new IllegalArgumentException(message);
		}
	}
	
	/**
	 * 校验参数是否为True
	 * @param param
	 */
	public static void isTrue(boolean param) {
		isTrue(param, "[Assert Failed] the param is false");
	}
	
	/**
	 * 校验参数是否为False
	 * @param param
	 */
	public static void isFalse(boolean param) {
		isFalse(param, "[Assert Failed] the param is true");
	}
	
	/**
	 * 校验参数是否为False
	 * @param param
	 * @param message 自定义异常打印信息
	 */
	public static void isFalse(boolean param, String message) {
		if (param) {
			throw new IllegalArgumentException(message);
		}
	}
	
}
