package io.swagger.api;

import io.swagger.model.CashFlowList;
import io.swagger.model.ErrorMessage;
import java.math.BigDecimal;
import io.swagger.model.Category;
import io.swagger.model.CategoryParams;
import io.swagger.model.Label;
import io.swagger.model.LabelParams;
import io.swagger.model.User;
import io.swagger.model.UserCreateParamsImpl;
import io.swagger.model.IdentifierList;
import io.swagger.model.ExecutePasswordChangeParams;
import io.swagger.model.ExecuteSepaMoneyTransferParams;
import io.swagger.model.BankResponse;
import io.swagger.model.Account;
import io.swagger.model.AccountList;
import io.swagger.model.BankConnectionList;
import io.swagger.model.PageableBankList;
import io.swagger.model.PageableCategoryList;
import io.swagger.model.PageableLabelList;
import io.swagger.model.PageableSecurityList;
import io.swagger.model.PageableTransactionList;
import io.swagger.model.Bank;
import io.swagger.model.BankConnection;
import io.swagger.model.BankList;
import io.swagger.model.CategoryList;
import io.swagger.model.ClientConfiguration;
import io.swagger.model.DailyBalanceList;
import io.swagger.model.LabelList;
import io.swagger.model.SecurityList;
import io.swagger.model.Security;
import io.swagger.model.Transaction;
import io.swagger.model.TransactionList;
import io.swagger.model.VerificationStatusResource;
import io.swagger.model.ImportBankConnectionParams;
import io.swagger.model.UpdateSpecificTransactionsParams;
import io.swagger.model.BankConnectionParams;
import io.swagger.model.ClientConfigurationParams;
import io.swagger.model.UpdateTransactionsParams;
import io.swagger.model.UserUpdateParamsImpl;
import io.swagger.model.PasswordChangingResource;
import io.swagger.model.RequestPasswordChangeParameters;
import io.swagger.model.MoneyTransferOrderingResponse;
import io.swagger.model.RequestSepaMoneyTransferParams;
import io.swagger.model.SplitTransactionsParams;
import io.swagger.model.AccountParams;
import io.swagger.model.UpdateBankConnectionParams;

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

@Api(value = "api", description = "the api API")
public interface ApiApi {

