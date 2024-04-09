package com.travelmobileapp.data;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile CountryDao _countryDao;

  private volatile TravelDao _travelDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `CountryEntity` (`id` TEXT NOT NULL, `country-name` TEXT NOT NULL, `visited` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `travel-table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `travel-title` TEXT NOT NULL, `travel-description` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c255964da7da95ee00fcfd172ea63900')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `CountryEntity`");
        db.execSQL("DROP TABLE IF EXISTS `travel-table`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsCountryEntity = new HashMap<String, TableInfo.Column>(3);
        _columnsCountryEntity.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCountryEntity.put("country-name", new TableInfo.Column("country-name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCountryEntity.put("visited", new TableInfo.Column("visited", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCountryEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCountryEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCountryEntity = new TableInfo("CountryEntity", _columnsCountryEntity, _foreignKeysCountryEntity, _indicesCountryEntity);
        final TableInfo _existingCountryEntity = TableInfo.read(db, "CountryEntity");
        if (!_infoCountryEntity.equals(_existingCountryEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "CountryEntity(com.travelmobileapp.data.CountryEntity).\n"
                  + " Expected:\n" + _infoCountryEntity + "\n"
                  + " Found:\n" + _existingCountryEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsTravelTable = new HashMap<String, TableInfo.Column>(3);
        _columnsTravelTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTravelTable.put("travel-title", new TableInfo.Column("travel-title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTravelTable.put("travel-description", new TableInfo.Column("travel-description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTravelTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTravelTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTravelTable = new TableInfo("travel-table", _columnsTravelTable, _foreignKeysTravelTable, _indicesTravelTable);
        final TableInfo _existingTravelTable = TableInfo.read(db, "travel-table");
        if (!_infoTravelTable.equals(_existingTravelTable)) {
          return new RoomOpenHelper.ValidationResult(false, "travel-table(com.travelmobileapp.data.Travel).\n"
                  + " Expected:\n" + _infoTravelTable + "\n"
                  + " Found:\n" + _existingTravelTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "c255964da7da95ee00fcfd172ea63900", "a0c18f4f0a3a7a6bc123400f34ee7aec");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "CountryEntity","travel-table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `CountryEntity`");
      _db.execSQL("DELETE FROM `travel-table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CountryDao.class, CountryDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(TravelDao.class, TravelDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public CountryDao countryDao() {
    if (_countryDao != null) {
      return _countryDao;
    } else {
      synchronized(this) {
        if(_countryDao == null) {
          _countryDao = new CountryDao_Impl(this);
        }
        return _countryDao;
      }
    }
  }

  @Override
  public TravelDao travelDao() {
    if (_travelDao != null) {
      return _travelDao;
    } else {
      synchronized(this) {
        if(_travelDao == null) {
          _travelDao = new TravelDao_Impl(this);
        }
        return _travelDao;
      }
    }
  }
}
