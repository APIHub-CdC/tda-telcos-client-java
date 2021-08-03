package io.TelcosDataAgregation.client.api;

import io.TelcosDataAgregation.client.ApiCallback;
import io.TelcosDataAgregation.client.ApiClient;
import io.TelcosDataAgregation.client.ApiException;
import io.TelcosDataAgregation.client.ApiResponse;
import io.TelcosDataAgregation.client.Configuration;
import io.TelcosDataAgregation.client.Pair;
import io.TelcosDataAgregation.client.ProgressRequestBody;
import io.TelcosDataAgregation.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.TelcosDataAgregation.client.model.AckTDARequest;
import io.TelcosDataAgregation.client.model.AckTelcosDataAggregation;
import io.TelcosDataAgregation.client.model.AckFailureTDAConsumption;
import io.TelcosDataAgregation.client.model.AckSuccessTDAConsumption;
import io.TelcosDataAgregation.client.model.TelcosDataAggregation;
import io.TelcosDataAgregation.client.model.TelcosDataAggregationConfiguration;
import io.TelcosDataAgregation.client.model.TelcosDataAggregationConfigurationResponse;
import io.TelcosDataAgregation.client.model.TelcosDataAggregationMetadata;
import io.TelcosDataAgregation.client.model.Errors;
import org.threeten.bp.OffsetDateTime;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TdaApiForTelcosDataAggregationApi {
    private ApiClient apiClient;
    public TdaApiForTelcosDataAggregationApi() {
        this(Configuration.getDefaultApiClient());
    }
    public TdaApiForTelcosDataAggregationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call getTelcosDataAggregationsCall(String xApiKey, String username, String password,  String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/telcosdataaggregations";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (perPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("perPage", perPage));
        if (startAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startAt", startAt));
        if (endAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endAt", endAt));
        if (inquiryStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("inquiryStatus", inquiryStatus));
        if (successCheck != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("successCheck", successCheck));
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTelcosDataAggregationsValidateBeforeCall(String xApiKey, String username, String password,  String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getTelcosDataAggregations(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getTelcosDataAggregations(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling getTelcosDataAggregations(Async)");
        }

        okhttp3.Call call = getTelcosDataAggregationsCall(xApiKey, username, password,  page, perPage, startAt, endAt, inquiryStatus, successCheck, progressListener, progressRequestListener);
        return call;
    }
    
    public TelcosDataAggregationMetadata getTelcosDataAggregations(String xApiKey, String username, String password,  String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck) throws ApiException {
        ApiResponse<TelcosDataAggregationMetadata> resp = getTelcosDataAggregationsWithHttpInfo(xApiKey, username, password,  page, perPage, startAt, endAt, inquiryStatus, successCheck);
        return resp.getData();
    }
    
    public ApiResponse<TelcosDataAggregationMetadata> getTelcosDataAggregationsWithHttpInfo(String xApiKey, String username, String password,  String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck) throws ApiException {
        okhttp3.Call call = getTelcosDataAggregationsValidateBeforeCall(xApiKey, username, password, page, perPage, startAt, endAt, inquiryStatus, successCheck, null, null);
        Type localVarReturnType = new TypeToken<TelcosDataAggregationMetadata>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getTelcosDataAggregationsAsync(String xApiKey, String username, String password,  String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck, final ApiCallback<TelcosDataAggregationMetadata> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getTelcosDataAggregationsValidateBeforeCall(xApiKey, username, password,  page, perPage, startAt, endAt, inquiryStatus, successCheck, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TelcosDataAggregationMetadata>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    
    public okhttp3.Call getConfTelcosDataAggregationCall(String xApiKey, String username, String password,  UUID subscriptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/configurations/{subscriptionId}"
            .replaceAll("\\{" + "subscriptionId" + "\\}", apiClient.escapeString(subscriptionId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getConfTelcosDataAggregationValidateBeforeCall(String xApiKey, String username, String password, UUID subscriptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getConfTelcosDataAggregation(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getConfTelcosDataAggregation(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling getConfTelcosDataAggregation(Async)");
        }

        if (subscriptionId == null) {
            throw new ApiException("Missing the required parameter 'subscriptionId' when calling getConfTelcosDataAggregation(Async)");
        }
        
        okhttp3.Call call = getConfTelcosDataAggregationCall(xApiKey, username, password,  subscriptionId, progressListener, progressRequestListener);
        return call;
    }
    
    public TelcosDataAggregationConfigurationResponse getConfTelcosDataAggregation(String xApiKey, String username, String password,  UUID subscriptionId) throws ApiException {
        ApiResponse<TelcosDataAggregationConfigurationResponse> resp = getConfTelcosDataAggregationWithHttpInfo(xApiKey, username, password, subscriptionId);
        return resp.getData();
    }
    
    public ApiResponse<TelcosDataAggregationConfigurationResponse> getConfTelcosDataAggregationWithHttpInfo(String xApiKey, String username, String password,  UUID subscriptionId) throws ApiException {
        okhttp3.Call call = getConfTelcosDataAggregationValidateBeforeCall(xApiKey, username, password,  subscriptionId, null, null);
        Type localVarReturnType = new TypeToken<TelcosDataAggregationConfigurationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getConfTelcosDataAggregationAsync(String xApiKey, String username, String password,  UUID subscriptionId, final ApiCallback<TelcosDataAggregationConfigurationResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getConfTelcosDataAggregationValidateBeforeCall(xApiKey, username, password,  subscriptionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TelcosDataAggregationConfigurationResponse>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    
    public okhttp3.Call getInquiryCall(String xApiKey, String username, String password,  String inquiryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/telcosdataaggregations/{inquiryId}"
            .replaceAll("\\{" + "inquiryId" + "\\}", apiClient.escapeString(inquiryId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInquiryValidateBeforeCall(String xApiKey, String username, String password,  String inquiryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getInquiry(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getInquiry(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling getInquiry(Async)");
        }
        
        if (inquiryId == null) {
            throw new ApiException("Missing the required parameter 'inquiryId' when calling getInquiry(Async)");
        }
        
        okhttp3.Call call = getInquiryCall(xApiKey, username, password,  inquiryId, progressListener, progressRequestListener);
        return call;
    }
    
    public AckSuccessTDAConsumption getInquiry(String xApiKey, String username, String password,  String inquiryId) throws ApiException {
        ApiResponse<AckSuccessTDAConsumption> resp = getInquiryWithHttpInfo(xApiKey, username, password,  inquiryId);
        return resp.getData();
    }
    
    public ApiResponse<AckSuccessTDAConsumption> getInquiryWithHttpInfo(String xApiKey, String username, String password, String inquiryId) throws ApiException {
        okhttp3.Call call = getInquiryValidateBeforeCall(xApiKey, username, password,  inquiryId, null, null);
        Type localVarReturnType = new TypeToken<AckSuccessTDAConsumption>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getInquiryAsync(String xApiKey, String username, String password,  String inquiryId, final ApiCallback<AckSuccessTDAConsumption> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getInquiryValidateBeforeCall(xApiKey, username, password,  inquiryId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AckSuccessTDAConsumption>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    
    public okhttp3.Call postTelcosDataAggregationCall(String xApiKey, String username, String password, TelcosDataAggregation request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        String localVarPath = "/telcosdataaggregations";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call postTelcosDataAggregationValidateBeforeCall(String xApiKey,  String username, String password, TelcosDataAggregation request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling postTelcosDataAggregation(Async)");
        }
     
        
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling postTelcosDataAggregation(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling postTelcosDataAggregation(Async)");
        }
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling postTelcosDataAggregation(Async)");
        }
        
        okhttp3.Call call = postTelcosDataAggregationCall(xApiKey,  username, password, request, progressListener, progressRequestListener);
        return call;
    }
    
    public AckTDARequest postTelcosDataAggregation(String xApiKey, String username, String password, TelcosDataAggregation request) throws ApiException {
        ApiResponse<AckTDARequest> resp = postTelcosDataAggregationWithHttpInfo(xApiKey,  username, password, request);
        return resp.getData();
    }
    
    public ApiResponse<AckTDARequest> postTelcosDataAggregationWithHttpInfo(String xApiKey, String username, String password, TelcosDataAggregation request) throws ApiException {
        okhttp3.Call call = postTelcosDataAggregationValidateBeforeCall(xApiKey, username, password, request, null, null);
        Type localVarReturnType = new TypeToken<AckTDARequest>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call postTelcosDataAggregationAsync(String xApiKey, String username, String password, TelcosDataAggregation request, final ApiCallback<AckTDARequest> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = postTelcosDataAggregationValidateBeforeCall(xApiKey, username, password, request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AckTDARequest>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    
    public okhttp3.Call postConfTelcosDataAggregationCall(String xApiKey, String username, String password, TelcosDataAggregationConfiguration request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        String localVarPath = "/configurations";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call postConfTelcosDataAggregationValidateBeforeCall(String xApiKey,  String username, String password, TelcosDataAggregationConfiguration request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling postConfTelcosDataAggregation(Async)");
        }
    
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling postConfTelcosDataAggregation(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling postConfTelcosDataAggregation(Async)");
        }
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling postConfTelcosDataAggregation(Async)");
        }
        
        okhttp3.Call call = postConfTelcosDataAggregationCall(xApiKey,  username, password, request, progressListener, progressRequestListener);
        return call;
    }
    
    public AckTelcosDataAggregation postConfTelcosDataAggregation(String xApiKey,  String username, String password, TelcosDataAggregationConfiguration request) throws ApiException {
        ApiResponse<AckTelcosDataAggregation> resp = postConfTelcosDataAggregationWithHttpInfo(xApiKey,  username, password, request);
        return resp.getData();
    }
    
    public ApiResponse<AckTelcosDataAggregation> postConfTelcosDataAggregationWithHttpInfo(String xApiKey, String username, String password, TelcosDataAggregationConfiguration request) throws ApiException {
        okhttp3.Call call = postConfTelcosDataAggregationValidateBeforeCall(xApiKey,  username, password, request, null, null);
        Type localVarReturnType = new TypeToken<AckTelcosDataAggregation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call postConfTelcosDataAggregationAsync(String xApiKey,  String username, String password, TelcosDataAggregationConfiguration request, final ApiCallback<AckTelcosDataAggregation> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = postConfTelcosDataAggregationValidateBeforeCall(xApiKey, username, password, request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AckTelcosDataAggregation>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
}
