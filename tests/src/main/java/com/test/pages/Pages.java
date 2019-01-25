package com.test.pages;

public class Pages {

    private static CreateEntityPage createEntityPage;
    private static ThankYouPage thankYouPage;

    public static CreateEntityPage createEntityPage() {
        if (createEntityPage == null){
            createEntityPage = new CreateEntityPage();
        }
        return createEntityPage;
    }

    public static ThankYouPage thankYouPage() {
        if (thankYouPage == null){
            thankYouPage = new ThankYouPage();
        }
        return thankYouPage;
    }

}
