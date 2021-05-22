package day34_void_methods;

public class EtsySeachTest {

    public static void openBrowser() {
        System.out.println("Launching Chrome browser");
    }

    public static void main(String[] args) {
        System.out.println("---Starting ETSY Search Smoke Test---");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("--- Etsy Search Smoke Test completed: PASS ---");
    }

    public static void navigateToEtsyUrl() {
        System.out.println("Navigate to https://www.etsy.com");
    }

    public static void searchForWoodenSpoon() {
        System.out.println("PASS: Verify Etsy home page is disployed");
        System.out.println("Type 'Wooden Spoon' in search field and click search");
    }

    public static void verifyResultsAreDisplayed() {
        System.out.println("PASS: Search results are successfully displayed");
    }
}
