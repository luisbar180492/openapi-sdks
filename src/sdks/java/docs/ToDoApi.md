# ToDoApi

All URIs are relative to *http://localhost:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOne**](ToDoApi.md#createOne) | **POST** /toDo | 
[**deleteOne**](ToDoApi.md#deleteOne) | **DELETE** /toDo/{id} | 
[**getMany**](ToDoApi.md#getMany) | **GET** /toDo | 
[**getOne**](ToDoApi.md#getOne) | **GET** /toDo/{id} | 


<a name="createOne"></a>
# **createOne**
> ToDoItem createOne(toDoItem)



Creates a new to do item

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToDoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3000/api");

    ToDoApi apiInstance = new ToDoApi(defaultClient);
    ToDoItem toDoItem = new ToDoItem(); // ToDoItem | To do item to create
    try {
      ToDoItem result = apiInstance.createOne(toDoItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToDoApi#createOne");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toDoItem** | [**ToDoItem**](ToDoItem.md)| To do item to create |

### Return type

[**ToDoItem**](ToDoItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful response |  -  |
**0** | failed response |  -  |

<a name="deleteOne"></a>
# **deleteOne**
> deleteOne(id)



Deletes a to do item by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToDoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3000/api");

    ToDoApi apiInstance = new ToDoApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of to do item to delete
    try {
      apiInstance.deleteOne(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToDoApi#deleteOne");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| ID of to do item to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | successful response |  -  |
**0** | failed response |  -  |

<a name="getMany"></a>
# **getMany**
> List&lt;List&lt;ToDoItem&gt;&gt; getMany(limit)



Returns all to do items. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToDoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3000/api");

    ToDoApi apiInstance = new ToDoApi(defaultClient);
    Integer limit = 56; // Integer | maximum number of results to return
    try {
      List<List<ToDoItem>> result = apiInstance.getMany(limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToDoApi#getMany");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| maximum number of results to return | [optional]

### Return type

[**List&lt;List&lt;ToDoItem&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful response |  -  |
**0** | failed response |  -  |

<a name="getOne"></a>
# **getOne**
> ToDoItem getOne(id)



Returns a to do item by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToDoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3000/api");

    ToDoApi apiInstance = new ToDoApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of to do item to return
    try {
      ToDoItem result = apiInstance.getOne(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToDoApi#getOne");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| ID of to do item to return |

### Return type

[**ToDoItem**](ToDoItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful response |  -  |
**0** | failed response |  -  |

