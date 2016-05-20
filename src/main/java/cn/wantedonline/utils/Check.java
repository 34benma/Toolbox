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

import java.util.Arrays;

/**
 * 有返回值的校验工具
 * @author wangcheng
 * 2016年5月20日
 */
public class Check {
	private Check(){}
	/**
	 * 校验obj是否为空
	 * @param obj 校验对象
	 * @return true 为空
	 */
	public static boolean isNull(Object obj) {
		return obj == null;
	}
	
	/**
	 * 校验obj是否不为空
	 * @param obj
	 * @return
	 */
	public static boolean isNotNull(Object obj) {
		return obj != null;
	}
	
	/**
	 * 校验param是否为正
	 * @param param
	 * @return
	 */
	public static boolean isPositive(int param) {
		return param > 0 ? true : false;
	}
	
	/**
	 * 校验param是否为非正
	 * @param param
	 * @return
	 */
	public static boolean isNotPositive(int param) {
		return !isPositive(param);
	}
	
	/**
	 * 校验param是否为正
	 * @param param
	 * @return
	 */
	public static boolean isPositive(long param) {
		return param > 0 ? true : false;
	}
	
	/**
	 * 校验param是否为非正
	 * @param param
	 * @return
	 */
	public static boolean isNotPositive(long param) {
		return !isPositive(param);
	}
	
	/**
	 * 校验param是否为负
	 * @param param
	 * @return
	 */
	public static boolean isNegative(int param) {
		return param < 0 ? true : false;
	}
	
	/**
	 * 校验param是否为负
	 * @param param
	 * @return
	 */
	public static boolean isNegative(long param) {
		return param < 0 ? true : false;
	}
	
	/**
	 * 校验param是否为非负
	 * @param param
	 * @return
	 */
	public static boolean isNotNegative(int param) {
		return !isNegative(param);
	}
	
	/**
	 * 校验param是否为非负
	 * @param param
	 * @return
	 */
	public static boolean isNotNegative(long param) {
		return !isNegative(param);
	}
	
    /**
     * 0检查
     * @param param
     * @return
     */
    public static boolean isZero(int param) {
        return param == 0 ? true : false;
    }

    /**
     * 非0检查
     * @param param
     * @return
     */
    public static boolean isNotZero(int param) {
        return param != 0 ? true : false;
    }

    /**
     * 长整型0检查
     * @param param
     * @return
     */
    public static boolean isZero(long param) {
        return param == 0 ? true : false;
    }

    /**
     * 长整型非0检查
     * @param param
     * @return
     */
    public static boolean isNotZero(long param) {
        return param != 0 ? true : false;
    }

    /**
     * 字符串空校验，包括null和""
     * @param param
     * @return
     */
    public static boolean isEmptyStr(String param) {
        return isNull(param) || "".equals(param);
    }
    
    /**
     * 校验参数是否是 0 或 1
     * @param param
     * @return
     */
    public static boolean isBinary(int param) {
        return param >> 1 == 0 ? true : false;
    }

    /**
     * 校验参数是否不是 0 或 1
     * @param param
     * @return
     */
    public static boolean isNotBinary(int param) {
        return param >> 1 == 0 ? false : true;
    }

    /**
     * 校验某个字符串长度是否大于
     * @param str
     * @param length 不包含上限
     * @return
     */
    public static boolean strMoreLen(String str, int length) {
        return str.length() > length ? true : false;
    }

    /**
     * 校验某个字符串长度是否小于
     * @param str
     * @param length 不包含下限
     * @return
     */
    public static boolean strLessLen(String str, int length) {
        return str.length() < length ? true : false;
    }

    /**
     * 判断param是否在values里
     * @param param
     * @param values
     * @return
     */
    public static boolean paramIn(Object param, Object... values) {
        return Arrays.asList(values).contains(param);
    }

    /**
     * 判断param是否不在values里
     * @param param
     * @param values
     * @return
     */
    public static boolean paramNotIn(Object param, Object... values) {
        return !Arrays.asList(values).contains(param);
    }
	
}
