package testproject

class QuoteController {

    static scaffold = true;

    /*def index() {
        render "Wazzupp!! Index method used."
    }*/

    def randomQuote() {
        def staticAuthor = "Random Dev"
        def staticContent = "Random Quote!"

        int numberOfQuotes = Quote.count
        println "******Number of quotes in DB is : " + numberOfQuotes

        int randomId = new Random().nextInt(numberOfQuotes)
        println "******Random id is: " + randomId
        Quote randomQuote = Quote.findById(randomId + 1)

        println "This is a 'develop' feature!"
        println "Zombies!!!!"

        [author: randomQuote.author + "," + randomQuote.year, content: randomQuote.content]
    }
}
