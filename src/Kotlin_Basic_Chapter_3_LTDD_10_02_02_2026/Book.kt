package Kotlin_Basic_Chapter_3_LTDD_10_02_02_2026
class Book(var title : String, var author : String, var ISBN : String     ) {
    fun showDetails() {
        println("Title: $title")
    }
}

class bookCollection( var name: String  ) : ArrayList<Book>() {
    var bookList = arrayListOf<Book>()

    fun addBook( books : Book)  {
        bookList.add(books)
    }
    fun removeBook( books : Book)  {
        bookList.remove(books)
    }

    fun showAllBooks() {
        bookList.forEach { it.showDetails() }
    }
}

fun main() {
    var Book1 = Book("1" , "Dont Know" , "67693618")
    var Book2 = Book("2" , "Dont Know" , "67693618")
    var Book3 = Book("3" , "Dont Know" , "67693618")

    var bookList = bookCollection("Book Collection")

    bookList.addBook(Book1)
    bookList.addBook(Book2)
    bookList.showAllBooks()

    bookList.addBook(Book3)
    bookList.showAllBooks()
    bookList.removeBook(Book3)
    bookList.showAllBooks()
}