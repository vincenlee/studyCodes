package com.micro.testgreengao.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.micro.testgreengao.bean.one2one.IdCard;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ID_CARD".
*/
public class IdCardDao extends AbstractDao<IdCard, Long> {

    public static final String TABLENAME = "ID_CARD";

    /**
     * Properties of entity IdCard.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property _id = new Property(0, Long.class, "_id", true, "_id");
        public final static Property CardName = new Property(1, String.class, "cardName", false, "CARD_NAME");
        public final static Property Location = new Property(2, String.class, "location", false, "LOCATION");
    }


    public IdCardDao(DaoConfig config) {
        super(config);
    }
    
    public IdCardDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ID_CARD\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: _id
                "\"CARD_NAME\" TEXT," + // 1: cardName
                "\"LOCATION\" TEXT);"); // 2: location
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ID_CARD\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, IdCard entity) {
        stmt.clearBindings();
 
        Long _id = entity.get_id();
        if (_id != null) {
            stmt.bindLong(1, _id);
        }
 
        String cardName = entity.getCardName();
        if (cardName != null) {
            stmt.bindString(2, cardName);
        }
 
        String location = entity.getLocation();
        if (location != null) {
            stmt.bindString(3, location);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, IdCard entity) {
        stmt.clearBindings();
 
        Long _id = entity.get_id();
        if (_id != null) {
            stmt.bindLong(1, _id);
        }
 
        String cardName = entity.getCardName();
        if (cardName != null) {
            stmt.bindString(2, cardName);
        }
 
        String location = entity.getLocation();
        if (location != null) {
            stmt.bindString(3, location);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public IdCard readEntity(Cursor cursor, int offset) {
        IdCard entity = new IdCard( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // _id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // cardName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // location
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, IdCard entity, int offset) {
        entity.set_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCardName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLocation(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(IdCard entity, long rowId) {
        entity.set_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(IdCard entity) {
        if(entity != null) {
            return entity.get_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(IdCard entity) {
        return entity.get_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
