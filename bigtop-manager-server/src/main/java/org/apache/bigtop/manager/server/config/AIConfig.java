package org.apache.bigtop.manager.server.config;

import org.apache.bigtop.manager.ai.assistant.GeneralAssistantFactory;
import org.apache.bigtop.manager.ai.assistant.provider.LocSystemPromptProvider;
import org.apache.bigtop.manager.ai.core.factory.AIAssistantFactory;
import org.apache.bigtop.manager.ai.core.provider.SystemPromptProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AIConfig {

    @Bean
    public SystemPromptProvider systemPromptProvider(){
        return new LocSystemPromptProvider();
    }

    @Bean
    public AIAssistantFactory aiAssistantFactory(SystemPromptProvider systemPromptProvider){
        return new GeneralAssistantFactory(systemPromptProvider);
    }
}
