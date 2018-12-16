package e.jimmyv2.roomwordsample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

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
