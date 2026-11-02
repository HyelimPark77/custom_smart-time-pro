.class public final enum Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

.field public static final enum FILE:Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

.field public static final enum STREAM:Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;
    .locals 2

    sget-object v0, Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;->STREAM:Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

    sget-object v1, Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;->FILE:Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

    filled-new-array {v0, v1}, [Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

    const-string v1, "STREAM"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;->STREAM:Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

    new-instance v0, Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

    const-string v1, "FILE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;->FILE:Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

    invoke-static {}, Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;->$values()[Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;->$VALUES:[Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;->$ENTRIES:Lkotlin/enums/EnumEntries;

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
            "Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;
    .locals 1

    const-class v0, Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;->$VALUES:[Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

    return-object v0
.end method
