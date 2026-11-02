.class public final Lcom/sma/smartv3/db/MyDb$init$49;
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

    const/16 v0, 0x31

    const/16 v1, 0x32

    invoke-direct {p0, v0, v1}, Landroidx/room/migration/Migration;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `RecordDeviceFile` (\n    `mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n    `mTime` INTEGER NOT NULL, \n    `mLocalTime` TEXT NOT NULL, \n    `mName` TEXT NOT NULL, \n    `mPath` TEXT NOT NULL, \n    `mSize` INTEGER NOT NULL, \n    `mWidth` INTEGER NOT NULL, \n    `mHeight` INTEGER NOT NULL, \n    `mDuration` INTEGER NOT NULL, \n    `mThumbnail` TEXT NOT NULL, \n    `mFileType` INTEGER NOT NULL, \n    `mIsFavority` INTEGER NOT NULL, \n    `mContent` TEXT NOT NULL, \n    `mIsSync` INTEGER NOT NULL, \n    `mIsDelete` INTEGER NOT NULL, \n    `mProcessType` INTEGER NOT NULL, \n    `mProcessStatus` INTEGER NOT NULL, \n    `mProcessPath` TEXT NOT NULL, \n    `mIsRead` INTEGER NOT NULL, \n    `mIsConversion` INTEGER NOT NULL, \n    `mReservedTextType` INTEGER NOT NULL, \n    `mReservedText` TEXT NOT NULL, \n    `mIsSummaryReport` INTEGER NOT NULL, \n    `mSummaryReportText` TEXT NOT NULL\n)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_RecordDeviceFile_mTime` ON `RecordDeviceFile` (`mTime`)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `RecordDeviceInfo` (\n    `mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n    `mTime` INTEGER NOT NULL, \n    `mLocalTime` TEXT NOT NULL, \n    `mMac` TEXT NOT NULL, \n    `mName` TEXT NOT NULL, \n    `mVersion` TEXT NOT NULL, \n    `mBattery` INTEGER NOT NULL, \n    `mTotalStorage` INTEGER NOT NULL, \n    `mAvailableStorage` INTEGER NOT NULL, \n    `isActive` INTEGER NOT NULL\n)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_RecordDeviceInfo_mMac` ON `RecordDeviceInfo` (`mMac`)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method
