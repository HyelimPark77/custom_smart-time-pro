.class public final enum Lcom/sma/smartv3/view/bubbleview/ArrowDirection;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/view/bubbleview/ArrowDirection;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

.field public static final enum BOTTOM:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

.field public static final enum BOTTOM_CENTER:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

.field public static final enum BOTTOM_RIGHT:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

.field public static final enum LEFT:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

.field public static final enum LEFT_CENTER:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

.field public static final enum RIGHT:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

.field public static final enum RIGHT_CENTER:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

.field public static final enum TOP:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

.field public static final enum TOP_CENTER:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

.field public static final enum TOP_RIGHT:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;


# instance fields
.field private value:I


# direct methods
.method private static synthetic $values()[Lcom/sma/smartv3/view/bubbleview/ArrowDirection;
    .locals 10

    sget-object v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->LEFT:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    sget-object v1, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->RIGHT:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    sget-object v2, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->TOP:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    sget-object v3, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->BOTTOM:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    sget-object v4, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->LEFT_CENTER:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    sget-object v5, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->RIGHT_CENTER:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    sget-object v6, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->TOP_CENTER:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    sget-object v7, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->BOTTOM_CENTER:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    sget-object v8, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->TOP_RIGHT:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    sget-object v9, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->BOTTOM_RIGHT:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    filled-new-array/range {v0 .. v9}, [Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    const-string v1, "LEFT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->LEFT:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    new-instance v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    const-string v1, "RIGHT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->RIGHT:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    new-instance v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    const-string v1, "TOP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->TOP:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    new-instance v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    const-string v1, "BOTTOM"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->BOTTOM:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    new-instance v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    const-string v1, "LEFT_CENTER"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->LEFT_CENTER:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    new-instance v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    const-string v1, "RIGHT_CENTER"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->RIGHT_CENTER:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    new-instance v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    const-string v1, "TOP_CENTER"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->TOP_CENTER:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    new-instance v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    const-string v1, "BOTTOM_CENTER"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->BOTTOM_CENTER:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    new-instance v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    const-string v1, "TOP_RIGHT"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->TOP_RIGHT:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    new-instance v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    const-string v1, "BOTTOM_RIGHT"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->BOTTOM_RIGHT:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    invoke-static {}, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->$values()[Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->$VALUES:[Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000,
            0x0
        }
        names = {
            "$enum$name",
            "$enum$ordinal",
            "value"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->value:I

    return-void
.end method

.method public static fromInt(I)Lcom/sma/smartv3/view/bubbleview/ArrowDirection;
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "value"
        }
    .end annotation

    invoke-static {}, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->values()[Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->getValue()I

    move-result v4

    if-ne p0, v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object p0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->LEFT:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/view/bubbleview/ArrowDirection;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8000
        }
        names = {
            "name"
        }
    .end annotation

    const-class v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/view/bubbleview/ArrowDirection;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->$VALUES:[Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    invoke-virtual {v0}, [Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->value:I

    return v0
.end method
