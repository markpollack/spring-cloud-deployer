/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.deployer.resource.support;

import org.junit.Test;

import java.io.File;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Mark Pollack
 */
public class DownloadingUrlResourceTests {

	@Test
	public void test() throws Exception {
		DownloadingUrlResource httpResource = new DownloadingUrlResource("https://repo.spring.io/libs-release/org/springframework/cloud/stream/app/file-sink-rabbit/1.2.0.RELEASE/file-sink-rabbit-1.2.0.RELEASE.jar");
		File file1 = httpResource.getFile();
		File file2 = httpResource.getFile();
		assertThat(file1, is(equalTo(file2)));
		assertThat(file1.getName(), is(equalTo("6af04efff943e5482911ef00472e796c41c6d411-filesinkrabbit120RELEASEjar")));
	}
}
