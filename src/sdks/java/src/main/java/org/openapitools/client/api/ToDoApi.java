/*
 * To Do API
 * A To Do API example which demonstrate features in the OpenAPI 3.0 specification
 *
 * The version of the OpenAPI document: 1.0.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Error;
import org.openapitools.client.model.ToDoItem;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToDoApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToDoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ToDoApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createOne
     * @param toDoItem To do item to create (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> failed response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createOneCall(ToDoItem toDoItem, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = toDoItem;

        // create path and map variables
        String localVarPath = "/toDo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createOneValidateBeforeCall(ToDoItem toDoItem, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'toDoItem' is set
        if (toDoItem == null) {
            throw new ApiException("Missing the required parameter 'toDoItem' when calling createOne(Async)");
        }
        

        okhttp3.Call localVarCall = createOneCall(toDoItem, _callback);
        return localVarCall;

    }

    /**
     * 
     * Creates a new to do item
     * @param toDoItem To do item to create (required)
     * @return ToDoItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> failed response </td><td>  -  </td></tr>
     </table>
     */
    public ToDoItem createOne(ToDoItem toDoItem) throws ApiException {
        ApiResponse<ToDoItem> localVarResp = createOneWithHttpInfo(toDoItem);
        return localVarResp.getData();
    }

    /**
     * 
     * Creates a new to do item
     * @param toDoItem To do item to create (required)
     * @return ApiResponse&lt;ToDoItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> failed response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToDoItem> createOneWithHttpInfo(ToDoItem toDoItem) throws ApiException {
        okhttp3.Call localVarCall = createOneValidateBeforeCall(toDoItem, null);
        Type localVarReturnType = new TypeToken<ToDoItem>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Creates a new to do item
     * @param toDoItem To do item to create (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> failed response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createOneAsync(ToDoItem toDoItem, final ApiCallback<ToDoItem> _callback) throws ApiException {

        okhttp3.Call localVarCall = createOneValidateBeforeCall(toDoItem, _callback);
        Type localVarReturnType = new TypeToken<ToDoItem>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteOne
     * @param id ID of to do item to delete (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> failed response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteOneCall(UUID id, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/toDo/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteOneValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteOne(Async)");
        }
        

        okhttp3.Call localVarCall = deleteOneCall(id, _callback);
        return localVarCall;

    }

    /**
     * 
     * Deletes a to do item by id
     * @param id ID of to do item to delete (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> failed response </td><td>  -  </td></tr>
     </table>
     */
    public void deleteOne(UUID id) throws ApiException {
        deleteOneWithHttpInfo(id);
    }

    /**
     * 
     * Deletes a to do item by id
     * @param id ID of to do item to delete (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> failed response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteOneWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = deleteOneValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Deletes a to do item by id
     * @param id ID of to do item to delete (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> failed response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteOneAsync(UUID id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteOneValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMany
     * @param limit maximum number of results to return (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> failed response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getManyCall(Integer limit, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/toDo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getManyValidateBeforeCall(Integer limit, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getManyCall(limit, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns all to do items. 
     * @param limit maximum number of results to return (optional)
     * @return List&lt;List&lt;ToDoItem&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> failed response </td><td>  -  </td></tr>
     </table>
     */
    public List<List<ToDoItem>> getMany(Integer limit) throws ApiException {
        ApiResponse<List<List<ToDoItem>>> localVarResp = getManyWithHttpInfo(limit);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns all to do items. 
     * @param limit maximum number of results to return (optional)
     * @return ApiResponse&lt;List&lt;List&lt;ToDoItem&gt;&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> failed response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<List<ToDoItem>>> getManyWithHttpInfo(Integer limit) throws ApiException {
        okhttp3.Call localVarCall = getManyValidateBeforeCall(limit, null);
        Type localVarReturnType = new TypeToken<List<List<ToDoItem>>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns all to do items. 
     * @param limit maximum number of results to return (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> failed response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getManyAsync(Integer limit, final ApiCallback<List<List<ToDoItem>>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getManyValidateBeforeCall(limit, _callback);
        Type localVarReturnType = new TypeToken<List<List<ToDoItem>>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getOne
     * @param id ID of to do item to return (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> failed response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOneCall(UUID id, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/toDo/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getOneValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getOne(Async)");
        }
        

        okhttp3.Call localVarCall = getOneCall(id, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a to do item by id
     * @param id ID of to do item to return (required)
     * @return ToDoItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> failed response </td><td>  -  </td></tr>
     </table>
     */
    public ToDoItem getOne(UUID id) throws ApiException {
        ApiResponse<ToDoItem> localVarResp = getOneWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a to do item by id
     * @param id ID of to do item to return (required)
     * @return ApiResponse&lt;ToDoItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> failed response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToDoItem> getOneWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = getOneValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<ToDoItem>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a to do item by id
     * @param id ID of to do item to return (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> failed response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOneAsync(UUID id, final ApiCallback<ToDoItem> _callback) throws ApiException {

        okhttp3.Call localVarCall = getOneValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<ToDoItem>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
