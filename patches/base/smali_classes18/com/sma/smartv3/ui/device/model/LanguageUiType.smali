.class public final enum Lcom/sma/smartv3/ui/device/model/LanguageUiType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/ui/device/model/LanguageUiType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/ui/device/model/LanguageUiType;

.field public static final enum ADD:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

.field public static final enum NORMAL:Lcom/sma/smartv3/ui/device/model/LanguageUiType;


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/ui/device/model/LanguageUiType;
    .locals 2

    sget-object v0, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->NORMAL:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    sget-object v1, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->ADD:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    filled-new-array {v0, v1}, [Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    const-string v1, "NORMAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/model/LanguageUiType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->NORMAL:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    new-instance v0, Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    const-string v1, "ADD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/model/LanguageUiType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->ADD:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    invoke-static {}, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->$values()[Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->$VALUES:[Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->$ENTRIES:Lkotlin/enums/EnumEntries;

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
            "Lcom/sma/smartv3/ui/device/model/LanguageUiType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/ui/device/model/LanguageUiType;
    .locals 1

    const-class v0, Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/ui/device/model/LanguageUiType;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->$VALUES:[Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    return-object v0
.end method
