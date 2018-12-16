package e.jimmyv2.roomwordsample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * A basic class representing an entity that is a row in a one-column database table.
 *
 * @ Entity - You must annotate the class as an entity and supply a table name if not class name.
 * @ PrimaryKey - You must identify the primary key.
 * @ ColumnInfo - You must supply the column name if it is different from the variable name.
 *
 * See the documentation for the full rich set of annotations.
 * https://developer.android.com/topic/libraries/architecture/room.html
 */

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;
    private String mDefinition;

    public Word(@NonNull String word, @NonNull String definition) {
        this.mWord = word;
        this.mDefinition = definition;}

    public String getWord()
    {return this.mWord;}

    public String getDefinition(){
        return mDefinition;
    }
    @Override
    public String toString()
    {
        return String.format("%s: %n%s", this.getWord(), this.getDefinition());
    }
}