.class public final Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/view/CustomBarChartView$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;->setChartRenderer()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Landroid/view/MotionEvent;)V
    .locals 1

    const-string v0, "motionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getScrollView()Landroidx/core/widget/NestedScrollView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/core/widget/NestedScrollView;->requestDisallowInterceptTouchEvent(Z)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getScrollView()Landroidx/core/widget/NestedScrollView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/core/widget/NestedScrollView;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method
