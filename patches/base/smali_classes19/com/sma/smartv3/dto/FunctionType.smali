.class public final enum Lcom/sma/smartv3/dto/FunctionType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/dto/FunctionType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/dto/FunctionType;

.field public static final enum THIRD_PARTY_AI_ASSISTANT:Lcom/sma/smartv3/dto/FunctionType;


# instance fields
.field private final flag:I


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/dto/FunctionType;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/dto/FunctionType;->THIRD_PARTY_AI_ASSISTANT:Lcom/sma/smartv3/dto/FunctionType;

    filled-new-array {v0}, [Lcom/sma/smartv3/dto/FunctionType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/sma/smartv3/dto/FunctionType;

    const/4 v1, 0x0

    const/16 v2, 0x3e9

    const-string v3, "THIRD_PARTY_AI_ASSISTANT"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/dto/FunctionType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/dto/FunctionType;->THIRD_PARTY_AI_ASSISTANT:Lcom/sma/smartv3/dto/FunctionType;

    invoke-static {}, Lcom/sma/smartv3/dto/FunctionType;->$values()[Lcom/sma/smartv3/dto/FunctionType;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/dto/FunctionType;->$VALUES:[Lcom/sma/smartv3/dto/FunctionType;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/dto/FunctionType;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    iput p3, p0, Lcom/sma/smartv3/dto/FunctionType;->flag:I

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
            "Lcom/sma/smartv3/dto/FunctionType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/dto/FunctionType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/dto/FunctionType;
    .locals 1

    const-class v0, Lcom/sma/smartv3/dto/FunctionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/dto/FunctionType;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/dto/FunctionType;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/dto/FunctionType;->$VALUES:[Lcom/sma/smartv3/dto/FunctionType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/dto/FunctionType;

    return-object v0
.end method


# virtual methods
.method public final getFlag()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/FunctionType;->flag:I

    return v0
.end method
