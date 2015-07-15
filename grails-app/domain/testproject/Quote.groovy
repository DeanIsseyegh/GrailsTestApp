package testproject

class Quote {

    String author
    String content
    Integer year

    static constraints = {
        author blank:false
        content blank:false
        year blank:false
    }
}
