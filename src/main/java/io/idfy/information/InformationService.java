package io.idfy.information;

import com.squareup.okhttp.HttpUrl;
import io.idfy.IdfyBaseService;
import io.idfy.OAuthScope;
import io.idfy.Urls;
import io.idfy.information.models.*;
import io.idfy.internal.utils.Encoder;
import io.idfy.models.IdfyException;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import java.util.List;

public class InformationService extends IdfyBaseService {
    public InformationService() {
        super();
    }

    public InformationService(String clientId, String clientSecret, List<OAuthScope> oAuthScopes) {
        super(clientId, clientSecret, oAuthScopes);
    }

    // AmlService

    /**
     * B2B Identify and Screening Request
     * Person screening with data enhancement enabled for nationalities where data enhancement is provided. For other nationalities the data enhancement will be skipped  **Required fields**: Name with either birthDate or ssn.
     * @param name Complete name of person.  (Order of first and last names is not significant.) (required)
     * @param regNo Business registration number (optional)
     * @param dunsNo D-U-N-S number (optional)
     * @param nationality Nationality of person (two letters ISO 3166 ) (optional)
     * @param language Language to use in response where applicable, optional. (two letters ISO 3166 ) (optional)
     * @param includeReport Create a PDF report with the data timestamp and sealed as future proof for the process. (optional)
     * @param mode What mode to use. When using identify and screening data enhancement is enabled for nationalities where data enhancement is provided. (optional)
     * @return CompanyAmlResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CompanyAmlResponse b2BIdentifyAndScreeningRequest(String name, String regNo, String dunsNo, String nationality, String language, Boolean includeReport, String mode) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/aml/b2b";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (name != null) {
            url.addQueryParameter("name", name.toString());}
        if (regNo != null) {
            url.addQueryParameter("regNo", regNo.toString());}
        if (dunsNo != null) {
            url.addQueryParameter("dunsNo", dunsNo.toString());}
        if (nationality != null) {
            url.addQueryParameter("nationality", nationality.toString());}
        if (language != null) {
            url.addQueryParameter("language", language.toString());}
        if (includeReport != null) {
            url.addQueryParameter("includeReport", includeReport.toString());}
        if (mode != null) {
            url.addQueryParameter("mode", mode.toString());}

        return get(url.build(), CompanyAmlResponse.class);
    }

    /**
     * B2B Identify and Screening Request (asynchronously)
     * Person screening with data enhancement enabled for nationalities where data enhancement is provided. For other nationalities the data enhancement will be skipped  **Required fields**: Name with either birthDate or ssn.
     * @param name Complete name of person.  (Order of first and last names is not significant.) (required)
     * @param regNo Business registration number (optional)
     * @param dunsNo D-U-N-S number (optional)
     * @param nationality Nationality of person (two letters ISO 3166 ) (optional)
     * @param language Language to use in response where applicable, optional. (two letters ISO 3166 ) (optional)
     * @param includeReport Create a PDF report with the data timestamp and sealed as future proof for the process. (optional)
     * @param mode What mode to use. When using identify and screening data enhancement is enabled for nationalities where data enhancement is provided. (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<CompanyAmlResponse> b2BIdentifyAndScreeningRequestAsync(String name, String regNo, String dunsNo, String nationality, String language, Boolean includeReport, String mode) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/aml/b2b";

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (name != null) {
            url.addQueryParameter("name", name.toString());}
        if (regNo != null) {
            url.addQueryParameter("regNo", regNo.toString());}
        if (dunsNo != null) {
            url.addQueryParameter("dunsNo", dunsNo.toString());}
        if (nationality != null) {
            url.addQueryParameter("nationality", nationality.toString());}
        if (language != null) {
            url.addQueryParameter("language", language.toString());}
        if (includeReport != null) {
            url.addQueryParameter("includeReport", includeReport.toString());}
        if (mode != null) {
            url.addQueryParameter("mode", mode.toString());}

        return getAsync(url.build(), CompanyAmlResponse.class);
    }


    /**
     * B2C Identify and Screening Request
     * Person screening with data enhancement enabled for nationalities where data enhancement is provided. For other nationalities the data enhancement will be skipped  **Required fields**: Name with either birthDate or ssn.
     * @param name Complete name of person.  (Order of first and last names is not significant.) (required)
     * @param ssn National Identification number. SSN or Birthdate are REQUIRED (Se NationalId format) (optional)
     * @param birthDate Date of birth. SSN or Birthdate are REQUIRED (format: yyyyMMdd) (optional)
     * @param nationality Nationality of person (two letters ISO 3166 ) (optional)
     * @param language Language to use in response where applicable, optional. (two letters ISO 3166 ) (optional)
     * @param includeReport Create a PDF report with the data timestamp and sealed as future proof for the process. (optional)
     * @param mode What mode to use. When using identify and screening data enhancement is enabled for nationalities where data enhancement is provided. (optional)
     * @return PersonAmlResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PersonAmlResponse b2CIdentifyAndScreeningRequest(String name, String ssn, String birthDate, String nationality, String language, Boolean includeReport, String mode) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/aml/b2c";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (name != null) {
            url.addQueryParameter("name", name.toString());}
        if (ssn != null) {
            url.addQueryParameter("ssn", ssn.toString());}
        if (birthDate != null) {
            url.addQueryParameter("birthDate", birthDate.toString());}
        if (nationality != null) {
            url.addQueryParameter("nationality", nationality.toString());}
        if (language != null) {
            url.addQueryParameter("language", language.toString());}
        if (includeReport != null) {
            url.addQueryParameter("includeReport", includeReport.toString());}
        if (mode != null) {
            url.addQueryParameter("mode", mode.toString());}

        return get(url.build(), PersonAmlResponse.class);
    }

    /**
     * B2C Identify and Screening Request (asynchronously)
     * Person screening with data enhancement enabled for nationalities where data enhancement is provided. For other nationalities the data enhancement will be skipped  **Required fields**: Name with either birthDate or ssn.
     * @param name Complete name of person.  (Order of first and last names is not significant.) (required)
     * @param ssn National Identification number. SSN or Birthdate are REQUIRED (Se NationalId format) (optional)
     * @param birthDate Date of birth. SSN or Birthdate are REQUIRED (format: yyyyMMdd) (optional)
     * @param nationality Nationality of person (two letters ISO 3166 ) (optional)
     * @param language Language to use in response where applicable, optional. (two letters ISO 3166 ) (optional)
     * @param includeReport Create a PDF report with the data timestamp and sealed as future proof for the process. (optional)
     * @param mode What mode to use. When using identify and screening data enhancement is enabled for nationalities where data enhancement is provided. (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<PersonAmlResponse> b2CIdentifyAndScreeningRequestAsync(String name, String ssn, String birthDate, String nationality, String language, Boolean includeReport, String mode) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/aml/b2c";

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (name != null) {
            url.addQueryParameter("name", name.toString());}
        if (ssn != null) {
            url.addQueryParameter("ssn", ssn.toString());}
        if (birthDate != null) {
            url.addQueryParameter("birthDate", birthDate.toString());}
        if (nationality != null) {
            url.addQueryParameter("nationality", nationality.toString());}
        if (language != null) {
            url.addQueryParameter("language", language.toString());}
        if (includeReport != null) {
            url.addQueryParameter("includeReport", includeReport.toString());}
        if (mode != null) {
            url.addQueryParameter("mode", mode.toString());}

        return getAsync(url.build(), PersonAmlResponse.class);
    }

    // BusinessRegistryService

    /**
     * List registration authorities
     * Retrieves a list of business registration authorities globally
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void listRegistrationAuthorities() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/businessregistry";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        get(url.build());
    }

    /**
     * List registration authorities (asynchronously)
     * Retrieves a list of business registration authorities globally
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> listRegistrationAuthoritiesAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/businessregistry";

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build());
    }


    /**
     * Retrieve registration authority
     * Retrieves detailed information about a specific registration authority
     * @param authorityCode  (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void retrieveRegistrationAuthority(String authorityCode) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/businessregistry/{authorityCode}"
                .replaceAll("\\{" + "authorityCode" + "\\}", Encoder.escapeString(authorityCode.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        get(url.build());
    }

    /**
     * Retrieve registration authority (asynchronously)
     * Retrieves detailed information about a specific registration authority
     * @param authorityCode  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> retrieveRegistrationAuthorityAsync(String authorityCode) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/businessregistry/{authorityCode}"
                .replaceAll("\\{" + "authorityCode" + "\\}", Encoder.escapeString(authorityCode.toString()));

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build());
    }

    // BusinessService

    /**
     * Perform credit check
     * Run a credit check on a specified company, this check will not produce any duplicate letters.               A pdf report will be awailable to download the first 48 hours.
     * @param orgnumber  (required)
     * @param userId Override bisnode user Id (optional)
     * @param password Override bisnode password (optional)
     * @param countryCode Default &#x3D; \&quot;NO\&quot; (optional)
     * @param includeReport Specify if you want a pdf report (defaults to false) (optional)
     * @return CreditCheckCompanyResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreditCheckCompanyResponse performCreditCheck(Integer orgnumber, String userId, String password, String countryCode, Boolean includeReport) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/business/creditcheck";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (orgnumber != null) {
            url.addQueryParameter("orgnumber", orgnumber.toString());}
        if (userId != null) {
            url.addQueryParameter("userId", userId.toString());}
        if (password != null) {
            url.addQueryParameter("password", password.toString());}
        if (countryCode != null) {
            url.addQueryParameter("countryCode", countryCode.toString());}
        if (includeReport != null) {
            url.addQueryParameter("includeReport", includeReport.toString());}

        return get(url.build(), CreditCheckCompanyResponse.class);
    }

    /**
     * Perform credit check (asynchronously)
     * Run a credit check on a specified company, this check will not produce any duplicate letters.               A pdf report will be awailable to download the first 48 hours.
     * @param orgnumber  (required)
     * @param userId Override bisnode user Id (optional)
     * @param password Override bisnode password (optional)
     * @param countryCode Default &#x3D; \&quot;NO\&quot; (optional)
     * @param includeReport Specify if you want a pdf report (defaults to false) (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<CreditCheckCompanyResponse> performCreditCheckAsync(Integer orgnumber, String userId, String password, String countryCode, Boolean includeReport) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/business/creditcheck";

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (orgnumber != null) {
            url.addQueryParameter("orgnumber", orgnumber.toString());}
        if (userId != null) {
            url.addQueryParameter("userId", userId.toString());}
        if (password != null) {
            url.addQueryParameter("password", password.toString());}
        if (countryCode != null) {
            url.addQueryParameter("countryCode", countryCode.toString());}
        if (includeReport != null) {
            url.addQueryParameter("includeReport", includeReport.toString());}

        return getAsync(url.build(), CreditCheckCompanyResponse.class);
    }


    /**
     * Retrieve information from Difi
     * Query company information from difi datahotell (official data from bronnoysund), supports query by name and/or orgnumber
     * @param orgnumber  (optional)
     * @param companyname  (optional)
     * @return DifiResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DifiResponse retrieveInformationFromDifi(String orgnumber, String companyname) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/business/info/difi";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (orgnumber != null) {
            url.addQueryParameter("orgnumber", orgnumber.toString());}
        if (companyname != null) {
            url.addQueryParameter("companyname", companyname.toString());}

        return get(url.build(), DifiResponse.class);
    }

    /**
     * Retrieve information from Difi (asynchronously)
     * Query company information from difi datahotell (official data from bronnoysund), supports query by name and/or orgnumber
     * @param orgnumber  (optional)
     * @param companyname  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<DifiResponse> retrieveInformationFromDifiAsync(String orgnumber, String companyname) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/business/info/difi";

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (orgnumber != null) {
            url.addQueryParameter("orgnumber", orgnumber.toString());}
        if (companyname != null) {
            url.addQueryParameter("companyname", companyname.toString());}

        return getAsync(url.build(), DifiResponse.class);
    }


    /**
     * Retrieve information from Matchit
     * Query company information from Matchit, Matchit uses existing information to build up their database. Supports query by name and/or orgnumber
     * @param companyname query param (optional)
     * @param orgnumber query param (optional)
     * @return CompanyInformationResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CompanyInformationResponse retrieveInformationFromMatchit(String companyname, String orgnumber) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/business/info/matchit";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (companyname != null) {
            url.addQueryParameter("companyname", companyname.toString());}
        if (orgnumber != null) {
            url.addQueryParameter("orgnumber", orgnumber.toString());}

        return get(url.build(), CompanyInformationResponse.class);
    }

    /**
     * Retrieve information from Matchit (asynchronously)
     * Query company information from Matchit, Matchit uses existing information to build up their database. Supports query by name and/or orgnumber
     * @param companyname query param (optional)
     * @param orgnumber query param (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<CompanyInformationResponse> retrieveInformationFromMatchitAsync(String companyname, String orgnumber) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/business/info/matchit";

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (companyname != null) {
            url.addQueryParameter("companyname", companyname.toString());}
        if (orgnumber != null) {
            url.addQueryParameter("orgnumber", orgnumber.toString());}

        return getAsync(url.build(), CompanyInformationResponse.class);
    }

    // GeoDataService

    /**
     * List countries
     * Lists all countries in the world with English name and ISO 3166-1 country code
     * @param lang Language for result. Defaults to English (optional)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void listCountries(String lang) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/geodata/countries";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (lang != null) {
            url.addQueryParameter("lang", lang.toString());}

        get(url.build());
    }

    /**
     * List countries (asynchronously)
     * Lists all countries in the world with English name and ISO 3166-1 country code
     * @param lang Language for result. Defaults to English (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> listCountriesAsync(String lang) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/geodata/countries";

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (lang != null) {
            url.addQueryParameter("lang", lang.toString());}

        return getAsync(url.build());
    }


    /**
     * List country subdivisions
     * Retrieves a list over top level administrative subdivisions for a country with name and ISO 3166-2 region code
     * @param countryCode ISO 3166-1 country code to look up (required)
     * @param lang Language for result. Defaults to English (optional)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void listCountrySubdivisions(String countryCode, String lang) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/geodata/countries/{countryCode}/subdivisions"
                .replaceAll("\\{" + "countryCode" + "\\}", Encoder.escapeString(countryCode.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (lang != null) {
            url.addQueryParameter("lang", lang.toString());}

        get(url.build());
    }

    /**
     * List country subdivisions (asynchronously)
     * Retrieves a list over top level administrative subdivisions for a country with name and ISO 3166-2 region code
     * @param countryCode ISO 3166-1 country code to look up (required)
     * @param lang Language for result. Defaults to English (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> listCountrySubdivisionsAsync(String countryCode, String lang) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/geodata/countries/{countryCode}/subdivisions"
                .replaceAll("\\{" + "countryCode" + "\\}", Encoder.escapeString(countryCode.toString()));

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (lang != null) {
            url.addQueryParameter("lang", lang.toString());}

        return getAsync(url.build());
    }


    /**
     * Retrieve country info
     * Retrieves basic geographical information about a country
     * @param countryCode ISO 3166-1 country code to look up (required)
     * @param lang Language for result. Defaults to English (optional)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void retrieveCountryInfo(String countryCode, String lang) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/geodata/countries/{countryCode}"
                .replaceAll("\\{" + "countryCode" + "\\}", Encoder.escapeString(countryCode.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (lang != null) {
            url.addQueryParameter("lang", lang.toString());}

        get(url.build());
    }

    /**
     * Retrieve country info (asynchronously)
     * Retrieves basic geographical information about a country
     * @param countryCode ISO 3166-1 country code to look up (required)
     * @param lang Language for result. Defaults to English (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> retrieveCountryInfoAsync(String countryCode, String lang) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/geodata/countries/{countryCode}"
                .replaceAll("\\{" + "countryCode" + "\\}", Encoder.escapeString(countryCode.toString()));

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (lang != null) {
            url.addQueryParameter("lang", lang.toString());}

        return getAsync(url.build());
    }

    // LeiService

    /**
     * Query LEI records
     * QueryLeiRecords for LEI-registered entities with filters
     * @param countryCode ISO 3166-1 alpha-2 country code for country entity is registered in (optional)
     * @param lei LEI of entity (optional)
     * @param legalNameContains Words included in entity&#39;s legal name (optional)
     * @param legalNameEquals Exact phrase included in entity&#39;s legal name (optional)
     * @param registrationAuthorityEntityId Entity Id provided by local business registry authority. For Norway this is the &#39;organisasjonsnummer&#39; or tax identification number of the business (optional)
     * @param pageSize Size of result set per request. Defaults to 25 (optional)
     * @param page Current page number for result set. Defaults to 0 (optional)
     * @return SearchResult
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SearchResult queryLEIRecords(String countryCode, String lei, String legalNameContains, String legalNameEquals, String registrationAuthorityEntityId, Integer pageSize, Integer page) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/lei/search";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (countryCode != null) {
            url.addQueryParameter("countryCode", countryCode.toString());}
        if (lei != null) {
            url.addQueryParameter("lei", lei.toString());}
        if (legalNameContains != null) {
            url.addQueryParameter("legalNameContains", legalNameContains.toString());}
        if (legalNameEquals != null) {
            url.addQueryParameter("legalNameEquals", legalNameEquals.toString());}
        if (registrationAuthorityEntityId != null) {
            url.addQueryParameter("registrationAuthorityEntityId", registrationAuthorityEntityId.toString());}
        if (pageSize != null) {
            url.addQueryParameter("pageSize", pageSize.toString());}
        if (page != null) {
            url.addQueryParameter("page", page.toString());}

        return get(url.build(), SearchResult.class);
    }

    /**
     * Query LEI records (asynchronously)
     * QueryLeiRecords for LEI-registered entities with filters
     * @param countryCode ISO 3166-1 alpha-2 country code for country entity is registered in (optional)
     * @param lei LEI of entity (optional)
     * @param legalNameContains Words included in entity&#39;s legal name (optional)
     * @param legalNameEquals Exact phrase included in entity&#39;s legal name (optional)
     * @param registrationAuthorityEntityId Entity Id provided by local business registry authority. For Norway this is the &#39;organisasjonsnummer&#39; or tax identification number of the business (optional)
     * @param pageSize Size of result set per request. Defaults to 25 (optional)
     * @param page Current page number for result set. Defaults to 0 (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<SearchResult> queryLEIRecordsAsync(String countryCode, String lei, String legalNameContains, String legalNameEquals, String registrationAuthorityEntityId, Integer pageSize, Integer page) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/lei/search";

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (countryCode != null) {
            url.addQueryParameter("countryCode", countryCode.toString());}
        if (lei != null) {
            url.addQueryParameter("lei", lei.toString());}
        if (legalNameContains != null) {
            url.addQueryParameter("legalNameContains", legalNameContains.toString());}
        if (legalNameEquals != null) {
            url.addQueryParameter("legalNameEquals", legalNameEquals.toString());}
        if (registrationAuthorityEntityId != null) {
            url.addQueryParameter("registrationAuthorityEntityId", registrationAuthorityEntityId.toString());}
        if (pageSize != null) {
            url.addQueryParameter("pageSize", pageSize.toString());}
        if (page != null) {
            url.addQueryParameter("page", page.toString());}

        return getAsync(url.build(), SearchResult.class);
    }


    /**
     * Retrieve LEI record
     * Retrieve the entity record for a given LEI
     * @param lei LEI to retrieve (required)
     * @return LeiRecord
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LeiRecord retrieveLEIRecord(String lei) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/lei/{lei}/lookup"
                .replaceAll("\\{" + "lei" + "\\}", Encoder.escapeString(lei.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), LeiRecord.class);
    }

    /**
     * Retrieve LEI record (asynchronously)
     * Retrieve the entity record for a given LEI
     * @param lei LEI to retrieve (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<LeiRecord> retrieveLEIRecordAsync(String lei) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/lei/{lei}/lookup"
                .replaceAll("\\{" + "lei" + "\\}", Encoder.escapeString(lei.toString()));

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), LeiRecord.class);
    }

    // MobileInfoService

    /**
     * Mobile info
     * With this enpoints a user can fill out a form with one click. Per now the user have to be a telenor customer to retrieve information from this endpoint.             The url received here can be used in an iframe or a popupwindow, we will then deliever the user information with webmessageing.             <br /><br />             Flow:<br />             1) Get url from this endpoint<br />             2) Open a popup window or an iframe with this url as src<br />             3) User authenticates and gives you permission to retrieve user information<br />             4) User is redirected to the callback endpoint, we connect to the serviceprovider API and retrieves the information about the user<br />             5) We use webmessaging so you can collect the information
     * @param serviceProvider The name of the mobile service provider (telenor) (required)
     * @param responseMode  (required)
     * @return String
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String mobileInfo(String serviceProvider, String responseMode) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/mobileinfo/authorize";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (serviceProvider != null) {
            url.addQueryParameter("serviceProvider", serviceProvider.toString());}
        if (responseMode != null) {
            url.addQueryParameter("responseMode", responseMode.toString());}

        return post(url.build(), String.class);
    }

    /**
     * Mobile info (asynchronously)
     * With this enpoints a user can fill out a form with one click. Per now the user have to be a telenor customer to retrieve information from this endpoint.             The url received here can be used in an iframe or a popupwindow, we will then deliever the user information with webmessageing.             <br /><br />             Flow:<br />             1) Get url from this endpoint<br />             2) Open a popup window or an iframe with this url as src<br />             3) User authenticates and gives you permission to retrieve user information<br />             4) User is redirected to the callback endpoint, we connect to the serviceprovider API and retrieves the information about the user<br />             5) We use webmessaging so you can collect the information
     * @param serviceProvider The name of the mobile service provider (telenor) (required)
     * @param responseMode  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<String> mobileInfoAsync(String serviceProvider, String responseMode) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/mobileinfo/authorize";

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (serviceProvider != null) {
            url.addQueryParameter("serviceProvider", serviceProvider.toString());}
        if (responseMode != null) {
            url.addQueryParameter("responseMode", responseMode.toString());}

        return postAsync(url.build(), String.class);
    }

    // PersonService

    /**
     * List person info through MatchIt by query
     * Returns (unofficial) person information, this method returns the 5 best matches from the query parameters served (freetext). The information is delievered by Matchit.
     * @param queryString  (required)
     * @return PersonPersonInformation
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PersonPersonInformation[] listPersonInfoThroughMatchitByQuery(String queryString) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/person/info/matchit/query";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (queryString != null) {
            url.addQueryParameter("queryString", queryString.toString());}

        return get(url.build(), PersonPersonInformation[].class);
    }

    /**
     * List person info through MatchIt by query (asynchronously)
     * Returns (unofficial) person information, this method returns the 5 best matches from the query parameters served (freetext). The information is delievered by Matchit.
     * @param queryString  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<PersonPersonInformation[]> listPersonInfoThroughMatchitByQueryAsync(String queryString) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/person/info/matchit/query";

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (queryString != null) {
            url.addQueryParameter("queryString", queryString.toString());}

        return getAsync(url.build(), PersonPersonInformation[].class);
    }


    /**
     * Retrieve person info through Infotorget
     * Run a query using social security number as parameter. The use of this requires username and password for Infortorget with the required permissions.  Valid query parameter combinations:   socialSecurityNumber,   socialSecurityNumber + firstName + lastName,   dateOfBirth + firstName + lastName,   firstName + lastName + address + postalCode
     * @param username Infotorget username (required)
     * @param password Infotorget password (required)
     * @param reason Reason for request (required)
     * @param system Your system name (Cannot contain any special characters or numbers) (required)
     * @param socialSecurityNumber  (optional)
     * @param firstname  (optional)
     * @param lastname  (optional)
     * @param dateofbirth  (optional)
     * @param address  (optional)
     * @param postalcode  (optional)
     * @return PersonOfficialPersonRegistryResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PersonOfficialPersonRegistryResponse retrievePersonInfoThroughInfotorget(String username, String password, String reason, String system, String socialSecurityNumber, String firstname, String lastname, Integer dateofbirth, String address, String postalcode) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/person/info/infotorget";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (username != null) {
            url.addQueryParameter("username", username.toString());}
        if (password != null) {
            url.addQueryParameter("password", password.toString());}
        if (reason != null) {
            url.addQueryParameter("reason", reason.toString());}
        if (system != null) {
            url.addQueryParameter("system", system.toString());}
        if (socialSecurityNumber != null) {
            url.addQueryParameter("socialSecurityNumber", socialSecurityNumber.toString());}
        if (firstname != null) {
            url.addQueryParameter("firstname", firstname.toString());}
        if (lastname != null) {
            url.addQueryParameter("lastname", lastname.toString());}
        if (dateofbirth != null) {
            url.addQueryParameter("dateofbirth", dateofbirth.toString());}
        if (address != null) {
            url.addQueryParameter("address", address.toString());}
        if (postalcode != null) {
            url.addQueryParameter("postalcode", postalcode.toString());}

        return get(url.build(), PersonOfficialPersonRegistryResponse.class);
    }

    /**
     * Retrieve person info through Infotorget (asynchronously)
     * Run a query using social security number as parameter. The use of this requires username and password for Infortorget with the required permissions.  Valid query parameter combinations:   socialSecurityNumber,   socialSecurityNumber + firstName + lastName,   dateOfBirth + firstName + lastName,   firstName + lastName + address + postalCode
     * @param username Infotorget username (required)
     * @param password Infotorget password (required)
     * @param reason Reason for request (required)
     * @param system Your system name (Cannot contain any special characters or numbers) (required)
     * @param socialSecurityNumber  (optional)
     * @param firstname  (optional)
     * @param lastname  (optional)
     * @param dateofbirth  (optional)
     * @param address  (optional)
     * @param postalcode  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<PersonOfficialPersonRegistryResponse> retrievePersonInfoThroughInfotorgetAsync(String username, String password, String reason, String system, String socialSecurityNumber, String firstname, String lastname, Integer dateofbirth, String address, String postalcode) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/person/info/infotorget";

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (username != null) {
            url.addQueryParameter("username", username.toString());}
        if (password != null) {
            url.addQueryParameter("password", password.toString());}
        if (reason != null) {
            url.addQueryParameter("reason", reason.toString());}
        if (system != null) {
            url.addQueryParameter("system", system.toString());}
        if (socialSecurityNumber != null) {
            url.addQueryParameter("socialSecurityNumber", socialSecurityNumber.toString());}
        if (firstname != null) {
            url.addQueryParameter("firstname", firstname.toString());}
        if (lastname != null) {
            url.addQueryParameter("lastname", lastname.toString());}
        if (dateofbirth != null) {
            url.addQueryParameter("dateofbirth", dateofbirth.toString());}
        if (address != null) {
            url.addQueryParameter("address", address.toString());}
        if (postalcode != null) {
            url.addQueryParameter("postalcode", postalcode.toString());}

        return getAsync(url.build(), PersonOfficialPersonRegistryResponse.class);
    }


    /**
     * Retrieve person info through MatchIt
     * Returns (unofficial) person information, this method returns the best match from the query parameters served. The information is delievered by Matchit.   Valid query parameter combinations: name + dateOfBirth, name + socialSec, name + address, phonenumber
     * @param name  (optional)
     * @param socialSec  (optional)
     * @param dateOfBirth  (optional)
     * @param phonenumber  (optional)
     * @param address  (optional)
     * @return PersonPersonInformation
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PersonPersonInformation retrievePersonInfoThroughMatchit(String name, String socialSec, String dateOfBirth, String phonenumber, String address) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/person/info/matchit";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (name != null) {
            url.addQueryParameter("name", name.toString());}
        if (socialSec != null) {
            url.addQueryParameter("socialSec", socialSec.toString());}
        if (dateOfBirth != null) {
            url.addQueryParameter("dateOfBirth", dateOfBirth.toString());}
        if (phonenumber != null) {
            url.addQueryParameter("phonenumber", phonenumber.toString());}
        if (address != null) {
            url.addQueryParameter("address", address.toString());}

        return get(url.build(), PersonPersonInformation.class);
    }

    /**
     * Retrieve person info through MatchIt (asynchronously)
     * Returns (unofficial) person information, this method returns the best match from the query parameters served. The information is delievered by Matchit.   Valid query parameter combinations: name + dateOfBirth, name + socialSec, name + address, phonenumber
     * @param name  (optional)
     * @param socialSec  (optional)
     * @param dateOfBirth  (optional)
     * @param phonenumber  (optional)
     * @param address  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<PersonPersonInformation> retrievePersonInfoThroughMatchitAsync(String name, String socialSec, String dateOfBirth, String phonenumber, String address) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/person/info/matchit";

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (name != null) {
            url.addQueryParameter("name", name.toString());}
        if (socialSec != null) {
            url.addQueryParameter("socialSec", socialSec.toString());}
        if (dateOfBirth != null) {
            url.addQueryParameter("dateOfBirth", dateOfBirth.toString());}
        if (phonenumber != null) {
            url.addQueryParameter("phonenumber", phonenumber.toString());}
        if (address != null) {
            url.addQueryParameter("address", address.toString());}

        return getAsync(url.build(), PersonPersonInformation.class);
    }


    /**
     * Run credit check
     * Credit check of a single person. The use of this will produce a duplicate letter to the person that is checked.               A pdf report will be awailable to download the first 48 hours.
     * @param socialSecurityNumber  (required)
     * @param userId Override bisnode user Id (optional)
     * @param password Override bisnode password (optional)
     * @param phonenumber Specify this to use electronic duplicate letters (optional)
     * @param email Specify this to use electronic duplicate letters (optional)
     * @param includeReport Specify if you want a pdf report (defaults to false) (optional)
     * @return PersonCreditCheckPersonResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PersonCreditCheckPersonResponse runCreditCheck(Long socialSecurityNumber, String userId, String password, Integer phonenumber, String email, Boolean includeReport) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/person/creditcheck";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (socialSecurityNumber != null) {
            url.addQueryParameter("socialSecurityNumber", socialSecurityNumber.toString());}
        if (userId != null) {
            url.addQueryParameter("userId", userId.toString());}
        if (password != null) {
            url.addQueryParameter("password", password.toString());}
        if (phonenumber != null) {
            url.addQueryParameter("phonenumber", phonenumber.toString());}
        if (email != null) {
            url.addQueryParameter("email", email.toString());}
        if (includeReport != null) {
            url.addQueryParameter("includeReport", includeReport.toString());}

        return get(url.build(), PersonCreditCheckPersonResponse.class);
    }

    /**
     * Run credit check (asynchronously)
     * Credit check of a single person. The use of this will produce a duplicate letter to the person that is checked.               A pdf report will be awailable to download the first 48 hours.
     * @param socialSecurityNumber  (required)
     * @param userId Override bisnode user Id (optional)
     * @param password Override bisnode password (optional)
     * @param phonenumber Specify this to use electronic duplicate letters (optional)
     * @param email Specify this to use electronic duplicate letters (optional)
     * @param includeReport Specify if you want a pdf report (defaults to false) (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<PersonCreditCheckPersonResponse> runCreditCheckAsync(Long socialSecurityNumber, String userId, String password, Integer phonenumber, String email, Boolean includeReport) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/person/creditcheck";

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (socialSecurityNumber != null) {
            url.addQueryParameter("socialSecurityNumber", socialSecurityNumber.toString());}
        if (userId != null) {
            url.addQueryParameter("userId", userId.toString());}
        if (password != null) {
            url.addQueryParameter("password", password.toString());}
        if (phonenumber != null) {
            url.addQueryParameter("phonenumber", phonenumber.toString());}
        if (email != null) {
            url.addQueryParameter("email", email.toString());}
        if (includeReport != null) {
            url.addQueryParameter("includeReport", includeReport.toString());}

        return getAsync(url.build(), PersonCreditCheckPersonResponse.class);
    }

    // ReportService

    /**
     * Retrive report
     * The pdf report will be awailable to download the first 48 hours.
     * @param reportId The reportId returned from the Get (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void retriveReport(String reportId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/report/{reportId}"
                .replaceAll("\\{" + "reportId" + "\\}", Encoder.escapeString(reportId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        get(url.build());
    }

    /**
     * Retrive report (asynchronously)
     * The pdf report will be awailable to download the first 48 hours.
     * @param reportId The reportId returned from the Get (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> retriveReportAsync(String reportId) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/report/{reportId}"
                .replaceAll("\\{" + "reportId" + "\\}", Encoder.escapeString(reportId.toString()));

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build());
    }

    // SignatureRolesCheckService

    /**
     * Check signatures / prokura
     * Check if received signatures and/or prokura are valid. This call allows you to do this check for multiple organizations simulataneously.  A valid date of birth in this format [ddMMyy] is required. The persons last name plus minimum one other part of the signees name (first, (middle) and last name has to be separated by whitespace, comma or ;).   A report that explains the validity of the signatures can be included.
     * @param data An array including all the organizations you want to check (required)
     * @param includereport Returns a pdf report explaining the validity of the checked signatures, default value is true (optional)
     * @param countrycode Default value is \&quot;NO\&quot; (optional)
     * @return SignatureStatusResponse
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignatureStatusResponse checkSignaturesProkura(SignatureCheckRequest data, Boolean includereport, String countrycode) throws Exception, IdfyException {
        Object localVarPostBody = data;
        // create path and map variables
        String localVarPath = "/signroles/signature/check";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (includereport != null) {
            url.addQueryParameter("includereport", includereport.toString());}
        if (countrycode != null) {
            url.addQueryParameter("countrycode", countrycode.toString());}

        return post(url.build(), data, SignatureStatusResponse.class);
    }

    /**
     * Check signatures / prokura (asynchronously)
     * Check if received signatures and/or prokura are valid. This call allows you to do this check for multiple organizations simulataneously.  A valid date of birth in this format [ddMMyy] is required. The persons last name plus minimum one other part of the signees name (first, (middle) and last name has to be separated by whitespace, comma or ;).   A report that explains the validity of the signatures can be included.
     * @param data An array including all the organizations you want to check (required)
     * @param includereport Returns a pdf report explaining the validity of the checked signatures, default value is true (optional)
     * @param countrycode Default value is \&quot;NO\&quot; (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<SignatureStatusResponse> checkSignaturesProkuraAsync(SignatureCheckRequest data, Boolean includereport, String countrycode) throws Exception, IdfyException {
        Object localVarPostBody = data;
        // create path and map variables
        String localVarPath = "/signroles/signature/check";

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (includereport != null) {
            url.addQueryParameter("includereport", includereport.toString());}
        if (countrycode != null) {
            url.addQueryParameter("countrycode", countrycode.toString());}

        return postAsync(url.build(), data, SignatureStatusResponse.class);
    }


    /**
     * Get rights
     * Check which person(s) that has the right to sign documents in an organization. You will receive lists with names and date of birth for the persons allowed for signing / prokura.
     * @param orgnumber  (required)
     * @param countrycode Default value is \&quot;NO\&quot; (optional)
     * @return SignatureRights
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignatureRights getRights(String orgnumber, String countrycode) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/signroles/rights";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (orgnumber != null) {
            url.addQueryParameter("orgnumber", orgnumber.toString());}
        if (countrycode != null) {
            url.addQueryParameter("countrycode", countrycode.toString());}

        return get(url.build(), SignatureRights.class);
    }

    /**
     * Get rights (asynchronously)
     * Check which person(s) that has the right to sign documents in an organization. You will receive lists with names and date of birth for the persons allowed for signing / prokura.
     * @param orgnumber  (required)
     * @param countrycode Default value is \&quot;NO\&quot; (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<SignatureRights> getRightsAsync(String orgnumber, String countrycode) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/signroles/rights";

        localVarPath = Urls.INFORMATION.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (orgnumber != null) {
            url.addQueryParameter("orgnumber", orgnumber.toString());}
        if (countrycode != null) {
            url.addQueryParameter("countrycode", countrycode.toString());}

        return getAsync(url.build(), SignatureRights.class);
    }

}
