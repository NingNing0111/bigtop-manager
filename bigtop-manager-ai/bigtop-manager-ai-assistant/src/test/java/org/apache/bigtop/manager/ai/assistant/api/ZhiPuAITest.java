/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.bigtop.manager.ai.assistant.api;

import org.apache.bigtop.manager.ai.assistant.GeneralAssistantFactory;
import org.apache.bigtop.manager.ai.assistant.provider.AIAssistantConfig;
import org.apache.bigtop.manager.ai.core.enums.PlatformType;
import org.apache.bigtop.manager.ai.core.factory.AIAssistant;
import org.apache.bigtop.manager.ai.core.factory.AIAssistantFactory;
import org.apache.bigtop.manager.ai.core.provider.AIAssistantConfigProvider;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.langchain4j.model.zhipu.chat.ChatCompletionModel;

public class ZhiPuAITest {
    private AIAssistantConfigProvider configProvider = AIAssistantConfig.builder()
            .set("apiKey", "keyValue")
            // The `baseUrl` has a default value that is automatically generated based on the `PlatformType`.
            .set("modelName", ChatCompletionModel.GLM_3_TURBO.toString())
            .set("baseUrl", "https://open.bigmodel.cn")
            .build();
    private AIAssistant aiAssistant;

    @BeforeEach
    public void init() {
        AIAssistantFactory aiAssistantFactory = new GeneralAssistantFactory();
        aiAssistant = aiAssistantFactory.create(PlatformType.ZHIPU, configProvider);
    }

    @Test
    public void simpleChat() {
        String resp = aiAssistant.ask("Hi, Please introduce yourself.");
        System.out.println(resp);
    }
}
