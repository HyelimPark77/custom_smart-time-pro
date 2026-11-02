.class public final enum Lcom/sma/smartv3/model/AIFunctionCat;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/model/AIFunctionCat;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/model/AIFunctionCat;

.field public static final enum ALL:Lcom/sma/smartv3/model/AIFunctionCat;

.field public static final enum AMUSEMENT:Lcom/sma/smartv3/model/AIFunctionCat;

.field public static final enum LIFE:Lcom/sma/smartv3/model/AIFunctionCat;

.field public static final enum WORK:Lcom/sma/smartv3/model/AIFunctionCat;


# instance fields
.field private final cat:I


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/model/AIFunctionCat;
    .locals 4

    sget-object v0, Lcom/sma/smartv3/model/AIFunctionCat;->ALL:Lcom/sma/smartv3/model/AIFunctionCat;

    sget-object v1, Lcom/sma/smartv3/model/AIFunctionCat;->LIFE:Lcom/sma/smartv3/model/AIFunctionCat;

    sget-object v2, Lcom/sma/smartv3/model/AIFunctionCat;->WORK:Lcom/sma/smartv3/model/AIFunctionCat;

    sget-object v3, Lcom/sma/smartv3/model/AIFunctionCat;->AMUSEMENT:Lcom/sma/smartv3/model/AIFunctionCat;

    filled-new-array {v0, v1, v2, v3}, [Lcom/sma/smartv3/model/AIFunctionCat;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/model/AIFunctionCat;

    const-string v1, "ALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/model/AIFunctionCat;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/model/AIFunctionCat;->ALL:Lcom/sma/smartv3/model/AIFunctionCat;

    new-instance v0, Lcom/sma/smartv3/model/AIFunctionCat;

    const-string v1, "LIFE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/model/AIFunctionCat;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/model/AIFunctionCat;->LIFE:Lcom/sma/smartv3/model/AIFunctionCat;

    new-instance v0, Lcom/sma/smartv3/model/AIFunctionCat;

    const-string v1, "WORK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/model/AIFunctionCat;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/model/AIFunctionCat;->WORK:Lcom/sma/smartv3/model/AIFunctionCat;

    new-instance v0, Lcom/sma/smartv3/model/AIFunctionCat;

    const-string v1, "AMUSEMENT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/model/AIFunctionCat;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/model/AIFunctionCat;->AMUSEMENT:Lcom/sma/smartv3/model/AIFunctionCat;

    invoke-static {}, Lcom/sma/smartv3/model/AIFunctionCat;->$values()[Lcom/sma/smartv3/model/AIFunctionCat;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/model/AIFunctionCat;->$VALUES:[Lcom/sma/smartv3/model/AIFunctionCat;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/model/AIFunctionCat;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    iput p3, p0, Lcom/sma/smartv3/model/AIFunctionCat;->cat:I

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
            "Lcom/sma/smartv3/model/AIFunctionCat;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/model/AIFunctionCat;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/model/AIFunctionCat;
    .locals 1

    const-class v0, Lcom/sma/smartv3/model/AIFunctionCat;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/model/AIFunctionCat;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/model/AIFunctionCat;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/model/AIFunctionCat;->$VALUES:[Lcom/sma/smartv3/model/AIFunctionCat;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/model/AIFunctionCat;

    return-object v0
.end method


# virtual methods
.method public final getCat()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AIFunctionCat;->cat:I

    return v0
.end method
