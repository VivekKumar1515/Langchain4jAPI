package dev.development4good.langchain4j.langchain4j;

import dev.langchain4j.memory.chat.ChatMemoryProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;

@Configuration
public class AssistantConfiguration {
    /**
     * This chat memory will be used by an {@link Assistant}
     */
    @Bean
    ChatMemoryProvider chatMemoryProvider() {
        return memoryId -> MessageWindowChatMemory.withMaxMessages(10);
    }
}
