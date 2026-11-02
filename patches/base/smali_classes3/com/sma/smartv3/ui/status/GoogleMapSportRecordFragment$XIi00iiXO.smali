.class public final Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/view/CustomGoogleMapView$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->showMapContent(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Landroid/view/MotionEvent;)V
    .locals 3

    const-string v0, "motionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x0

    const-string v1, "view"

    const/4 v2, 0x1

    if-ne p1, v2, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->access$getView$p(Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;)Landroidx/core/widget/NestedScrollView;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroidx/core/widget/NestedScrollView;->requestDisallowInterceptTouchEvent(Z)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->access$getView$p(Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;)Landroidx/core/widget/NestedScrollView;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v0, p1

    :goto_1
    invoke-virtual {v0, v2}, Landroidx/core/widget/NestedScrollView;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method
