package Messager;

import java.lang.module.ModuleDescriptor;

@WithBuilder
public class MessageBuilder {
    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;



    public static class Builder {
        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private long timestamp;

        public Builder messageType(MessageType messageType){
            this.messageType = messageType;
            return this;
        }

        public Builder content(String content){
            this.content = content;
            return this;
        }

        public Builder sender(String sender){
            this.sender = sender;
            return this;
        }

        public Builder recipient(String recipient){
            this.recipient = recipient;
            return this;
        }

        public Builder isDelivered(boolean isDelivered){
            this.isDelivered = isDelivered;
            return this;
        }

        public Builder timestamp(long timestamp){
            this.timestamp = timestamp;
            return this;
        }

        public MessageBuilder build(){
//            return new MessageBuilder(this);
            MessageBuilder messageBuilder = new MessageBuilder();
            messageBuilder.messageType = this.messageType;
            messageBuilder.content = this.content;
            messageBuilder.isDelivered = this.isDelivered;
            messageBuilder.sender = this.sender;
            messageBuilder.timestamp = this.timestamp;
            messageBuilder.recipient = this.recipient;
            return messageBuilder;
        }

    }
}