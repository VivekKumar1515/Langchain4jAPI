package dev.development4good.langchain4j.langchain4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AssistantController {
    Assistant assistant;

    @Autowired
    AssistantController(Assistant assistant) {
        this.assistant = assistant;
    }

    @RequestMapping(value = "/assistant", method=RequestMethod.GET)
    public String assistant(@RequestParam(value = "message", defaultValue = "What is so special about Edinburgh?") String message) {
        return assistant.chat(UUID.randomUUID().toString(), message);
    }
    
}
