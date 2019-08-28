package io.idfy.text;

import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.HttpUrl;

import io.idfy.OAuthScope;
import io.idfy.IdfyBaseService;
import io.idfy.Urls;
import io.idfy.internal.utils.Encoder;
import io.idfy.models.IdfyException;
import io.idfy.text.models.*;
import org.w3c.dom.Text;

import java.io.InputStream;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class TextService extends IdfyBaseService {
    public TextService() {
        super();
    }

    public TextService(String clientId, String clientSecret, List<OAuthScope> oAuthScopes) {
        super(clientId, clientSecret, oAuthScopes);
    }

    /**
     * Create language set
     * Creates a new language set.
     * @param newLanguageSet  (optional)
     * @return LanguageSetDTO
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LanguageSetDTO createLanguageSet(LanguageSetCreateDTO newLanguageSet) throws Exception, IdfyException {
        Object localVarPostBody = newLanguageSet;
        // create path and map variables
        String localVarPath = "/language-sets";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return post(url.build(), newLanguageSet, LanguageSetDTO.class);
    }

    /**
     * Create language set (asynchronously)
     * Creates a new language set.
     * @param newLanguageSet  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<LanguageSetDTO> createLanguageSetAsync(LanguageSetCreateDTO newLanguageSet) throws Exception, IdfyException {
        Object localVarPostBody = newLanguageSet;
        // create path and map variables
        String localVarPath = "/language-sets";

        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return postAsync(url.build(), newLanguageSet, LanguageSetDTO.class);
    }


    /**
     * Delete language set
     * Deletes the specified language set.
     * @param id  (required)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteLanguageSet(Integer id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/language-sets/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        delete(url.build());
    }

    /**
     * Delete language set (asynchronously)
     * Deletes the specified language set.
     * @param id  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> deleteLanguageSetAsync(Integer id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/language-sets/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return deleteAsync(url.build());
    }


    /**
     * List language sets
     * Returns a list of all your language sets.
     * @return LanguageSetDTO
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LanguageSetDTO[] listLanguageSets() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/language-sets";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), LanguageSetDTO[].class);
    }

    /**
     * List language sets (asynchronously)
     * Returns a list of all your language sets.
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<LanguageSetDTO[]> listLanguageSetsAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/language-sets";

        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), LanguageSetDTO[].class);
    }


    /**
     * Retrieve language set
     * Retrieves the details of a single language set.
     * @param id  (required)
     * @return LanguageSetDTO
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LanguageSetDTO retrieveLanguageSet(Integer id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/language-sets/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), LanguageSetDTO.class);
    }

    /**
     * Retrieve language set (asynchronously)
     * Retrieves the details of a single language set.
     * @param id  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<LanguageSetDTO> retrieveLanguageSetAsync(Integer id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/language-sets/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), LanguageSetDTO.class);
    }


    /**
     * Update language set
     * Updates the specified language set with the parameters passed.
     * @param id  (required)
     * @param languageSetUpdate  (optional)
     * @return LanguageSetDTO
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LanguageSetDTO updateLanguageSet(Integer id, LanguageSetUpdateDTO languageSetUpdate) throws Exception, IdfyException {
        Object localVarPostBody = languageSetUpdate;
        // create path and map variables
        String localVarPath = "/language-sets/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return patch(url.build(), languageSetUpdate, LanguageSetDTO.class);
    }

    /**
     * Update language set (asynchronously)
     * Updates the specified language set with the parameters passed.
     * @param id  (required)
     * @param languageSetUpdate  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<LanguageSetDTO> updateLanguageSetAsync(Integer id, LanguageSetUpdateDTO languageSetUpdate) throws Exception, IdfyException {
        Object localVarPostBody = languageSetUpdate;
        // create path and map variables
        String localVarPath = "/language-sets/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return patchAsync(url.build(), languageSetUpdate, LanguageSetDTO.class);
    }

    /**
     * List all languages
     * Returns a list of all supported languages.
     * @return LanguageDTO
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LanguageDTO listAllLanguages() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/languages";

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), LanguageDTO.class);
    }

    /**
     * List all languages (asynchronously)
     * Returns a list of all supported languages.
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<LanguageDTO> listAllLanguagesAsync() throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/languages";

        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), LanguageDTO.class);
    }


    /**
     * Retrieve language
     *
     * @param id  (required)
     * @return LanguageDTO
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LanguageDTO retrieveLanguage(Integer id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/languages/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), LanguageDTO.class);
    }

    /**
     * Retrieve language (asynchronously)
     *
     * @param id  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<LanguageDTO> retrieveLanguageAsync(Integer id) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/languages/{id}"
                .replaceAll("\\{" + "id" + "\\}", Encoder.escapeString(id.toString()));

        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), LanguageDTO.class);
    }

    /**
     * List translations
     * Returns a list of all your translations for the given language set.
     * @param languageSetId  (required)
     * @param translationKeyGroupId  (required)
     * @param language  (optional)
     * @param format  (optional)
     * @return TranslationDTO
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TranslationDTO[] listTranslations(Integer languageSetId, Integer translationKeyGroupId, String language, String format) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/language-sets/{languageSetId}/translations"
                .replaceAll("\\{" + "languageSetId" + "\\}", Encoder.escapeString(languageSetId.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (language != null) {
            url.addQueryParameter("language", language.toString());}
        if (translationKeyGroupId != null) {
            url.addQueryParameter("translationKeyGroupId", translationKeyGroupId.toString());}
        if (format != null) {
            url.addQueryParameter("format", format.toString());}

        return get(url.build(), TranslationDTO[].class);
    }

    /**
     * List translations (asynchronously)
     * Returns a list of all your translations for the given language set.
     * @param languageSetId  (required)
     * @param translationKeyGroupId  (required)
     * @param language  (optional)
     * @param format  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<TranslationDTO[]> listTranslationsAsync(Integer languageSetId, Integer translationKeyGroupId, String language, String format) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/language-sets/{languageSetId}/translations"
                .replaceAll("\\{" + "languageSetId" + "\\}", Encoder.escapeString(languageSetId.toString()));

        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();

        if (language != null) {
            url.addQueryParameter("language", language.toString());}
        if (translationKeyGroupId != null) {
            url.addQueryParameter("translationKeyGroupId", translationKeyGroupId.toString());}
        if (format != null) {
            url.addQueryParameter("format", format.toString());}

        return getAsync(url.build(), TranslationDTO[].class);
    }


    /**
     * Retrieve translation
     * Retrieves the details of a single translation.
     * @param languageSetId  (required)
     * @param subjectId  (required)
     * @param languageCode  (required)
     * @return TranslationDTO
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TranslationDTO retrieveTranslation(Integer languageSetId, Integer subjectId, String languageCode) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/language-sets/{languageSetId}/translations/{subjectId}/{languageCode}"
                .replaceAll("\\{" + "languageSetId" + "\\}", Encoder.escapeString(languageSetId.toString()))
                .replaceAll("\\{" + "subjectId" + "\\}", Encoder.escapeString(subjectId.toString()))
                .replaceAll("\\{" + "languageCode" + "\\}", Encoder.escapeString(languageCode.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return get(url.build(), TranslationDTO.class);
    }

    /**
     * Retrieve translation (asynchronously)
     * Retrieves the details of a single translation.
     * @param languageSetId  (required)
     * @param subjectId  (required)
     * @param languageCode  (required)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<TranslationDTO> retrieveTranslationAsync(Integer languageSetId, Integer subjectId, String languageCode) throws Exception, IdfyException {
        // create path and map variables
        String localVarPath = "/language-sets/{languageSetId}/translations/{subjectId}/{languageCode}"
                .replaceAll("\\{" + "languageSetId" + "\\}", Encoder.escapeString(languageSetId.toString()))
                .replaceAll("\\{" + "subjectId" + "\\}", Encoder.escapeString(subjectId.toString()))
                .replaceAll("\\{" + "languageCode" + "\\}", Encoder.escapeString(languageCode.toString()));

        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return getAsync(url.build(), TranslationDTO.class);
    }


    /**
     * Update translation
     * Updates the specified translation with the parameters passed.
     * @param languageSetId  (required)
     * @param subjectId  (required)
     * @param languageCode  (required)
     * @param translationUpdate  (optional)
     * @throws IdfyException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateTranslation(Integer languageSetId, Integer subjectId, String languageCode, TranslationUpdateDTO translationUpdate) throws Exception, IdfyException {
        Object localVarPostBody = translationUpdate;
        // create path and map variables
        String localVarPath = "/language-sets/{languageSetId}/translations/{subjectId}/{languageCode}"
                .replaceAll("\\{" + "languageSetId" + "\\}", Encoder.escapeString(languageSetId.toString()))
                .replaceAll("\\{" + "subjectId" + "\\}", Encoder.escapeString(subjectId.toString()))
                .replaceAll("\\{" + "languageCode" + "\\}", Encoder.escapeString(languageCode.toString()));

        // Base path still needs to be added manually. Some APIs (such as Signature) are missing the "base path" value in the OpenAPI spec. and therefore need to have the basePath hardcoded in as a workaround.
        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        patch(url.build(), translationUpdate);
    }

    /**
     * Update translation (asynchronously)
     * Updates the specified translation with the parameters passed.
     * @param languageSetId  (required)
     * @param subjectId  (required)
     * @param languageCode  (required)
     * @param translationUpdate  (optional)
     * @return The request call
     * @throws IdfyException If fail to process the API call, e.g. serializing the request body object
     */
    public CompletableFuture<Void> updateTranslationAsync(Integer languageSetId, Integer subjectId, String languageCode, TranslationUpdateDTO translationUpdate) throws Exception, IdfyException {
        Object localVarPostBody = translationUpdate;
        // create path and map variables
        String localVarPath = "/language-sets/{languageSetId}/translations/{subjectId}/{languageCode}"
                .replaceAll("\\{" + "languageSetId" + "\\}", Encoder.escapeString(languageSetId.toString()))
                .replaceAll("\\{" + "subjectId" + "\\}", Encoder.escapeString(subjectId.toString()))
                .replaceAll("\\{" + "languageCode" + "\\}", Encoder.escapeString(languageCode.toString()));

        localVarPath = Urls.TEXT.concat(localVarPath);
        HttpUrl.Builder url = HttpUrl.parse(localVarPath).newBuilder();


        return patchAsync(url.build(), translationUpdate);
    }
}