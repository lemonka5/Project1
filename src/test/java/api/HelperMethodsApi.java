package api;

import io.restassured.response.ValidatableResponse;

public class HelperMethodsApi {
    /*
     * username: Tester
     * password: Parola10!
     * apiKey: JWT123456
     * */

    ValidatableResponse res;

    String auth = "Authorization";
    String apiKey = "Bearer JWT123456";
    String ISBNs = "[9781449325862, 9781449331818, 9781449337711, 9781449365035, 9781491904244, 9781491950296, 9781593275846, 9781593277574]";
    String ISBN = "[9781449325862]";

    //Account section:
    String endpointlogin = "https://demoqa.com/Account/v1/Authorized";
    String endpointcreateuser = "https://demoqa.com/Account/v1/User";

    //Book store section:
    String endpointbooks = "https://demoqa.com/BookStore/v1/Books";
    String endpointdeleteuser = "https://demoqa.com/Account/v1/User/{UUID}";
    String endpointdeletebook  = "https://demoqa.com/BookStore/v1/Book";
    String enpointchangebook = "https://demoqa.com/BookStore/v1/Books/9781449325862";
}
