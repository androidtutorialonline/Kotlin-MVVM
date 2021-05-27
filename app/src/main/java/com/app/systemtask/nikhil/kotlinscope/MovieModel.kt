package com.app.systemtask.nikhil.kotlinscope

class MovieModel(title:String?,genere:String?,year:String?) {
    private var title:String
    private var genere:String
    private var year:String

    init {
        this.title=title!!
        this.genere=genere!!
        this.year=year!!
    }

    fun getTitle(): String? {
        return title
    }
    fun setTitle(name: String?) {
        title = name!!
    }
    fun getYear(): String? {
        return year
    }
    fun setYear(year: String?) {
        this.year = year!!
    }
    fun getGenre(): String? {
        return genere
    }
    fun setGenre(genre: String?) {
        this.genere = genre!!
    }
}