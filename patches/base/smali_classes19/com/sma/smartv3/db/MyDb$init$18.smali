.class public final Lcom/sma/smartv3/db/MyDb$init$18;
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

    const/16 v0, 0x12

    const/16 v1, 0x13

    invoke-direct {p0, v0, v1}, Landroidx/room/migration/Migration;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ALTER TABLE Workout ADD COLUMN mSource INTEGER NOT NULL DEFAULT 0"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE SportData(mId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,mTime INTEGER NOT NULL,mLocalTime Text NOT NULL,mStep INTEGER NOT NULL,mDistance INTEGER NOT NULL,mCalorie INTEGER NOT NULL,mDuration INTEGER NOT NULL,mSpm INTEGER NOT NULL,mAltitude INTEGER NOT NULL,mAirPressure INTEGER NOT NULL,mPace INTEGER NOT NULL,mSpeed INTEGER NOT NULL,mMode INTEGER NOT NULL,mIsSync INTEGER NOT NULL,mIsDelete INTEGER NOT NULL)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method
