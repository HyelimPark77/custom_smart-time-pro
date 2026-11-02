.class public final enum Lcom/sma/smartv3/model/AppStoreItemType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/model/AppStoreItemType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/model/AppStoreItemType;

.field public static final enum INSTALL:Lcom/sma/smartv3/model/AppStoreItemType;

.field public static final enum INSTALLED:Lcom/sma/smartv3/model/AppStoreItemType;

.field public static final enum NOT_RENEW:Lcom/sma/smartv3/model/AppStoreItemType;

.field public static final enum RENEW:Lcom/sma/smartv3/model/AppStoreItemType;


# instance fields
.field private final type:I


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/model/AppStoreItemType;
    .locals 4

    sget-object v0, Lcom/sma/smartv3/model/AppStoreItemType;->INSTALLED:Lcom/sma/smartv3/model/AppStoreItemType;

    sget-object v1, Lcom/sma/smartv3/model/AppStoreItemType;->INSTALL:Lcom/sma/smartv3/model/AppStoreItemType;

    sget-object v2, Lcom/sma/smartv3/model/AppStoreItemType;->RENEW:Lcom/sma/smartv3/model/AppStoreItemType;

    sget-object v3, Lcom/sma/smartv3/model/AppStoreItemType;->NOT_RENEW:Lcom/sma/smartv3/model/AppStoreItemType;

    filled-new-array {v0, v1, v2, v3}, [Lcom/sma/smartv3/model/AppStoreItemType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/model/AppStoreItemType;

    const-string v1, "INSTALLED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/model/AppStoreItemType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/model/AppStoreItemType;->INSTALLED:Lcom/sma/smartv3/model/AppStoreItemType;

    new-instance v0, Lcom/sma/smartv3/model/AppStoreItemType;

    const-string v1, "INSTALL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/model/AppStoreItemType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/model/AppStoreItemType;->INSTALL:Lcom/sma/smartv3/model/AppStoreItemType;

    new-instance v0, Lcom/sma/smartv3/model/AppStoreItemType;

    const-string v1, "RENEW"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/model/AppStoreItemType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/model/AppStoreItemType;->RENEW:Lcom/sma/smartv3/model/AppStoreItemType;

    new-instance v0, Lcom/sma/smartv3/model/AppStoreItemType;

    const-string v1, "NOT_RENEW"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/model/AppStoreItemType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/model/AppStoreItemType;->NOT_RENEW:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-static {}, Lcom/sma/smartv3/model/AppStoreItemType;->$values()[Lcom/sma/smartv3/model/AppStoreItemType;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/model/AppStoreItemType;->$VALUES:[Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/model/AppStoreItemType;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    iput p3, p0, Lcom/sma/smartv3/model/AppStoreItemType;->type:I

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
            "Lcom/sma/smartv3/model/AppStoreItemType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/model/AppStoreItemType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/model/AppStoreItemType;
    .locals 1

    const-class v0, Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/model/AppStoreItemType;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/model/AppStoreItemType;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/model/AppStoreItemType;->$VALUES:[Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/model/AppStoreItemType;

    return-object v0
.end method


# virtual methods
.method public final getType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AppStoreItemType;->type:I

    return v0
.end method
