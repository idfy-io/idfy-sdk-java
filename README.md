# idfy-sdk-java
[![Build Status](https://travis-ci.org/Signereno/test-idfy-java-sdk.svg?branch=master)](https://travis-ci.org/Signereno/test-idfy-java-sdk)

A Java SDK for simple integration with the Idfy REST API.

Is compatible with Java 8 and upwards.

## Installation
The SDK will soon be available on Maven Central, and the JAR can also be downloaded directly from this repository.

### Installing from Maven
Coming soon!

### Download the JAR
Simply navigate to the [Releases](https://github.com/idfy-io/idfy-sdk-java/releases) tab in this repository. Each release includes a JAR file which can be downloaded and added to your project directly. [HINT](https://stackoverflow.com/questions/4955635/how-to-add-local-jar-files-to-a-maven-project)

## Documentation
- [Idfy REST API Reference](https://developer.idfy.io/api)
- [Idfy Developer Documentation](https://developer.idfy.io/docs)

## Sample Usage
The example below shows how to get the details of a specific document.

```java
// Set your credentials and desired scopes
List myList = new LinkedList();

myList.add(OAuthScope.DocumentWrite);
myList.add(OAuthScope.DocumentRead);
myList.add(OAuthScope.DocumentFile);

IdfyConfiguration.setClientCredentials("Your account ID", "Your account secret", myList );

// Make a call to retrieve the document
SignatureService service = new SignatureService();

CreateDocumentResponse document = null;

try {
    document =  service.documentsGet(UUID.fromString("Your Document ID"));
} catch (Exception e) {
    e.printStackTrace();
} catch (IdfyException e) {
    e.printStackTrace();
}

System.out.println( document.toString() );

```

## Note
Some dependencies might not be included in the JAR file. If this is the case, just import them normally with Maven, and everything should work.

## Support
- Open an [issue](https://github.com/idfy-io/idfy-sdk-java/issues) to report bugs or submit feature requests.
- For other support requests, visit our [support page](https://support.idfy.io) or contact us at [support@idfy.io](mailto:support@idfy.io).
