.class public final Lcom/sma/smartv3/view/CustomSupportMapFragment$TouchableWrapper;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/CustomSupportMapFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "TouchableWrapper"
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/view/CustomSupportMapFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/CustomSupportMapFragment;Landroid/content/Context;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/view/CustomSupportMapFragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/CustomSupportMapFragment$TouchableWrapper;->IO:Lcom/sma/smartv3/view/CustomSupportMapFragment;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/CustomSupportMapFragment$TouchableWrapper;->IO:Lcom/sma/smartv3/view/CustomSupportMapFragment;

    invoke-static {v0}, Lcom/sma/smartv3/view/CustomSupportMapFragment;->access$getMListener$p(Lcom/sma/smartv3/view/CustomSupportMapFragment;)Lcom/sma/smartv3/view/CustomSupportMapFragment$OXO1;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0}, Lcom/sma/smartv3/view/CustomSupportMapFragment$OXO1;->OXO1()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/view/CustomSupportMapFragment$TouchableWrapper;->IO:Lcom/sma/smartv3/view/CustomSupportMapFragment;

    invoke-static {v0}, Lcom/sma/smartv3/view/CustomSupportMapFragment;->access$getMListener$p(Lcom/sma/smartv3/view/CustomSupportMapFragment;)Lcom/sma/smartv3/view/CustomSupportMapFragment$OXO1;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0}, Lcom/sma/smartv3/view/CustomSupportMapFragment$OXO1;->OXO1()V

    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
