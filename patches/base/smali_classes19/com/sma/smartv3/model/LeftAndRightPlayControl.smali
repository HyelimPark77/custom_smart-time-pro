.class public final enum Lcom/sma/smartv3/model/LeftAndRightPlayControl;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/model/LeftAndRightPlayControl;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/model/LeftAndRightPlayControl;

.field public static final enum LEFT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

.field public static final enum LEFT_AND_RIGHT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

.field public static final enum RIGHT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;


# instance fields
.field private final model:I


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/model/LeftAndRightPlayControl;
    .locals 3

    sget-object v0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->LEFT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    sget-object v1, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->RIGHT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    sget-object v2, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->LEFT_AND_RIGHT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    filled-new-array {v0, v1, v2}, [Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    const-string v1, "LEFT"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/sma/smartv3/model/LeftAndRightPlayControl;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->LEFT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    new-instance v0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    const-string v1, "RIGHT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lcom/sma/smartv3/model/LeftAndRightPlayControl;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->RIGHT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    new-instance v0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    const-string v1, "LEFT_AND_RIGHT"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/sma/smartv3/model/LeftAndRightPlayControl;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->LEFT_AND_RIGHT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    invoke-static {}, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->$values()[Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->$VALUES:[Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    iput p3, p0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->model:I

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
            "Lcom/sma/smartv3/model/LeftAndRightPlayControl;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/model/LeftAndRightPlayControl;
    .locals 1

    const-class v0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/model/LeftAndRightPlayControl;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->$VALUES:[Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    return-object v0
.end method


# virtual methods
.method public final getModel()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->model:I

    return v0
.end method
