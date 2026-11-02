.class public final Lcom/sma/smartv3/db/MyDb$init$42;
.super Landroidx/room/migration/Migration;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/db/MyDb;->init(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x2a

    const/16 v1, 0x2b

    invoke-direct {p0, v0, v1}, Landroidx/room/migration/Migration;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS \'Vitality\' (\n   \'mId\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n   \'mTime\' INTEGER NOT NULL UNIQUE,\n   \'mLocalTime\' TEXT NOT NULL,\n   \'mAllVitality\'  INTEGER NOT NULL,\n   \'mLowIntensityTime\' INTEGER NOT NULL,\n   \'mLowIntensityValue\' INTEGER NOT NULL,\n   \'mMediumIntensityTime\' INTEGER NOT NULL,\n   \'mMediumIntensityValue\' INTEGER NOT NULL,\n   \'mHighIntensityTime\' INTEGER NOT NULL,\n   \'mHighIntensityValue\' INTEGER NOT NULL,\n   \'mIsSync\' INTEGER NOT NULL DEFAULT 0\n)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_Vitality_mTime` \n ON `Vitality` (`mTime`)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS \'RespiratoryRate\' (\n    \'mId\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    \'mTime\' INTEGER NOT NULL UNIQUE,\n     \'mLocalTime\' TEXT NOT NULL,\n     \'mValue\' INTEGER NOT NULL,\n     \'mIsSync\' INTEGER NOT NULL\n)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_RespiratoryRate_mTime` \n ON `RespiratoryRate` (`mTime`)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS \'PhysicalPower\' (\n    \'mId\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    \'mTime\' INTEGER NOT NULL UNIQUE,\n     \'mLocalTime\' TEXT NOT NULL,\n     \'mValue\' INTEGER NOT NULL,\n     \'mIsSync\' INTEGER NOT NULL\n)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_PhysicalPower_mTime` \n ON `PhysicalPower` (`mTime`)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method
