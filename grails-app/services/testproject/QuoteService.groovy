package testproject

import grails.transaction.Transactional

@Transactional
class QuoteService {

    def Quote getRandomQuote() {
        int numberOfQuotes = Quote.count
        println "******Number of quotes in DB is : " + numberOfQuotes
        def allQuotes = Quote.findAll()

        int randomInd = new Random().nextInt(numberOfQuotes)
        Quote randomQuote = allQuotes.get(randomInd)
    }
}
