package io.swagger.api;

import io.swagger.model.BadClientCredentialsMessage;
import io.swagger.model.AccessToken;
import io.swagger.model.ErrorMessage;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

@Api(value = "oauth", description = "the oauth API")
public interface OauthApi {

    @ApiOperation(value = "Revoke a token", notes = "An additional endpoint for the OAuth 2.0 Standard, which allows clients to notify finAPI that a previously obtained refresh or access token is no longer required. A successful request will invalidate the given token. The revocation of a particular token may also cause the revocation of related tokens and the underlying authorization grant. For token_type_hint=access_token finAPI will invalidate only the given access_token. For token_type_hint=refresh_token, finAPI will invalidate the refresh token and all access tokens based on the same authorization grant. If the token_type_hint is not defined, finAPI will revoke all access and refresh tokens (if applicable) that are based on the same authorization grant.<br/>Note that service responds with HTTP status code 200 if the token has been revoked successfully or if the client submitted an invalid token. <br/><b>Please Note:</b> The current client's access_token is required to authenticate the revocation. <br/>Example: If want to revoke a user's refresh_token (and therefore also his access_token) you can call:<br/><pre>POST /oauth/revoke?token={refresh_token}&token_type_hint=refresh_token&access_token={client_access_token}</pre>", response = Void.class, tags={ "Authorization", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Token is invalidated successfully or a token is invalid", response = Void.class),
        @ApiResponse(code = 400, message = "The service does not support the revocation of the presented token type.", response = Void.class) })
    @RequestMapping(value = "/oauth/revoke",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> revoke(@ApiParam(value = "The token that the client wants to get revoked", required = true) @RequestParam(value = "token", required = true) String token,@ApiParam(value = "A hint about the type of the token submitted for revocation", allowableValues = "{values=[access_token, refresh_token], enumVars=[{name=ACCESS_TOKEN, value=\"access_token\"}, {name=REFRESH_TOKEN, value=\"refresh_token\"}]}") @RequestParam(value = "tokenTypeHint", required = false) String tokenTypeHint);


    @ApiOperation(value = "Get tokens", notes = "finAPI implements the OAuth 2.0 Standard for authorizing applications and users within applications. OAuth uses the terminology of clients and users. A client represents an application that calls finAPI services. Each call to a finAPI service must be authorized by an access_token. Use this service to get an access_token for a client or user, or to refresh the access_token of the previously authorized user.<br/>This service must be called with a valid client identifier and client secret. Please contact us, if you want us to provide you with a test client by sending an email to <a href='mailto:support@finapi.io'>support@finapi.io</a>.<br /><br />Reflecting the OAuth standard, finAPI provides two different roles: <b>client</b> and <b>user</b>.<br/>&bull; A <b>client</b> (or rather an application) can create users<br/>&bull; A <b>user</b> can manage his finAPI account details (e.g. email address or phone number), and all of his downloaded or created data such as his bank connections, accounts and transactions. A user can also delete his finAPI account, including all related data. <br/><br/>The authorization process is similar for both the client and user roles: <br/>&bull; To authorize a client (i.e. application), use <code>grant_type=client_credentials</code>.<br/>&bull; To authorize a user, use <code>grant_type=password</code>.<br/><br/>The application will return the authorization data, if all parameters are correct. <br/>Example for the authorization data response: <br/><pre>{ \"access_token\": \"1471e085-2961-4c48-8d98-1b108184a730\", \"token_type\": \"bearer\", \"refresh_token\": \"a78f52d6-0d5a-40b5-be72-46e7fdbbd464\", \"expires_in\": 3600, \"scope\": \"all\" }</pre><br/>You can use the returned access_token to authorize a user by sending a header like: <br/><br/><pre>Authorization: Bearer 1471e085-2961-4c48-8d98-1b108184a730</pre> <br/> <p>WARNING: Sending the access_token as a request parameter is deprecated and will probably be no longer supported in the next release of finAPI. Please send the access_token in the request header instead.</p><p>If the requested user is not verified yet by the client, an error code 403 will be returned.</p><p>If the current role has no privileges to call a service method (e.g. if a user tries to create a new user, or access another user's data), then the request will fail with the HTTP status 403. Currently the access token has an expiration time of one hour. If the token has expired, all services will return the HTTP status 401. To restore access you can simply get a new token (as it is described above) or use <code>grant_type=refresh_token</code> (for user role only). In the latter case you just have to pass the previously received <code>refresh_token</code>.</p>", response = AccessToken.class, tags={ "Authorization", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Authorization is successful", response = AccessToken.class),
        @ApiResponse(code = 400, message = "Bad user credentials or invalid refresh_token or unsupported grant_type", response = AccessToken.class),
        @ApiResponse(code = 401, message = "Bad client credentials", response = AccessToken.class),
        @ApiResponse(code = 403, message = "User is not verified", response = AccessToken.class) })
    @RequestMapping(value = "/oauth/token",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<AccessToken> token(@ApiParam(value = "Determines the required type of authorization:password - authorize an existing user; client_credentials - authorize an existing client;refresh_token - refresh an access_token of the previously authorized user.", required = true, allowableValues = "{values=[password, client_credentials, refresh_token], enumVars=[{name=PASSWORD, value=\"password\"}, {name=CLIENT_CREDENTIALS, value=\"client_credentials\"}, {name=REFRESH_TOKEN, value=\"refresh_token\"}]}") @RequestParam(value = "grantType", required = true) String grantType,@ApiParam(value = "Client identifier", required = true) @RequestParam(value = "clientId", required = true) String clientId,@ApiParam(value = "Client secret", required = true) @RequestParam(value = "clientSecret", required = true) String clientSecret,@ApiParam(value = "Refresh token. Required for grant_type=refresh_token only.") @RequestParam(value = "refreshToken", required = false) String refreshToken,@ApiParam(value = "User identifier. Required for grant_type=password only.") @RequestParam(value = "username", required = false) String username,@ApiParam(value = "User password. Required for grant_type=password only.") @RequestParam(value = "password", required = false) String password);

}
