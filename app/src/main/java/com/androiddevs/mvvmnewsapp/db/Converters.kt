package com.androiddevs.mvvmnewsapp.db

import androidx.room.TypeConverter
import com.androiddevs.mvvmnewsapp.models.Source

/*
 Room can only store primitive data types like Int ,String ,Boolean etc

 And to store our custom object Like Article Data class we need a type converted which converts this into a primitive one
 Now to store the article in the Room  we use fun fromSource which takes Source as parameter and return as String to Store in Room

 And on retrieving from the room library we again recreate source from the string on fun toSource function
 */

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}