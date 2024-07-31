package dev.development4good.langchain4j.langchain4j;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
interface Assistant {
    @SystemMessage("You are a polite assistant")
    String chat(@MemoryId String memoryId, @UserMessage String message);
}
