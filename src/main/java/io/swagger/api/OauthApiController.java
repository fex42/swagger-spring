package io.swagger.api;

import io.swagger.model.BadClientCredentialsMessage;
import io.swagger.model.AccessToken;
import io.swagger.model.ErrorMessage;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

@Controller
public class OauthApiController implements OauthApi {

    public ResponseEntity<Void> revoke(@ApiParam(value = "The token that the client wants to get revoked", required = true) @RequestParam(value = "token", required = true) String token,
        @ApiParam(value = "A hint about the type of the token submitted for revocation", allowableValues = "{values=[access_token, refresh_token], enumVars=[{name=ACCESS_TOKEN, value=\"access_token\"}, {name=REFRESH_TOKEN, value=\"refresh_token\"}]}") @RequestParam(value = "tokenTypeHint", required = false) String tokenTypeHint) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<AccessToken> token(@ApiParam(value = "Determines the required type of authorization:password - authorize an existing user; client_credentials - authorize an existing client;refresh_token - refresh an access_token of the previously authorized user.", required = true, allowableValues = "{values=[password, client_credentials, refresh_token], enumVars=[{name=PASSWORD, value=\"password\"}, {name=CLIENT_CREDENTIALS, value=\"client_credentials\"}, {name=REFRESH_TOKEN, value=\"refresh_token\"}]}") @RequestParam(value = "grantType", required = true) String grantType,
        @ApiParam(value = "Client identifier", required = true) @RequestParam(value = "clientId", required = true) String clientId,
        @ApiParam(value = "Client secret", required = true) @RequestParam(value = "clientSecret", required = true) String clientSecret,
        @ApiParam(value = "Refresh token. Required for grant_type=refresh_token only.") @RequestParam(value = "refreshToken", required = false) String refreshToken,
        @ApiParam(value = "User identifier. Required for grant_type=password only.") @RequestParam(value = "username", required = false) String username,
        @ApiParam(value = "User password. Required for grant_type=password only.") @RequestParam(value = "password", required = false) String password) {
        // do some magic!
        return new ResponseEntity<AccessToken>(HttpStatus.OK);
    }

}
