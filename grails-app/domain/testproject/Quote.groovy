package testproject

class Quote {

    String author
    String content
    int year

    static constraints = {
        author blank:false
        content blank:false
        year blank:false
    }
}
