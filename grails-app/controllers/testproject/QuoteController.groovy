package testproject

class QuoteController {

    static scaffold = true;

    QuoteService quoteService
    RandomFeaturesService randomFeaturesService

    def randomQuote() {
        Quote randomQuote = quoteService.getRandomQuote()
        randomFeaturesService.doRandomFeatures()

        [quote: randomQuote]
    }
}
