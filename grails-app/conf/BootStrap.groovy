import testproject.Quote

class BootStrap {

    def init = { servletContext ->
        Quote quote1 = new Quote(author: "Bob", content: "Dev dev dev", year:"1989").save()
        Quote quote2 = new Quote(author: "Ronny", content: "Blah blah blah", year:"1939").save()
        Quote quote3 = new Quote(author: "William", content: "Harharharhar", year:"1952").save()

    }
    def destroy = {
    }
}
