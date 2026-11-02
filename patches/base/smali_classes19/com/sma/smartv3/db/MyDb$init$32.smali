.class public final Lcom/sma/smartv3/db/MyDb$init$32;
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

    const/16 v0, 0x20

    const/16 v1, 0x21

    invoke-direct {p0, v0, v1}, Landroidx/room/migration/Migration;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CREATE TABLE BloodGlucose2(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mMeasurementId Text NOT NULL,mUserId Text NOT NULL,mStartTime Text NOT NULL,mEndTime Text NOT NULL,mModelNo Text NOT NULL,mLowerBound REAL NOT NULL DEFAULT 0,mUpperBound REAL NOT NULL DEFAULT 0,mFasting INTEGER NOT NULL,mWithin2hrsMeal INTEGER NOT NULL,mCompletedProgress INTEGER NOT NULL,mCurrentLevel INTEGER NOT NULL,mRiskCode Text NOT NULL,mInsights Text NOT NULL,mTips Text NOT NULL,mLocaleInsights Text NOT NULL,mLocaleTips Text NOT NULL,mIsSync INTEGER NOT NULL,mIsDelete INTEGER NOT NULL)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE UNIQUE INDEX index_BloodGlucose2_mMeasurementId ON BloodGlucose2(mMeasurementId)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method
