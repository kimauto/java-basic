package day11.morning;
//18
public class ShowService {

    private static ShowService showService;

    private ShowService() {
    }

    public static ShowService getInstance() {
        if (showService == null){
            showService = new ShowService();
        }

        return showService;
    }
}
