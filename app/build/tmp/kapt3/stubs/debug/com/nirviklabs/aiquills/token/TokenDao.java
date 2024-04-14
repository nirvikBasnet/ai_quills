package com.nirviklabs.aiquills.token;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\'\u00a8\u0006\t"}, d2 = {"Lcom/nirviklabs/aiquills/token/TokenDao;", "", "getToken", "Lcom/nirviklabs/aiquills/token/Token;", "id", "", "insertToken", "", "token", "app_debug"})
@androidx.room.Dao
public abstract interface TokenDao {
    
    @androidx.room.Query(value = "SELECT * FROM token_table where id = :id")
    @org.jetbrains.annotations.NotNull
    public abstract com.nirviklabs.aiquills.token.Token getToken(int id);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertToken(@org.jetbrains.annotations.NotNull
    com.nirviklabs.aiquills.token.Token token);
}