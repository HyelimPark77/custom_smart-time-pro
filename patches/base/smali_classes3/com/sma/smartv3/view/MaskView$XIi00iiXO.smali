.class public final synthetic Lcom/sma/smartv3/view/MaskView$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/MaskView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "XIi00iiXO"
.end annotation


# static fields
.field public static final synthetic OXO1:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/sma/smartv3/view/MaskView$HollowShape;->values()[Lcom/sma/smartv3/view/MaskView$HollowShape;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/sma/smartv3/view/MaskView$HollowShape;->SQUARE:Lcom/sma/smartv3/view/MaskView$HollowShape;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v1, Lcom/sma/smartv3/view/MaskView$HollowShape;->CIRCLE:Lcom/sma/smartv3/view/MaskView$HollowShape;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    sput-object v0, Lcom/sma/smartv3/view/MaskView$XIi00iiXO;->OXO1:[I

    return-void
.end method
