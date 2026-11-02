.class public final enum Lcom/sma/smartv3/model/VipBenefitType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/model/VipBenefitType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/model/VipBenefitType;

.field public static final enum AI:Lcom/sma/smartv3/model/VipBenefitType;

.field public static final enum AIGC:Lcom/sma/smartv3/model/VipBenefitType;

.field public static final enum BUY_VIP:Lcom/sma/smartv3/model/VipBenefitType;

.field public static final enum DIAL:Lcom/sma/smartv3/model/VipBenefitType;


# instance fields
.field private final type:I


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/model/VipBenefitType;
    .locals 4

    sget-object v0, Lcom/sma/smartv3/model/VipBenefitType;->AI:Lcom/sma/smartv3/model/VipBenefitType;

    sget-object v1, Lcom/sma/smartv3/model/VipBenefitType;->AIGC:Lcom/sma/smartv3/model/VipBenefitType;

    sget-object v2, Lcom/sma/smartv3/model/VipBenefitType;->DIAL:Lcom/sma/smartv3/model/VipBenefitType;

    sget-object v3, Lcom/sma/smartv3/model/VipBenefitType;->BUY_VIP:Lcom/sma/smartv3/model/VipBenefitType;

    filled-new-array {v0, v1, v2, v3}, [Lcom/sma/smartv3/model/VipBenefitType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/sma/smartv3/model/VipBenefitType;

    const/4 v1, 0x0

    const/16 v2, 0x101

    const-string v3, "AI"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/model/VipBenefitType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/model/VipBenefitType;->AI:Lcom/sma/smartv3/model/VipBenefitType;

    new-instance v0, Lcom/sma/smartv3/model/VipBenefitType;

    const/4 v1, 0x1

    const/16 v2, 0x102

    const-string v3, "AIGC"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/model/VipBenefitType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/model/VipBenefitType;->AIGC:Lcom/sma/smartv3/model/VipBenefitType;

    new-instance v0, Lcom/sma/smartv3/model/VipBenefitType;

    const/4 v1, 0x2

    const/16 v2, 0x103

    const-string v3, "DIAL"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/model/VipBenefitType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/model/VipBenefitType;->DIAL:Lcom/sma/smartv3/model/VipBenefitType;

    new-instance v0, Lcom/sma/smartv3/model/VipBenefitType;

    const/4 v1, 0x3

    const/16 v2, 0x104

    const-string v3, "BUY_VIP"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/model/VipBenefitType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/model/VipBenefitType;->BUY_VIP:Lcom/sma/smartv3/model/VipBenefitType;

    invoke-static {}, Lcom/sma/smartv3/model/VipBenefitType;->$values()[Lcom/sma/smartv3/model/VipBenefitType;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/model/VipBenefitType;->$VALUES:[Lcom/sma/smartv3/model/VipBenefitType;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/model/VipBenefitType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/sma/smartv3/model/VipBenefitType;->type:I

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
            "Lcom/sma/smartv3/model/VipBenefitType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/model/VipBenefitType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/model/VipBenefitType;
    .locals 1

    const-class v0, Lcom/sma/smartv3/model/VipBenefitType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/model/VipBenefitType;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/model/VipBenefitType;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/model/VipBenefitType;->$VALUES:[Lcom/sma/smartv3/model/VipBenefitType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/model/VipBenefitType;

    return-object v0
.end method


# virtual methods
.method public final getType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/VipBenefitType;->type:I

    return v0
.end method
