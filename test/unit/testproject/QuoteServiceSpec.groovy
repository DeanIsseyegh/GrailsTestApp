package testproject

import grails.test.mixin.TestFor
import spock.lang.Specification
import grails.test.mixin.Mock

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(QuoteService)
@Mock(Quote)
class QuoteServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "random quote service should return a quote given a quote is in the database"() {
        given:
        def testQuote = new Quote(author: "testAuth", content: "testContent", year: 1234).save()

        when:
        Quote randomQuote = service.getRandomQuote()

        then:
        assert randomQuote == testQuote, "random quote should equal to test quote!"
        assert randomQuote.author == testQuote.author, "author should be test quotes author"
        assert randomQuote.content == testQuote.content, "content should be test quotes content"
        assert randomQuote.year == testQuote.year, "year should not test quotes year"
    }
}
