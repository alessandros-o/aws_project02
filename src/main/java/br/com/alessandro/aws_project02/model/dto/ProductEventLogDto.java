package br.com.alessandro.aws_project02.model.dto;

import br.com.alessandro.aws_project02.enums.EventType;
import br.com.alessandro.aws_project02.model.ProductEventLog;

public class ProductEventLogDto {

    private final String code;
    private final EventType eventType;
    private final long productId;
    private final String username;
    private final long timestamp;

    public ProductEventLogDto(ProductEventLog productEventLog) {
        this.code = productEventLog.getPk();
        this.eventType = productEventLog.getEventType();
        this.productId = productEventLog.getProductId();
        this.username = productEventLog.getUsername();
        this.timestamp = productEventLog.getTimestamp();
    }

    public String getCode() {
        return code;
    }

    public EventType getEventType() {
        return eventType;
    }

    public long getProductId() {
        return productId;
    }

    public String getUsername() {
        return username;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
