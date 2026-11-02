.class public final Lcom/sma/smartv3/db/MyDb$init$17;
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

    const/16 v0, 0x11

    const/16 v1, 0x12

    invoke-direct {p0, v0, v1}, Landroidx/room/migration/Migration;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CREATE TABLE MatchLog(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mMatchRecordId INTEGER NOT NULL,mTime INTEGER NOT NULL,mPeriodTime INTEGER NOT NULL,mPeriodNumber INTEGER NOT NULL,mType INTEGER NOT NULL,mCount INTEGER NOT NULL,mCancelType INTEGER NOT NULL,mIsSync INTEGER NOT NULL,mIsDelete INTEGER NOT NULL)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE MatchPeriod(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mMatchRecordId INTEGER NOT NULL,mDuration INTEGER NOT NULL,mDistance INTEGER NOT NULL,mStep INTEGER NOT NULL,mCalorie INTEGER NOT NULL,mSpeed INTEGER NOT NULL,mAvgBpm INTEGER NOT NULL,mMaxBpm INTEGER NOT NULL,mIsSync INTEGER NOT NULL,mIsDelete INTEGER NOT NULL)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE MatchRecord(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mStart INTEGER NOT NULL,mLocalTime Text NOT NULL,mType INTEGER NOT NULL,mPeriodListSize INTEGER NOT NULL,mLogListSize INTEGER NOT NULL,mIsSync INTEGER NOT NULL,mIsDelete INTEGER NOT NULL,p_mId INTEGER NOT NULL,p_mMatchRecordId INTEGER NOT NULL,p_mDuration INTEGER NOT NULL,p_mDistance INTEGER NOT NULL,p_mStep INTEGER NOT NULL,p_mCalorie INTEGER NOT NULL,p_mSpeed INTEGER NOT NULL,p_mAvgBpm INTEGER NOT NULL,p_mMaxBpm INTEGER NOT NULL,p_mIsSync INTEGER NOT NULL,p_mIsDelete INTEGER NOT NULL)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method