    @ApiOperation(value = "Get cash flows", notes = "Get the cash flow(s) (= total income, spending, and balance) for one or several categories. You can specify various criteria such as the time period to calculate the cash flows for, or what categories to do the calculations for. Note that the cash flow for a category may include the cash flows for all of its sub-categories, or not include it, depending on the 'includeSubCashFlows' setting. Must pass the user's access_token.", response = CashFlowList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Categories", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Cash flows", response = CashFlowList.class),
        @ApiResponse(code = 400, message = "Bad request", response = CashFlowList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = CashFlowList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = CashFlowList.class) })
    @RequestMapping(value = "/api/v1/categories/cashFlows",
        method = RequestMethod.GET)
    ResponseEntity<CashFlowList> cashFlows(@ApiParam(value = "If specified, then only transactions that contain the search term in their purpose or counterpart fields will be contained in the result. Note that the search is case insensitive.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "The counterpart is the person or institution that received your payment, or that you made the payment to. If this parameter is specified, then only transactions that contain the given term in one (or more) of their counterpart fields ('counterpartName', 'counterpartAccountNumber', 'counterpartIban', 'counterpartBic' or 'counterpartBlz') will be contained in the result. Note that the search is case insensitive.") @RequestParam(value = "counterpart", required = false) String counterpart,@ApiParam(value = "A comma-separated list of account identifiers. If specified, then only transactions that relate to the given accounts will be regarded. If not specified, then all accounts will be regarded.") @RequestParam(value = "accountIds", required = false) List<Long> accountIds,@ApiParam(value = "Lower bound for a transaction's booking date as returned by the bank (= original booking date), in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only transactions whose 'bankBookingDate' is equal to or later than the given date will be regarded.") @RequestParam(value = "minBankBookingDate", required = false) String minBankBookingDate,@ApiParam(value = "Upper bound for a transaction's booking date as returned by the bank (= original booking date), in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only transactions whose 'bankBookingDate' is equal to or earlier than the given date will be regarded.") @RequestParam(value = "maxBankBookingDate", required = false) String maxBankBookingDate,@ApiParam(value = "Lower bound for a transaction's booking date as set by finAPI, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). For details about the meaning of the finAPI booking date, please see the field's documentation in the service's response.") @RequestParam(value = "minFinapiBookingDate", required = false) String minFinapiBookingDate,@ApiParam(value = "Upper bound for a transaction's booking date as set by finAPI, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). For details about the meaning of the finAPI booking date, please see the field's documentation in the service's response.") @RequestParam(value = "maxFinapiBookingDate", required = false) String maxFinapiBookingDate,@ApiParam(value = "If specified, then only transactions whose amount is equal to or greater than the given amount will be regarded. Can contain a positive or negative number with at most two decimal places. Examples: -300.12, or 90.95") @RequestParam(value = "minAmount", required = false) BigDecimal minAmount,@ApiParam(value = "If specified, then only transactions whose amount is equal to or less than the given amount will be regarded. Can contain a positive or negative number with at most two decimal places. Examples: -300.12, or 90.95") @RequestParam(value = "maxAmount", required = false) BigDecimal maxAmount,@ApiParam(value = "If specified, then only transactions with the given direction(s) will be regarded. Use 'income' for regarding only received payments (amount >= 0), 'spending' for regarding only outgoing payments (amount < 0), or 'both' to regard both directions. If not specified, the direction defaults to 'both'.", allowableValues = "{values=[all, income, spending], enumVars=[{name=ALL, value=\"all\"}, {name=INCOME, value=\"income\"}, {name=SPENDING, value=\"spending\"}]}") @RequestParam(value = "direction", required = false) String direction,@ApiParam(value = "A comma-separated list of label identifiers. If specified, then only transactions that have been marked with at least one of the given labels will be contained in the result.") @RequestParam(value = "labelIds", required = false) List<Long> labelIds,@ApiParam(value = "If specified, then the cash flows depend only on the specified categories. Note that the cash flow for a category may include/exclude the cash flows of its sub-categories, depending on the 'includeSubCashFlows' setting. To include not categorized transactions, pass the value '0' as the categoryId. Note: When this parameter is not set, then the result will contain a cash flow for all categories that have transactions associated to them, more precisely: transactions that fulfill the filter criteria. Categories that have no associated transactions according to the filter criteria will not appear in the result. However, when you specify this parameter, then all specified categories will have a cash flow entry in the result, even if there are no associated transactions for the category (the cash flow will have income, spending and balance all set to zero).") @RequestParam(value = "categoryIds", required = false) List<Long> categoryIds,@ApiParam(value = "If specified, then only transactions that have their 'isNew' flag set to true/false will be regarded for the cash flow calculations.") @RequestParam(value = "isNew", required = false) Boolean isNew,@ApiParam(value = "Lower bound for a transaction's import date, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only transactions whose 'importDate' is equal to or later than the given date will be regarded.") @RequestParam(value = "minImportDate", required = false) String minImportDate,@ApiParam(value = "Upper bound for a transaction's import date, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only transactions whose 'importDate' is equal to or earlier than the given date will be regarded.") @RequestParam(value = "maxImportDate", required = false) String maxImportDate,@ApiParam(value = "If it is true, then the income, spending and balance of a main category results from all transactions that have either this (main) category or any of its subcategories assigned (of course all transactions depends from the other filtering settings); If it is false, then the income, spending and balance of a main category only results from the transactions that have exactly this (main) category assigned.", defaultValue = "true") @RequestParam(value = "includeSubCashFlows", required = false, defaultValue="true") Boolean includeSubCashFlows,@ApiParam(value = "Determines the order of the results. You can order the results by income, spending, balance, category.id or category.name. The default order for this service is 'category.id,asc'. You can also order by multiple properties. In that case the order of the parameters passed is important. Example: '/cashFlows?order=income,desc&order=spending,asc&balance,desc' will return as first result the category with the highest income. If two categories have the same income, it returns the category with the highest spending first (because spending is a negative value) and so on. The general format is: 'property[,asc|desc]', with 'asc' being the default value. Please note that ordering by multiple fields is not supported in our swagger frontend, but you can test this feature with any HTTP tool of your choice (e.g. postman or DHC). ") @RequestParam(value = "order", required = false) List<String> order);


    @ApiOperation(value = "Create a new category", notes = "Create a new custom category for the authorized user. Must pass the user's access_token.", response = Category.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Categories", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Category.class),
        @ApiResponse(code = 201, message = "New category was created successfully", response = Category.class),
        @ApiResponse(code = 400, message = "The category name is too long. The maximum length for a category name is 128 symbols.", response = Category.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Category.class),
        @ApiResponse(code = 404, message = "The parent category does not exist.", response = Category.class),
        @ApiResponse(code = 422, message = "1. The given parentId must reference a main category, but points to a sub category. Multi-level sub categories are not supported.<br/>2. A category with that name already exists.<br/>NOTE: A category already exists means that there is another category of the same name on the same hierarchy level.<br/>Examples:<br/>&bull; if you want to add a sub-category 'Sub' to the main category 'Main', and 'Main' already contains 'Sub', then the category already exists and cannot get created.<br/>&bull; if you want to add a sub-category 'Sub' to the main category 'Main', and some other main category contains 'Sub' (or a main category itself is called 'Sub'), then the category can still get created, because there is no 'Sub' in the 'Main' category<br/>&bull; if you want to add a new main-category 'Main' and there is already a main category with that name, then the category already exists and cannot get created", response = Category.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Category.class) })
    @RequestMapping(value = "/api/v1/categories",
        method = RequestMethod.POST)
    ResponseEntity<Category> createCategory(@ApiParam(value = "Parameters of the new category"  ) @RequestBody CategoryParams body);


    @ApiOperation(value = "Create a new label", notes = "Create a new label for a specific user. Must pass the new label's name and the user's access_token.", response = Label.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Labels", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Label.class),
        @ApiResponse(code = 201, message = "Label created", response = Label.class),
        @ApiResponse(code = 400, message = "Bad request", response = Label.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Label.class),
        @ApiResponse(code = 422, message = "ILLEGAL_FIELD_VALUE if  the given label name is too long; ENTITY_EXISTS if a label with the given name already exists", response = Label.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Label.class) })
    @RequestMapping(value = "/api/v1/labels",
        method = RequestMethod.POST)
    ResponseEntity<Label> createLabel(@ApiParam(value = "Label's name" ,required=true ) @RequestBody LabelParams body);


    @ApiOperation(value = "Create a new user", notes = "Create a new user. Must pass your global (i.e. client) access_token. This service returns the user's password as plain text. Note that finAPI regards user identifiers case-insensitive.", response = User.class, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 201, message = "User created", response = User.class),
        @ApiResponse(code = 400, message = "Bad request (for instance if the given password is too short/long)", response = User.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = User.class),
        @ApiResponse(code = 403, message = "You are not allowed to create a user", response = User.class),
        @ApiResponse(code = 422, message = "ENTITY_EXISTS if the given userId already exists", response = User.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = User.class) })
    @RequestMapping(value = "/api/v1/users",
        method = RequestMethod.POST)
    ResponseEntity<User> createUser(@ApiParam(value = "User's details" ,required=true ) @RequestBody UserCreateParamsImpl body);


    @ApiOperation(value = "Delete an account", notes = "Delete a single bank account of the user that is authorized by the access_token, including its transactions and balance data. Must pass the account's identifier and the user's access_token. Notes: <br/>- You cannot delete an account while the bank connection that it relates to is currently in the process of import, update, or transactions categorization. <br/>- When the last remaining account of a bank connection gets deleted, then the bank connection itself will get deleted as well!", response = Void.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Account deleted", response = Void.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Void.class),
        @ApiResponse(code = 404, message = "Account not found", response = Void.class),
        @ApiResponse(code = 423, message = "Account cannot get deleted as the bank connection that it relates to is currently in the process of import, update, or transactions categorization.", response = Void.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Void.class) })
    @RequestMapping(value = "/api/v1/accounts/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAccount(@ApiParam(value = "Identifier of the account to delete",required=true ) @PathVariable("id") Long id);


    @ApiOperation(value = "Delete all accounts", notes = "Delete all accounts of the user that is authorized by the access_token, including all transactions and balance data. Must pass the user's access_token. Notes: <br/>- Deleting all of the user's accounts also deletes all of his bank connections. <br/>- If at least one of the user's bank connections in currently in the process of import, update, or transactions categorization, then this service will perform no action at all.", response = IdentifierList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Accounts deleted", response = IdentifierList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = IdentifierList.class),
        @ApiResponse(code = 423, message = "No action was performed as at least one bank connection is busy (currently in the process of import, update, or transactions categorization).", response = IdentifierList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = IdentifierList.class) })
    @RequestMapping(value = "/api/v1/accounts",
        method = RequestMethod.DELETE)
    ResponseEntity<IdentifierList> deleteAllAccounts();


    @ApiOperation(value = "Delete all bank connections", notes = "Delete all bank connections of the user that is authorized by the access_token. Must pass the user's access_token. Note that if at least one bank connection is busy (currently in the process of import, update, or transactions categorization), then this service will perform no action at all.", response = IdentifierList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Bank Connections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Bank connections deleted", response = IdentifierList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = IdentifierList.class),
        @ApiResponse(code = 423, message = "No action was performed as at least one bank connection is busy (currently in the process of import, update, or transactions categorization).", response = IdentifierList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = IdentifierList.class) })
    @RequestMapping(value = "/api/v1/bankConnections",
        method = RequestMethod.DELETE)
    ResponseEntity<IdentifierList> deleteAllBankConnections();


    @ApiOperation(value = "Delete all categories", notes = "Delete all custom categories of the user that is authorized by the access_token. Must pass the user's access_token.", response = IdentifierList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Categories", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All custom categories were deleted successfully", response = IdentifierList.class),
        @ApiResponse(code = 400, message = "Bad request", response = IdentifierList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = IdentifierList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = IdentifierList.class) })
    @RequestMapping(value = "/api/v1/categories",
        method = RequestMethod.DELETE)
    ResponseEntity<IdentifierList> deleteAllCategories();


    @ApiOperation(value = "Delete all labels", notes = "Delete all labels of the user that is authorized by the access_token. Must pass the user's access_token.", response = IdentifierList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Labels", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of identifiers of deleted labels", response = IdentifierList.class),
        @ApiResponse(code = 400, message = "Bad request", response = IdentifierList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = IdentifierList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = IdentifierList.class) })
    @RequestMapping(value = "/api/v1/labels",
        method = RequestMethod.DELETE)
    ResponseEntity<IdentifierList> deleteAllLabels();


    @ApiOperation(value = "Delete all transactions", notes = "Delete all deletable transactions of the currently authorized user. <br/>A transaction is deletable if at least one of the following holds true:<br/> &bull; The transaction belongs to a demo account <br/> &bull; The transaction's potentialDuplicate flag is set to TRUE", response = IdentifierList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Transactions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of identifiers of all deleted transactions", response = IdentifierList.class),
        @ApiResponse(code = 400, message = "Bad request", response = IdentifierList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = IdentifierList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = IdentifierList.class) })
    @RequestMapping(value = "/api/v1/transactions",
        method = RequestMethod.DELETE)
    ResponseEntity<IdentifierList> deleteAllTransactions();


    @ApiOperation(value = "Delete a bank connection", notes = "Delete a single bank connection of the user that is authorized by the access_token, including all of its accounts and their transactions and balance data. Must pass the connection's identifier and the user's access_token. Note that a connection cannot get deleted while it is in the process of import, update, or transactions categorization.", response = Void.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Bank Connections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Bank connection deleted", response = Void.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Void.class),
        @ApiResponse(code = 404, message = "Bank connection not found", response = Void.class),
        @ApiResponse(code = 423, message = "Bank connection cannot get deleted as it is currently in the process of import, update, or transactions categorization.", response = Void.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Void.class) })
    @RequestMapping(value = "/api/v1/bankConnections/{bankConnectionId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteBankConnection(@ApiParam(value = "Identifier of the bank connection to delete",required=true ) @PathVariable("bankConnectionId") Long bankConnectionId);


    @ApiOperation(value = "Delete a category", notes = "Delete a single category of the user that is authorized by the access_token. Must pass the user's access_token. Note that you can only delete user-custom categories (category's where the 'isCustom' flag is true).", response = Void.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Categories", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Category was deleted successfully", response = Void.class),
        @ApiResponse(code = 400, message = "Bad request", response = Void.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Void.class),
        @ApiResponse(code = 404, message = "Category not found", response = Void.class),
        @ApiResponse(code = 422, message = "Category cannot be deleted", response = Void.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Void.class) })
    @RequestMapping(value = "/api/v1/categories/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCategory(@ApiParam(value = "Category identifier",required=true ) @PathVariable("id") Long id);


    @ApiOperation(value = "Delete a label", notes = "Delete a single label of the user that is authorized by the access_token. Must pass the label's identifier and the user's access_token.", response = Void.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Labels", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Label deleted", response = Void.class),
        @ApiResponse(code = 400, message = "Bad request", response = Void.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Void.class),
        @ApiResponse(code = 404, message = "Label not found", response = Void.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Void.class) })
    @RequestMapping(value = "/api/v1/labels/{labelId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteLabel(@ApiParam(value = "Identifier of the label to delete",required=true ) @PathVariable("labelId") Long labelId);


    @ApiOperation(value = "Delete a transaction", notes = "Delete a single transaction of the user that is authorized by the access_token.  A transaction can only get deleted if at least one of the following holds true:<br/> &bull; The transaction belongs to a demo account <br/> &bull; The transaction's potentialDuplicate flag is set to TRUE", response = Void.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Transactions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Identifier of the transaction to delete", response = Void.class),
        @ApiResponse(code = 400, message = "Bad request", response = Void.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Void.class),
        @ApiResponse(code = 404, message = "Transaction not found", response = Void.class),
        @ApiResponse(code = 422, message = "Transaction cannot get deleted", response = Void.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Void.class) })
    @RequestMapping(value = "/api/v1/transactions/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteTransaction(@ApiParam(value = "Identifier of transaction",required=true ) @PathVariable("id") Long id);


    @ApiOperation(value = "Delete the authorized user", notes = "Delete the authorized user. Must pass the user's access_token. ATTENTION: This deletes the user including all of his bank connections, accounts, balance data and transactions! THIS PROCESS CANNOT BE UNDONE! Note that a user cannot get deleted while any of his bank connections are currently busy (in the process of import, update, or transactions categorization). <p>Note: finAPI will send a notification about the deletion of the user to each of your clients that has a user synchronization callback URL set in its configuration. This also includes the client that is performing this request.</p>", response = Void.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User deleted", response = Void.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Void.class),
        @ApiResponse(code = 403, message = "You are not allowed to delete this user", response = Void.class),
        @ApiResponse(code = 404, message = "User not found", response = Void.class),
        @ApiResponse(code = 423, message = "User cannot get deleted as at least one of his bank connections is currently busy.", response = Void.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Void.class) })
    @RequestMapping(value = "/api/v1/users",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUser();


    @ApiOperation(value = "Delete an unverified user", notes = "Delete an unverified user. Must pass your global (i.e. client) access_token.<p>Note: finAPI will send a notification about the deletion of the user to each of your clients that has a user synchronization callback URL set in its configuration. This also includes the client that is performing this request.</p>Also note that finAPI regards user identifiers case-insensitive.", response = Void.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User deleted", response = Void.class),
        @ApiResponse(code = 400, message = "Identifier is not given", response = Void.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Void.class),
        @ApiResponse(code = 403, message = "You are not allowed to delete this user", response = Void.class),
        @ApiResponse(code = 404, message = "User not found", response = Void.class),
        @ApiResponse(code = 422, message = "The user with the given identifier is already verified", response = Void.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Void.class) })
    @RequestMapping(value = "/api/v1/users/{userId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUser(@ApiParam(value = "",required=true ) @PathVariable("userId") String userId);


    @ApiOperation(value = "Execute password change", notes = "Change the password of a user. Must pass your global (i.e. client) access_token. Note: When changing the password of a user, all tokens that have been handed out for that user (for whatever client) will be revoked! Also note that finAPI regards user identifiers case-insensitive.", response = Void.class, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Password changed", response = Void.class),
        @ApiResponse(code = 400, message = "Bad request", response = Void.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Void.class),
        @ApiResponse(code = 403, message = "You are not allowed to change a password", response = Void.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Void.class) })
    @RequestMapping(value = "/api/v1/users/executePasswordChange",
        method = RequestMethod.POST)
    ResponseEntity<Void> executePasswordChange(@ApiParam(value = ""  ) @RequestBody ExecutePasswordChangeParams body);


    @ApiOperation(value = "Execute SEPA Money Transfer", notes = "Execute a SEPA money transfer order that has been previously submitted by the use of the /requestSepaMoneyTransfer service. Note that this service cannot be used for the demo account.", response = BankResponse.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "SEPA Money Transfer executed", response = BankResponse.class),
        @ApiResponse(code = 400, message = "Bad request", response = BankResponse.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = BankResponse.class),
        @ApiResponse(code = 404, message = "Account not found", response = BankResponse.class),
        @ApiResponse(code = 422, message = "ILLEGAL_ENTITY_STATE if no pending SEPA money transfer order exists for the account; BANK_SERVER_REJECTION if the bank server responded with an error message when finAPI tried to execute the money transfer order. The response's error message can be forwarded to the user, it will typically contain a german message from the bank server that contains useful information.", response = BankResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = BankResponse.class) })
    @RequestMapping(value = "/api/v1/accounts/executeSepaMoneyTransfer",
        method = RequestMethod.POST)
    ResponseEntity<BankResponse> executeSepaMoneyTransfer(@ApiParam(value = "Parameters for the execution of a SEPA money transfer order" ,required=true ) @RequestBody ExecuteSepaMoneyTransferParams body);


    @ApiOperation(value = "Get the authorized user", notes = "Get the authorized user's data. Must pass the user's access_token. Only the authorized user can get his data, i.e. his access_token must be used. Note that each symbol of the password is distorted with an 'X' character, i.e. if the user's password is '12345', the service will return the string 'XXXXX'.", response = User.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User's data", response = User.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = User.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = User.class) })
    @RequestMapping(value = "/api/v1/users",
        method = RequestMethod.GET)
    ResponseEntity<User> get();


    @ApiOperation(value = "Get an account", notes = "Get a single bank account of the user that is authorized by the access_token. Must pass the account's identifier and the user's access_token.", response = Account.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Requested account", response = Account.class),
        @ApiResponse(code = 400, message = "Bad request", response = Account.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Account.class),
        @ApiResponse(code = 404, message = "Account not found", response = Account.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Account.class) })
    @RequestMapping(value = "/api/v1/accounts/{id}",
        method = RequestMethod.GET)
    ResponseEntity<Account> getAccount(@ApiParam(value = "Identifier of requested account",required=true ) @PathVariable("id") Long id);


    @ApiOperation(value = "Get multiple accounts", notes = "Get a list of multiple bank accounts of the user that is authorized by the access_token. Must pass the accounts' identifiers and the user's access_token. Accounts whose identifiers do not exist or do not relate to the authorized user will not be contained in the result (If this applies to all of the given identifiers, then the result will be an empty list). WARNING: This service is deprecated and will be removed at some point. If you want to get multiple accounts, please instead use the service 'Get and search all accounts' and pass a comma-separated list of identifiers as a parameter 'ids'.", response = AccountList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of requested accounts", response = AccountList.class),
        @ApiResponse(code = 400, message = "Bad request", response = AccountList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = AccountList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = AccountList.class) })
    @RequestMapping(value = "/api/v1/accounts/{ids}",
        method = RequestMethod.GET)
    ResponseEntity<AccountList> getAccounts(@ApiParam(value = "Comma-separated list of identifiers of requested accounts",required=true ) @PathVariable("ids") List<Long> ids);


    @ApiOperation(value = "Get and search all accounts", notes = "Get bank accounts of the user that is authorized by the access_token. Must pass the user's access_token. You can set optional search criteria to get only those bank accounts that you are interested in. If you do not specify any search criteria, then this service functions as a 'get all' service.", response = AccountList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of all of the user's accounts", response = AccountList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = AccountList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = AccountList.class) })
    @RequestMapping(value = "/api/v1/accounts",
        method = RequestMethod.GET)
    ResponseEntity<AccountList> getAllAccounts(@ApiParam(value = "A comma-separated list of account identifiers. If specified, then only accounts whose identifier match any of the given identifiers will be regarded. The maximum number of identifiers is 1000.") @RequestParam(value = "ids", required = false) List<Long> ids,@ApiParam(value = "If specified, then only accounts that contain the search term in one (or more) of their 'accountName', 'iban', 'accountNumber' or subAccountNumber fields will be contained in the result. Note that the search is case-insensitive.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "A comma-separated list of account types. If specified, then only accounts that relate to the given types will be regarded. If not specified, then all accounts will be regarded.") @RequestParam(value = "accountTypeIds", required = false) List<Long> accountTypeIds,@ApiParam(value = "A comma-separated list of bank connection identifiers. If specified, then only accounts that relate to the given bank connections will be regarded. If not specified, then all accounts will be regarded.") @RequestParam(value = "bankConnectionIds", required = false) List<Long> bankConnectionIds,@ApiParam(value = "Lower bound for a account's last successful update date, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only accounts whose 'lastSuccessfulUpdate' is equal to or later than the given date will be regarded.") @RequestParam(value = "minLastSuccessfulUpdate", required = false) String minLastSuccessfulUpdate,@ApiParam(value = "Upper bound for a account's last successful update date, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only accounts whose 'lastSuccessfulUpdate' is equal to or earlier than the given date will be regarded.") @RequestParam(value = "maxLastSuccessfulUpdate", required = false) String maxLastSuccessfulUpdate,@ApiParam(value = "If specified, then only accounts whose balance is equal to or greater than the given balance will be regarded. Can contain a positive or negative number with at most two decimal places. Examples: -300.12, or 90.95") @RequestParam(value = "minBalance", required = false) BigDecimal minBalance,@ApiParam(value = "If specified, then only accounts whose balance is equal to or less than the given balance will be regarded. Can contain a positive or negative number with at most two decimal places. Examples: -300.12, or 90.95") @RequestParam(value = "maxBalance", required = false) BigDecimal maxBalance);


    @ApiOperation(value = "Get all bank connections", notes = "Get bank connections of the user that is authorized by the access_token. Must pass the user's access_token. You can set optional search criteria to get only those bank connections that you are interested in. If you do not specify any search criteria, then this service functions as a 'get all' service.", response = BankConnectionList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Bank Connections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of all of the user's bank connections", response = BankConnectionList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = BankConnectionList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = BankConnectionList.class) })
    @RequestMapping(value = "/api/v1/bankConnections",
        method = RequestMethod.GET)
    ResponseEntity<BankConnectionList> getAllBankConnections(@ApiParam(value = "A comma-separated list of bank connection identifiers. If specified, then only bank connections whose identifier match any of the given identifiers will be regarded. The maximum number of identifiers is 1000.") @RequestParam(value = "ids", required = false) List<Long> ids);


    @ApiOperation(value = "Get and search all banks", notes = "Get the banks that are supported by finAPI. Must pass the user's or client's access_token. You can set optional search criteria to get only those banks that you are interested in. If you do not specify any search criteria, then this service functions as a 'get all' service.", response = PageableBankList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Banks", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of all banks that are supported by finAPI, or list of all banks that match the given search string, if any was specified", response = PageableBankList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = PageableBankList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = PageableBankList.class) })
    @RequestMapping(value = "/api/v1/banks",
        method = RequestMethod.GET)
    ResponseEntity<PageableBankList> getAllBanks(@ApiParam(value = "A comma-separated list of bank identifiers. If specified, then only banks whose identifier match any of the given identifiers will be regarded. The maximum number of identifiers is 1000.") @RequestParam(value = "ids", required = false) List<Long> ids,@ApiParam(value = "Search string used for finding banks (case-insensitive). Fields that are regarded in the search are the bank's name, bank's BLZs and bank's BIC. If one or more of these fields (fully) contain the search string, the respective bank will be contained in the result. If no bank matches the search string, the result will be an empty list.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Result page that you want to retrieve.", defaultValue = "1") @RequestParam(value = "page", required = false, defaultValue="1") String page,@ApiParam(value = "Number of records per page. Max size is 100.", defaultValue = "20") @RequestParam(value = "perPage", required = false, defaultValue="20") String perPage,@ApiParam(value = "Determines the order of the results. You can order the results by id, name or bic. The default order for all services is 'id,asc'. You can also order by multiple properties. In that case the order of the parameters passed is important. Example: '/banks?order=name,desc&order=id,asc' will return banks ordered by 'name' (descending), where banks with the same 'name' are ordered by 'id' (ascending). The general format is: 'property[,asc|desc]', with 'asc' being the default value. Please note that ordering by multiple fields is not supported in our swagger frontend, but you can test this feature with any HTTP tool of your choice (e.g. postman or DHC). ") @RequestParam(value = "order", required = false) List<String> order);


    @ApiOperation(value = "Get and search all categories", notes = "Get a list of all global finAPI categories as well as all custom categories of the authorized user. Must pass the user's access_token. You can set optional search criteria to get only those categories that you are interested in. If you do not specify any search criteria, then this service functions as a 'get all' service.", response = PageableCategoryList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Categories", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of all available categories", response = PageableCategoryList.class),
        @ApiResponse(code = 400, message = "Bad request", response = PageableCategoryList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = PageableCategoryList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = PageableCategoryList.class) })
    @RequestMapping(value = "/api/v1/categories",
        method = RequestMethod.GET)
    ResponseEntity<PageableCategoryList> getAllCategories(@ApiParam(value = "A comma-separated list of category identifiers. If specified, then only categories whose identifier match any of the given identifiers will be regarded. The maximum number of identifiers is 1000.") @RequestParam(value = "ids", required = false) List<Long> ids,@ApiParam(value = "Search string used for finding categories (case-insensitive). Only the categories' names will be regarded in the search. If no categories match the search string, the result will be an empty list.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Result page that you want to retrieve.", defaultValue = "1") @RequestParam(value = "page", required = false, defaultValue="1") String page,@ApiParam(value = "Number of records per page. Max size is 100.", defaultValue = "20") @RequestParam(value = "perPage", required = false, defaultValue="20") String perPage,@ApiParam(value = "Determines the order of the results. You can order the results by 'id', 'name' and 'isCustom'. The default order is 'id,asc'. You can also order by multiple properties. In that case the order of the parameters passed is important. Example: '/categories?order=isCustom,desc&order=name' will return all custom categories followed by all default categories. Both groups are ordered ascending by name. The general format is: 'property[,asc|desc]', with 'asc' being the default value. Please note that ordering by multiple fields is not supported in our swagger frontend, but you can test this feature with any HTTP tool of your choice (e.g. postman or DHC). ") @RequestParam(value = "order", required = false) List<String> order);


    @ApiOperation(value = "Get and search all labels", notes = "Get labels of the user that is authorized by the access_token. Must pass the user's access_token. You can set optional search criteria to get only those labels that you are interested in. If you do not specify any search criteria, then this service functions as a 'get all' service.", response = PageableLabelList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Labels", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of all of the user's labels", response = PageableLabelList.class),
        @ApiResponse(code = 400, message = "Bad request", response = PageableLabelList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = PageableLabelList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = PageableLabelList.class) })
    @RequestMapping(value = "/api/v1/labels",
        method = RequestMethod.GET)
    ResponseEntity<PageableLabelList> getAllLabels(@ApiParam(value = "A comma-separated list of label identifiers. If specified, then only labels whose identifier match any of the given identifiers will be regarded. The maximum number of identifiers is 1000.") @RequestParam(value = "ids", required = false) List<Long> ids,@ApiParam(value = "Result page that you want to retrieve", defaultValue = "1") @RequestParam(value = "page", required = false, defaultValue="1") String page,@ApiParam(value = "Maximum amount of records per page. Max size is 100.", defaultValue = "20") @RequestParam(value = "perPage", required = false, defaultValue="20") String perPage,@ApiParam(value = "Determines the order of the results. You can order the results by id or name. The default order for all services is 'id,asc'. Since both fields (id and name) are unique, ordering by multiple fields is pointless. The general format is: 'property[,asc|desc]', with 'asc' being the default value. ") @RequestParam(value = "order", required = false) List<String> order);


    @ApiOperation(value = "Get and search all securities", notes = "Get securities of the user that is authorized by the access_token. Must pass the user's access_token. You can set optional search criteria to get only those securities that you are interested in. If you do not specify any search criteria, then this service functions as a 'get all' service.", response = PageableSecurityList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Securities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of securities with info for pagination", response = PageableSecurityList.class),
        @ApiResponse(code = 400, message = "Bad request", response = PageableSecurityList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = PageableSecurityList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = PageableSecurityList.class) })
    @RequestMapping(value = "/api/v1/securities",
        method = RequestMethod.GET)
    ResponseEntity<PageableSecurityList> getAllSecurities(@ApiParam(value = "A comma-separated list of security identifiers. If specified, then only securities whose identifier match any of the given identifiers will be regarded. The maximum number of identifiers is 1000.") @RequestParam(value = "ids", required = false) List<Long> ids,@ApiParam(value = "Search string to filter securities by ISIN, WKN and name.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-separated list of identifiers of accounts") @RequestParam(value = "accountIds", required = false) List<Long> accountIds,@ApiParam(value = "Result page that you want to retrieve.", defaultValue = "1") @RequestParam(value = "page", required = false, defaultValue="1") String page,@ApiParam(value = "Number of records per page. Max size is 100.", defaultValue = "20") @RequestParam(value = "perPage", required = false, defaultValue="20") String perPage,@ApiParam(value = "Determines the order of the results. You can order the results by next fields: id, name, isin, wkn, quote, quantityNominal, marketValue and entryQuote. The default order for all services is 'id,asc'. You can also order by multiple properties. In that case the order of the parameters passed is important. The general format is: 'property[,asc|desc]', with 'asc' being the default value. Please note that ordering by multiple fields is not supported in our swagger frontend, but you can test this feature with any HTTP tool of your choice (e.g. postman or DHC). ") @RequestParam(value = "order", required = false) List<String> order);


    @ApiOperation(value = "Get and search all transactions", notes = "Get transactions of the user that is authorized by the access_token. Must pass the user's access_token. You can set optional search criteria to get only those transactions that you are interested in. If you do not specify any search criteria, then this service functions as a 'get all' service.", response = PageableTransactionList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Transactions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of transactions", response = PageableTransactionList.class),
        @ApiResponse(code = 400, message = "Bad request", response = PageableTransactionList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = PageableTransactionList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = PageableTransactionList.class) })
    @RequestMapping(value = "/api/v1/transactions",
        method = RequestMethod.GET)
    ResponseEntity<PageableTransactionList> getAllTransactions(@ApiParam(value = "This parameter defines finAPI's logical view on the transactions when querying them: 'bankView' regards only the original transactions as they were received from the bank, without considering how the transactions might have gotten split by the user (see POST /transactions/<id>/split). This means that if a transaction is split into logical sub-transactions, then the service will still regard only the original transaction, and NOT the logical sub-transactions in its processing (though for convenience, the transactions will have the data of their sub-transactions included in the response). 'userView' by contrast regards the transactions as they exist for the user. For transactions that have not been split into logical sub-transactions, there is no difference to the \"bankView\". But for transaction that have been split into logical sub-transactions, the service will ONLY regard these sub-transactions, and not the originally received transaction (though for convenience, the sub-transactions will have the identifier of their original transaction included in the response).", required = true, allowableValues = "{values=[bankView, userView], enumVars=[{name=BANKVIEW, value=\"bankView\"}, {name=USERVIEW, value=\"1\"}]}", defaultValue = "userView") @RequestParam(value = "view", required = true, defaultValue="userView") String view,@ApiParam(value = "A comma-separated list of transaction identifiers. If specified, then only transactions whose identifier match any of the given identifiers will be regarded. The maximum number of identifiers is 1000.") @RequestParam(value = "ids", required = false) List<Long> ids,@ApiParam(value = "If specified, then only transactions that contain the search term in their purpose or counterpart fields will be contained in the result. Note that the search is case-insensitive.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "The counterpart is the person or institution that received your payment, or that you made the payment to. If this parameter is specified, then only transactions that contain the given term in one (or more) of their counterpart fields ('counterpartName', 'counterpartAccountNumber', 'counterpartIban', 'counterpartBic' or 'counterpartBlz') will be contained in the result. Note that the search is case insensitive.") @RequestParam(value = "counterpart", required = false) String counterpart,@ApiParam(value = "A comma-separated list of account identifiers. If specified, then only transactions that relate to the given accounts will be regarded. If not specified, then all accounts will be regarded.") @RequestParam(value = "accountIds", required = false) List<Long> accountIds,@ApiParam(value = "Lower bound for a transaction's booking date as returned by the bank (= original booking date), in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only transactions whose 'bankBookingDate' is equal to or later than the given date will be regarded.") @RequestParam(value = "minBankBookingDate", required = false) String minBankBookingDate,@ApiParam(value = "Upper bound for a transaction's booking date as returned by the bank (= original booking date), in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only transactions whose 'bankBookingDate' is equal to or earlier than the given date will be regarded.") @RequestParam(value = "maxBankBookingDate", required = false) String maxBankBookingDate,@ApiParam(value = "Lower bound for a transaction's booking date as set by finAPI, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). For details about the meaning of the finAPI booking date, please see the field's documentation in the service's response.") @RequestParam(value = "minFinapiBookingDate", required = false) String minFinapiBookingDate,@ApiParam(value = "Upper bound for a transaction's booking date as set by finAPI, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). For details about the meaning of the finAPI booking date, please see the field's documentation in the service's response.") @RequestParam(value = "maxFinapiBookingDate", required = false) String maxFinapiBookingDate,@ApiParam(value = "If specified, then only transactions whose amount is equal to or greater than the given amount will be regarded. Can contain a positive or negative number with at most two decimal places. Examples: -300.12, or 90.95") @RequestParam(value = "minAmount", required = false) BigDecimal minAmount,@ApiParam(value = "If specified, then only transactions whose amount is equal to or less than the given amount will be regarded. Can contain a positive or negative number with at most two decimal places. Examples: -300.12, or 90.95") @RequestParam(value = "maxAmount", required = false) BigDecimal maxAmount,@ApiParam(value = "If specified, then only transactions with the given direction(s) will be regarded. Use 'income' for regarding only received payments (amount >= 0), 'spending' for regarding only outgoing payments (amount < 0), or 'both' to regard both directions. If not specified, the direction defaults to 'both'.", allowableValues = "{values=[all, income, spending], enumVars=[{name=ALL, value=\"all\"}, {name=INCOME, value=\"income\"}, {name=SPENDING, value=\"spending\"}]}") @RequestParam(value = "direction", required = false) String direction,@ApiParam(value = "A comma-separated list of label identifiers. If specified, then only transactions that have been marked with at least one of the given labels will be contained in the result.") @RequestParam(value = "labelIds", required = false) List<Long> labelIds,@ApiParam(value = "A comma-separated list of category identifiers. If specified, then the result will contain only transactions whose category is either one of the given categories, or whose category is a sub-category of one of the given categories. To include not categorized transactions, pass the value '0' as the categoryId.") @RequestParam(value = "categoryIds", required = false) List<Long> categoryIds,@ApiParam(value = "If specified, then only transactions that have their 'isNew' flag set to true/false will be regarded.") @RequestParam(value = "isNew", required = false) Boolean isNew,@ApiParam(value = "Lower bound for a transaction's import date, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only transactions whose 'importDate' is equal to or later than the given date will be regarded.") @RequestParam(value = "minImportDate", required = false) String minImportDate,@ApiParam(value = "Upper bound for a transaction's import date, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only transactions whose 'importDate' is equal to or earlier than the given date will be regarded.") @RequestParam(value = "maxImportDate", required = false) String maxImportDate,@ApiParam(value = "Result page that you want to retrieve.", defaultValue = "1") @RequestParam(value = "page", required = false, defaultValue="1") String page,@ApiParam(value = "Number of records per page. Max size is 100.", defaultValue = "20") @RequestParam(value = "perPage", required = false, defaultValue="20") String perPage,@ApiParam(value = "Determines the order of the results. You can use the following fields for ordering the response: id, parentId, accountId, valueDate, bankBookingDate, finapiBookingDate, amount, purpose, counterpartName, counterpartAccountNumber, counterpartIban, counterpartBlz, counterpartBic, type, primanota, category.id, category.name, isPotentialDuplicate, isNew and importDate. The default order for all services is 'id,asc'. You can also order by multiple properties. In that case the order of the parameters passed is important. Example: '/transactions?order=finapiBookingDate,desc&order=counterpartName' will return the latest transactions first. If there are more transactions on the same day, then these transactions are ordered by the counterpart name (ascending). The general format is: 'property[,asc|desc]', with 'asc' being the default value. Please note that ordering by multiple fields is not supported in our swagger frontend, but you can test this feature with any HTTP tool of your choice (e.g. postman or DHC). ") @RequestParam(value = "order", required = false) List<String> order);


    @ApiOperation(value = "Get a bank", notes = "Get a single bank from finAPI's database of supported banks. You have to pass the bank's identifier.", response = Bank.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Banks", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Requested Bank", response = Bank.class),
        @ApiResponse(code = 400, message = "Bad request", response = Bank.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Bank.class),
        @ApiResponse(code = 404, message = "Bank not found", response = Bank.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Bank.class) })
    @RequestMapping(value = "/api/v1/banks/{id}",
        method = RequestMethod.GET)
    ResponseEntity<Bank> getBank(@ApiParam(value = "Identifier of requested bank",required=true ) @PathVariable("id") Long id);


    @ApiOperation(value = "Get a bank connection", notes = "Get a single bank connection of the user that is authorized by the access_token. Must pass the connection's identifier and the user's access_token.", response = BankConnection.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Bank Connections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Requested bank connection", response = BankConnection.class),
        @ApiResponse(code = 400, message = "Bad request", response = BankConnection.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = BankConnection.class),
        @ApiResponse(code = 404, message = "Bank connection not found", response = BankConnection.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = BankConnection.class) })
    @RequestMapping(value = "/api/v1/bankConnections/{id}",
        method = RequestMethod.GET)
    ResponseEntity<BankConnection> getBankConnection(@ApiParam(value = "Identifier of requested bank connection",required=true ) @PathVariable("id") Long id);


    @ApiOperation(value = "Get multiple bank connections", notes = "Get a list of multiple bank connections of the user that is authorized by the access_token. Must pass the connections' identifiers and the user's access_token. Connections whose identifiers do not exist or do not relate to the authorized user will not be contained in the result (If this applies to all of the given identifiers, then the result will be an empty list). WARNING: This service is deprecated and will be removed at some point. If you want to get multiple bank connections, please instead use the service 'Get all bank connections' and pass a comma-separated list of identifiers as a parameter 'ids'.", response = BankConnectionList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Bank Connections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of requested bank connections", response = BankConnectionList.class),
        @ApiResponse(code = 400, message = "Bad request", response = BankConnectionList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = BankConnectionList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = BankConnectionList.class) })
    @RequestMapping(value = "/api/v1/bankConnections/{ids}",
        method = RequestMethod.GET)
    ResponseEntity<BankConnectionList> getBankConnections(@ApiParam(value = "Comma-separated list of identifiers of requested bank connections",required=true ) @PathVariable("ids") List<Long> ids);


    @ApiOperation(value = "Get multiple banks", notes = "Get a list of supported banks from the finAPI database. You have to pass a list of bank identifiers. Banks whose identifiers do not exist will not be contained in the result. (If this applies to all of the given identifiers, then the result will be an empty list.) WARNING: This service is deprecated and will be removed at some point. If you want to get multiple banks, please instead use the service 'Get and search all banks' and pass a comma-separated list of identifiers as a parameter 'ids'.", response = BankList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Banks", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of requested banks", response = BankList.class),
        @ApiResponse(code = 400, message = "Bad request", response = BankList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = BankList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = BankList.class) })
    @RequestMapping(value = "/api/v1/banks/{ids}",
        method = RequestMethod.GET)
    ResponseEntity<BankList> getBanks(@ApiParam(value = "Comma-separated list of identifiers of requested banks",required=true ) @PathVariable("ids") List<Long> ids);


    @ApiOperation(value = "Get multiple categories", notes = "Get a list of multiple categories that are either a global finAPI category or a custom category of the authorized user. Must pass the categories' identifiers and the user's access_token. Categories whose identifiers do not exist or that relate to a different user not be contained in the result (If this applies to all of the given identifiers, then the result will be an empty list). WARNING: This service is deprecated and will be removed at some point. If you want to get multiple categories, please instead use the service 'Get and search all categories' and pass a comma-separated list of identifiers as a parameter 'ids'.", response = CategoryList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Categories", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of requested categories", response = CategoryList.class),
        @ApiResponse(code = 400, message = "Bad request", response = CategoryList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = CategoryList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = CategoryList.class) })
    @RequestMapping(value = "/api/v1/categories/{ids}",
        method = RequestMethod.GET)
    ResponseEntity<CategoryList> getCategories(@ApiParam(value = "Comma-separated list of identifiers of requested categories",required=true ) @PathVariable("ids") List<Long> ids);


    @ApiOperation(value = "Get a category", notes = "Get a single category that is either a global finAPI category or a custom category of the authorized user. Must pass the category's identifier and the user's access_token.", response = Category.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Categories", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Requested category", response = Category.class),
        @ApiResponse(code = 400, message = "Bad request", response = Category.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Category.class),
        @ApiResponse(code = 404, message = "Category not found", response = Category.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Category.class) })
    @RequestMapping(value = "/api/v1/categories/{id}",
        method = RequestMethod.GET)
    ResponseEntity<Category> getCategory(@ApiParam(value = "Category identifier",required=true ) @PathVariable("id") Long id);


    @ApiOperation(value = "Get client configuration", notes = "Get your client's configuration. Must pass your global (i.e. client) access_token.", response = ClientConfiguration.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Client Configuration", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Current client configuration", response = ClientConfiguration.class),
        @ApiResponse(code = 400, message = "Bad request", response = ClientConfiguration.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = ClientConfiguration.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ClientConfiguration.class) })
    @RequestMapping(value = "/api/v1/clientConfiguration",
        method = RequestMethod.GET)
    ResponseEntity<ClientConfiguration> getClientConfiguration();


    @ApiOperation(value = "Get daily balances", notes = "Returns the daily balances for the given accounts and the given period. The balances are calculated by finAPI and are based on each account's latest balance.", response = DailyBalanceList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Requested daily balances", response = DailyBalanceList.class),
        @ApiResponse(code = 400, message = "Bad request", response = DailyBalanceList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = DailyBalanceList.class),
        @ApiResponse(code = 404, message = "Account(s) not found", response = DailyBalanceList.class),
        @ApiResponse(code = 422, message = "Invalid date range (e.g. endDate < startDate)", response = DailyBalanceList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = DailyBalanceList.class) })
    @RequestMapping(value = "/api/v1/accounts/dailyBalances",
        method = RequestMethod.GET)
    ResponseEntity<DailyBalanceList> getDailyBalances(@ApiParam(value = "A comma-separated list of (non-security) account identifiers. If no accounts are specified, all (non-security) accounts of the current user are regarded. ") @RequestParam(value = "accountIds", required = false) List<Long> accountIds,@ApiParam(value = "A string in the format 'YYYY-MM-DD'. If startDate is not specified, it defaults to the endDate minus one month.") @RequestParam(value = "startDate", required = false) String startDate,@ApiParam(value = "A string in the format 'YYYY-MM-DD'. If endDate is not specified, it defaults to today's date.") @RequestParam(value = "endDate", required = false) String endDate,@ApiParam(value = "Result page that you want to retrieve.", defaultValue = "1") @RequestParam(value = "page", required = false, defaultValue="1") String page,@ApiParam(value = "Number of records per page. Max size is 100.", defaultValue = "20") @RequestParam(value = "perPage", required = false, defaultValue="20") String perPage,@ApiParam(value = "Determines the order of the results. You can order the results by id, name or bic. The default order for this service is 'date,asc'. You can also order by multiple properties. In that case the order of the parameters passed is important. Example: '/accounts/dailyBalances?order=date,desc&order=balance,asc' will return daily balances ordered by 'date' (descending), where items with the same 'date' are ordered by 'balance' (ascending). The general format is: 'property[,asc|desc]', with 'asc' being the default value. Please note that ordering by multiple fields is not supported in our swagger frontend, but you can test this feature with any HTTP tool of your choice (e.g. postman or DHC). ") @RequestParam(value = "order", required = false) List<String> order);


    @ApiOperation(value = "Get a label", notes = "Get a single label of the user that is authorized by the access_token. Must pass the label's identifier and the user's access_token.", response = Label.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Labels", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Requested label", response = Label.class),
        @ApiResponse(code = 400, message = "Bad request", response = Label.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Label.class),
        @ApiResponse(code = 404, message = "Label not found", response = Label.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Label.class) })
    @RequestMapping(value = "/api/v1/labels/{id}",
        method = RequestMethod.GET)
    ResponseEntity<Label> getLabel(@ApiParam(value = "Identifier of requested label",required=true ) @PathVariable("id") Long id);


    @ApiOperation(value = "Get multiple labels", notes = "Get a list of multiple labels of the user that is authorized by the access_token.Must pass the labels' identifiers and the user's access_token. Identifiers that do not exist or do not relate to the authorized user will not be contained in the result (If this applies to all of the given identifiers, then the result will be an empty list). WARNING: This service is deprecated and will be removed at some point. If you want to get multiple labels, please instead use the service 'Get all labels' and pass a comma-separated list of identifiers as a parameter 'ids'.", response = LabelList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Labels", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of requested labels", response = LabelList.class),
        @ApiResponse(code = 400, message = "Bad request", response = LabelList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = LabelList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = LabelList.class) })
    @RequestMapping(value = "/api/v1/labels/{ids}",
        method = RequestMethod.GET)
    ResponseEntity<LabelList> getLabels(@ApiParam(value = "Comma-separated list of identifiers of requested labels",required=true ) @PathVariable("ids") List<Long> ids);


    @ApiOperation(value = "Get multiple securities", notes = "Get a list of multiple securities of the user that is authorized by the access_token. Must pass the securities' identifiers and the user's access_token. Securities whose identifiers do not exist or do not relate to the authorized user will not be contained in the result (If this applies to all of the given identifiers, then the result will be an empty list). WARNING: This service is deprecated and will be removed at some point. If you want to get multiple securities, please instead use the service 'Get and search all securities' and pass a comma-separated list of identifiers as a parameter 'ids'.", response = SecurityList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Securities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of requested securities", response = SecurityList.class),
        @ApiResponse(code = 400, message = "Bad request", response = SecurityList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = SecurityList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = SecurityList.class) })
    @RequestMapping(value = "/api/v1/securities/{ids}",
        method = RequestMethod.GET)
    ResponseEntity<SecurityList> getSecurities(@ApiParam(value = "Comma-separated list of identifiers of requested securities",required=true ) @PathVariable("ids") List<Long> ids);


    @ApiOperation(value = "Get a security", notes = "Get a single security for a specific user. Must pass the security's identifier and the user's access_token.", response = Security.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Securities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Requested security", response = Security.class),
        @ApiResponse(code = 400, message = "Bad request", response = Security.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Security.class),
        @ApiResponse(code = 404, message = "Security not found", response = Security.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Security.class) })
    @RequestMapping(value = "/api/v1/securities/{id}",
        method = RequestMethod.GET)
    ResponseEntity<Security> getSecurity(@ApiParam(value = "Security identifier",required=true ) @PathVariable("id") Long id);


    @ApiOperation(value = "Get a transaction", notes = "Get a single transaction of the user that is authorized by the access_token. Must pass the transaction's identifier and the user's access_token.", response = Transaction.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Transactions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Requested transaction", response = Transaction.class),
        @ApiResponse(code = 400, message = "Bad request", response = Transaction.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Transaction.class),
        @ApiResponse(code = 404, message = "Transaction not found", response = Transaction.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Transaction.class) })
    @RequestMapping(value = "/api/v1/transactions/{id}",
        method = RequestMethod.GET)
    ResponseEntity<Transaction> getTransaction(@ApiParam(value = "Identifier of transaction",required=true ) @PathVariable("id") Long id);


    @ApiOperation(value = "Get multiple transactions", notes = "Get a list of multiple transactions of the user that is authorized by the access_token. Must pass the transactions' identifiers and the user's access_token. Transactions whose identifiers do not exist or do not relate to the authorized user will not be contained in the result (If this applies to all of the given identifiers, then the result will be an empty list). WARNING: This service is deprecated and will be removed at some point. If you want to get multiple transactions, please instead use the service 'Get and search all transactions', where you can pass a comma-separated list of identifiers .", response = TransactionList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Transactions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of requested transactions", response = TransactionList.class),
        @ApiResponse(code = 400, message = "Bad request", response = TransactionList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = TransactionList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = TransactionList.class) })
    @RequestMapping(value = "/api/v1/transactions/{ids}",
        method = RequestMethod.GET)
    ResponseEntity<TransactionList> getTransactions(@ApiParam(value = "Comma-separated list of identifiers of requested transactions",required=true ) @PathVariable("ids") List<Long> ids);


    @ApiOperation(value = "Get a user's verification status", notes = "Get the verification status of the requested user. Must pass your global (i.e. client) access_token. Note that finAPI regards user identifiers case-insensitive.", response = VerificationStatusResource.class, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User's verification status", response = VerificationStatusResource.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = VerificationStatusResource.class),
        @ApiResponse(code = 403, message = "You are not allowed to get a verification status", response = VerificationStatusResource.class),
        @ApiResponse(code = 404, message = "User not found", response = VerificationStatusResource.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = VerificationStatusResource.class) })
    @RequestMapping(value = "/api/v1/users/verificationStatus",
        method = RequestMethod.GET)
    ResponseEntity<VerificationStatusResource> getVerificationStatus(@ApiParam(value = "User's identifier", required = true) @RequestParam(value = "userId", required = true) String userId);


    @ApiOperation(value = "Import a new bank connection", notes = "Imports a new bank connection for a specific user. Must pass the connection credentials and the user's access_token. All bank accounts will be downloaded and imported with their current balances, transactions and supported two-step procedures (note that the amount of available transactions may vary between banks, e.g. some banks deliver all transactions from the past year, others only deliver the transactions from the past three months). The balance and transactions download process runs asynchronously, so this service may return before all balances and transactions have been imported. Also, all downloaded transactions will be categorized by a separate background process that runs asynchronously too. To check the status of the balance and transactions download process as well as the background categorization process, see the status flags that are returned by the GET /bankConnections/<id> service.<br/>Note that you can also import a \"demo connection\" which contains a single bank account with some pre-defined transactions. To import the demo connection, you need to pass the identifier of the \"demo bank\", which is a bank with BLZ 00000000 (see GET /banks/search). In case of demo connection import, any other fields besides the demo bank identifier can remain unset.", response = BankConnection.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Bank Connections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = BankConnection.class),
        @ApiResponse(code = 201, message = "Bank connection imported", response = BankConnection.class),
        @ApiResponse(code = 400, message = "Bad Request", response = BankConnection.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = BankConnection.class),
        @ApiResponse(code = 422, message = "UNKNOWN_ENTITY if the specified bank identifier does not exist; ILLEGAL_ENTITY_STATE if such a bank connection already exists or - in case of demo connection import - the user is not allowed to import the demo bank connection; ILLEGAL_FIELD_VALUE if the specified banking PIN contains illegal characters; BANK_SERVER_REJECTION if the bank server responded with an error message when finAPI tried to retrieve the user's data. The response's error message can be forwarded to the user, it will typically contain a german message from the bank server that contains useful information (like that the given login credentials were not correct or that the connection is not activated for online banking).", response = BankConnection.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = BankConnection.class),
        @ApiResponse(code = 501, message = "The given bank is currently not supported by finAPI", response = BankConnection.class) })
    @RequestMapping(value = "/api/v1/bankConnections/import",
        method = RequestMethod.POST)
    ResponseEntity<BankConnection> importBankConnection(@ApiParam(value = "Import bank connection parameters" ,required=true ) @RequestBody ImportBankConnectionParams body);


    @ApiOperation(value = "Edit multiple transactions", notes = "Change the fields of all or only specified the user's transactions. You can update the following fields: 'isNew=true|false' and/or 'isPotentialDuplicate=false' and/or 'categoryId=<id>' and/or 'labelIds=[<ids>]'. To clear the category of the given transactions (so that they are no longer categorized), pass the value '0' as the categoryId. To clear the labels of the given transactions, pass an empty array of label identifiers: '[]'. The parameters 'categoryId' and 'labelIds' are forbidden if 'ids' is NOT set (i.e. you cannot update the category or labels for ALL transactions). The result is a list of identifiers of only those transactions that have changed as a result of this service call.", response = IdentifierList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Transactions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of identifiers of all updated transactions", response = IdentifierList.class),
        @ApiResponse(code = 400, message = "Bad request", response = IdentifierList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = IdentifierList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = IdentifierList.class) })
    @RequestMapping(value = "/api/v1/transactions",
        method = RequestMethod.PATCH)
    ResponseEntity<IdentifierList> patchAllTransactions(@ApiParam(value = "Update transactions parameters" ,required=true ) @RequestBody UpdateSpecificTransactionsParams body);


    @ApiOperation(value = "Edit a bank connection", notes = "Change the stored authentication credentials (banking user ID, banking customer ID, and banking PIN) and/or the default two-step procedure ID for a single bank connection of the user that is authorized by the access_token. Must pass the connection's identifier and the user's access_token. Optional parameters are new credentials and a new default two-step procedure ID. Note that a bank connection's credentials cannot be changed while it is in the process of import, update, or transactions categorization.", response = BankConnection.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Bank Connections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Bank connection parameters updated", response = BankConnection.class),
        @ApiResponse(code = 400, message = "Bad request", response = BankConnection.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = BankConnection.class),
        @ApiResponse(code = 404, message = "Bank connection not found", response = BankConnection.class),
        @ApiResponse(code = 423, message = "Bank connection cannot get patched at the moment as it is currently being imported or updated", response = BankConnection.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = BankConnection.class) })
    @RequestMapping(value = "/api/v1/bankConnections/{bankConnectionId}",
        method = RequestMethod.PATCH)
    ResponseEntity<BankConnection> patchBankConnection(@ApiParam(value = "Identifier of the bank connection to change the parameters for",required=true ) @PathVariable("bankConnectionId") Long bankConnectionId,@ApiParam(value = "New bank connection parameters" ,required=true ) @RequestBody BankConnectionParams body);


    @ApiOperation(value = "Edit client configuration", notes = "Edit your client's configuration. Must pass your global (i.e. client) access_token.", response = ClientConfiguration.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Client Configuration", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "New client configuration", response = ClientConfiguration.class),
        @ApiResponse(code = 400, message = "Bad request", response = ClientConfiguration.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = ClientConfiguration.class),
        @ApiResponse(code = 422, message = "Invalid callback URL", response = ClientConfiguration.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ClientConfiguration.class) })
    @RequestMapping(value = "/api/v1/clientConfiguration",
        method = RequestMethod.PATCH)
    ResponseEntity<ClientConfiguration> patchClientConfiguration(@ApiParam(value = "Client configuration parameters"  ) @RequestBody ClientConfigurationParams body);


    @ApiOperation(value = "Edit a label", notes = "Change the name of a label of the user that is authorized by the access_token. Must pass the label's identifier, the label's new name and the user's access_token.", response = Label.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Labels", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Label updated", response = Label.class),
        @ApiResponse(code = 400, message = "Bad request", response = Label.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Label.class),
        @ApiResponse(code = 404, message = "Label not found", response = Label.class),
        @ApiResponse(code = 422, message = "ILLEGAL_FIELD_VALUE if  the given label name is too long; ENTITY_EXISTS if a label with the given name already exists", response = Label.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Label.class) })
    @RequestMapping(value = "/api/v1/labels/{labelId}",
        method = RequestMethod.PATCH)
    ResponseEntity<Label> patchLabel(@ApiParam(value = "Label's identifier",required=true ) @PathVariable("labelId") Long labelId,@ApiParam(value = "Label's new name" ,required=true ) @RequestBody LabelParams body);


    @ApiOperation(value = "Edit a transaction", notes = "Change a transaction's fields. You can change the following fields: 'isNew=true|false' and/or 'isPotentialDuplicate=false' and/or 'categoryId=<id>' and/or 'labelIds=[<ids>]'. To clear a transaction's category (so that it is no longer categorized), pass the value '0' as the categoryId. To clear the labels of the given transaction, pass an empty array of label identifiers: '[]'.", response = Transaction.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Transactions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Transaction updated", response = Transaction.class),
        @ApiResponse(code = 400, message = "Bad request", response = Transaction.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Transaction.class),
        @ApiResponse(code = 404, message = "Transaction not found", response = Transaction.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Transaction.class) })
    @RequestMapping(value = "/api/v1/transactions/{id}",
        method = RequestMethod.PATCH)
    ResponseEntity<Transaction> patchTransaction(@ApiParam(value = "Identifier of transaction",required=true ) @PathVariable("id") Long id,@ApiParam(value = "Update transactions parameters" ,required=true ) @RequestBody UpdateTransactionsParams body);


    @ApiOperation(value = "Edit multiple transactions (DEPRECATED)", notes = "Change the fields of multiple transactions. You can change the following fields: 'isNew=true|false' and/or 'isPotentialDuplicate=false' and/or 'categoryId=<id>' and/or 'labelIds=[<ids>]'. The max number of input identifiers is limited to 100. To clear the category of the given transactions (so that they are no longer categorized), pass the value '0' as the categoryId. To clear the labels of the given transactions, pass an empty array of label identifiers: '[]'. The result is a list of identifiers of only those transactions that have changed as a result of this service call. WARNING: This service is deprecated and will be removed at some point. If you want to edit multiple transactions, please instead use the service 'Edit multiple transactions', where you can pass a comma-separated list of identifiers .", response = IdentifierList.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Transactions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of identifiers of all updated transactions", response = IdentifierList.class),
        @ApiResponse(code = 400, message = "Bad request", response = IdentifierList.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = IdentifierList.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = IdentifierList.class) })
    @RequestMapping(value = "/api/v1/transactions/{ids}",
        method = RequestMethod.PATCH)
    ResponseEntity<IdentifierList> patchTransactions(@ApiParam(value = "Comma-separated list of identifiers of updated transactions",required=true ) @PathVariable("ids") List<Long> ids,@ApiParam(value = "Update transactions parameters" ,required=true ) @RequestBody UpdateTransactionsParams body);


    @ApiOperation(value = "Edit the authorized user", notes = "Change the email address and/or phone number of the authorized user. Must pass the user's access_token. Pass an empty string (but not null) to unset either the email or phone number. At least one field must have a non-null value in the request body. Only the authorized user can edit his data, i.e. his access_token must be used. This service returns the user's password in distorted form.", response = User.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User updated", response = User.class),
        @ApiResponse(code = 400, message = "Bad request", response = User.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = User.class),
        @ApiResponse(code = 403, message = "You are not allowed to edit this user", response = User.class),
        @ApiResponse(code = 404, message = "User not found", response = User.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = User.class) })
    @RequestMapping(value = "/api/v1/users",
        method = RequestMethod.PATCH)
    ResponseEntity<User> patchUser(@ApiParam(value = "User's details" ,required=true ) @RequestBody UserUpdateParamsImpl body);


    @ApiOperation(value = "Request password change", notes = "Request password change for a user. Must pass your global (i.e. client) access_token. Note that finAPI regards user identifiers case-insensitive.", response = PasswordChangingResource.class, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request accepted", response = PasswordChangingResource.class),
        @ApiResponse(code = 400, message = "Bad request", response = PasswordChangingResource.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = PasswordChangingResource.class),
        @ApiResponse(code = 403, message = "You are not allowed to request a password change", response = PasswordChangingResource.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = PasswordChangingResource.class) })
    @RequestMapping(value = "/api/v1/users/requestPasswordChange",
        method = RequestMethod.POST)
    ResponseEntity<PasswordChangingResource> requestPasswordChange(@ApiParam(value = ""  ) @RequestBody RequestPasswordChangeParameters body);


    @ApiOperation(value = "Request SEPA Money Transfer", notes = "Submit a SEPA money transfer order. Returns an instruction from the bank server that can be displayed to the user (e.g. \"Enter TAN\"), typically in the language of the bank's country. The order remains valid for execution for only a couple of minutes (the exact validity period depends on the bank). For executing the order, use the /executeSepaMoneyTransfer service after calling this service. Note that when the order is not executed within the validity period, the bank might take note of that and - if happening too often - ultimately lock the user's online banking access. If there already exists a previously submitted, but not yet executed money transfer order for this account, then that order will be discarded and replaced with the new order that is being created with this service call. Note that this service cannot be used for the demo account.", response = MoneyTransferOrderingResponse.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "SEPA Money Transfer requested", response = MoneyTransferOrderingResponse.class),
        @ApiResponse(code = 400, message = "Bad request", response = MoneyTransferOrderingResponse.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = MoneyTransferOrderingResponse.class),
        @ApiResponse(code = 404, message = "Account not found", response = MoneyTransferOrderingResponse.class),
        @ApiResponse(code = 422, message = "ILLEGAL_ENTITY_STATE if no PIN has been specified and finAPI has no PIN stored for the account's bank connection; UNSUPPORTED_ORDER if the account does not support the SEPA money transfer order; IBAN_ONLY_MONEY_TRANSFER_NOT_SUPPORTED if the recipient account's BIC is required but was not set; MISSING_TWO_STEP_PROCEDURE if no two-step-procedure was specified in the input parameters of the service call, and there is no default two-step-procedure set in the account's bank connection neither; BANK_SERVER_REJECTION if the bank server responded with an error message when finAPI tried to submit the money transfer order. The response's error message can be forwarded to the user, as it will typically contain a german message from the bank server that contains  useful information for the user.", response = MoneyTransferOrderingResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = MoneyTransferOrderingResponse.class),
        @ApiResponse(code = 501, message = "The given bank is currently not supported by finAPI", response = MoneyTransferOrderingResponse.class) })
    @RequestMapping(value = "/api/v1/accounts/requestSepaMoneyTransfer",
        method = RequestMethod.POST)
    ResponseEntity<MoneyTransferOrderingResponse> requestSepaMoneyTransfer(@ApiParam(value = "Parameters for a SEPA money transfer request" ,required=true ) @RequestBody RequestSepaMoneyTransferParams body);


    @ApiOperation(value = "Restore a transaction", notes = "Restore a previously split transaction. Removes all of its sub-transactions.", response = Transaction.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Transactions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Transaction restored", response = Transaction.class),
        @ApiResponse(code = 400, message = "Bad request", response = Transaction.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Transaction.class),
        @ApiResponse(code = 404, message = "Transaction not found", response = Transaction.class),
        @ApiResponse(code = 422, message = "The request transaction is a sub-transaction and can not be restored.", response = Transaction.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Transaction.class) })
    @RequestMapping(value = "/api/v1/transactions/{id}/restore",
        method = RequestMethod.POST)
    ResponseEntity<Transaction> restoreTransaction(@ApiParam(value = "Transaction identifier",required=true ) @PathVariable("id") Long id);


    @ApiOperation(value = "Split a transaction", notes = "Split a transaction into several logical sub-transactions. If the given transaction is split already, all its current sub-transactions will get deleted before the new sub-transactions will get created.", response = Transaction.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Transactions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Transaction split", response = Transaction.class),
        @ApiResponse(code = 400, message = "Bad request", response = Transaction.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Transaction.class),
        @ApiResponse(code = 404, message = "Transaction or category not found", response = Transaction.class),
        @ApiResponse(code = 422, message = "ILLEGAL_ENTITY_STATE if the transaction is already split; ILLEGAL_FIELD_VALUE if there is less than two sub-transactions specified, or the specified sub-transactions' amounts do not add up to the original transaction's amount", response = Transaction.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Transaction.class) })
    @RequestMapping(value = "/api/v1/transactions/{id}/split",
        method = RequestMethod.POST)
    ResponseEntity<Transaction> splitTransaction(@ApiParam(value = "Transaction identifier",required=true ) @PathVariable("id") Long id,@ApiParam(value = "Split transactions parameters" ,required=true ) @RequestBody SplitTransactionsParams body);


    @ApiOperation(value = "Edit an account", notes = "Change the name and/or the type and/or the 'isNew' flag of a single bank account of the user that is authorized by the access_token. Must pass the account's identifier, the account's new name and/or type and/or 'isNew' flag, and the user's access_token.", response = Account.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Account edited", response = Account.class),
        @ApiResponse(code = 400, message = "MISSING_FIELD if neither a name, nor a type, nor the 'isNew' flag were specified; UNKNOWN_ENTITY if the given account type id does not exist", response = Account.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Account.class),
        @ApiResponse(code = 404, message = "Account not found", response = Account.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Account.class) })
    @RequestMapping(value = "/api/v1/accounts/{id}",
        method = RequestMethod.PATCH)
    ResponseEntity<Account> updateAccount(@ApiParam(value = "Identifier of the account to edit",required=true ) @PathVariable("id") Long id,@ApiParam(value = "New account name and/or type and/or 'isNew' flag"  ) @RequestBody AccountParams body);


    @ApiOperation(value = "Update a bank connection", notes = "Update an existing bank connection of the user that is authorized by the access_token. Downloads and imports the current account balances and new transactions. Must pass the connection's identifier and the user's access_token. For more information about the process of data download and transactions categorization, see POST /bankConnections/import. Note that supported two-step procedures are updated as well. It may unset the current default two-step procedure of the given bank connection (but only if this procedure is not supported anymore by the bank). You can also update the \"demo connection\". Note that you cannot trigger an update of a bank connection as long as there is still a previously triggered update running.", response = BankConnection.class, authorizations = {
        @Authorization(value = "finapi_auth", scopes = {
            @AuthorizationScope(scope = "all", description = "modify any sources")
            })
    }, tags={ "Bank Connections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Bank connection updated", response = BankConnection.class),
        @ApiResponse(code = 400, message = "Bad Request", response = BankConnection.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = BankConnection.class),
        @ApiResponse(code = 404, message = "Bank connection not found", response = BankConnection.class),
        @ApiResponse(code = 422, message = "MISSING_FIELD if the PIN is not specified and there is no PIN stored in finAPI for this connection; ILLEGAL_FIELD_VALUE if the specified banking PIN contains illegal characters; ILLEGAL_ENTITY_STATE if the bank connection is already in the process of an import or update at the moment; BANK_SERVER_REJECTION if the bank server responded with an error message when finAPI tried to  retrieve the user's data. The response's error message can be forwarded to the user, it will typically contain a german message from the bank server that contains useful information (like that the given login credentials were not correct or that the connection is not activated for online banking).", response = BankConnection.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = BankConnection.class) })
    @RequestMapping(value = "/api/v1/bankConnections/update",
        method = RequestMethod.POST)
    ResponseEntity<BankConnection> updateBankConnection(@ApiParam(value = "Update bank connection parameters" ,required=true ) @RequestBody UpdateBankConnectionParams body);


    @ApiOperation(value = "Verify a user", notes = "Verify a user. Must pass your global (i.e. client) access_token. Note that finAPI regards user identifiers case-insensitive.", response = Void.class, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User verified", response = Void.class),
        @ApiResponse(code = 400, message = "Bad request", response = Void.class),
        @ApiResponse(code = 401, message = "Not authenticated or invalid access_token", response = Void.class),
        @ApiResponse(code = 404, message = "User not found", response = Void.class),
        @ApiResponse(code = 422, message = "User already verified", response = Void.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = Void.class) })
    @RequestMapping(value = "/api/v1/users/verify/{userId}",
        method = RequestMethod.POST)
    ResponseEntity<Void> verifyUser(@ApiParam(value = "User's identifier",required=true ) @PathVariable("userId") String userId);

}
