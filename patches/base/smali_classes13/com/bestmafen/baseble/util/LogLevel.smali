.class public final enum Lcom/bestmafen/baseble/util/LogLevel;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/bestmafen/baseble/util/LogLevel;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/bestmafen/baseble/util/LogLevel;

.field public static final enum D:Lcom/bestmafen/baseble/util/LogLevel;

.field public static final enum E:Lcom/bestmafen/baseble/util/LogLevel;

.field public static final enum I:Lcom/bestmafen/baseble/util/LogLevel;

.field public static final enum V:Lcom/bestmafen/baseble/util/LogLevel;

.field public static final enum W:Lcom/bestmafen/baseble/util/LogLevel;


# direct methods
.method private static final synthetic $values()[Lcom/bestmafen/baseble/util/LogLevel;
    .locals 5

    sget-object v0, Lcom/bestmafen/baseble/util/LogLevel;->V:Lcom/bestmafen/baseble/util/LogLevel;

    sget-object v1, Lcom/bestmafen/baseble/util/LogLevel;->D:Lcom/bestmafen/baseble/util/LogLevel;

    sget-object v2, Lcom/bestmafen/baseble/util/LogLevel;->I:Lcom/bestmafen/baseble/util/LogLevel;

    sget-object v3, Lcom/bestmafen/baseble/util/LogLevel;->W:Lcom/bestmafen/baseble/util/LogLevel;

    sget-object v4, Lcom/bestmafen/baseble/util/LogLevel;->E:Lcom/bestmafen/baseble/util/LogLevel;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/bestmafen/baseble/util/LogLevel;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/bestmafen/baseble/util/LogLevel;

    const-string v1, "V"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/bestmafen/baseble/util/LogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bestmafen/baseble/util/LogLevel;->V:Lcom/bestmafen/baseble/util/LogLevel;

    new-instance v0, Lcom/bestmafen/baseble/util/LogLevel;

    const-string v1, "D"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/bestmafen/baseble/util/LogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bestmafen/baseble/util/LogLevel;->D:Lcom/bestmafen/baseble/util/LogLevel;

    new-instance v0, Lcom/bestmafen/baseble/util/LogLevel;

    const-string v1, "I"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/bestmafen/baseble/util/LogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bestmafen/baseble/util/LogLevel;->I:Lcom/bestmafen/baseble/util/LogLevel;

    new-instance v0, Lcom/bestmafen/baseble/util/LogLevel;

    const-string v1, "W"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/bestmafen/baseble/util/LogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bestmafen/baseble/util/LogLevel;->W:Lcom/bestmafen/baseble/util/LogLevel;

    new-instance v0, Lcom/bestmafen/baseble/util/LogLevel;

    const-string v1, "E"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/bestmafen/baseble/util/LogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bestmafen/baseble/util/LogLevel;->E:Lcom/bestmafen/baseble/util/LogLevel;

    invoke-static {}, Lcom/bestmafen/baseble/util/LogLevel;->$values()[Lcom/bestmafen/baseble/util/LogLevel;

    move-result-object v0

    sput-object v0, Lcom/bestmafen/baseble/util/LogLevel;->$VALUES:[Lcom/bestmafen/baseble/util/LogLevel;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/bestmafen/baseble/util/LogLevel;->$ENTRIES:Lkotlin/enums/EnumEntries;

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
            "Lcom/bestmafen/baseble/util/LogLevel;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/bestmafen/baseble/util/LogLevel;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/bestmafen/baseble/util/LogLevel;
    .locals 1

    const-class v0, Lcom/bestmafen/baseble/util/LogLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/bestmafen/baseble/util/LogLevel;

    return-object p0
.end method

.method public static values()[Lcom/bestmafen/baseble/util/LogLevel;
    .locals 1

    sget-object v0, Lcom/bestmafen/baseble/util/LogLevel;->$VALUES:[Lcom/bestmafen/baseble/util/LogLevel;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/bestmafen/baseble/util/LogLevel;

    return-object v0
.end method
