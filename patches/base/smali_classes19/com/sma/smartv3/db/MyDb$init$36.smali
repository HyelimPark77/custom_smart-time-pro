.class public final Lcom/sma/smartv3/db/MyDb$init$36;
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

    const/16 v0, 0x24

    const/16 v1, 0x25

    invoke-direct {p0, v0, v1}, Landroidx/room/migration/Migration;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CREATE TABLE HealthyReport(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mUserGender INTEGER NOT NULL,mUserWeight FLOAT NOT NULL,mUserHeight FLOAT NOT NULL,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mAbnormalNumber INTEGER NOT NULL,mHeartRateTime INTEGER NOT NULL,mHeartRateValue INTEGER NOT NULL,mHeartRateAIRecords Text NOT NULL,mBloodPressureTime INTEGER NOT NULL,mSystolicValue INTEGER NOT NULL,mDiastolicValue INTEGER NOT NULL,mBloodPressureAIRecords Text NOT NULL,mBloodOxygenTime INTEGER NOT NULL,mBloodOxygenValue INTEGER NOT NULL,mBloodOxygenAIRecords Text NOT NULL,mSleepTime INTEGER NOT NULL,mSleepDeepLengthTime FLOAT NOT NULL,mSleepPiecemealTime FLOAT NOT NULL,mSleepAIRecords Text NOT NULL,mPressureTime INTEGER NOT NULL,mPressureValue INTEGER NOT NULL,mPressureAIRecords Text NOT NULL,mBloodGlucose2Time INTEGER NOT NULL,mBloodGlucose2Value FLOAT NOT NULL,mBloodGlucose2AIRecords Text NOT NULL,mWeightTime INTEGER NOT NULL,mWeightValue FLOAT NOT NULL,mWeightAIRecords Text NOT NULL,mWeekSportsTime INTEGER NOT NULL,mWeekSportsNumber INTEGER NOT NULL,mWeekSportsAllTime INTEGER NOT NULL,mWeekSportsAIRecords Text NOT NULL,mIsSync INTEGER NOT NULL)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE UNIQUE INDEX index_HealthyReport_mTime ON HealthyReport(mTime)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method
