package com.github.vaibhavsinha.kong.api.plugin.authentication;

import com.github.vaibhavsinha.kong.model.plugin.authentication.oauth2.*;

import java.util.Map;

public interface OAuth2ProcessService {


    // OAuth2 Process ---------------------------------------------------------------------------------------------------


    Map<String, Object> authorize(String apiUri, AuthorizationRequest request);

    Token grantTokenHttps(String apiUri, GrantTokenRequest request);

    Token grantTokenHttp(String apiUri, GrantTokenRequest request);
}
