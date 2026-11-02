.class Lcom/jieli/bluetooth_connect/data/BtConnectDatabase$1;
.super Landroidx/room/migration/Migration;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/bluetooth_connect/data/BtConnectDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>(II)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "startVersion",
            "endVersion"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Landroidx/room/migration/Migration;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 1
    .param p1    # Landroidx/sqlite/db/SupportSQLiteDatabase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "database"
        }
    .end annotation

    const-string v0, "ALTER TABLE HistoryRecord RENAME TO __HistoryRecord_old"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `HistoryRecord` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `address` TEXT NOT NULL, `mapped_address` TEXT, `dev_type` INTEGER NOT NULL, `connect_type` INTEGER NOT NULL, `sdk_flag` INTEGER NOT NULL, `vid` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `pid` INTEGER NOT NULL, `left_dev_lat` REAL NOT NULL, `left_dev_lon` REAL NOT NULL, `left_dev_update_time` INTEGER NOT NULL, `right_dev_lat` REAL NOT NULL, `right_dev_lon` REAL NOT NULL, `right_dev_update_time` INTEGER NOT NULL, `online_time` INTEGER NOT NULL)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "INSERT INTO `HistoryRecord`(`name`, `address`, `mapped_address`, `dev_type`, `connect_type`, `sdk_flag`, `vid`, `uid`, `pid`, `left_dev_lat`, `left_dev_lon`, `left_dev_update_time`, `right_dev_lat`, `right_dev_lon`, `right_dev_update_time`, `online_time`) SELECT `name`, `address`, `mapped_address`, `dev_type`, `connect_type`, `sdk_flag`, `vid`, `uid`, `pid`, `left_dev_lat`, `left_dev_lon`, `left_dev_update_time`, `right_dev_lat`, `right_dev_lon`, `right_dev_update_time`, `online_time` FROM __HistoryRecord_old"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "DROP TABLE __HistoryRecord_old;"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method
