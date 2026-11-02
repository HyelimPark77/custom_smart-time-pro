.class public final enum Lcom/sma/smartv3/model/SyncStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/model/SyncStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/model/SyncStatus;

.field public static final enum DOWNLOAD:Lcom/sma/smartv3/model/SyncStatus;

.field public static final enum FAILED:Lcom/sma/smartv3/model/SyncStatus;

.field public static final enum NO_SYNC:Lcom/sma/smartv3/model/SyncStatus;

.field public static final enum SYNCED:Lcom/sma/smartv3/model/SyncStatus;

.field public static final enum SYNCING:Lcom/sma/smartv3/model/SyncStatus;


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/model/SyncStatus;
    .locals 5

    sget-object v0, Lcom/sma/smartv3/model/SyncStatus;->DOWNLOAD:Lcom/sma/smartv3/model/SyncStatus;

    sget-object v1, Lcom/sma/smartv3/model/SyncStatus;->FAILED:Lcom/sma/smartv3/model/SyncStatus;

    sget-object v2, Lcom/sma/smartv3/model/SyncStatus;->NO_SYNC:Lcom/sma/smartv3/model/SyncStatus;

    sget-object v3, Lcom/sma/smartv3/model/SyncStatus;->SYNCING:Lcom/sma/smartv3/model/SyncStatus;

    sget-object v4, Lcom/sma/smartv3/model/SyncStatus;->SYNCED:Lcom/sma/smartv3/model/SyncStatus;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/sma/smartv3/model/SyncStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/model/SyncStatus;

    const-string v1, "DOWNLOAD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/model/SyncStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/model/SyncStatus;->DOWNLOAD:Lcom/sma/smartv3/model/SyncStatus;

    new-instance v0, Lcom/sma/smartv3/model/SyncStatus;

    const-string v1, "FAILED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/model/SyncStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/model/SyncStatus;->FAILED:Lcom/sma/smartv3/model/SyncStatus;

    new-instance v0, Lcom/sma/smartv3/model/SyncStatus;

    const-string v1, "NO_SYNC"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/model/SyncStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/model/SyncStatus;->NO_SYNC:Lcom/sma/smartv3/model/SyncStatus;

    new-instance v0, Lcom/sma/smartv3/model/SyncStatus;

    const-string v1, "SYNCING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/model/SyncStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/model/SyncStatus;->SYNCING:Lcom/sma/smartv3/model/SyncStatus;

    new-instance v0, Lcom/sma/smartv3/model/SyncStatus;

    const-string v1, "SYNCED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/model/SyncStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/model/SyncStatus;->SYNCED:Lcom/sma/smartv3/model/SyncStatus;

    invoke-static {}, Lcom/sma/smartv3/model/SyncStatus;->$values()[Lcom/sma/smartv3/model/SyncStatus;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/model/SyncStatus;->$VALUES:[Lcom/sma/smartv3/model/SyncStatus;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/model/SyncStatus;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/sma/smartv3/model/SyncStatus;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/model/SyncStatus;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/model/SyncStatus;
    .locals 1

    const-class v0, Lcom/sma/smartv3/model/SyncStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/model/SyncStatus;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/model/SyncStatus;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/model/SyncStatus;->$VALUES:[Lcom/sma/smartv3/model/SyncStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/model/SyncStatus;

    return-object v0
.end method
