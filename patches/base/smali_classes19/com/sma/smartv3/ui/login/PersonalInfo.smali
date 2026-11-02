.class public final enum Lcom/sma/smartv3/ui/login/PersonalInfo;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/ui/login/PersonalInfo;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/ui/login/PersonalInfo;

.field public static final enum BIRTHDAY_UNIT:Lcom/sma/smartv3/ui/login/PersonalInfo;

.field public static final enum HEIGHT_WEIGHT:Lcom/sma/smartv3/ui/login/PersonalInfo;

.field public static final enum MOVING_TARGET:Lcom/sma/smartv3/ui/login/PersonalInfo;

.field public static final enum NAME_GENDER:Lcom/sma/smartv3/ui/login/PersonalInfo;


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/ui/login/PersonalInfo;
    .locals 4

    sget-object v0, Lcom/sma/smartv3/ui/login/PersonalInfo;->NAME_GENDER:Lcom/sma/smartv3/ui/login/PersonalInfo;

    sget-object v1, Lcom/sma/smartv3/ui/login/PersonalInfo;->BIRTHDAY_UNIT:Lcom/sma/smartv3/ui/login/PersonalInfo;

    sget-object v2, Lcom/sma/smartv3/ui/login/PersonalInfo;->HEIGHT_WEIGHT:Lcom/sma/smartv3/ui/login/PersonalInfo;

    sget-object v3, Lcom/sma/smartv3/ui/login/PersonalInfo;->MOVING_TARGET:Lcom/sma/smartv3/ui/login/PersonalInfo;

    filled-new-array {v0, v1, v2, v3}, [Lcom/sma/smartv3/ui/login/PersonalInfo;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/ui/login/PersonalInfo;

    const-string v1, "NAME_GENDER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/login/PersonalInfo;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/login/PersonalInfo;->NAME_GENDER:Lcom/sma/smartv3/ui/login/PersonalInfo;

    new-instance v0, Lcom/sma/smartv3/ui/login/PersonalInfo;

    const-string v1, "BIRTHDAY_UNIT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/login/PersonalInfo;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/login/PersonalInfo;->BIRTHDAY_UNIT:Lcom/sma/smartv3/ui/login/PersonalInfo;

    new-instance v0, Lcom/sma/smartv3/ui/login/PersonalInfo;

    const-string v1, "HEIGHT_WEIGHT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/login/PersonalInfo;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/login/PersonalInfo;->HEIGHT_WEIGHT:Lcom/sma/smartv3/ui/login/PersonalInfo;

    new-instance v0, Lcom/sma/smartv3/ui/login/PersonalInfo;

    const-string v1, "MOVING_TARGET"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/login/PersonalInfo;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/login/PersonalInfo;->MOVING_TARGET:Lcom/sma/smartv3/ui/login/PersonalInfo;

    invoke-static {}, Lcom/sma/smartv3/ui/login/PersonalInfo;->$values()[Lcom/sma/smartv3/ui/login/PersonalInfo;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/login/PersonalInfo;->$VALUES:[Lcom/sma/smartv3/ui/login/PersonalInfo;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/login/PersonalInfo;->$ENTRIES:Lkotlin/enums/EnumEntries;

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
            "Lcom/sma/smartv3/ui/login/PersonalInfo;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/ui/login/PersonalInfo;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/ui/login/PersonalInfo;
    .locals 1

    const-class v0, Lcom/sma/smartv3/ui/login/PersonalInfo;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/ui/login/PersonalInfo;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/ui/login/PersonalInfo;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/login/PersonalInfo;->$VALUES:[Lcom/sma/smartv3/ui/login/PersonalInfo;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/ui/login/PersonalInfo;

    return-object v0
.end method
