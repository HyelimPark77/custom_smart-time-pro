.class public final Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initViewPager$1;
.super Landroidx/viewpager/widget/PagerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->initViewPager()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initViewPager$1;->this$0:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-direct {p0}, Landroidx/viewpager/widget/PagerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    const-string p2, "container"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "object"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initViewPager$1;->this$0:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {p2}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getViewPagerMain(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p1, p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initViewPager$1;->this$0:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getViewPagerMain(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initViewPager$1;->this$0:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {p2}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getViewPagerEarPhone(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p1, p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$initViewPager$1;->this$0:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getViewPagerEarPhone(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Landroid/view/View;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object p1
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "object"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
