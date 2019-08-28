/*
 * Idfy.Validation
 * In this API you can validate signatures from the following electronic IDs (e-ID)<br/><br/>  &bull; Norwegian BankId (SDO)<br/>  ## Last update [LastUpdate] ## Last update   Last build date for this endpoint: 12.03.2018
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */


package io.idfy.validation;

import io.idfy.OAuthScope;
import io.idfy.models.IdfyException;
import io.idfy.IdfyConfiguration;
import io.idfy.validation.models.ParseSDORequest;
import io.idfy.validation.models.ParseSDOResponse;
import io.idfy.validation.models.ValidateSDORequest;
import io.idfy.validation.models.ValidateSDOResponse;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for NorwegianBankIdService
 */
@Disabled("Dato tull")
public class NorwegianBankIdServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final ValidationService api = new ValidationService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * Parse and validate sdo
     *
     * This service validates and parses the signatures on the SDOdata, to validate/parse the SDO we use the validation component from bankID norway.   This endpoint parses the SDO to readable data and provides you with information about the signatures and document.
     */
    @Test
    public void noBankIDValidationParseSDOTest() throws IdfyException, Exception {
        ParseSDORequest request =  new ParseSDORequest.Builder().build();
        ParseSDOResponse response = api.noBankIDValidationParseSDO(request);
        assertNotNull(response);
    }
    
    /**
     * Validate SDO
     *
     * This service validates the signatures on the SDOdata, to validate the SDO we use the validation component from BankID Norway.   In this endpoint you can also include the data from the original document to validate that they matches the SDO data, the same goes for the signatures. (Ssn is only available if you have an account and validate-ssn scope)
     */
    @Test
    public void noBankIDValidationValidateSDOTest() throws IdfyException, Exception {
        ValidateSDORequest request =  new ValidateSDORequest.Builder().build();
        ValidateSDOResponse response = api.noBankIDValidationValidateSDO(request);
        assertNotNull(response);
    }
    

}
