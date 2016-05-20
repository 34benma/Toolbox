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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * 测试Assert类
 * @author wangcheng
 * 2016年5月20日
 */
public class TestAssert {
	
	@Test
	public void testIsNotNull1() {
		Object obj = null;
		try {
			Assert.isNotNull(obj);
			fail("未捕捉到异常");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	public void testIsNotNull2() {
		Object obj = new Object();
		try {
			Assert.isNotNull(obj);
			assertTrue(true);
		} catch (IllegalArgumentException e) {
			assertTrue(false);
		}
	}

}
