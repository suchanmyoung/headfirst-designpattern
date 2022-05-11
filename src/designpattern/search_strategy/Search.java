package designpattern.search_strategy;

public class Search {
    public static void main(String[] args) {
        SearchButton searchButton = new SearchButton();
        searchButton.onClick();

        searchButton.setSearchStrategy(new SearchStrategyImage());
        searchButton.onClick();

        searchButton.setSearchStrategy(new SearchStrategyNews());
        searchButton.onClick();

        searchButton.setSearchStrategy(new SearchStrategyAll());
        searchButton.onClick();
    }
}
