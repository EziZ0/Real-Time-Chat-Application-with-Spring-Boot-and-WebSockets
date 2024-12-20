package com.Chat.Chat.Application.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatMessage {
    private Long id;
    private String sender;
    private String content;

    @JsonProperty("sender")
    public String getSender() {
        return sender;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }
}
