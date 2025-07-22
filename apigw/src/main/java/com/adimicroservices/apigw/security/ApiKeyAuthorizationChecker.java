package com.adimicroservices.apigw.security;

public interface ApiKeyAuthorizationChecker {
    boolean isAuthorized(String key, String application);
}
