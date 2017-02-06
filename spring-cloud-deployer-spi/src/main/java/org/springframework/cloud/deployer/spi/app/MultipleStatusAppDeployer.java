/*
 * Copyright 2016 the original author or authors.
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

package org.springframework.cloud.deployer.spi.app;

import java.util.Map;

/**
 * Extension of AppDeployer that adds an additional status method which takes
 * multiple deployment ids.
 */
public interface MultipleStatusAppDeployer extends AppDeployer {


    /**
     * Return the {@link AppStatus} for all the apps represented by
     * multiple deployment ids
     *
     * @param ids the array of app deployment id, as returned by {@link #deploy}
     * @return a Map of deployment id and app deployment status
     */
    Map<String, AppStatus> statuses(String... ids);

}
