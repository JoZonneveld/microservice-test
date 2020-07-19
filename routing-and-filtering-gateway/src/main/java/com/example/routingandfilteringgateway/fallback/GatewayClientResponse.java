package com.example.routingandfilteringgateway.fallback;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.io.InputStream;

public class GatewayClientResponse implements ClientHttpResponse {
    private HttpStatus status;
    private String message;
    public GatewayClientResponse(HttpStatus gatewayTimeout, String defaultMessage) {
        this.status = gatewayTimeout;
        this.message = defaultMessage;
    }

    @Override
    public HttpStatus getStatusCode() throws IOException {
        return this.status;
    }

    @Override
    public int getRawStatusCode() throws IOException {
        return this.status.value();
    }

    @Override
    public String getStatusText() throws IOException {
        return this.status.name();
    }

    @Override
    public void close() {

    }

    @Override
    public InputStream getBody() throws IOException {
        return null;
    }

    @Override
    public HttpHeaders getHeaders() {
        return null;
    }
}
