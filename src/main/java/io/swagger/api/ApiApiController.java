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
public class ApiApiController implements ApiApi {

    public ResponseEntity<CashFlowList> cashFlows(@ApiParam(value = "If specified, then only transactions that contain the search term in their purpose or counterpart fields will be contained in the result. Note that the search is case insensitive.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "The counterpart is the person or institution that received your payment, or that you made the payment to. If this parameter is specified, then only transactions that contain the given term in one (or more) of their counterpart fields ('counterpartName', 'counterpartAccountNumber', 'counterpartIban', 'counterpartBic' or 'counterpartBlz') will be contained in the result. Note that the search is case insensitive.") @RequestParam(value = "counterpart", required = false) String counterpart,
        @ApiParam(value = "A comma-separated list of account identifiers. If specified, then only transactions that relate to the given accounts will be regarded. If not specified, then all accounts will be regarded.") @RequestParam(value = "accountIds", required = false) List<Long> accountIds,
        @ApiParam(value = "Lower bound for a transaction's booking date as returned by the bank (= original booking date), in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only transactions whose 'bankBookingDate' is equal to or later than the given date will be regarded.") @RequestParam(value = "minBankBookingDate", required = false) String minBankBookingDate,
        @ApiParam(value = "Upper bound for a transaction's booking date as returned by the bank (= original booking date), in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only transactions whose 'bankBookingDate' is equal to or earlier than the given date will be regarded.") @RequestParam(value = "maxBankBookingDate", required = false) String maxBankBookingDate,
        @ApiParam(value = "Lower bound for a transaction's booking date as set by finAPI, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). For details about the meaning of the finAPI booking date, please see the field's documentation in the service's response.") @RequestParam(value = "minFinapiBookingDate", required = false) String minFinapiBookingDate,
        @ApiParam(value = "Upper bound for a transaction's booking date as set by finAPI, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). For details about the meaning of the finAPI booking date, please see the field's documentation in the service's response.") @RequestParam(value = "maxFinapiBookingDate", required = false) String maxFinapiBookingDate,
        @ApiParam(value = "If specified, then only transactions whose amount is equal to or greater than the given amount will be regarded. Can contain a positive or negative number with at most two decimal places. Examples: -300.12, or 90.95") @RequestParam(value = "minAmount", required = false) BigDecimal minAmount,
        @ApiParam(value = "If specified, then only transactions whose amount is equal to or less than the given amount will be regarded. Can contain a positive or negative number with at most two decimal places. Examples: -300.12, or 90.95") @RequestParam(value = "maxAmount", required = false) BigDecimal maxAmount,
        @ApiParam(value = "If specified, then only transactions with the given direction(s) will be regarded. Use 'income' for regarding only received payments (amount >= 0), 'spending' for regarding only outgoing payments (amount < 0), or 'both' to regard both directions. If not specified, the direction defaults to 'both'.", allowableValues = "{values=[all, income, spending], enumVars=[{name=ALL, value=\"all\"}, {name=INCOME, value=\"income\"}, {name=SPENDING, value=\"spending\"}]}") @RequestParam(value = "direction", required = false) String direction,
        @ApiParam(value = "A comma-separated list of label identifiers. If specified, then only transactions that have been marked with at least one of the given labels will be contained in the result.") @RequestParam(value = "labelIds", required = false) List<Long> labelIds,
        @ApiParam(value = "If specified, then the cash flows depend only on the specified categories. Note that the cash flow for a category may include/exclude the cash flows of its sub-categories, depending on the 'includeSubCashFlows' setting. To include not categorized transactions, pass the value '0' as the categoryId. Note: When this parameter is not set, then the result will contain a cash flow for all categories that have transactions associated to them, more precisely: transactions that fulfill the filter criteria. Categories that have no associated transactions according to the filter criteria will not appear in the result. However, when you specify this parameter, then all specified categories will have a cash flow entry in the result, even if there are no associated transactions for the category (the cash flow will have income, spending and balance all set to zero).") @RequestParam(value = "categoryIds", required = false) List<Long> categoryIds,
        @ApiParam(value = "If specified, then only transactions that have their 'isNew' flag set to true/false will be regarded for the cash flow calculations.") @RequestParam(value = "isNew", required = false) Boolean isNew,
        @ApiParam(value = "Lower bound for a transaction's import date, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only transactions whose 'importDate' is equal to or later than the given date will be regarded.") @RequestParam(value = "minImportDate", required = false) String minImportDate,
        @ApiParam(value = "Upper bound for a transaction's import date, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only transactions whose 'importDate' is equal to or earlier than the given date will be regarded.") @RequestParam(value = "maxImportDate", required = false) String maxImportDate,
        @ApiParam(value = "If it is true, then the income, spending and balance of a main category results from all transactions that have either this (main) category or any of its subcategories assigned (of course all transactions depends from the other filtering settings); If it is false, then the income, spending and balance of a main category only results from the transactions that have exactly this (main) category assigned.", defaultValue = "true") @RequestParam(value = "includeSubCashFlows", required = false, defaultValue="true") Boolean includeSubCashFlows,
        @ApiParam(value = "Determines the order of the results. You can order the results by income, spending, balance, category.id or category.name. The default order for this service is 'category.id,asc'. You can also order by multiple properties. In that case the order of the parameters passed is important. Example: '/cashFlows?order=income,desc&order=spending,asc&balance,desc' will return as first result the category with the highest income. If two categories have the same income, it returns the category with the highest spending first (because spending is a negative value) and so on. The general format is: 'property[,asc|desc]', with 'asc' being the default value. Please note that ordering by multiple fields is not supported in our swagger frontend, but you can test this feature with any HTTP tool of your choice (e.g. postman or DHC). ") @RequestParam(value = "order", required = false) List<String> order) {
        // do some magic!
        return new ResponseEntity<CashFlowList>(HttpStatus.OK);
    }

    public ResponseEntity<Category> createCategory(@ApiParam(value = "Parameters of the new category"  ) @RequestBody CategoryParams body) {
        // do some magic!
        return new ResponseEntity<Category>(HttpStatus.OK);
    }

    public ResponseEntity<Label> createLabel(@ApiParam(value = "Label's name" ,required=true ) @RequestBody LabelParams body) {
        // do some magic!
        return new ResponseEntity<Label>(HttpStatus.OK);
    }

    public ResponseEntity<User> createUser(@ApiParam(value = "User's details" ,required=true ) @RequestBody UserCreateParamsImpl body) {
        // do some magic!
        return new ResponseEntity<User>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteAccount(@ApiParam(value = "Identifier of the account to delete",required=true ) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<IdentifierList> deleteAllAccounts() {
        // do some magic!
        return new ResponseEntity<IdentifierList>(HttpStatus.OK);
    }

    public ResponseEntity<IdentifierList> deleteAllBankConnections() {
        // do some magic!
        return new ResponseEntity<IdentifierList>(HttpStatus.OK);
    }

    public ResponseEntity<IdentifierList> deleteAllCategories() {
        // do some magic!
        return new ResponseEntity<IdentifierList>(HttpStatus.OK);
    }

    public ResponseEntity<IdentifierList> deleteAllLabels() {
        // do some magic!
        return new ResponseEntity<IdentifierList>(HttpStatus.OK);
    }

    public ResponseEntity<IdentifierList> deleteAllTransactions() {
        // do some magic!
        return new ResponseEntity<IdentifierList>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteBankConnection(@ApiParam(value = "Identifier of the bank connection to delete",required=true ) @PathVariable("bankConnectionId") Long bankConnectionId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteCategory(@ApiParam(value = "Category identifier",required=true ) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteLabel(@ApiParam(value = "Identifier of the label to delete",required=true ) @PathVariable("labelId") Long labelId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteTransaction(@ApiParam(value = "Identifier of transaction",required=true ) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteUser() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteUser(@ApiParam(value = "",required=true ) @PathVariable("userId") String userId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> executePasswordChange(@ApiParam(value = ""  ) @RequestBody ExecutePasswordChangeParams body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<BankResponse> executeSepaMoneyTransfer(@ApiParam(value = "Parameters for the execution of a SEPA money transfer order" ,required=true ) @RequestBody ExecuteSepaMoneyTransferParams body) {
        // do some magic!
        return new ResponseEntity<BankResponse>(HttpStatus.OK);
    }

    public ResponseEntity<User> get() {
        // do some magic!
        return new ResponseEntity<User>(HttpStatus.OK);
    }

    public ResponseEntity<Account> getAccount(@ApiParam(value = "Identifier of requested account",required=true ) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<Account>(HttpStatus.OK);
    }

    public ResponseEntity<AccountList> getAccounts(@ApiParam(value = "Comma-separated list of identifiers of requested accounts",required=true ) @PathVariable("ids") List<Long> ids) {
        // do some magic!
        return new ResponseEntity<AccountList>(HttpStatus.OK);
    }

    public ResponseEntity<AccountList> getAllAccounts(@ApiParam(value = "A comma-separated list of account identifiers. If specified, then only accounts whose identifier match any of the given identifiers will be regarded. The maximum number of identifiers is 1000.") @RequestParam(value = "ids", required = false) List<Long> ids,
        @ApiParam(value = "If specified, then only accounts that contain the search term in one (or more) of their 'accountName', 'iban', 'accountNumber' or subAccountNumber fields will be contained in the result. Note that the search is case-insensitive.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "A comma-separated list of account types. If specified, then only accounts that relate to the given types will be regarded. If not specified, then all accounts will be regarded.") @RequestParam(value = "accountTypeIds", required = false) List<Long> accountTypeIds,
        @ApiParam(value = "A comma-separated list of bank connection identifiers. If specified, then only accounts that relate to the given bank connections will be regarded. If not specified, then all accounts will be regarded.") @RequestParam(value = "bankConnectionIds", required = false) List<Long> bankConnectionIds,
        @ApiParam(value = "Lower bound for a account's last successful update date, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only accounts whose 'lastSuccessfulUpdate' is equal to or later than the given date will be regarded.") @RequestParam(value = "minLastSuccessfulUpdate", required = false) String minLastSuccessfulUpdate,
        @ApiParam(value = "Upper bound for a account's last successful update date, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only accounts whose 'lastSuccessfulUpdate' is equal to or earlier than the given date will be regarded.") @RequestParam(value = "maxLastSuccessfulUpdate", required = false) String maxLastSuccessfulUpdate,
        @ApiParam(value = "If specified, then only accounts whose balance is equal to or greater than the given balance will be regarded. Can contain a positive or negative number with at most two decimal places. Examples: -300.12, or 90.95") @RequestParam(value = "minBalance", required = false) BigDecimal minBalance,
        @ApiParam(value = "If specified, then only accounts whose balance is equal to or less than the given balance will be regarded. Can contain a positive or negative number with at most two decimal places. Examples: -300.12, or 90.95") @RequestParam(value = "maxBalance", required = false) BigDecimal maxBalance) {
        // do some magic!
        return new ResponseEntity<AccountList>(HttpStatus.OK);
    }

    public ResponseEntity<BankConnectionList> getAllBankConnections(@ApiParam(value = "A comma-separated list of bank connection identifiers. If specified, then only bank connections whose identifier match any of the given identifiers will be regarded. The maximum number of identifiers is 1000.") @RequestParam(value = "ids", required = false) List<Long> ids) {
        // do some magic!
        return new ResponseEntity<BankConnectionList>(HttpStatus.OK);
    }

    public ResponseEntity<PageableBankList> getAllBanks(@ApiParam(value = "A comma-separated list of bank identifiers. If specified, then only banks whose identifier match any of the given identifiers will be regarded. The maximum number of identifiers is 1000.") @RequestParam(value = "ids", required = false) List<Long> ids,
        @ApiParam(value = "Search string used for finding banks (case-insensitive). Fields that are regarded in the search are the bank's name, bank's BLZs and bank's BIC. If one or more of these fields (fully) contain the search string, the respective bank will be contained in the result. If no bank matches the search string, the result will be an empty list.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Result page that you want to retrieve.", defaultValue = "1") @RequestParam(value = "page", required = false, defaultValue="1") String page,
        @ApiParam(value = "Number of records per page. Max size is 100.", defaultValue = "20") @RequestParam(value = "perPage", required = false, defaultValue="20") String perPage,
        @ApiParam(value = "Determines the order of the results. You can order the results by id, name or bic. The default order for all services is 'id,asc'. You can also order by multiple properties. In that case the order of the parameters passed is important. Example: '/banks?order=name,desc&order=id,asc' will return banks ordered by 'name' (descending), where banks with the same 'name' are ordered by 'id' (ascending). The general format is: 'property[,asc|desc]', with 'asc' being the default value. Please note that ordering by multiple fields is not supported in our swagger frontend, but you can test this feature with any HTTP tool of your choice (e.g. postman or DHC). ") @RequestParam(value = "order", required = false) List<String> order) {
        // do some magic!
        return new ResponseEntity<PageableBankList>(HttpStatus.OK);
    }

    public ResponseEntity<PageableCategoryList> getAllCategories(@ApiParam(value = "A comma-separated list of category identifiers. If specified, then only categories whose identifier match any of the given identifiers will be regarded. The maximum number of identifiers is 1000.") @RequestParam(value = "ids", required = false) List<Long> ids,
        @ApiParam(value = "Search string used for finding categories (case-insensitive). Only the categories' names will be regarded in the search. If no categories match the search string, the result will be an empty list.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Result page that you want to retrieve.", defaultValue = "1") @RequestParam(value = "page", required = false, defaultValue="1") String page,
        @ApiParam(value = "Number of records per page. Max size is 100.", defaultValue = "20") @RequestParam(value = "perPage", required = false, defaultValue="20") String perPage,
        @ApiParam(value = "Determines the order of the results. You can order the results by 'id', 'name' and 'isCustom'. The default order is 'id,asc'. You can also order by multiple properties. In that case the order of the parameters passed is important. Example: '/categories?order=isCustom,desc&order=name' will return all custom categories followed by all default categories. Both groups are ordered ascending by name. The general format is: 'property[,asc|desc]', with 'asc' being the default value. Please note that ordering by multiple fields is not supported in our swagger frontend, but you can test this feature with any HTTP tool of your choice (e.g. postman or DHC). ") @RequestParam(value = "order", required = false) List<String> order) {
        // do some magic!
        return new ResponseEntity<PageableCategoryList>(HttpStatus.OK);
    }

    public ResponseEntity<PageableLabelList> getAllLabels(@ApiParam(value = "A comma-separated list of label identifiers. If specified, then only labels whose identifier match any of the given identifiers will be regarded. The maximum number of identifiers is 1000.") @RequestParam(value = "ids", required = false) List<Long> ids,
        @ApiParam(value = "Result page that you want to retrieve", defaultValue = "1") @RequestParam(value = "page", required = false, defaultValue="1") String page,
        @ApiParam(value = "Maximum amount of records per page. Max size is 100.", defaultValue = "20") @RequestParam(value = "perPage", required = false, defaultValue="20") String perPage,
        @ApiParam(value = "Determines the order of the results. You can order the results by id or name. The default order for all services is 'id,asc'. Since both fields (id and name) are unique, ordering by multiple fields is pointless. The general format is: 'property[,asc|desc]', with 'asc' being the default value. ") @RequestParam(value = "order", required = false) List<String> order) {
        // do some magic!
        return new ResponseEntity<PageableLabelList>(HttpStatus.OK);
    }

    public ResponseEntity<PageableSecurityList> getAllSecurities(@ApiParam(value = "A comma-separated list of security identifiers. If specified, then only securities whose identifier match any of the given identifiers will be regarded. The maximum number of identifiers is 1000.") @RequestParam(value = "ids", required = false) List<Long> ids,
        @ApiParam(value = "Search string to filter securities by ISIN, WKN and name.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-separated list of identifiers of accounts") @RequestParam(value = "accountIds", required = false) List<Long> accountIds,
        @ApiParam(value = "Result page that you want to retrieve.", defaultValue = "1") @RequestParam(value = "page", required = false, defaultValue="1") String page,
        @ApiParam(value = "Number of records per page. Max size is 100.", defaultValue = "20") @RequestParam(value = "perPage", required = false, defaultValue="20") String perPage,
        @ApiParam(value = "Determines the order of the results. You can order the results by next fields: id, name, isin, wkn, quote, quantityNominal, marketValue and entryQuote. The default order for all services is 'id,asc'. You can also order by multiple properties. In that case the order of the parameters passed is important. The general format is: 'property[,asc|desc]', with 'asc' being the default value. Please note that ordering by multiple fields is not supported in our swagger frontend, but you can test this feature with any HTTP tool of your choice (e.g. postman or DHC). ") @RequestParam(value = "order", required = false) List<String> order) {
        // do some magic!
        return new ResponseEntity<PageableSecurityList>(HttpStatus.OK);
    }

    public ResponseEntity<PageableTransactionList> getAllTransactions(@ApiParam(value = "This parameter defines finAPI's logical view on the transactions when querying them: 'bankView' regards only the original transactions as they were received from the bank, without considering how the transactions might have gotten split by the user (see POST /transactions/<id>/split). This means that if a transaction is split into logical sub-transactions, then the service will still regard only the original transaction, and NOT the logical sub-transactions in its processing (though for convenience, the transactions will have the data of their sub-transactions included in the response). 'userView' by contrast regards the transactions as they exist for the user. For transactions that have not been split into logical sub-transactions, there is no difference to the \"bankView\". But for transaction that have been split into logical sub-transactions, the service will ONLY regard these sub-transactions, and not the originally received transaction (though for convenience, the sub-transactions will have the identifier of their original transaction included in the response).", required = true, allowableValues = "{values=[bankView, userView], enumVars=[{name=BANKVIEW, value=\"bankView\"}, {name=USERVIEW, value=\"userView\"}]}", defaultValue = "userView") @RequestParam(value = "view", required = true, defaultValue="userView") String view,
        @ApiParam(value = "A comma-separated list of transaction identifiers. If specified, then only transactions whose identifier match any of the given identifiers will be regarded. The maximum number of identifiers is 1000.") @RequestParam(value = "ids", required = false) List<Long> ids,
        @ApiParam(value = "If specified, then only transactions that contain the search term in their purpose or counterpart fields will be contained in the result. Note that the search is case-insensitive.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "The counterpart is the person or institution that received your payment, or that you made the payment to. If this parameter is specified, then only transactions that contain the given term in one (or more) of their counterpart fields ('counterpartName', 'counterpartAccountNumber', 'counterpartIban', 'counterpartBic' or 'counterpartBlz') will be contained in the result. Note that the search is case insensitive.") @RequestParam(value = "counterpart", required = false) String counterpart,
        @ApiParam(value = "A comma-separated list of account identifiers. If specified, then only transactions that relate to the given accounts will be regarded. If not specified, then all accounts will be regarded.") @RequestParam(value = "accountIds", required = false) List<Long> accountIds,
        @ApiParam(value = "Lower bound for a transaction's booking date as returned by the bank (= original booking date), in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only transactions whose 'bankBookingDate' is equal to or later than the given date will be regarded.") @RequestParam(value = "minBankBookingDate", required = false) String minBankBookingDate,
        @ApiParam(value = "Upper bound for a transaction's booking date as returned by the bank (= original booking date), in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only transactions whose 'bankBookingDate' is equal to or earlier than the given date will be regarded.") @RequestParam(value = "maxBankBookingDate", required = false) String maxBankBookingDate,
        @ApiParam(value = "Lower bound for a transaction's booking date as set by finAPI, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). For details about the meaning of the finAPI booking date, please see the field's documentation in the service's response.") @RequestParam(value = "minFinapiBookingDate", required = false) String minFinapiBookingDate,
        @ApiParam(value = "Upper bound for a transaction's booking date as set by finAPI, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). For details about the meaning of the finAPI booking date, please see the field's documentation in the service's response.") @RequestParam(value = "maxFinapiBookingDate", required = false) String maxFinapiBookingDate,
        @ApiParam(value = "If specified, then only transactions whose amount is equal to or greater than the given amount will be regarded. Can contain a positive or negative number with at most two decimal places. Examples: -300.12, or 90.95") @RequestParam(value = "minAmount", required = false) BigDecimal minAmount,
        @ApiParam(value = "If specified, then only transactions whose amount is equal to or less than the given amount will be regarded. Can contain a positive or negative number with at most two decimal places. Examples: -300.12, or 90.95") @RequestParam(value = "maxAmount", required = false) BigDecimal maxAmount,
        @ApiParam(value = "If specified, then only transactions with the given direction(s) will be regarded. Use 'income' for regarding only received payments (amount >= 0), 'spending' for regarding only outgoing payments (amount < 0), or 'both' to regard both directions. If not specified, the direction defaults to 'both'.", allowableValues = "{values=[all, income, spending], enumVars=[{name=ALL, value=\"all\"}, {name=INCOME, value=\"income\"}, {name=SPENDING, value=\"spending\"}]}") @RequestParam(value = "direction", required = false) String direction,
        @ApiParam(value = "A comma-separated list of label identifiers. If specified, then only transactions that have been marked with at least one of the given labels will be contained in the result.") @RequestParam(value = "labelIds", required = false) List<Long> labelIds,
        @ApiParam(value = "A comma-separated list of category identifiers. If specified, then the result will contain only transactions whose category is either one of the given categories, or whose category is a sub-category of one of the given categories. To include not categorized transactions, pass the value '0' as the categoryId.") @RequestParam(value = "categoryIds", required = false) List<Long> categoryIds,
        @ApiParam(value = "If specified, then only transactions that have their 'isNew' flag set to true/false will be regarded.") @RequestParam(value = "isNew", required = false) Boolean isNew,
        @ApiParam(value = "Lower bound for a transaction's import date, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only transactions whose 'importDate' is equal to or later than the given date will be regarded.") @RequestParam(value = "minImportDate", required = false) String minImportDate,
        @ApiParam(value = "Upper bound for a transaction's import date, in the format 'YYYY-MM-DD' (e.g. '2016-01-01'). If specified, then only transactions whose 'importDate' is equal to or earlier than the given date will be regarded.") @RequestParam(value = "maxImportDate", required = false) String maxImportDate,
        @ApiParam(value = "Result page that you want to retrieve.", defaultValue = "1") @RequestParam(value = "page", required = false, defaultValue="1") String page,
        @ApiParam(value = "Number of records per page. Max size is 100.", defaultValue = "20") @RequestParam(value = "perPage", required = false, defaultValue="20") String perPage,
        @ApiParam(value = "Determines the order of the results. You can use the following fields for ordering the response: id, parentId, accountId, valueDate, bankBookingDate, finapiBookingDate, amount, purpose, counterpartName, counterpartAccountNumber, counterpartIban, counterpartBlz, counterpartBic, type, primanota, category.id, category.name, isPotentialDuplicate, isNew and importDate. The default order for all services is 'id,asc'. You can also order by multiple properties. In that case the order of the parameters passed is important. Example: '/transactions?order=finapiBookingDate,desc&order=counterpartName' will return the latest transactions first. If there are more transactions on the same day, then these transactions are ordered by the counterpart name (ascending). The general format is: 'property[,asc|desc]', with 'asc' being the default value. Please note that ordering by multiple fields is not supported in our swagger frontend, but you can test this feature with any HTTP tool of your choice (e.g. postman or DHC). ") @RequestParam(value = "order", required = false) List<String> order) {
        // do some magic!
        return new ResponseEntity<PageableTransactionList>(HttpStatus.OK);
    }

    public ResponseEntity<Bank> getBank(@ApiParam(value = "Identifier of requested bank",required=true ) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<Bank>(HttpStatus.OK);
    }

    public ResponseEntity<BankConnection> getBankConnection(@ApiParam(value = "Identifier of requested bank connection",required=true ) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<BankConnection>(HttpStatus.OK);
    }

    public ResponseEntity<BankConnectionList> getBankConnections(@ApiParam(value = "Comma-separated list of identifiers of requested bank connections",required=true ) @PathVariable("ids") List<Long> ids) {
        // do some magic!
        return new ResponseEntity<BankConnectionList>(HttpStatus.OK);
    }

    public ResponseEntity<BankList> getBanks(@ApiParam(value = "Comma-separated list of identifiers of requested banks",required=true ) @PathVariable("ids") List<Long> ids) {
        // do some magic!
        return new ResponseEntity<BankList>(HttpStatus.OK);
    }

    public ResponseEntity<CategoryList> getCategories(@ApiParam(value = "Comma-separated list of identifiers of requested categories",required=true ) @PathVariable("ids") List<Long> ids) {
        // do some magic!
        return new ResponseEntity<CategoryList>(HttpStatus.OK);
    }

    public ResponseEntity<Category> getCategory(@ApiParam(value = "Category identifier",required=true ) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<Category>(HttpStatus.OK);
    }

    public ResponseEntity<ClientConfiguration> getClientConfiguration() {
        // do some magic!
        return new ResponseEntity<ClientConfiguration>(HttpStatus.OK);
    }

    public ResponseEntity<DailyBalanceList> getDailyBalances(@ApiParam(value = "A comma-separated list of (non-security) account identifiers. If no accounts are specified, all (non-security) accounts of the current user are regarded. ") @RequestParam(value = "accountIds", required = false) List<Long> accountIds,
        @ApiParam(value = "A string in the format 'YYYY-MM-DD'. If startDate is not specified, it defaults to the endDate minus one month.") @RequestParam(value = "startDate", required = false) String startDate,
        @ApiParam(value = "A string in the format 'YYYY-MM-DD'. If endDate is not specified, it defaults to today's date.") @RequestParam(value = "endDate", required = false) String endDate,
        @ApiParam(value = "Result page that you want to retrieve.", defaultValue = "1") @RequestParam(value = "page", required = false, defaultValue="1") String page,
        @ApiParam(value = "Number of records per page. Max size is 100.", defaultValue = "20") @RequestParam(value = "perPage", required = false, defaultValue="20") String perPage,
        @ApiParam(value = "Determines the order of the results. You can order the results by id, name or bic. The default order for this service is 'date,asc'. You can also order by multiple properties. In that case the order of the parameters passed is important. Example: '/accounts/dailyBalances?order=date,desc&order=balance,asc' will return daily balances ordered by 'date' (descending), where items with the same 'date' are ordered by 'balance' (ascending). The general format is: 'property[,asc|desc]', with 'asc' being the default value. Please note that ordering by multiple fields is not supported in our swagger frontend, but you can test this feature with any HTTP tool of your choice (e.g. postman or DHC). ") @RequestParam(value = "order", required = false) List<String> order) {
        // do some magic!
        return new ResponseEntity<DailyBalanceList>(HttpStatus.OK);
    }

    public ResponseEntity<Label> getLabel(@ApiParam(value = "Identifier of requested label",required=true ) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<Label>(HttpStatus.OK);
    }

    public ResponseEntity<LabelList> getLabels(@ApiParam(value = "Comma-separated list of identifiers of requested labels",required=true ) @PathVariable("ids") List<Long> ids) {
        // do some magic!
        return new ResponseEntity<LabelList>(HttpStatus.OK);
    }

    public ResponseEntity<SecurityList> getSecurities(@ApiParam(value = "Comma-separated list of identifiers of requested securities",required=true ) @PathVariable("ids") List<Long> ids) {
        // do some magic!
        return new ResponseEntity<SecurityList>(HttpStatus.OK);
    }

    public ResponseEntity<Security> getSecurity(@ApiParam(value = "Security identifier",required=true ) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<Security>(HttpStatus.OK);
    }

    public ResponseEntity<Transaction> getTransaction(@ApiParam(value = "Identifier of transaction",required=true ) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<Transaction>(HttpStatus.OK);
    }

    public ResponseEntity<TransactionList> getTransactions(@ApiParam(value = "Comma-separated list of identifiers of requested transactions",required=true ) @PathVariable("ids") List<Long> ids) {
        // do some magic!
        return new ResponseEntity<TransactionList>(HttpStatus.OK);
    }

    public ResponseEntity<VerificationStatusResource> getVerificationStatus(@ApiParam(value = "User's identifier", required = true) @RequestParam(value = "userId", required = true) String userId) {
        // do some magic!
        return new ResponseEntity<VerificationStatusResource>(HttpStatus.OK);
    }

    public ResponseEntity<BankConnection> importBankConnection(@ApiParam(value = "Import bank connection parameters" ,required=true ) @RequestBody ImportBankConnectionParams body) {
        // do some magic!
        return new ResponseEntity<BankConnection>(HttpStatus.OK);
    }

    public ResponseEntity<IdentifierList> patchAllTransactions(@ApiParam(value = "Update transactions parameters" ,required=true ) @RequestBody UpdateSpecificTransactionsParams body) {
        // do some magic!
        return new ResponseEntity<IdentifierList>(HttpStatus.OK);
    }

    public ResponseEntity<BankConnection> patchBankConnection(@ApiParam(value = "Identifier of the bank connection to change the parameters for",required=true ) @PathVariable("bankConnectionId") Long bankConnectionId,
        @ApiParam(value = "New bank connection parameters" ,required=true ) @RequestBody BankConnectionParams body) {
        // do some magic!
        return new ResponseEntity<BankConnection>(HttpStatus.OK);
    }

    public ResponseEntity<ClientConfiguration> patchClientConfiguration(@ApiParam(value = "Client configuration parameters"  ) @RequestBody ClientConfigurationParams body) {
        // do some magic!
        return new ResponseEntity<ClientConfiguration>(HttpStatus.OK);
    }

    public ResponseEntity<Label> patchLabel(@ApiParam(value = "Label's identifier",required=true ) @PathVariable("labelId") Long labelId,
        @ApiParam(value = "Label's new name" ,required=true ) @RequestBody LabelParams body) {
        // do some magic!
        return new ResponseEntity<Label>(HttpStatus.OK);
    }

    public ResponseEntity<Transaction> patchTransaction(@ApiParam(value = "Identifier of transaction",required=true ) @PathVariable("id") Long id,
        @ApiParam(value = "Update transactions parameters" ,required=true ) @RequestBody UpdateTransactionsParams body) {
        // do some magic!
        return new ResponseEntity<Transaction>(HttpStatus.OK);
    }

    public ResponseEntity<IdentifierList> patchTransactions(@ApiParam(value = "Comma-separated list of identifiers of updated transactions",required=true ) @PathVariable("ids") List<Long> ids,
        @ApiParam(value = "Update transactions parameters" ,required=true ) @RequestBody UpdateTransactionsParams body) {
        // do some magic!
        return new ResponseEntity<IdentifierList>(HttpStatus.OK);
    }

    public ResponseEntity<User> patchUser(@ApiParam(value = "User's details" ,required=true ) @RequestBody UserUpdateParamsImpl body) {
        // do some magic!
        return new ResponseEntity<User>(HttpStatus.OK);
    }

    public ResponseEntity<PasswordChangingResource> requestPasswordChange(@ApiParam(value = ""  ) @RequestBody RequestPasswordChangeParameters body) {
        // do some magic!
        return new ResponseEntity<PasswordChangingResource>(HttpStatus.OK);
    }

    public ResponseEntity<MoneyTransferOrderingResponse> requestSepaMoneyTransfer(@ApiParam(value = "Parameters for a SEPA money transfer request" ,required=true ) @RequestBody RequestSepaMoneyTransferParams body) {
        // do some magic!
        return new ResponseEntity<MoneyTransferOrderingResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Transaction> restoreTransaction(@ApiParam(value = "Transaction identifier",required=true ) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<Transaction>(HttpStatus.OK);
    }

    public ResponseEntity<Transaction> splitTransaction(@ApiParam(value = "Transaction identifier",required=true ) @PathVariable("id") Long id,
        @ApiParam(value = "Split transactions parameters" ,required=true ) @RequestBody SplitTransactionsParams body) {
        // do some magic!
        return new ResponseEntity<Transaction>(HttpStatus.OK);
    }

    public ResponseEntity<Account> updateAccount(@ApiParam(value = "Identifier of the account to edit",required=true ) @PathVariable("id") Long id,
        @ApiParam(value = "New account name and/or type and/or 'isNew' flag"  ) @RequestBody AccountParams body) {
        // do some magic!
        return new ResponseEntity<Account>(HttpStatus.OK);
    }

    public ResponseEntity<BankConnection> updateBankConnection(@ApiParam(value = "Update bank connection parameters" ,required=true ) @RequestBody UpdateBankConnectionParams body) {
        // do some magic!
        return new ResponseEntity<BankConnection>(HttpStatus.OK);
    }

    public ResponseEntity<Void> verifyUser(@ApiParam(value = "User's identifier",required=true ) @PathVariable("userId") String userId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
