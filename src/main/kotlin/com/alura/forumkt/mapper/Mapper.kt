package com.alura.forumkt.mapper

interface Mapper<T, U> {

    fun map(t: T): U
}