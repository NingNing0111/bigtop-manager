package org.apache.bigtop.manager.ai.zhipu;

import dev.langchain4j.data.message.ChatMessage;
import dev.langchain4j.data.message.SystemMessage;
import dev.langchain4j.memory.ChatMemory;
import org.apache.bigtop.manager.ai.core.factory.AIAssistant;
import reactor.core.publisher.Flux;

/**
 * @Project: org.apache.bigtop.manager.ai.zhipu
 * @Author: pgthinker
 * @GitHub: https://github.com/ningning0111
 * @Date: 2024/8/22 23:55
 * @Description:
 */
public class ZhiPuAIAssistant implements AIAssistant {
    private static final String PLATFORM_NAME = "openai";
    private static final String BASE_URL = "https://api.openai.com/v1";
    private static final String MODEL_NAME = "chatglm3-6b";
    @Override
    public Object getId() {
        return null;
    }

    @Override
    public Flux<String> streamAsk(ChatMessage userMessage) {
        return null;
    }

    @Override
    public String ask(ChatMessage userMessage) {
        return null;
    }

    @Override
    public ChatMemory getMemory() {
        return null;
    }

    @Override
    public String getPlatform() {
        return null;
    }

    @Override
    public void setSystemPrompt(SystemMessage systemPrompt) {

    }

    @Override
    public void resetMemory() {

    }
}
