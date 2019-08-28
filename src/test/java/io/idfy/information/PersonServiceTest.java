/*
 * Idfy Information Services
 * This endpoint offers a lot of useful extra information including credit checks, signature / prokura checks and information regarding persons and companies.   ## Last update   Last build date for this endpoint: 13.12.2018
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */


package io.idfy.information;

import io.idfy.OAuthScope;
import io.idfy.models.IdfyException;
import io.idfy.IdfyConfiguration;
import io.idfy.information.models.PersonCreditCheckPersonResponse;
import io.idfy.information.models.PersonOfficialPersonRegistryResponse;
import io.idfy.information.models.PersonPersonInformation;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

/**
 * API tests for PersonService
 */

public class PersonServiceTest {
    // The service name still needs to be set manually
    List<OAuthScope> scopes = Arrays.asList(OAuthScope.DocumentRead, OAuthScope.DocumentWrite, OAuthScope.DocumentFile);
    private final InformationService api = new InformationService("clientId", "clientSecret", scopes);

    @BeforeAll
    public static void setUp() {
    IdfyConfiguration.setBaseUrl("http://localhost:5000");
    }

    
    /**
     * List person info through MatchIt by query
     *
     * Returns (unofficial) person information, this method returns the 5 best matches from the query parameters served (freetext). The information is delievered by Matchit.
     */
    @Test
    public void listPersonInfoThroughMatchitByQueryTest() throws IdfyException, Exception {
        String queryString = new String("123");
        PersonPersonInformation[] response = api.listPersonInfoThroughMatchitByQuery(queryString);
        assertNotNull(response);
    }
    
    /**
     * Retrieve person info through Infotorget
     *
     * Run a query using social security number as parameter. The use of this requires username and password for Infortorget with the required permissions.  Valid query parameter combinations:   socialSecurityNumber,   socialSecurityNumber + firstName + lastName,   dateOfBirth + firstName + lastName,   firstName + lastName + address + postalCode
     */
    @Test
    public void retrievePersonInfoThroughInfotorgetTest() throws IdfyException, Exception {
        String username = new String("123");
        String password = new String("123");
        String reason = new String("123");
        String system = new String("123");
        String socialSecurityNumber = new String("123");
        String firstname = new String("123");
        String lastname = new String("123");
        Integer dateofbirth = 123;
        String address = new String("123");
        String postalcode = new String("123");
        PersonOfficialPersonRegistryResponse response = api.retrievePersonInfoThroughInfotorget(username, password, reason, system, socialSecurityNumber, firstname, lastname, dateofbirth, address, postalcode);
        assertNotNull(response);
    }
    
    /**
     * Retrieve person info through MatchIt
     *
     * Returns (unofficial) person information, this method returns the best match from the query parameters served. The information is delievered by Matchit.   Valid query parameter combinations: name + dateOfBirth, name + socialSec, name + address, phonenumber
     */
    @Test
    public void retrievePersonInfoThroughMatchitTest() throws IdfyException, Exception {
        String name = new String("123");
        String socialSec = new String("123");
        String dateOfBirth = new String("123");
        String phonenumber = new String("123");
        String address = new String("123");
        PersonPersonInformation response = api.retrievePersonInfoThroughMatchit(name, socialSec, dateOfBirth, phonenumber, address);
        assertNotNull(response);
    }
    
    /**
     * Run credit check
     *
     * Credit check of a single person. The use of this will produce a duplicate letter to the person that is checked.               A pdf report will be awailable to download the first 48 hours.
     */
    @Test
    public void runCreditCheckTest() throws IdfyException, Exception {
        Long socialSecurityNumber = 123L;
        String userId = new String("123");
        String password = new String("123");
        Integer phonenumber = 123;
        String email = new String("123");
        Boolean includeReport = true;
        PersonCreditCheckPersonResponse response = api.runCreditCheck(socialSecurityNumber, userId, password, phonenumber, email, includeReport);
        assertNotNull(response);
    }
    

}
