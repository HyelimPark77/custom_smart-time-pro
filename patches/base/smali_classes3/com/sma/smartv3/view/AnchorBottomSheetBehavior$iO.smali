.class public Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "iO"
.end annotation


# instance fields
.field public OXO1:J

.field public XIi00iiXO:F

.field public final synthetic iO:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            "this$0"
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;->iO:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;->OXO1:J

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;->XIi00iiXO:F

    return-void
.end method

.method public synthetic constructor <init>(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;Lcom/android/mltcode/paycertificationapi/XIXIXi;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;-><init>(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)V

    return-void
.end method


# virtual methods
.method public OXO1()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;->OXO1:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;->XIi00iiXO:F

    return-void
.end method

.method public XIi00iiXO()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;->XIi00iiXO:F

    return v0
.end method

.method public iO(I)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "dy"
        }
    .end annotation

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;->OXO1:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_0

    sub-long v2, v0, v2

    int-to-float p1, p1

    long-to-float v2, v2

    div-float/2addr p1, v2

    const/high16 v2, 0x447a0000    # 1000.0f

    mul-float/2addr p1, v2

    iput p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;->XIi00iiXO:F

    :cond_0
    iput-wide v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;->OXO1:J

    return-void
.end method
