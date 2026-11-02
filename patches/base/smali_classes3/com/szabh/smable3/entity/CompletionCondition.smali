.class public final enum Lcom/szabh/smable3/entity/CompletionCondition;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/szabh/smable3/entity/CompletionCondition;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/szabh/smable3/entity/CompletionCondition;

.field public static final enum DURATION:Lcom/szabh/smable3/entity/CompletionCondition;

.field public static final enum DURATION_IN_HR_ZONE:Lcom/szabh/smable3/entity/CompletionCondition;

.field public static final enum HR_ABOVE:Lcom/szabh/smable3/entity/CompletionCondition;

.field public static final enum HR_BELOW:Lcom/szabh/smable3/entity/CompletionCondition;

.field public static final enum MANUAL:Lcom/szabh/smable3/entity/CompletionCondition;


# instance fields
.field private final condition:I


# direct methods
.method private static final synthetic $values()[Lcom/szabh/smable3/entity/CompletionCondition;
    .locals 5

    sget-object v0, Lcom/szabh/smable3/entity/CompletionCondition;->DURATION:Lcom/szabh/smable3/entity/CompletionCondition;

    sget-object v1, Lcom/szabh/smable3/entity/CompletionCondition;->MANUAL:Lcom/szabh/smable3/entity/CompletionCondition;

    sget-object v2, Lcom/szabh/smable3/entity/CompletionCondition;->DURATION_IN_HR_ZONE:Lcom/szabh/smable3/entity/CompletionCondition;

    sget-object v3, Lcom/szabh/smable3/entity/CompletionCondition;->HR_ABOVE:Lcom/szabh/smable3/entity/CompletionCondition;

    sget-object v4, Lcom/szabh/smable3/entity/CompletionCondition;->HR_BELOW:Lcom/szabh/smable3/entity/CompletionCondition;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/szabh/smable3/entity/CompletionCondition;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/szabh/smable3/entity/CompletionCondition;

    const-string v1, "DURATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/CompletionCondition;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/CompletionCondition;->DURATION:Lcom/szabh/smable3/entity/CompletionCondition;

    new-instance v0, Lcom/szabh/smable3/entity/CompletionCondition;

    const-string v1, "MANUAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/CompletionCondition;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/CompletionCondition;->MANUAL:Lcom/szabh/smable3/entity/CompletionCondition;

    new-instance v0, Lcom/szabh/smable3/entity/CompletionCondition;

    const-string v1, "DURATION_IN_HR_ZONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/CompletionCondition;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/CompletionCondition;->DURATION_IN_HR_ZONE:Lcom/szabh/smable3/entity/CompletionCondition;

    new-instance v0, Lcom/szabh/smable3/entity/CompletionCondition;

    const-string v1, "HR_ABOVE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/CompletionCondition;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/CompletionCondition;->HR_ABOVE:Lcom/szabh/smable3/entity/CompletionCondition;

    new-instance v0, Lcom/szabh/smable3/entity/CompletionCondition;

    const-string v1, "HR_BELOW"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/CompletionCondition;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/CompletionCondition;->HR_BELOW:Lcom/szabh/smable3/entity/CompletionCondition;

    invoke-static {}, Lcom/szabh/smable3/entity/CompletionCondition;->$values()[Lcom/szabh/smable3/entity/CompletionCondition;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/CompletionCondition;->$VALUES:[Lcom/szabh/smable3/entity/CompletionCondition;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/CompletionCondition;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    iput p3, p0, Lcom/szabh/smable3/entity/CompletionCondition;->condition:I

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
            "Lcom/szabh/smable3/entity/CompletionCondition;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/entity/CompletionCondition;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/szabh/smable3/entity/CompletionCondition;
    .locals 1

    const-class v0, Lcom/szabh/smable3/entity/CompletionCondition;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/szabh/smable3/entity/CompletionCondition;

    return-object p0
.end method

.method public static values()[Lcom/szabh/smable3/entity/CompletionCondition;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/entity/CompletionCondition;->$VALUES:[Lcom/szabh/smable3/entity/CompletionCondition;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/szabh/smable3/entity/CompletionCondition;

    return-object v0
.end method


# virtual methods
.method public final getCondition()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/CompletionCondition;->condition:I

    return v0
.end method
