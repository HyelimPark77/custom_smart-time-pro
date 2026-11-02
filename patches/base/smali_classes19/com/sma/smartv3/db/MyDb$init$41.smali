.class public final Lcom/sma/smartv3/db/MyDb$init$41;
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

    const/16 v0, 0x29

    const/16 v1, 0x2a

    invoke-direct {p0, v0, v1}, Landroidx/room/migration/Migration;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `TranslateSessionEntity` (\n    `sessionId` TEXT NOT NULL,\n    `audioPath` TEXT NOT NULL,\n    `duration` REAL NOT NULL,\n    `createTime` INTEGER NOT NULL,\n     PRIMARY KEY(`sessionId`) ) "

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, " CREATE TABLE IF NOT EXISTS `TranslateEntity` (\n     `requestId` TEXT NOT NULL,\n      `text` TEXT NOT NULL,\n     `translate` TEXT NOT NULL,\n       `sessionId` TEXT NOT NULL,\n         `duration` REAL NOT NULL,\n         `isUpLoaded` INTEGER NOT NULL,\n        `audioPath` TEXT NOT NULL,\n       `fromLanguage` TEXT NOT NULL,\n        `toLanguage` TEXT NOT NULL,\n       `createTime` INTEGER NOT NULL,\n        PRIMARY KEY(`requestId`),\nFOREIGN KEY(`sessionId`) REFERENCES `TranslateSessionEntity`(`sessionId`) ON DELETE CASCADE )"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_TranslateEntity_sessionId` \n ON `TranslateEntity` (`sessionId`)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method
