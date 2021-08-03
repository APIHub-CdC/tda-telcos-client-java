package io.TelcosDataAgregation.client.api;

import io.TelcosDataAgregation.client.ApiClient;
import io.TelcosDataAgregation.client.ApiException;
import io.TelcosDataAgregation.client.ApiResponse;
import io.TelcosDataAgregation.client.interceptor.SignerInterceptor;
import io.TelcosDataAgregation.client.model.AckTDARequest;
import io.TelcosDataAgregation.client.model.AckTelcosDataAggregation;
import io.TelcosDataAgregation.client.model.AckSuccessTDAConsumption;
import io.TelcosDataAgregation.client.model.TelcosDataAggregation;
import io.TelcosDataAgregation.client.model.TelcosDataAggregationConfiguration;
import io.TelcosDataAgregation.client.model.TelcosDataAggregationConfigurationResponse;
import io.TelcosDataAgregation.client.model.TelcosDataAggregationMetadata;
import io.TelcosDataAgregation.client.model.ConfigurationRequest;
import io.TelcosDataAgregation.client.model.ConfigurationRequest2fA;
import io.TelcosDataAgregation.client.model.ConfigurationRequestDescriptions;
import io.TelcosDataAgregation.client.model.ConfigurationRequestPrincipal;
import io.TelcosDataAgregation.client.model.ConfigurationRequestTermsAndConditions;
import io.TelcosDataAgregation.client.model.Icons;

import org.threeten.bp.OffsetDateTime;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import io.TelcosDataAgregation.helper.ECDHAlgCipher;
import okhttp3.OkHttpClient;

public class TdaApiForTelcosDataAggregationApiTest {
    private final TdaApiForTelcosDataAggregationApi api = new TdaApiForTelcosDataAggregationApi();
    private Logger logger = LoggerFactory.getLogger(TdaApiForTelcosDataAggregationApiTest.class.getName());
    private ApiClient apiClient = null;


    private String cdcCertFile = "your_path_for_certificate_of_cdc/cdc_cert.pem";
    private String keystoreFile = "your_path_for_your_keystore/keystore.jks";
    private String keystorePassword = "your_super_secure_keystore_password";
    private String keyPassword = "your_super_secure_password";
    private String keyAlias = "your_key_alias";
    private UUID subscriptionId = UUID.fromString("your_subscriptionId");
    

    private String username = "your_username_otrorgante";
    private String password = "your_password_otorgante";

    private String xApiKey = "X_Api_Key";

    private String url = "the_url";


    private SignerInterceptor interceptor;
    private String IV="x-iv";

    private UUID inquiryId = null;
    
    @Before
    public void setUp() {

        interceptor = new SignerInterceptor(this.keystoreFile, this.cdcCertFile, this.keystorePassword, this.keyAlias,
                this.keyPassword);
        this.apiClient = api.getApiClient();
        this.apiClient.setBasePath(url);
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(interceptor).build();
        apiClient.setHttpClient(okHttpClient);
    }

    @Test
    public void getTelcosDataAggregationsTest() throws ApiException {

        String page = "1";
        String perPage = "2";
        OffsetDateTime startAt = null;
        OffsetDateTime endAt = null;
        String inquiryStatus = null;
        String successCheck = null;
        TelcosDataAggregationMetadata response = api.getTelcosDataAggregations(this.xApiKey, this.username, this.password, page,
                perPage, startAt, endAt, inquiryStatus, successCheck);
        
        Assert.assertNotNull(response);
        logger.info(response.toString());  
    }

    @Test
    public void getConfTelcosDataAggregationTest() throws ApiException {
    
        TelcosDataAggregationConfigurationResponse response = api.getConfTelcosDataAggregation(this.xApiKey, this.username, this.password,
                this.subscriptionId);
        Assert.assertNotNull(response);
        logger.info(response.toString());
    }

    @Test
    public void getInquiryTest() throws ApiException {
    
        ApiResponse<AckSuccessTDAConsumption>   rawResponse = api.getInquiryWithHttpInfo(this.xApiKey, this.username, this.password, this.inquiryId.toString());
        AckSuccessTDAConsumption response = rawResponse.getData();
        Assert.assertNotNull(response);
        logger.info(response.toString());

        
        Map<String, List<String>> headers = rawResponse.getHeaders();
        logger.debug(rawResponse.toString());
          
        String ct = (String) response.getTelcosDataAggregation().getPayload(); 
        String iv = headers.get(this.IV).get(0); 
     
        try { 
            ECDHAlgCipher cipher = new ECDHAlgCipher(this.cdcCertFile, this.keystoreFile, keystorePassword, keyPassword, keyAlias); 
            String payloadStr =  cipher.decryptString(ct, iv); 
            logger.info(payloadStr); 
        } catch (IOException e) 
        { 
            logger.error("Could not decrypt the payload field"); 
        }
         
    }

    @Test
    public void postTelcosDataAggregationTest() throws ApiException {

        TelcosDataAggregation request = new TelcosDataAggregation();
        request.setRequestId(UUID.randomUUID());
        request.setSubscriptionId(subscriptionId);
        request.setCurp(null);

        AckTDARequest response = api.postTelcosDataAggregation(this.xApiKey, this.username, this.password, request);

        logger.debug(response.toString());
        Assert.assertNotNull(response);
        inquiryId = response.getInquiryId();
        logger.info(inquiryId.toString());

    }

    @Test
    public void postConfTelcosDataAggregationTest() throws ApiException {

        TelcosDataAggregationConfiguration request = new TelcosDataAggregationConfiguration();
        ConfigurationRequestPrincipal principal = new ConfigurationRequestPrincipal();
        ConfigurationRequestDescriptions descriptions = new ConfigurationRequestDescriptions();
        ConfigurationRequestTermsAndConditions terms = new ConfigurationRequestTermsAndConditions();
        ConfigurationRequest configuration = new ConfigurationRequest();

        ConfigurationRequest2fA twoFa = new ConfigurationRequest2fA();


        principal.setUserName(null);
        principal.setAuthorizationStatement(null);
        principal.setUserLogo(null);
        principal.setPrimaryColor(null);
        principal.setSecondaryColor(null);

        descriptions.setFirstHighlightedText(null);
        descriptions.setFirstHighlightedIcon(Icons.FAR_FA_STAR);
        descriptions.setSecondHighlightedText(null);
        descriptions.setSecondHighlightedIcon(Icons.FAS_FA_CREDIT_CARD);
        descriptions.setThirdHighlightedText(null);
        descriptions.setThirdHighlightedIcon(Icons.FAS_FA_KEY);
        descriptions.setFourthHighlightedIcon(Icons.FAR_FA_STAR);
        descriptions.setFourthHighlightedText(null);

        terms.setTermsAndConditionsTitle(null);
        terms.setTermsAndConditionsLabel(null);
        terms.setTermsAndConditions(null);

        configuration.setPrincipal(principal);
        configuration.setDescriptions(descriptions);
        configuration.setTermsAndConditions(terms);
        
        twoFa.setTwoFaHighlightedIcon(Icons.FAR_FA_STAR);
        twoFa.setTwoFaHighlightedText(null);
        configuration.setTwoFa(twoFa);

		request.setSubscriptionId(subscriptionId);
		request.setConfiguration(configuration);

        AckTelcosDataAggregation response = api.postConfTelcosDataAggregation(this.xApiKey,  this.username, this.password, request);

        Assert.assertNotNull(response);
        logger.info(response.toString());
    }
    







}
