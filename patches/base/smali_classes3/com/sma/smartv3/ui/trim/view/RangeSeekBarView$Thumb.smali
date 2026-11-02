.class public final enum Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Thumb"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

.field public static final enum MAX:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

.field public static final enum MIN:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;


# direct methods
.method private static synthetic $values()[Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;
    .locals 2

    sget-object v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;->MIN:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    sget-object v1, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;->MAX:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    filled-new-array {v0, v1}, [Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    const-string v1, "MIN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;->MIN:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    new-instance v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    const-string v1, "MAX"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;->MAX:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    invoke-static {}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;->$values()[Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;->$VALUES:[Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            "$enum$name",
            "$enum$ordinal"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8000
        }
        names = {
            "name"
        }
    .end annotation

    const-class v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;->$VALUES:[Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    invoke-virtual {v0}, [Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    return-object v0
.end method
